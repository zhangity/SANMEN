package com.longj.platform.pb.upload;

import java.io.FileOutputStream;

import org.wdk.WDK;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class FileServerFactory {
	private static FileServer fileServer=null;
	public static FileServer getInstance() {
		if(fileServer==null){
			if("http".equalsIgnoreCase(WDK.getNodeParam("file_server_type"))){
				fileServer=new HttpFileServer(WDK.getNodeParam("file_server_url"));
				System.out.println("file.server.type=http");
			}else{
				fileServer=new LocalFileServer();
				System.out.println("file.server.type=local");
			}
		}
		return fileServer;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		FileOutputStream fos=new FileOutputStream("out.zip");
		JSONArray ja=new JSONArray();
		JSONObject jo=new JSONObject();
		jo.put("businessid", "1111111111111");
		jo.put("businesstype", "draft");
		ja.add(jo);
		
		JSONObject jo2=new JSONObject();
		jo2.put("fileid", "1111111111111");
		jo2.put("name", "发文附件.doc");
		jo2.put("path", "attachment");
		ja.add(jo2);
		
		FileServerFactory.getInstance().getZip(ja,fos,null);
	}
}