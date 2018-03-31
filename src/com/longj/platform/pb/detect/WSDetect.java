package com.longj.platform.pb.detect;

import org.wdk.core.base.BaseWS;


public class WSDetect extends BaseWS{

	@Override
	public String process(String instr) {
		// TODO Auto-generated method stub
		
		return DetectServer.process(instr);
	}

}