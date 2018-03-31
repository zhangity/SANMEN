package com.longj.platform.pb.util;

import java.math.BigDecimal;
import java.sql.Blob;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 有关字符串处理的工具类。
 * 
 * <p>
 * 这个类中的每个方法都可以“安全”地处理<code>null</code>，而不会抛出<code>NullPointerException</code>。
 * </p>
 *
 * @author daru.zheng
 * @version $Id: StringUtil.java,v 1.3 2015/03/27 02:17:24 zhengdr Exp $
 */
public class StringUtil {
    /* ============================================================================ */
    /*  singleton集合。                                                           */
    /* ============================================================================ */

    /* ============================================================================ */
    /*  判空函数。                                                                  */
    /*                                                                              */
    /*  以下方法用来判定一个字符串是否为：                                          */
    /*  1. null                                                                     */
    /*  2. empty - ""                                                               */
    /*  3. blank - "全部是空白" - 空白由Character.isWhitespace所定义。              */
    /* ============================================================================ */

    /**
     * 检查字符串是否为<code>null</code>或空字符串<code>""</code>。
     * <pre>
     * StringUtil.isEmpty(null)      = true
     * StringUtil.isEmpty("")        = true
     * StringUtil.isEmpty(" ")       = false
     * StringUtil.isEmpty("bob")     = false
     * StringUtil.isEmpty("  bob  ") = false
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空, 则返回<code>true</code>
     */
    public static boolean isEmpty(String str) {
        return ((str == null) || (str.length() == 0));
    }

    /**
     * 检查字符串是否不是<code>null</code>和空字符串<code>""</code>。
     * <pre>
     * StringUtil.isEmpty(null)      = false
     * StringUtil.isEmpty("")        = false
     * StringUtil.isEmpty(" ")       = true
     * StringUtil.isEmpty("bob")     = true
     * StringUtil.isEmpty("  bob  ") = true
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果不为空, 则返回<code>true</code>
     */
    public static boolean isNotEmpty(String str) {
        return ((str != null) && (str.length() > 0));
    }

    /**
     * 检查字符串是否是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
     * <pre>
     * StringUtil.isBlank(null)      = true
     * StringUtil.isBlank("")        = true
     * StringUtil.isBlank(" ")       = true
     * StringUtil.isBlank("bob")     = false
     * StringUtil.isBlank("  bob  ") = false
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空白, 则返回<code>true</code>
     */
    public static boolean isBlank(String str) {
        int length;

        if ((str == null) || ((length = str.length()) == 0)) {
            return true;
        }

        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    /**
     * 检查字符串是否不是空白：<code>null</code>、空字符串<code>""</code>或只有空白字符。
     * <pre>
     * StringUtil.isBlank(null)      = false
     * StringUtil.isBlank("")        = false
     * StringUtil.isBlank(" ")       = false
     * StringUtil.isBlank("bob")     = true
     * StringUtil.isBlank("  bob  ") = true
     * </pre>
     *
     * @param str 要检查的字符串
     *
     * @return 如果为空白, 则返回<code>true</code>
     */
    public static boolean isNotBlank(String str) {
        int length;

        if ((str == null) || ((length = str.length()) == 0)) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return true;
            }
        }

        return false;
    }
    
    /**
     * 是否为数字
     * " 2 " true
     * @param str
     * @return
     */
    public static boolean isNumeric(String str) {
    	if (org.apache.commons.lang.StringUtils.isNumeric(str) && !str.trim().equals("")) {
    		return true;
    	}
    	return false;
    }
    
    /**
     * 将blob转为字节数组
     * 
     * @param blob
     *            a {@link Blob} object
     * @return byte array
     */
    public static byte[] blobToByte(Blob blob) {
        try {
            if (null == blob || 0 == blob.length()) {
                return null;
            }
            return blob.getBytes(1, (int) blob.length());
        } catch (SQLException e) {
            return null;
        }
    }
       
    /**
     * 取得最小数。
     *
     * @param a 整数1
     * @param b 整数2
     * @param c 整数3
     *
     * @return 三个数中的最小值
     */
	public static int min(int a, int b, int c) {
        if (b < a) {
            a = b;
        }

        if (c < a) {
            a = c;
        }

        return a;
    }
	
	/**
     * 将空值转为""
     *
     * @param str !=null or !=""
     *
     * @return boolean
     */
	public static String nullToEmpty(Object obj) {
        if (obj == null)
            return "";
        String str = obj.toString();
        return str == null ? "" : str;
    }
	
    
    /**
     *  生成四位随机数，包括数字和字符
     *
     * @return String
     */
	public static String generateFourWord() {  
		String[] beforeShuffle = new String[] { "2", "3", "4", "5", "6", "7",  
			"8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",  
			"K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",  
			"W", "X", "Y", "Z" };  
		List list = Arrays.asList(beforeShuffle);  
		Collections.shuffle(list);  
		StringBuilder sb = new StringBuilder();  
		for (int i = 0; i < list.size(); i++) {  
			sb.append(list.get(i));  
		}  
		String afterShuffle = sb.toString();  
		String result = afterShuffle.substring(5, 9);  
		return result;  
	}  
	
	/**
     *  生成四位随机数字
     *
     * @return String
     */
	public static String generateFourDigital() {  
		String[] beforeShuffle = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9"}; 
		List list = Arrays.asList(beforeShuffle);  
		Collections.shuffle(list);  
		StringBuilder sb = new StringBuilder();  
		for (int i = 0; i < list.size(); i++) {  
			sb.append(list.get(i));  
		}  
		String afterShuffle = sb.toString();  
		String result = afterShuffle.substring(5, 9);  
		return result;  
	}  
	
	
	/**
     *  生成三位随机数字
     *
     * @return String
     */
	public static String generateThreeDigital() {  
		String[] beforeShuffle = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9"};  
		List list = Arrays.asList(beforeShuffle);  
		Collections.shuffle(list);  
		StringBuilder sb = new StringBuilder();  
		for (int i = 0; i < list.size(); i++) {  
			sb.append(list.get(i));  
		}  
		String afterShuffle = sb.toString();  
		String result = afterShuffle.substring(5, 8);  
		return result;  
	}  
	
	
	/**
     *  去除字符串前后3位随机数
     *
     * @return String
     */
	public static String rtnResult(String parmString) {  
		String result = parmString.substring(3,parmString.length());  
		result=result.substring(0,result.length()-3);
		return result;  
	}  
	
	
	/**
     *  生成新账号
     *  新账号生成规则
     *  (将字符串前后各加三个随机数字)
     *  @param id 唯一ID号
     *
     * @return String
     */
	public static String generateNewAccount(Long id) {  
		
		String newAccount=generateThreeDigital() + id + generateThreeDigital();
		
		return newAccount;  
	}  
	
	/**
     * 根据距离换算为经纬度
     *
     * @return double
     */
	public static double transLongitudeAndLatitude(double circleSize) {	
		//double 有精度问题
		BigDecimal circleBigSize=new BigDecimal(circleSize);
		BigDecimal distinceBigSize=new BigDecimal("110.0");
		
		BigDecimal tempValue=circleBigSize.divide( distinceBigSize, 6, BigDecimal.ROUND_HALF_UP);  //四舍五入
		double bwtValue=tempValue.doubleValue();
		return bwtValue;  
	} 
	
	
	/**
     * 标准化double数据
     *
     * @return double
     */
	public static double integrateDouble(double value) {	
		//规则化字符串
		DecimalFormat df=new DecimalFormat("0.000000"); 
		double rtValue=Double.valueOf(df.format(value));
		
		return rtValue;  
	}  

	
	/***
	 * 获取分页总页数
	 * @param numPage  查询的数据总行数
	 * @param pageSize 展示页面每页显示个数
	 * @return int     总页数 
	 */
    public static int getPageCountTotal(int numPage,int pageSize) {
		int pageCount = (numPage % pageSize == 0) ? (numPage / pageSize) : (numPage
				/ pageSize + 1);
		return pageCount;
	}
	
	/***
	 * 获取真实第多少页
	 * @param pageCount 分页总页数
	 * @param startPage 显示第多少页
	 * @return int   第多少页
	 */
    public static int getStartPage(int pageCount,String startPage) {		
		if (Integer.valueOf(startPage) >= pageCount) {			
			startPage = String.valueOf(pageCount);
		}
		//这里确定是从第几页查询
		int page=Integer.valueOf(startPage);
		return page;
	}
    
    
    /***
	 * 确定分页中真实的从第几行数据开始查询
	 * @param page 开始查询第多少页
	 * @param pageSize 默认每页显示数量
	 * @return int   第多少行
	 */
    public static int getStartLine(int page,int pageSize) {		
		//下面确定从第几个数据开始查询
		int line=(page - 1) * pageSize;
		return line;
	}

    /**
     * 四舍五入保存n位小数
     * @param d
     * @param n
     * @return
     */
    public static double round(double d, int n) {
    	BigDecimal bigDecimal = new BigDecimal(Double.toString(d));
    	return bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
    
    //根据两个经纬度查询两点之间距离（单位：米）
    private static double EARTH_RADIUS = 6378137;
	private static double rad(double d){
	   return d * Math.PI / 180.0;
	}
	
	/**
	 * 根据两个经纬度查询两点之间距离（单位：米）
	 * @param lng1   第一个点经度（PS:120.2）
	 * @param lat1   第一个点纬度（PS:30.18028）
	 * @param lng2   第二个点经度（PS:120.2）
	 * @param lat2   第二个点纬度（PS:30.18028）	 
	 * @return
	 */
	public static double GetDistance(double lng1, double lat1, double lng2, double lat2){
	   double radLat1 = rad(lat1);
	   double radLat2 = rad(lat2);
	   double a = radLat1 - radLat2;
	   double b = rad(lng1) - rad(lng2);
	   double s = 2 * Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2) +
			   	Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
	   s = s * EARTH_RADIUS;
	   s = Math.round(s * 10000) / 10000;	 	  
	   return s;
	}
	
	
	/**
     * sql语句IN中的数据量不能超过1000条的解决办法
     * @param strArry 参数条件集合
     * @param columnName 列名
     * @param markType 是否传单引号还是空
     * @return
     */
    public static String getSqlStrByArry(Object[] strArry,String columnName,String markType) {      
    	if(markType==null || !"'".equals(markType)){
    		markType ="";
    	}
        StringBuffer sql = new StringBuffer("");
        if (strArry != null) {
        	sql.append(" ( "); //多组or 要用括号括起
            sql.append(" ").append(columnName).append (" in ( ");
            for (int i = 0; i < strArry.length; i++) {
            	sql.append(markType).append(strArry[i] +markType+ ",");
                if ((i + 1) % 1000 == 0 && (i + 1) < strArry.length) {
                    sql.deleteCharAt(sql.length() - 1);
                    sql.append(" ) or ").append(columnName).append (" IN (");
                }
            }
            sql.deleteCharAt(sql.length() - 1);
            sql.append(" )");
            sql.append(" ) "); //多组or 要用括号括起
        }
        return sql.toString();
    }
    /**
	 * 
	 * @param str 转换的字符串
	 * @param for1 转换前的格式
	 * @param for2 转换后的格式
	 * @return
	 * @throws ParseException
	 */
	public static String formatStr(String str,String for1,String for2) throws ParseException {
		String sfstr = str;
		if(isNotBlank(str)){
			SimpleDateFormat sf1 = new SimpleDateFormat(for1);
			SimpleDateFormat sf2 = new SimpleDateFormat(for2);
			sfstr = sf2.format(sf1.parse(str));
		}
		return sfstr;
	}
	
	
	/**
	 * 整形转为三位字符串
	 * @param str 转换的字符串
	 * @param for1 转换前的格式
	 * @param for2 转换后的格式
	 * @return
	 * @throws ParseException
	 */
	public static String formatNuberStr(String numberStr) throws ParseException {
		String newNumberStr ="";	
		if(numberStr!=null){
			if(numberStr.length() == 1){
				newNumberStr+="00"+numberStr;	
			}else if(numberStr.length()==2){
				newNumberStr+="0"+numberStr;
			}else{
				newNumberStr+= numberStr;
			}
		}
		return newNumberStr;
	}
	
	
	
}
