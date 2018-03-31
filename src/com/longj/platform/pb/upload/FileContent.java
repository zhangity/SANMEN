package com.longj.platform.pb.upload;

import java.io.InputStream;
import java.io.Serializable;

public class FileContent implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5606176162014249967L;
	private String fileid;
	private String filename;
	private long filelen;
	private byte[] filebytes;
	public FileContent(String fileid, String filename, byte[] filebytes,long filelen) {
		super();
		this.fileid = fileid;
		this.filename = filename;
		this.filebytes = filebytes;
		this.filelen = filelen;
	}
	public String getFileid() {
		return fileid;
	}
	public void setFileid(String fileid) {
		this.fileid = fileid;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public byte[] getFilebytes() {
		return filebytes;
	}
	public void setFilebytes(byte[] filebytes) {
		this.filebytes = filebytes;
		if(filebytes!=null)
		this.filelen=filebytes.length;
	}
	public long getFilelen() {
		return filelen;
	}
	public void setFilelen(long filelen) {
		this.filelen = filelen;
	}

}