package com.longj.products.ea.standard.bu;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;

public class HttpClientResponse {

	private Builder builder;
	private HttpClientResponse respone;

	public String getBody() {
		InputStream is  = 	this.getInputStream();
		ByteArrayOutputStream baos = new ByteArrayOutputStream();  
		int i;  
		String str = null;
		if(is==null){
			return str;
		}
		try {
			while ((i = is.read()) != -1) {  
			    baos.write(i);  
			}
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		try {
			str = baos.toString("UTF-8");
		} catch (UnsupportedEncodingException e) {
		}  
		return str;
		
	}

	public InputStream getInputStream() {
		return builder.getIn();
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public HttpClientResponse getRespone() {
		return respone;
	}

	public void setRespone(HttpClientResponse respone) {
		this.respone = respone;
	}

	public class Builder {

		private HttpResponse httpresponse;

		private ByteArrayInputStream in;

		private List<Exception> eList = new ArrayList<Exception>();

		public void setHttpResponse(HttpResponse httpresponse) {
			this.httpresponse = httpresponse;
		}

		public void setBodyInputStream(ByteArrayInputStream in) {
			this.in = in;
		}

		public void setEx(Exception e) {
			eList.add(e);
		}

		public HttpClientResponse build() {
			return respone;
		}

		public HttpResponse getHttpresponse() {
			return httpresponse;
		}

		public void setHttpresponse(HttpResponse httpresponse) {
			this.httpresponse = httpresponse;
		}

		public ByteArrayInputStream getIn() {
			return in;
		}

	}

	public static Builder custom() {
		HttpClientResponse response = new HttpClientResponse();
		response.setRespone(response);
		response.setBuilder(response.new Builder());
		return response.getBuilder();
	}

}
