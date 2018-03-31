package com.longj.platform.busi.wdk.uum.avatar;

import java.util.HashMap;

import net.sf.json.JSONArray;

import org.jbpm.api.cmd.Environment;
import org.wdk.module.wql.core.bean.ConnectBean;

import com.longj.platform.busi.wdk.handler.SessionUser;


public interface AvatarIF {

	/**
	 * 
	 * @param sessionUser 登录信息
	 * @param piid 流程实例ID
	 * @param taskid 代办ID
	 * @param avatarid 虚拟角色ID
	 * @param paraMap 虚拟角色其他参数
	 * @return
	 */
	public JSONArray getPersons(Environment environment,SessionUser sessionUser,String piid,String taskid,String avatarid,HashMap paraMap );
	
	/**
	 * 
	 * @param sessionUser 登录信息
	 * @param piid 流程实例ID
	 * @param taskid 代办ID
	 * @param avatarid 虚拟角色ID
	 * @param paraMap 虚拟角色其他参数
	 * @param conb 数据库连接
	 * @return
	 */
	public JSONArray getPersons(Environment environment,SessionUser sessionUser,String piid,String taskid,String avatarid,HashMap paraMap,ConnectBean conb );
}