package wql;
/**
 * 为了便于快速超找wql被引用的情况，请在开发过程中不要直接使用wql的名称，而是将需要引用的wql名称在
 * 本类中定义，通过变量的方式动态引用，便于快速超找和替换
 * @author Administrator
 *
 */
public class WQLNames {
	
	/****************************************************
	 * 				平台公用
	 ***************************************************/
	
	//留痕表
	public final static String QPFPBMARK0001 = "QPFPBMARK0001";			//交互报文留痕查询
	public final static String UPFPBMARK0001 = "UPFPBMARK0001";			//交互报文留痕更新
	
	
	//登录信息表
	public final static String QPFPB_UH0001 = "QPFPB_UH0001";		//用户信息查询
	public final static String QPFPB_UH0002 = "QPFPB_UH0002";		//登录信息查询

	public final static String UPFPB_UH0001 = "UPFPB_UH0001";		//用户信息修改
	public final static String UPFPB_UH0002 = "UPFPB_UH0002";		//登录信息修改
	
	//登录审计和操作审计
	public final static String QPFPB_AT0001 = "QPFPB_AT0001";		//登录审计查询
	public final static String QPFPB_AT0002 = "QPFPB_AT0002";		//操作审计查询

	public final static String UPFPB_AT0001 = "UPFPB_AT0001";		//登录审计修改
	public final static String UPFPB_AT0002 = "UPFPB_AT0002";		//操作审计修改
	
	//意见获取
	public final static String QPFWF0002 = "QPFWF0002";
	
	//检查是否允许账号密码登录
	public final static String QPFWF0003 = "QPFWF0003";
	
	/****************************************************
	 * 				统一待办库
	 ***************************************************/
	public final static String QPFTODO0001 = "QPFTODO0001";			//统一待办库查询操作
	public final static String QPFTODO0002 = "QPFTODO0002";			//统一待办历史库查询操作
	
	public final static String UPFTODO0001 = "UPFTODO0001";			//统一待办库更新操作
	
	/****************************************************
	 * 				统一消息
	 ***************************************************/
	public final static String QPFMSG0001 = "QPFMSG0001";			//统一消息查询操作
	
	public final static String UPFMSG0001 = "UPFMSG0001";			//统一消息更新操作
	
	
	/****************************************************
	 * 				查询操作
	 ***************************************************/
	public final static String QSYSHL0001 = "QSYSHL0001";			//登录接口：系统菜单查询
	public final static String QSYSRL0001 = "QSYSRL0001";
	public final static String QSYSRL0002 = "QSYSRL0002";
	public final static String QSYSRL0003 = "QSYSRL0003";
	public final static String QSYSRL0004 = "QSYSRL0004";			//角色人员表的查询操作
	public final static String QSYSRL0005 = "QSYSRL0005";			//菜单角色权限关联表的查询操作

	
	/****************************************************
	 * 				更新操作
	 ***************************************************/
	public final static String USYSHL0001 = "USYSHL0001";			//登录接口：系统菜单操作
	public final static String USYSRL0001 = "USYSRL0001";
	public final static String USYSRL0002 = "USYSRL0002";
	public final static String USYSRL0003 = "USYSRL0003";
	public final static String USYSRL0004 = "USYSRL0004";			//角色人员表的更新操作
	public final static String USYSRL0005 = "USYSRL0005";			//菜单角色权限关联表的更新操作
	
	
	public final static String UPFPBCB001 = "UPFPBCB001";
	
	
	/****************************************************
	 *              组织、人员
	 ***************************************************/
	public final static String QPFPB_OG0001 = "QPFPB_OG0001";	
	public final static String QPFPB_OG0002 = "QPFPB_OG0002";	
	public final static String QPFPB_OG0003 = "QPFPB_OG0003";	//两厂主任
	public final static String QPFPB_OG0004 = "QPFPB_OG0004";	//分管部门
	
	public final static String QUUMUU_0001 = "QUUMUU_0001";	
	public final static String QUUMUU_0002 = "QUUMUU_0002";	
	public final static String QUUMUU_0003 = "QUUMUU_0003";	
	public final static String QUUMUU_0004 = "QUUMUU_0004";
	public final static String QUUMUU_0005 = "QUUMUU_0005";//取部门的父部门ID和名称
	public final static String QUUMUU_0006 = "QUUMUU_0006";//zhanghc 增加
	
	public final static String UUUMUU_0001 = "UUUMUU_0001";	
	public final static String UUUMUU_0002 = "UUUMUU_0002";	
	public final static String UUUMUU_0003 = "UUUMUU_0003";	
	public final static String UUUMUU_0004 = "UUUMUU_0004";	
	public final static String UUUMUU_0005 = "UUUMUU_0005";	
	public final static String UUUMUU_0006 = "UUUMUU_0006";	
	public final static String QUUMUU_0007 = "QUUMUU_0007";		//取人员的详细信息和部门含兼职部门信息
	public final static String QUUMUU_0008 = "QUUMUU_0008";		//
	
	/****************************************************
	 *              应用、功能、角色、权限
	 ***************************************************/
	public final static String QPFPB_RL0001 = "QPFPB_RL0001";	
	public final static String QPFPB_RL0002 = "QPFPB_RL0002";	
	public final static String QPFPB_RL0003 = "QPFPB_RL0003";	
	public final static String QPFPB_RL0004 = "QPFPB_RL0004";	
	public final static String QPFPB_RL0005 = "QPFPB_RL0005";	
	public final static String QPFPB_RL0006 = "QPFPB_RL0006";	
	public final static String QPFPB_RL0007 = "QPFPB_RL0007";	
	public final static String QPFPB_RL0008 = "QPFPB_RL0008";	
	public final static String QPFPB_RL0009 = "QPFPB_RL0009";	
	public final static String QPFPB_RL0010 = "QPFPB_RL0010";
	public final static String QPFPB_RL0011 = "QPFPB_RL0011";
	
	public final static String QUUMUA_0001 = "QUUMUA_0001";	
	public final static String QUUMUA_0002 = "QUUMUA_0002";	
	public final static String QUUMUA_0003 = "QUUMUA_0003";	
	public final static String QUUMUA_0004 = "QUUMUA_0004";	
	public final static String QUUMUA_0005 = "QUUMUA_0005";	
	public final static String QUUMUA_0006 = "QUUMUA_0006";	
	public final static String QUUMUA_0007 = "QUUMUA_0007";	
	public final static String QUUMUA_0008 = "QUUMUA_0008";	
	public final static String QUUMUA_0009 = "QUUMUA_0009";	
	public final static String QUUMUA_0010 = "QUUMUA_0010";	
	public final static String QUUMUA_0011 = "QUUMUA_0011";	
	public final static String QUUMUA_0012 = "QUUMUA_0012";	//子功能数据权限设置
	

	public final static String QUUMTR_0001 = "QUUMTR_0001";			//同步查询远程库
	public final static String QUUMTR_0002 = "QUUMTR_0002";			//同步查询远程库
	public final static String QUUMTR_0003 = "QUUMTR_0003";			//同步查询远程库
	
	public final static String UUUMUA_0001 = "UUUMUA_0001";
	public final static String UUUMUA_0002 = "UUUMUA_0002";
	public final static String UUUMUA_0003 = "UUUMUA_0003";
	public final static String UUUMUA_0004 = "UUUMUA_0004";
	public final static String UUUMUA_0005 = "UUUMUA_0005";
	public final static String UUUMUA_0006 = "UUUMUA_0006";
	public final static String UUUMUA_0007 = "UUUMUA_0007";
	public final static String UUUMUA_0008 = "UUUMUA_0008";
	public final static String UUUMUA_0009 = "UUUMUA_0009";
	
	public final static String UUUMIF_0001 = "UUUMIF_0001";
	public final static String UUUMIF_0002 = "UUUMIF_0002";
	
	public final static String UUUMTR_0001 = "UUUMTR_0001";			//同步更新远程库
	public final static String UUUMTR_0002 = "UUUMTR_0002";			//同步更新远程库
	public final static String UUUMTR_0003 = "UUUMTR_0003";			//同步更新远程库
	
	
	public final static String QPFPB_PS0001 = "QPFPB_PS0001";		//查询用户的快捷方式
	
	
	
	
	/******************************************************
	 *              MQ
	 *****************************************************/
	public final static String QWDKMQ0001 = "QWDKMQ0001";
	public final static String QWDKMQ0002 = "QWDKMQ0002";	
	public final static String QWDKMQ0003 = "QWDKMQ0003";
	public final static String QWDKMQ0004 = "QWDKMQ0004";
	public final static String UWDKMQ0001 = "UWDKMQ0001";	
	public final static String UWDKMQ0002 = "UWDKMQ0002";	
	
	/******************************************************
	 *              流程
	 *****************************************************/
	public final static String QWDKWF0001 = "QWDKWF0001";			//流程模板查询
	public final static String QWDKWF1001 = "QWDKWF1001";			//流程模板查询2
	public final static String QWDKWF1002 = "QWDKWF1002";			//监控查询
	public final static String QWDKWFDESIGNER = "QWDKWFDESIGNER";	//流程设计器查询
	public final static String QWDKWFRECORD = "QWDKWFRECORD";		//taskrecord相关查询操作
	public final static String QWDKWFPIHIS = "QWDKWFPIHIS";			//历史流程相关查询操作
	public final static String QWDKWF2002 = "QWDKWF2002";
	public final static String QWDKWFTODO = "QWDKWFTODO";			//待办：相关操作
	public final static String QWDKWFDEPUTE = "QWDKWFDEPUTE";		//委托：查询
	public final static String QWDKWFTURN = "QWDKWFTURN";			//交办：查询
	public final static String QWDKWFTURNDTL = "QWDKWFTURNDTL";		//交办明细：查询
	public final static String QWDKWFDEPUTETODO = "QWDKWFDEPUTETODO";//委托待办查询
	public final static String QWDKOPINION = "QWDKOPINION";			//历史办理意见查询
	
	
	
	public final static String UWDKWF1002 = "UWDKWF1002";			//监控插入
	public final static String UWDKWFDESIGNER = "UWDKWFDESIGNER";	//流程设计器更新
	public final static String UWDKWFRECORD = "UWDKWFRECORD";		//taskrecord相关更新操作
	public final static String UWDKWFPIHIS = "UWDKWFPIHIS";			//历史流程相关查询操作
	public final static String UWDKWF2002 = "UWDKWF2002";
	public final static String UWDKWFTODO = "UWDKWFTODO";			//待办：相关操作
	public final static String UWDKWFDEPUTE = "UWDKWFDEPUTE";		//委托：更新
	public final static String UWDKWFTURN = "UWDKWFTURN";			//交办：更新
	public final static String UWDKWFTURNDTL = "UWDKWFTURNDTL";		//交办明细：更新
	
	/******************************************************
	 *              检查预约系统
	 *****************************************************/
	public final static String QEABIDEVICE0000 = "QEABIDEVICE0000";		//获取设备所属的房间
	public final static String QEABIEXAM0001 = "QEABIEXAM0001";			//查询所有关联的收费明细
	public final static String QEABIREG0002 = "QEABIREG0002"; 			// 查询预约规则，互斥等其它规则
	public final static String QEABUSCHEDU0001 = "QEABUSCHEDU0001"; 	//排班表查询
	public final static String QEABUAPPT0002 = "QEABUAPPT0002"; 		//预约号码实例表查询
	public final static String QEABUEXAM0003 = "QEABUEXAM0003";			//查询本医生常用使用的检查项目
	public final static String QEABUSTAT0004 = "QEABUSTAT0004";			//统计报表需要用到的查询
	public final static String UEAHIS0000 = "UEAHIS0000";				//获取HIS系统数据库中的主键nextval
	public final static String UEAHIS0001 = "UEAHIS0001";				//开单后，把检查单的数据同步到HIS系统的数据库中去
	
	
}