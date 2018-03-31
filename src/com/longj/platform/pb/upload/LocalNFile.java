package com.longj.platform.pb.upload;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;
import org.apache.xerces.impl.dv.util.Base64;
import org.wdk.WDK;
import org.wdk.WDKConstant;
import org.wdk.WDKCore;
import org.wdk.core.bean.AttachmentBean;
import org.wdk.core.bean.CatalogBean;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.WQL;
import org.wdk.module.wql.core.bean.ConnectBean;
import org.wdk.module.wql.core.bean.ResultBean;

public class LocalNFile  implements NFile{
	private static WDKLogger logger = new WDKLogger(LocalNFile.class.getName());
	private ConnectBean conn=null;

	public LocalNFile(ConnectBean conn) {
		super();
		this.conn = conn;
	}
	public LocalNFile() {
		super();
	}

	public boolean updateFilename(String fileid, String businessid,
			String businesstype, String filename) {
		logger.errorWithNoException("updateFilename");
		if(fileid==null){
			fileid=getFileId(businessid,businesstype);
		}
		if(fileid==null) return false;
		ResultBean rb = WQL.getWO("UWDKSY0013")
		.addParam("flag", "2")
		.addParam("fileid", fileid)
		.addParam("filename",filename )
		.process(conn);
		return rb.isSuccess();
	}

	public String save(String filename, String businessid, String businesstype,
			String catacode, InputStream is) {
		try {
			logger.errorWithNoException("String save(String filename, String businessid, String businesstype,String catacode, InputStream is)");
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
			if(hasbid && "true".equalsIgnoreCase(WDK.getNodeParam("file_server_save_single"))){
				delete(null,businessid,businesstype);								
			}
			String fileid = WDK.getUUID();
			String fileext = WDK.getFileExt(filename);
			String vfilename = WDK.getFileName(filename);
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
				.addParam("filename",vfilename )
				.addParam("filesize", Long.toString(filesize))
				.addParam("fileext", fileext)
				.addParam("catacode", catacode)
				.addParam("subcata",subcata )
				.addParam("personid", "")
				.addParam("status","1")
				.addParam("ordercode", "")
				.addParam("createdt",operdt)
				.process(conn);
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
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public FileContent get(String fileid, String businessid,
			String businesstype) {
		return get(fileid,businessid,businesstype,false);
	}
	public FileContent get(String fileid, String businessid,
			String businesstype,boolean usefilename) {
		logger.errorWithNoException("get");
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
					if(usefilename){
						filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator +attachment.getFilename();
					}
					File f = new File(filepath);
					fileInputStream = new FileInputStream(filepath);
					ByteArrayOutputStream baos=new ByteArrayOutputStream();
					int len=-1;
					byte[] buff=new byte[1024];
					while((len=fileInputStream.read(buff))!=-1){
						baos.write(buff,0,len);
					}
					return new FileContent(fileid,attachment.getFilename()+"."+attachment.getFileext(),baos.toByteArray(),f.length());
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
	
	public String getFileId(String businessid,String businesstype) {
		try {
			logger.errorWithNoException("getFileId");
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
	
	public boolean delete(String fileid, String businessid,
			String businesstype) {
		try {
			if(fileid==null){
				FileBusinessBean fbb= (FileBusinessBean)WQL.getWO("QPFPBFILE001")
				.addParam("flag", "1")
				.addParam("businessid",businessid )
				.addParam("businesstype",businesstype)
				.process()
				.getObject(0, FileBusinessBean.class);
				if(fbb!=null && fbb.fileid!=null){
					fileid= fbb.fileid;
				}else{
					return false;
				}
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
	
	public byte[] getZip(JSONArray filedef) {
		logger.errorWithNoException("getZip");
		ByteArrayOutputStream os=new ByteArrayOutputStream();
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
			return os.toByteArray();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(zos!=null){
					
					zos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public boolean exists(String fileid, String businessid,
			String businesstype) {
		logger.errorWithNoException("exists");
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
				return false;
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
					return f.exists();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
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
					String filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
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
	@Override
	public FileContent getBusinessFile(String fileid, String businessid,
			String businesstype) {
		// TODO Auto-generated method stub

		logger.errorWithNoException("getBusinessFile");
		FileInputStream fileInputStream = null;
		try {
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
					String filepath = WDKCore.inst.CFG_RESOURCE_ATTACHMENT + File.separator+ catabean.getFilepath()+File.separator+attachment.getSubcata()+File.separator + fileid + "."+ attachment.getFileext();
					File f = new File(filepath);
					fileInputStream = new FileInputStream(filepath);
					ByteArrayOutputStream baos=new ByteArrayOutputStream();
					int len=-1;
					byte[] buff=new byte[1024];
					while((len=fileInputStream.read(buff))!=-1){
						baos.write(buff,0,len);
					}
					return new FileContent(fileid,attachment.getFilename()+"."+attachment.getFileext(),baos.toByteArray(),f.length());
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
	public FileContent getEecoded(String fileid, String businessid,
			String businesstype) {
		// TODO Auto-generated method stub
		FileContent fc=this.get(fileid, businessid, businesstype,true);
		fc.setFilebytes(decode(fc.getFilebytes()));
		return fc;
	}
	
	private byte[] decode(byte[] data){
		ByteArrayOutputStream baos=null;
		try {
			baos=new ByteArrayOutputStream();
			
			if(data[7]==0x30 && data[8]==0x4d){
				baos.write(data,7,data.length-7);
			}else if(data[13]==0x30 && data[14]==0x4d){
				baos.write(data,13,data.length-13);
			}else{
				return data;
			}
			
			if(baos.size()>0){
				byte[] b =Base64.decode(new String(baos.toByteArray()));;
				return b;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(baos!=null)
					baos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}