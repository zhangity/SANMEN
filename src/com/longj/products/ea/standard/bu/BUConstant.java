package com.longj.products.ea.standard.bu;

/**
 * 预约检查系统常量表
 * 
 * @author YuBin
 * 
 */
public interface BUConstant {

	// 号码类型：1普通号码；2加号
	public static final String NUMBER_TYPE_NORMAL = "1";//普通号码
	public static final String NUMBER_TYPE_ADD = "2";//加号

	// 锁号类型：0-不锁号 1-住院锁号 2-医技科室锁号
	public static final String LOCKTYPE_NONE = "0";// 不锁号
	public static final String LOCKTYPE_ZYSH = "1";// 住院锁号
	public static final String LOCKTYPE_YJSH = "2";// 医技科室锁号

	// 1-排班锁号 2-人工锁号
	public static final String LOCKSOURCE_AT = "1";// 排班自动锁号
	public static final String LOCKSOURCE_MT = "2";// 人工锁号

	// 平台通用状态：1-启用；0-禁用
	public static final String STATUS_ENABLE = "1";// 启用
	public static final String STATUS_DISABLE = "0";// 禁用

	// 病人类别：t1-门诊病人；t2-住院病人
	public static final String PATIENT_SORT_MZ = "t1";// 门诊病人
	public static final String PATIENT_SORT_ZY = "t2";// 住院病人
	
	// 午别类型，am-上午；pm-下午
	public static final String AMPM_AM = "am";// 午别：上午
	public static final String AMPM_PM = "pm";// 午别：下午
	
	//费用类别，1-自费；0-医保
	public static final String CHARGE_TYPE_OWN = "1"; //自费
	public static final String CHARGE_TYPE_MED = "0"; //医保
	
	//检查单的表单状态
	public static final String FORM_STATUS_s001 = "s001";// ：已提交
	public static final String FORM_STATUS_s002 = "s002";// ：已删除
	public static final String FORM_STATUS_s003 = "s003";// ：已预约
	public static final String FORM_STATUS_s004 = "s004";// ：已撤销
	public static final String FORM_STATUS_s005 = "s005";// ：已签到
	public static final String FORM_STATUS_s006 = "s006";// ：开始检查
	public static final String FORM_STATUS_s007 = "s007";// ：检查结束
	public static final String FORM_STATUS_s008 = "s008";// ：已出报告
	
	//检查单的扣费状态
	public static final String CHARGE_STATUS_s000  = "s000";//：未付费
	public static final String CHARGE_STATUS_s001  = "s001";//：已门诊付费
	public static final String CHARGE_STATUS_s002  = "s002";//：门诊退费
	public static final String CHARGE_STATUS_s003  = "s003";//：已住院付费
	public static final String CHARGE_STATUS_s004  = "s004";//：住院退费
}
