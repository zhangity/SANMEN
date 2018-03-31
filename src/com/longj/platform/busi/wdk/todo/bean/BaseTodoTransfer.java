package com.longj.platform.busi.wdk.todo.bean;

public abstract class BaseTodoTransfer {
	//同步新增
	public abstract String WSTodoAdd(String instr);
	//同步关闭
	public abstract String WSTodoClose(String instr);
//	//同步查询
//	public abstract String WSTodoQuery(String instr);
//	//同步查询已办
//	public abstract String WSTodoQueryHist(String instr);
//	//同步统计
//	public abstract String WSTodoStatis(String instr);
}