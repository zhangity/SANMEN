package com.longj.platform.pb.upload;

import java.io.InputStream;
import java.io.OutputStream;

import org.wdk.module.wql.core.bean.ConnectBean;

import net.sf.json.JSONArray;

public interface NFile {

	/**
	 * 更新文件名
	 * @param fileid
	 * @param businessid
	 * @param businesstype
	 * @param filename
	 * @return
	 */
	boolean updateFilename(String fileid, String businessid,
			String businesstype, String filename);

	/**
	 * 保存
	 * @param filename
	 * @param businessid
	 * @param businesstype
	 * @param catacode
	 * @param is
	 * @return
	 */
	String save(String filename, String businessid, String businesstype,
			String catacode, InputStream is);
	
	FileContent get(String fileid, String businessid,
			String businesstype);
	
	FileContent getEecoded(String fileid, String businessid,
			String businesstype);
	
	FileContent getBusinessFile(String fileid, String businessid,
			String businesstype);
	
	String getFileId(String businessid,String businesstype);
	
	boolean delete(String fileid, String businessid,
			String businesstype);
	
	byte[] getZip(JSONArray filedef);
	
	boolean exists(String fileid, String businessid,
			String businesstype);

}