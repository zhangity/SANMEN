package com.longj.platform.pb.upload;

import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.wdk.module.wql.core.bean.ConnectBean;

public interface FileServer {

	

	/**
	 * 保存文件
	 * 
	 * @param catacode
	 * @param is
	 * @return
	 */
	void save(HttpServletRequest request, HttpServletResponse response)  throws Exception ;

	/**
	 * 更新文件
	 * 
	 * @param fileid
	 * @param filename 文件名不带后缀
	 * @return
	 */
	boolean updateFilename(String fileid, String filename,ConnectBean conn);
	/**
	 * 更新文件
	 * 
	 * @param catacode
	 * @param is
	 * @param fileid
	 * @return
	 */
	String update(String catacode, InputStream is, String fileid);

	/**
	 * 获取文件
	 * @param fileid
	 * @param businessid
	 * @param businesstype
	 */
	String get(String fileid, String businessid,
			String businesstype,OutputStream baos,ConnectBean conn);
	/**
	 * 获取文件流
	 * @param fileid
	 * @param businessid
	 * @param businesstype
	 * @return
	 */
	InputStream getInputStream(String fileid, String businessid,
			String businesstype,ConnectBean conn);
	/**
	 * 保存文件
	 * @param filename
	 * @param is
	 * @return
	 * @throws Exception
	 */
	String save(String filename,String businessid,String businesstype,String catacode,InputStream is,ConnectBean conn)  throws Exception;
	/**
	 * 下载文件
	 * 
	 * @param fileid
	 * @return
	 */
	void get(HttpServletRequest request, HttpServletResponse response);
	
	
	/**
	 * 下载文件
	 * 
	 * @param fileid
	 * @return
	 */
	void getBusinessFile(HttpServletRequest request, HttpServletResponse response);
	
	/**
	 * 通过业务编号及业务类型获取文件编号
	 * 
	 * @param fileid
	 * @return
	 */
	String getFileId(String businessid,String businesstype,ConnectBean conn);
	
	/**
	 * 删除文件
	 * 
	 * @param fileid
	 * @return
	 */
	boolean delete(String fileid,ConnectBean conn);

	/**
	 * 保存文件
	 * 
	 * @param catacode
	 * @param is
	 * @return
	 */
	String save(HttpServletRequest request)  throws Exception;

	/**
	 * 删除文件
	 * 
	 * @param fileid
	 * @return
	 */
	boolean delete(String businessId, String type,ConnectBean conn);
	/**
	 * 压缩文件（从文件服务取文件并压缩）
	 * @param filedef 文件定义用JSONArray
	 * @param os 压缩文件输出流，可以是已创建的文件输出流，也可以是response的输出流
	 */
	void getZip(JSONArray filedef,OutputStream os,ConnectBean conn);
}