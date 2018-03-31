package com.longj.platform.pb.upload;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
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
import org.wdk.WDK;
import org.wdk.core.bean.WDKLogger;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.caucho.hessian.client.HessianProxyFactory;

public class HttpFileServer  implements FileServer {
	String url="http://127.0.0.1:8080/tieg/file";
	
	private static WDKLogger logger = new WDKLogger(HttpFileServer.class.getName());
	public HttpFileServer(String url) {
		super();
		this.url = url;
	}

	@Override
	public boolean delete(String fileid,ConnectBean conn) {
		// TODO Auto-generated method stub
		HessianProxyFactory factory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) factory.create(NFile.class, url);
            return fs.delete(fileid, null, null);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
	}

	@Override
	public boolean delete(String businessId, String type,ConnectBean conn) {
		// TODO Auto-generated method stub
		HessianProxyFactory factory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) factory.create(NFile.class, url);
            return fs.delete(null, businessId, type);
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
		String catacode = request.getParameter("catacode");
		
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
						String fileid = null ;
						
						HessianProxyFactory hpfactory = new HessianProxyFactory();
				        try {
				            NFile fs = (NFile) hpfactory.create(NFile.class, url);
				            fileid = fs.save(item.getName(), businessid, businesstype, catacode, item.getInputStream());
				        } catch (Exception e) {
				            // TODO Auto-generated catch block
				            e.printStackTrace();
				        }
				        if(fileid!=null){
							JSONObject fileobj=new JSONObject();
							fileobj.put("fileid", fileid);
							fileobj.put("filename",item.getName());
							fileArray.add(fileobj);
				        }
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
		String fileid=null;
		HessianProxyFactory hpfactory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) hpfactory.create(NFile.class, url);
            fileid = fs.save(name, businessid, businesstype, catacode, is);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
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
		// TODO Auto-generated method stub
		try {
			String fileid = request.getParameter("fileid");
			String businessid = request.getParameter("businessid");
			String businesstype = request.getParameter("businesstype");
			String custfilename = request.getParameter("filename");
			String decode = request.getParameter("decode");
			HessianProxyFactory hpfactory = new HessianProxyFactory();
	        try {
	            NFile fs = (NFile) hpfactory.create(NFile.class, url);
	            FileContent fc = null;
	            if("1".equals(decode)){
	            	fc = fs.getEecoded(fileid, businessid, businesstype);
	            }else{
	            	fc = fs.get(fileid, businessid, businesstype);
	            }
	            response.reset();
				String filename=null;
				if(custfilename==null || "".equals(custfilename)){
					filename=this.getFileNameNoEx(fc.getFilename());
					filename=URLEncoder.encode(filename, "utf-8");
				}else{
					filename=custfilename;
//					filename=URLEncoder.encode(filename, "ISO8859-1");
				}
				byte[] filebytes=fc.getFilebytes();
				String ext=this.getExtensionName(fc.getFilename());
				response.addHeader("Content-Disposition",
						"attachment;filename="+ WDK.encodeFileName(request, filename
						+ "." + ext ));
//				System.out.println(filename);
//				System.out.println(ext);
//				System.out.println(WDK.getContentType(ext));
//				System.out.println(filebytes.length);
				response.setContentLength(filebytes.length);
				response.setContentType(WDK.getContentType(ext));
	           
	            OutputStream os=response.getOutputStream();
	            os.write(filebytes);
	            os.close();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
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
			
		} 
	}

	@Override
	public void getBusinessFile(HttpServletRequest request,
			HttpServletResponse response) {
		// TODO Auto-generated method stub
		try {
			String fileid = request.getParameter("fileid");
			String businessid = request.getParameter("businessid");
			String businesstype = request.getParameter("businesstype");
			HessianProxyFactory hpfactory = new HessianProxyFactory();
	        try {
	            NFile fs = (NFile) hpfactory.create(NFile.class, url);
	            FileContent fc = fs.getBusinessFile(fileid, businessid, businesstype);
	            response.reset();
				String filename=null;
				filename=this.getFileNameNoEx(fc.getFilename());
				filename=URLEncoder.encode(filename, "utf-8");
				
				byte[] filebytes=fc.getFilebytes();
				response.addHeader("Content-Disposition",
						"attachment;filename="+ WDK.encodeFileName(request, filename
						+ "." + this.getExtensionName(fc.getFilename())));

				response.setContentLength(new Long(fc.getFilelen()).intValue());
				response.setContentType(WDK.getContentType(this.getExtensionName(fc.getFilename())));
	           
	            OutputStream os=response.getOutputStream();
	            os.write(filebytes);
	            os.close();
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
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
			
		} 
	}

	@Override
	public String getFileId(String businessid, String businesstype,ConnectBean conn) {
		// TODO Auto-generated method stub
		
		HessianProxyFactory hpfactory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) hpfactory.create(NFile.class, url);
            return fs.getFileId(businessid, businesstype);
        }catch(Exception e){
        	e.printStackTrace();
        }
		return "";
	}

	@Override
	public boolean updateFilename(String fileid, String filename,ConnectBean conn) {
		// TODO Auto-generated method stub
		//存入库
		HessianProxyFactory hpfactory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) hpfactory.create(NFile.class, url);
            return fs.updateFilename(fileid, null, null, filename);
        }catch(Exception e){
        	e.printStackTrace();
        }
		return false;
	}
	@Override
	public InputStream getInputStream(String fileid, String businessid,
			String businesstype,ConnectBean conn) {
		// TODO Auto-generated method stub
		HessianProxyFactory hpfactory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) hpfactory.create(NFile.class, url);
            FileContent fc = fs.get(fileid, businessid, businesstype);
            ByteArrayInputStream bais=new ByteArrayInputStream(fc.getFilebytes());
			return bais;
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
	}
	@Override
	public String get(String fileid, String businessid,
			String businesstype,OutputStream baos,ConnectBean conn) {
		// TODO Auto-generated method stub
		
		HessianProxyFactory hpfactory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) hpfactory.create(NFile.class, url);
            FileContent fc = fs.get(fileid, businessid, businesstype);
            baos.write(fc.getFilebytes());
			return fc.getFilename();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
        
	}

	@Override
	public void getZip(JSONArray filedef, OutputStream os,ConnectBean conn) {
		// TODO Auto-generated method stub
		HessianProxyFactory hpfactory = new HessianProxyFactory();
        try {
            NFile fs = (NFile) hpfactory.create(NFile.class, url);
            byte[] filebytes = fs.getZip(filedef);
            os.write(filebytes);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	    private String getExtensionName(String filename) { 
	        if ((filename != null) && (filename.length() > 0)) { 
	            int dot = filename.lastIndexOf('.'); 
	            if ((dot >-1) && (dot < (filename.length() - 1))) { 
	                return filename.substring(dot + 1); 
	            } 
	        } 
	        return filename; 
	    } 
	    
	    private String getFileNameNoEx(String filename) { 
	        if ((filename != null) && (filename.length() > 0)) { 
	            int dot = filename.lastIndexOf('.'); 
	            if ((dot >-1) && (dot < (filename.length()))) { 
	                return filename.substring(0, dot); 
	            } 
	        } 
	        return filename; 
	    }
}