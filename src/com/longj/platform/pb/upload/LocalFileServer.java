package com.longj.platform.pb.upload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;
import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.core.bean.AttachmentBean;
import org.wdk.core.bean.CatalogBean;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;

import com.longj.platform.pb.util.StringUtil;


public class LocalFileServer  implements FileServer {
	private static WDKLogger logger = new WDKLogger(LocalFileServer.class.getName());
	@Override
	public boolean delete(String fileid,ConnectBean conn) {
		// TODO Auto-generated method stub
		try {
			AttachmentBean attachment = (AttachmentBean) WQL.getWO("QWDKSY0013")
			.addParam("flag", "2")
			.addParam("fileid", fileid)
			.process(conn)
			.getObject(0, AttachmentBean.class);
			if (null != attachment) {
				CatalogBean catabean = (CatalogBean) WQL.getWO("QWDKSY0012")
										.addParam("flag", "1")
										.addParam("catacode", attachment.getCatacode())
										.process(conn)
										.getObject(0, CatalogBean.class);
				if(null!=catabean){
					String filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
					File f = new File(filepath);
					if(f.exists()){
						if(WQL.getWO("UWDKSY0013")
						.addParam("flag", "3")
						.addParam("fileid", fileid)
						.process(conn).isSuccess()){
							return f.delete();
						}
					}
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String businessId, String type,ConnectBean conn) {
		// TODO Auto-generated method stub
		try {
			FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
			.addParam("flag", "1")
			.addParam("businessid",businessId )
			.addParam("businesstype",type)
			.process(conn)
			.getObject(0, FileBusinessBean.class);
			if(fbb!=null && fbb.fileid!=null){
				return delete(fbb.fileid,conn);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void save(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.getWriter().write(save(request));
	}
	@Override
	public String save(HttpServletRequest request)  throws Exception {
		// TODO Auto-generated method stub
		String businessid = request.getParameter("businessid");
		String businesstype = request.getParameter("businesstype");
		logger.debug("businessid="+businessid);
		logger.debug("businesstype="+businesstype);
		boolean hasbid=(null!=businessid);
				
		String catacode = request.getParameter("catacode");
		logger.debug("catacode="+catacode);
		if(null==catacode||"".equals(catacode)){
			catacode = WDKConstant.CATALOG_DEFAULT;
		}
		
		CatalogBean cb = (CatalogBean) WQL.getWO("QWDKSY0012")
											.addParam("flag", "1")
											.addParam("catacode", catacode)
											.process()
											.getObject(0,CatalogBean.class);
		String subcata = WDK.getDateTimeByFormat("yyyyMM");
		String catapath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+cb.getFilepath()+File.separator+subcata;
		File dir = new File(catapath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String operdt = WDK.getDateTime();
		JSONArray fileArray=new JSONArray();

		FileItemFactory factory = new DiskFileItemFactory();
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		// 防止中文文件名乱码
		upload.setHeaderEncoding("UTF-8");
		try {
			List<FileItem> items = upload.parseRequest(request);
			if (items != null) {
				Iterator<FileItem> itr = items.iterator();
				while (itr.hasNext()) {
					
					FileItem item = (FileItem) itr.next();
					if (item.isFormField()) {
						continue;
					} else {
						if(hasbid && "true".equalsIgnoreCase(WDK.getNodeParam("file_server_save_single"))){
							delete(businessid,businesstype,null);								
						}
						String fileid = WDK.getUUID();
						String fileext = WDK.getFileExt(item.getName());
						String filename = WDK.getFileName(item.getName());
						File f = new File(catapath+File.separator+fileid + "."+ fileext);
						item.write(f);
						long filesize = f.length();
						//存入库
						WQL.getWO("UWDKSY0013")
							.addParam("flag", "1")
							.addParam("fileid", fileid)
							.addParam("filename",filename )
							.addParam("filesize", Long.toString(filesize))
							.addParam("fileext", fileext)
							.addParam("catacode", catacode)
							.addParam("subcata",subcata )
							.addParam("personid", "")
							.addParam("status","1")
							.addParam("ordercode", "")
							.addParam("createdt",operdt)
							.process();
						logger.debug("saved file,fileid="+fileid+"&filename="+filename);
						//存入库
						if(hasbid){
							WQL.getWO("UPFPBFILE001")
							.addParam("flag", "4")
							.addParam("businessid",businessid )
							.addParam("businesstype", businesstype)
							.process();
							
							WQL.getWO("UPFPBFILE001")
								.addParam("flag", "1")
								.addParam("fileid", fileid)
								.addParam("businessid",businessid )
								.addParam("businesstype", businesstype)
								.process();
							
							
						}
						JSONObject fileobj=new JSONObject();
						fileobj.put("fileid", fileid);
						fileobj.put("filename", filename+"."+fileext);
						fileArray.add(fileobj);
					}
				}
			}
			if(fileArray.size()==1){
				return fileArray.getJSONObject(0).toString();
			}else{
				return fileArray.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String save(String name,String businessid,String businesstype,String catacode,InputStream is,ConnectBean conn)  throws Exception {
		// TODO Auto-generated method stub
		boolean hasbid=(null!=businessid);
				
		if(null==catacode||"".equals(catacode)){
			catacode = WDKConstant.CATALOG_DEFAULT;
		}
		
		CatalogBean cb = (CatalogBean) WQL.getWO("QWDKSY0012")
											.addParam("flag", "1")
											.addParam("catacode", catacode)
											.process(conn)
											.getObject(0,CatalogBean.class);
		String subcata = WDK.getDateTimeByFormat("yyyyMM");
		String catapath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+cb.getFilepath()+File.separator+subcata;
		File dir = new File(catapath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		String operdt = WDK.getDateTime();

		String fileid = WDK.getUUID();
		String fileext = WDK.getFileExt(name);
		String filename = WDK.getFileName(name);
		File f = new File(catapath+File.separator+fileid + "."+ fileext);
		FileOutputStream fos=new FileOutputStream(f);
		
		byte[] buff=new byte[1024];
		int len=-1;
		while((len=is.read(buff))!=-1){
			fos.write(buff,0,len);
		}
		fos.close();
		is.close();
		
		long filesize = f.length();
		//存入库
		WQL.getWO("UWDKSY0013")
			.addParam("flag", "1")
			.addParam("fileid", fileid)
			.addParam("filename",filename )
			.addParam("filesize", Long.toString(filesize))
			.addParam("fileext", fileext)
			.addParam("catacode", catacode)
			.addParam("subcata",subcata )
			.addParam("personid", "")
			.addParam("status","1")
			.addParam("ordercode", "")
			.addParam("createdt",operdt)
			.process(conn);
		logger.debug("saved file,fileid="+fileid+"&filename="+filename);
		//存入库
		if(hasbid){
			WQL.getWO("UPFPBFILE001")
			.addParam("flag", "4")
			.addParam("businessid",businessid )
			.addParam("businesstype", businesstype)
			.process(conn);
			
			WQL.getWO("UPFPBFILE001")
				.addParam("flag", "1")
				.addParam("fileid", fileid)
				.addParam("businessid",businessid )
				.addParam("businesstype", businesstype)
				.process(conn);
		}
					
		return fileid;
	}

	@Override
	public String update(String catacode, InputStream is, String fileid) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	}

	@Override
	public void get(HttpServletRequest request, HttpServletResponse response) {
		FileInputStream fileInputStream = null;
		try {
			String fileid = request.getParameter("fileid");
			String businessid = request.getParameter("businessid");
			String businesstype = request.getParameter("businesstype");
			String custfilename = request.getParameter("filename");
			String realpath = null;
			if(request.getParameter("realpath")!=null){
				realpath = URLDecoder.decode(request.getParameter("realpath"),"UTF-8");
			}
			String filepath =null;  //文件路径
			String displayName =null;  //文件名
			String fileext =null;  //扩展名
			//需要支持老文件
			if(StringUtil.isBlank(realpath)){	 //不是老文件			
				if(fileid==null || "".equals(fileid)){
					FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
					.addParam("flag", "1")
					.addParam("businessid",businessid )
					.addParam("businesstype",businesstype )
					.process()
					.getObject(0, FileBusinessBean.class);
					if(fbb!=null){
						fileid=fbb.fileid;
					}
				}
				if(fileid==null || "".equals(fileid)){
					//判断是否是老文件
					PrintWriter out = response.getWriter();
					out.print("文件不存在！");
					return;
				}
					
				AttachmentBean attachment = (AttachmentBean) WQL.getWO("QWDKSY0013")
										.addParam("flag", "2")
										.addParam("fileid", fileid)
										.process()
										.getObject(0, AttachmentBean.class);
				if (null != attachment) {
					CatalogBean catabean = (CatalogBean) WQL.getWO("QWDKSY0012")
														.addParam("flag", "1")
														.addParam("catacode", attachment.getCatacode())
														.process()
														.getObject(0, CatalogBean.class);
					if(null!=catabean){
						filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
						File f = new File(filepath);
						//支持文件名拼装文件，（历史迁移文件数据） @upd daru.zheng
						if(!f.exists()){
							filepath =  WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + attachment.getFilename() + "."+ attachment.getFileext();
						}
						//文件名
						displayName =attachment.getFilename();
						if(displayName.indexOf(".")>-1){
							displayName =displayName.substring(0,displayName.lastIndexOf("."));
						}
						//文件后缀
						fileext =  attachment.getFileext();
					}else{
						PrintWriter out = response.getWriter();
						out.print("目录不存在！");
					}
				} 
			}else{  //是老文件
				filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator + realpath;
				displayName =realpath.replaceAll("\\\\", "/");
				if(displayName.indexOf("/")>-1 && displayName.indexOf(".")>-1){
					displayName =displayName.substring(displayName.lastIndexOf("/")+1,displayName.indexOf("."));
				}
				fileext =  realpath.substring(realpath.indexOf(".")+1);
			}
			
			//文件存在标志
			boolean state =false;
			//判断文件是否存在
			if(StringUtil.isNotBlank(filepath)){
				File f = new File(filepath);
				if(f.exists()){
					state =true;  //存在文件
					fileInputStream = new FileInputStream(filepath);
					response.reset();
					String filename=null;
					if(custfilename==null || "".equals(custfilename)){
						filename=displayName;
						filename=URLEncoder.encode(filename, "utf-8");
					}else{
						filename=custfilename;
						//filename=URLEncoder.encode(filename, "ISO8859-1");
					}
					response.addHeader("Content-Disposition","attachment;filename="+ WDK.encodeFileName(request, filename+ "." + fileext));	
					response.setContentLength(new Long(f.length()).intValue());
					response.setContentType(WDK.getContentType(fileext));
					OutputStream bos = response.getOutputStream();
					int len=-1;
					byte[] fileByte = new byte[1024];
					while ((len=fileInputStream.read(fileByte)) != -1) {
						bos.write(fileByte, 0, len);
					}
					response.flushBuffer();
				}
			}
			//不存在文件
			if(!state){				
				PrintWriter out = response.getWriter();
				out.print("文件不存在！");
			}
		} catch (Exception e) {
			e.printStackTrace();
			PrintWriter out;
			try {
				out = response.getWriter();
				out.print("文件不存在！");
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
		} finally {
			if (null != fileInputStream) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void getBusinessFile(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		try {
			String fileid = request.getParameter("fileid");
			String businessid = request.getParameter("businessid");
			String businesstype = request.getParameter("businesstype");
			
			String custfilename = request.getParameter("filename");			
			String realpath = null;
			if(request.getParameter("realpath")!=null){
				realpath = URLDecoder.decode(request.getParameter("realpath"),"UTF-8");
			}
			
			String filepath =null;  //文件路径
			String displayName =null;  //文件名
			String fileext =null;  //扩展名
			//需要支持老文件
			if(StringUtil.isBlank(realpath)){	 //不是老文件				
				FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
				.addParam("flag", "1")
				.addParam("businessid",businessid )
				.addParam("businesstype",businesstype )
				.process()
				.getObject(0, FileBusinessBean.class);
				if(fbb!=null && fbb.fileid!=null && !"".equals(fbb.fileid)){
					fileid=fbb.fileid;
				}
				AttachmentBean attachment = (AttachmentBean) WQL.getWO("QWDKSY0013")
										.addParam("flag", "2")
										.addParam("fileid", fileid)
										.process()
										.getObject(0, AttachmentBean.class);
				if (null != attachment) {
					CatalogBean catabean = (CatalogBean) WQL.getWO("QWDKSY0012")
														.addParam("flag", "1")
														.addParam("catacode", attachment.getCatacode())
														.process()
														.getObject(0, CatalogBean.class);
					if(null!=catabean){
						filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
						File f = new File(filepath);
						//支持文件名拼装文件，（历史迁移文件数据） @upd daru.zheng
						if(!f.exists()){
							filepath =  WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + attachment.getFilename() + "."+ attachment.getFileext();
						}
						//文件名
						displayName =attachment.getFilename();
						if(displayName.indexOf(".")>-1){
							displayName =displayName.substring(0,displayName.lastIndexOf("."));
						}
						//文件后缀
						fileext =  attachment.getFileext();
					}else{
						PrintWriter out = response.getWriter();
						out.print("目录不存在！");
					}
				} else {
					PrintWriter out = response.getWriter();
					out.print("文件不存在！");
				}
			}else{  //是老文件
				filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator + realpath;
				displayName =realpath.replaceAll("\\\\", "/");
				if(displayName.indexOf("/")>-1 && displayName.indexOf(".")>-1){
					displayName =displayName.substring(displayName.lastIndexOf("/")+1,displayName.indexOf("."));
				}
				fileext =  realpath.substring(realpath.indexOf(".")+1);
			}
			
			//文件存在标志
			boolean state =false;
			//判断文件是否存在
			if(StringUtil.isNotBlank(filepath)){
				File f = new File(filepath);
				if(f.exists()){
					state =true;  //存在文件
					fileInputStream = new FileInputStream(filepath);
					response.reset();
					String filename=null;
					if(custfilename==null || "".equals(custfilename)){
						filename=displayName;
						filename=URLEncoder.encode(filename, "utf-8");
					}else{
						filename=custfilename;
					}
					response.addHeader("Content-Disposition","attachment;filename="+ WDK.encodeFileName(request, filename+ "." + fileext));	
					response.setContentLength(new Long(f.length()).intValue());
					response.setContentType(WDK.getContentType(fileext));
					OutputStream bos = response.getOutputStream();
					int len=-1;
					byte[] fileByte = new byte[1024];
					while ((len=fileInputStream.read(fileByte)) != -1) {
						bos.write(fileByte, 0, len);
					}
					response.flushBuffer();
				}
			}
			//不存在文件
			if(!state){				
				PrintWriter out = response.getWriter();
				out.print("文件不存在！");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			PrintWriter out;
			try {
				out = response.getWriter();
				out.print("文件不存在！");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} finally {
			if (null != fileInputStream) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public String getFileId(String businessid, String businesstype,ConnectBean conn) {
		// TODO Auto-generated method stub
		
		try {
			FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
			.addParam("flag", "1")
			.addParam("businessid",businessid )
			.addParam("businesstype",businesstype )
			.process(conn)
			.getObject(0, FileBusinessBean.class);
			if(fbb!=null) return fbb.fileid;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}

	@Override
	public boolean updateFilename(String fileid, String filename,ConnectBean conn) {
		// TODO Auto-generated method stub
		//存入库
		ResultBean rb = WQL.getWO("UWDKSY0013")
			.addParam("flag", "2")
			.addParam("fileid", fileid)
			.addParam("filename",filename )
			.process(conn);
		return rb.isSuccess();
	}
	@Override
	public InputStream getInputStream(String fileid, String businessid,
			String businesstype,ConnectBean conn) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		try {
			if(fileid==null || "".equals(fileid)){
				FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
				.addParam("flag", "1")
				.addParam("businessid",businessid )
				.addParam("businesstype",businesstype )
				.process(conn)
				.getObject(0, FileBusinessBean.class);
				if(fbb!=null){
					fileid=fbb.fileid;
				}
			}
			if(fileid==null || "".equals(fileid)){
				return null;
			}
				
			AttachmentBean attachment = (AttachmentBean) WQL.getWO("QWDKSY0013")
									.addParam("flag", "2")
									.addParam("fileid", fileid)
									.process(conn)
									.getObject(0, AttachmentBean.class);
			if (null != attachment) {
				CatalogBean catabean = (CatalogBean) WQL.getWO("QWDKSY0012")
													.addParam("flag", "1")
													.addParam("catacode", attachment.getCatacode())
													.process(conn)
													.getObject(0, CatalogBean.class);
				if(null!=catabean){
					String filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
					File f = new File(filepath);
					fileInputStream = new FileInputStream(filepath);
					
					return fileInputStream;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if (null != fileInputStream) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
	@Override
	public String get(String fileid, String businessid,
			String businesstype,OutputStream baos,ConnectBean conn) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		try {
			if(fileid==null || "".equals(fileid)){
				FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
				.addParam("flag", "1")
				.addParam("businessid",businessid )
				.addParam("businesstype",businesstype )
				.process(conn)
				.getObject(0, FileBusinessBean.class);
				if(fbb!=null){
					fileid=fbb.fileid;
				}
			}
			if(fileid==null || "".equals(fileid)){
				return null;
			}
				
			AttachmentBean attachment = (AttachmentBean) WQL.getWO("QWDKSY0013")
									.addParam("flag", "2")
									.addParam("fileid", fileid)
									.process(conn)
									.getObject(0, AttachmentBean.class);
			if (null != attachment) {
				CatalogBean catabean = (CatalogBean) WQL.getWO("QWDKSY0012")
													.addParam("flag", "1")
													.addParam("catacode", attachment.getCatacode())
													.process(conn)
													.getObject(0, CatalogBean.class);
				if(null!=catabean){
					String filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
					File f = new File(filepath);
					fileInputStream = new FileInputStream(filepath);
					
					int len=-1;
					byte[] fileByte = new byte[1024];
					while ((len=fileInputStream.read(fileByte)) != -1) {
						baos.write(fileByte, 0, len);
					}
					return attachment.getFilename() + "."+ attachment.getFileext();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if (null != fileInputStream) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	@Override
	public void getZip(JSONArray filedef, OutputStream os,ConnectBean conn) {
		// TODO Auto-generated method stub
		ZipOutputStream zos=null;
		try{
			zos=new ZipOutputStream(os);
			zos.setEncoding("gbk");
			zos.setMethod(ZipOutputStream.DEFLATED);
			for(int i=0;i<filedef.size();i++){
				JSONObject file=filedef.getJSONObject(i);
				zip(file.optString("path"),file.optString("name"),file.optString("fileid"),
						file.optString("businessid"),file.optString("businesstype"),zos,conn);
			}
//			zos.finish();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				zos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void zip(String path,String name,String fileid, String businessid,
			String businesstype,ZipOutputStream zos,ConnectBean conn) {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = null;
		try {
			if(fileid==null || "".equals(fileid)){
				FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
				.addParam("flag", "1")
				.addParam("businessid",businessid )
				.addParam("businesstype",businesstype )
				.process(conn)
				.getObject(0, FileBusinessBean.class);
				if(fbb!=null){
					fileid=fbb.fileid;
				}
			}
			if(fileid==null || "".equals(fileid)){
				return;
			}
				
			AttachmentBean attachment = (AttachmentBean) WQL.getWO("QWDKSY0013")
									.addParam("flag", "2")
									.addParam("fileid", fileid)
									.process(conn)
									.getObject(0, AttachmentBean.class);
			if (null != attachment) {
				CatalogBean catabean = (CatalogBean) WQL.getWO("QWDKSY0012")
													.addParam("flag", "1")
													.addParam("catacode", attachment.getCatacode())
													.process(conn)
													.getObject(0, CatalogBean.class);
				if(null!=catabean){
					String filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
					File f = new File(filepath);
					fileInputStream = new FileInputStream(f);
					String filename=name;
					if(filename==null || "".equals(filename)){
						if(businessid!=null && !"".equals(businessid)){
							filename=businessid+businesstype +"."+ attachment.getFileext();
						}else{
							filename=attachment.getFilename()+ "."+ attachment.getFileext();
						}
					}
					if(path!=null && !"".equals(path)){
						filename=path+"/"+filename;
					}
//					filename=Encoder.getUTF8StringFromGBKString(filename);
					ZipEntry ze = new ZipEntry(filename);
					ze.setSize(f.length());
					ze.setTime(f.lastModified());
					ze.setMethod(ZipEntry.DEFLATED);
					zos.putNextEntry(new ZipEntry(ze));
					byte[] fileByte = new byte[1024];
					int len=-1;
					while ((len=fileInputStream.read(fileByte)) !=-1) {
						zos.write(fileByte, 0, len);
					}
					zos.closeEntry();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if (null != fileInputStream) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}