package com.longj.platform.pb.msg.adapter;

import com.longj.platform.pb.msg.bean.MSGBaseAdapter;
import com.longj.platform.pb.msg.bean.MSGBean;
import com.longj.platform.pb.msg.bean.MSGResultBean;


public class AdapterMail extends MSGBaseAdapter{

	@Override
	public MSGResultBean process(MSGBean mb) {
		MSGResultBean mrb = new MSGResultBean(true, MSGResultBean.CODE_Success, MSGResultBean.DESC_Success);
		return mrb;
	}

}