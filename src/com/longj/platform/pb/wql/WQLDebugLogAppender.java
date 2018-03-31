package com.longj.platform.pb.wql;

import java.util.ArrayList;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

public class WQLDebugLogAppender extends AppenderSkeleton{
	private final int LOG_MAX_SIZE = 1000;//日志最大行数
	private ArrayList<String> loglist = new ArrayList<String>();

	@Override
	protected void append(LoggingEvent arg0) {
		// TODO Auto-generated method stub
		//System.out.println("WQLDebugLogAppender append"+arg0.getMessage());
		if(loglist.size()>LOG_MAX_SIZE){
			loglist.remove(0);
		}
		loglist.add(arg0.getMessage().toString());
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		//System.out.println("WQLDebugLogAppender close");
	}

	@Override
	public boolean requiresLayout() {
		// TODO Auto-generated method stub
		//System.out.println("WQLDebugLogAppender requiresLayout");
		return false;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<loglist.size();i++){
			sb.append(loglist.get(i)).append("\r\n");
		}
		return sb.toString();
	}

}
