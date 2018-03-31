package com.longj.platform.pb.util;

import java.util.ArrayList;




import org.wdk.core.bean.WDKContext;
import org.wdk.core.bean.WDKLogger;

/**
 * 消息助手类
 * 
 * @author daru.zheng
 * @date 2016.3.22
 */
public class FileNumberCountUtil {

	private static WDKLogger logger = new WDKLogger(FileNumberCountUtil.class.getName());


	/**
	 * 编号与跳号比较
	 * @param context
	 * @param skip_number 跳号
	 * @param code_number 编号
	 * @return
	 * @throws Exception
	 */
	public static String compareSkip_number(WDKContext context,String skip_number,String code_number)  throws Exception {
		String[] sn = skip_number.split(",");
		String newskip_number = "";
		//判断编号是否在跳号内
		for(int i=0;i<sn.length;i++){
			if(code_number.equals(sn[i])){
				logger.debug("==计数器处理：编号使用了跳号："+sn[i]+"要过滤");
			}else{
				//其他跳号
				if(newskip_number.length()==0){
					newskip_number = sn[i];
				}else{
					newskip_number = newskip_number+","+sn[i];
				}
			}
		}
		newskip_number = formatSkip_number(context,newskip_number);
		return newskip_number;
	}
	
	/**
	 * 编号使用时，跳号筛检
	 * @param context
	 * @param nowcount 当前计数
	 * @param skip_number 跳号
	 * @param code_number 新编号
	 * @return
	 * @throws Exception
	 */
	public static String filterSkip_number(WDKContext context,String nowcount,String skip_number,String code_number)  throws Exception {
		String[] sn = skip_number.split(",");
		String newskip_number = "";
		boolean isinarr = false;
		
		//判断编号是否在跳号内
		for(int i=0;i<sn.length;i++){
			if(code_number.equals(sn[i])){
				isinarr = true;
				logger.debug("==计数器处理：新编号使用了跳号："+sn[i]);
			}else{
				//其他跳号
				if(newskip_number.length()==0){
					newskip_number = sn[i];
				}else{
					newskip_number = newskip_number+","+sn[i];
				}
			}
		}
		if(!isinarr
				&&Integer.parseInt(code_number)>Integer.parseInt(nowcount)+1){
			//新编号大于当前计数+1，生成跳号
			for(int i =Integer.parseInt(nowcount)+1;i<Integer.parseInt(code_number);i++){
				if(newskip_number.length()==0){
					newskip_number = String.valueOf(i);
				}else{
					newskip_number = newskip_number + "," + String.valueOf(i);
				}
			}
		}
		newskip_number = formatSkip_number(context,newskip_number);
		return newskip_number;
	}
	
	/**
	 * 编号回收时，放入跳号
	 * @param context
	 * @param skip_number 跳号
	 * @param code_number 回收编号
	 * @return
	 * @throws Exception
	 */
	public static String recoverSkip_number(WDKContext context,String skip_number,String code_number)  throws Exception {
		String[] sn = skip_number.split(",");
		String newskip_number = skip_number;
		boolean isinarr = false;
		
		//判断编号是否在跳号内
		for(int i=0;i<sn.length;i++){
			if(code_number.equals(sn[i])){
				isinarr = true;
				logger.debug("==计数器处理：回收编号使用了跳号："+sn[i]);
				break;
			}
		}
		if(!isinarr){
			//回收
			if(newskip_number.length()>0){
				newskip_number = newskip_number+","+code_number;
			}else{
				newskip_number = code_number;
			}
		}
		newskip_number = formatSkip_number(context,newskip_number);
		return newskip_number;
	}
	
	/**
	 * 整理跳号
	 * @param context
	 * @param skip_number
	 * @return
	 * @throws Exception
	 */
	public static String formatSkip_number(WDKContext context,String skip_number)  throws Exception {
		String newskip_number = skip_number;
		
		logger.debug("==计数器处理：跳号："+newskip_number);
		//跳号去重复
		if(newskip_number.length()>0){
			String sn[]=newskip_number.split(",");
			ArrayList al=new ArrayList();
			for(int i=0;i<sn.length;i++){
				if(!al.contains(sn[i])){
					al.add(sn[i]);
				}
			}
			String tmp="";
			for(int i=0;i<al.size();i++){
				if(tmp.length()==0){
					tmp=al.get(i).toString();
				}else{
					tmp=tmp+","+al.get(i).toString();
				}
			}
			newskip_number = tmp;
			logger.debug("==计数器处理：跳号去重复后："+newskip_number);
		}
		//跳号由小到大排序
		if(newskip_number.length()>0){
			String sn[]=newskip_number.split(",");
			for(int i=0;i<sn.length-1;i++){
				String tmp = sn[i];
				for(int j=i+1;j<sn.length;j++){
					if(Integer.parseInt(tmp)>Integer.parseInt(sn[j])){
						sn[i]=sn[j];
						sn[j]=tmp;
						tmp=sn[i];
					}
				}
			}
			newskip_number="";
			for(int i=0;i<sn.length;i++){
				if(i==0){
					newskip_number=sn[i];
				}else{
					newskip_number=newskip_number+","+sn[i];
				}
			}
			logger.debug("==计数器处理：跳号排序后："+newskip_number);
		}
		return newskip_number;
	}
	
	
	/**
	 * 去除废号
	 * @param context
	 * @param skip_number 跳号
	 * @param code_number 回收编号
	 * @return
	 * @throws Exception
	 */
	public static String removeSkipNumber(WDKContext context,String skipNumber,int codenumber)  throws Exception {
		String skipNumberArr[]=skipNumber.split(",");
		StringBuffer newSkipNO=new StringBuffer();
		int length = skipNumberArr.length;
		for(int i=0;i<length;i++){
			String onlyNO=skipNumberArr[i];
			if(onlyNO!=null && onlyNO.length()>0){
				if(codenumber != Integer.valueOf(onlyNO)){						
					if(i==(length-1)){          //最后一个元素不需要加逗号
						newSkipNO.append(onlyNO);
					}else{
						newSkipNO.append(onlyNO+",");
					}
				}
			}
		}
		return newSkipNO.toString();
	}
	
	/**
	 * 放入跳号
	 * @param context
	 * @param skip_number
	 * @return
	 * @throws Exception
	 */
	public static String insertSkipNumber(WDKContext context,int datacount,String skipNumber,int codenumber)  throws Exception {
		StringBuffer newSkipNO=new StringBuffer();
		if(StringUtil.isNotBlank(skipNumber)){
			//if(!",".equals(skipNumber.substring(skipNumber.length(), skipNumber.length()))){ //最后一位不是逗号
			if(!skipNumber.endsWith(",")){ //最后一位不是逗号
				newSkipNO.append(skipNumber+",");
			}else{
				newSkipNO.append(skipNumber);
			}
		}						
		for(int k=(datacount+1); k<codenumber; k++){
			if(k==(codenumber-1)){          //最后一个元素不需要加逗号
				newSkipNO.append(k);
			}else{
				newSkipNO.append(k+",");
			}
		}	
		return newSkipNO.toString();
	}
	
	
	/**
	 * 放入一个跳号（删除插入）
	 * @param context
	 * @param skip_number
	 * @return
	 * @throws Exception
	 */
	public static String insertOneSkipNumber(WDKContext context, String skipNumber,int codenumber)  throws Exception {
		StringBuffer newSkipNO=new StringBuffer();
		if(StringUtil.isNotBlank(skipNumber)){
			if(!skipNumber.endsWith(",")){ //最后一位不是逗号
				newSkipNO.append(skipNumber+",");
			}else{
				newSkipNO.append(skipNumber);
			}
		}	
		//加入废号
		newSkipNO.append(codenumber);
		
		return newSkipNO.toString();
	}
	

}
