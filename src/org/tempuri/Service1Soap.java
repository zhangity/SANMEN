/**
 * Service1Soap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface Service1Soap extends java.rmi.Remote {

    /**
     * 得到一卡通最大的对帐日期
     */
    public org.tempuri.ReturnExTable gf_getYktSjJsz(java.lang.String as_tclx, java.lang.String as_dzrq, java.lang.String as_jsrq) throws java.rmi.RemoteException;

    /**
     * 得到医保最大的对帐日期
     */
    public org.tempuri.ReturnExTable gf_getEpsmJsz(java.lang.String as_tclx, java.lang.String as_dzrq, java.lang.String as_jsrq) throws java.rmi.RemoteException;

    /**
     * 得到一卡通的对帐结算作废数据
     */
    public org.tempuri.ReturnExTable gf_getYktSjZfz(java.lang.String as_tclx, java.lang.String as_dzrq, java.lang.String as_jsrq) throws java.rmi.RemoteException;

    /**
     * 得到医保的对帐结算作废数据
     */
    public org.tempuri.ReturnExTable gf_getEpsmZfz(java.lang.String as_tclx, java.lang.String as_dzrq, java.lang.String as_jsrq) throws java.rmi.RemoteException;

    /**
     * 保存一卡通对帐结果
     */
    public java.lang.String gf_saveYktSjDZJG(java.lang.String as_dzrq, java.lang.String as_error, java.lang.String as_tclx) throws java.rmi.RemoteException;

    /**
     * 得到未结算的数据(一卡通)
     */
    public org.tempuri.Gf_getYktSjBrwjssjResponseGf_getYktSjBrwjssjResult gf_getYktSjBrwjssj(java.lang.String as_brid, java.lang.String as_mzxh, java.lang.String as_kfrq) throws java.rmi.RemoteException;

    /**
     * 如果该次就诊的第一诊断为自费诊断，则该次就诊所开的药物和医技项目全部自费处理
     */
    public void gf_CfYjxmZfcl(java.lang.String as_brid, java.lang.String as_mzxh, java.lang.String as_kfrq) throws java.rmi.RemoteException;

    /**
     * 得到未结算的数据
     */
    public org.tempuri.Gf_getBrwjssjResponseGf_getBrwjssjResult gf_getBrwjssj(java.lang.String as_brid, java.lang.String as_mzxh, java.lang.String as_kfrq) throws java.rmi.RemoteException;

    /**
     * 得到医嘱数据（处方，医技）
     */
    public org.tempuri.Gf_getBrwjssjAllResponseGf_getBrwjssjAllResult gf_getBrwjssjAll(java.lang.String as_brid, java.lang.String as_kfrqb, java.lang.String as_kfrqo, java.lang.String ksdm) throws java.rmi.RemoteException;

    /**
     * 得到未结算的数据（医保）
     */
    public org.tempuri.Gf_getEpsmBrwjssjResponseGf_getEpsmBrwjssjResult gf_getEpsmBrwjssj(java.lang.String as_brid, java.lang.String as_mzxh) throws java.rmi.RemoteException;

    /**
     * 核对是否是医保
     */
    public int gf_check_yb(java.lang.String as_brxz) throws java.rmi.RemoteException;

    /**
     * 得到特殊病相关码表
     */
    public org.tempuri.Gf_tsbmbsResponseGf_tsbmbsResult gf_tsbmbs() throws java.rmi.RemoteException;

    /**
     * 得到三门医保票据结算记录
     */
    public org.tempuri.ReturnExTable getPAYMENT_EPSM_JSJLByFphmJzlx(java.lang.String fphm, java.lang.String jzlx) throws java.rmi.RemoteException;

    /**
     * 医保日对帐（as_dzrq：对帐日期<格式为yyyyMMdd>；as_ylxzlb：医疗险种类别<20：基本医疗；17：城乡居民合作医疗>）
     */
    public java.lang.String fun_Dzcl(java.lang.String as_dzrq, java.lang.String as_ylxzlb) throws java.rmi.RemoteException;

    /**
     * 交易明细下载（用户交易55）(as_dzrq：下载日期<格式为yyyyMMdd>；as_mxlb：门诊/住院类别(0：全部
     * 1：门诊 2：住院)；as_qslsh：开始结算流水号(下载全部就传入0))
     */
    public java.lang.String fun_Dzxz(java.lang.String as_dzrq, java.lang.String as_mxlb, java.lang.String as_qslsh) throws java.rmi.RemoteException;

    /**
     * model添加预检分诊记录
     */
    public org.tempuri.ReturnExComm insertTRIAGE_RECORDS(org.tempuri.TRIAGE_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 修改预检分诊记录model
     */
    public org.tempuri.ReturnExComm updateTRIAGE_RECORDS(org.tempuri.TRIAGE_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 获取病人相应诊断类型的诊断
     */
    public org.tempuri.GetTRIAGE_RECORDSResponseGetTRIAGE_RECORDSResult getTRIAGE_RECORDS(java.lang.String djsj1, java.lang.String djsj2) throws java.rmi.RemoteException;

    /**
     * 获取预检分诊记录的Model
     */
    public org.tempuri.TRIAGE_RECORDS getTRIAGE_RECORDSModel(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 获取输入初始的诊断
     */
    public org.tempuri.GetCsZdResponseGetCsZdResult getCsZd(java.lang.String zd) throws java.rmi.RemoteException;

    /**
     * 获取输入医生的诊断
     */
    public org.tempuri.GetYsZdResponseGetYsZdResult getYsZd(java.lang.String zd) throws java.rmi.RemoteException;

    /**
     * 获取输入医生
     */
    public org.tempuri.GetZdUserInfoResponseGetZdUserInfoResult getZdUserInfo(java.lang.String user, java.lang.String code) throws java.rmi.RemoteException;

    /**
     * 获取排班医生
     */
    public org.tempuri.GetPbUserInfoResponseGetPbUserInfoResult getPbUserInfo(java.lang.String user, java.lang.String ksdms) throws java.rmi.RemoteException;

    /**
     * 得到就诊医技信息
     */
    public org.tempuri.GetYJXXbyIDResponseGetYJXXbyIDResult getYJXXbyID(java.lang.String BRID, java.lang.String JZXH, java.lang.String KSSJ, java.lang.String JZSJ) throws java.rmi.RemoteException;

    /**
     * 删除医技信息
     */
    public org.tempuri.ReturnExComm delYJXX(java.lang.String YJXH) throws java.rmi.RemoteException;

    /**
     * 删除单个医技信息
     */
    public org.tempuri.ReturnExComm delDGYJXX(java.lang.String SBXH) throws java.rmi.RemoteException;

    /**
     * 更新医技信息
     */
    public org.tempuri.ReturnExComm updateYJXX(org.tempuri.UpdateYJXXDs ds) throws java.rmi.RemoteException;

    /**
     * 获取常用项目
     */
    public org.tempuri.GetYJGrcyXMResponseGetYJGrcyXMResult getYJGrcyXM(java.lang.String SSLB, java.lang.String SSDM) throws java.rmi.RemoteException;

    /**
     * 根据科室获取常用项目
     */
    public org.tempuri.GetYJGrcyXMbyKSResponseGetYJGrcyXMbyKSResult getYJGrcyXMbyKS(java.lang.String SSLB, java.lang.String SSDM, java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 根据科室获取常用项目组套
     */
    public org.tempuri.GetYJGrcyXMZTbyKSResponseGetYJGrcyXMZTbyKSResult getYJGrcyXMZTbyKS(java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 添加常用项目
     */
    public org.tempuri.ReturnExComm addYJGrcyXM(org.tempuri.AddYJGrcyXMDt dt, java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 获取病人当日已开处方和医技项目
     */
    public org.tempuri.GetBRDRcfyjXMbyYSResponseGetBRDRcfyjXMbyYSResult getBRDRcfyjXMbyYS(java.lang.String YSGH, java.lang.String BRID) throws java.rmi.RemoteException;

    /**
     * 获取科室常用项目组套明细
     */
    public org.tempuri.GetYJGrcyXMofZTResponseGetYJGrcyXMofZTResult getYJGrcyXMofZT(org.tempuri.GetYJGrcyXMofZTDs ds) throws java.rmi.RemoteException;

    /**
     * 获取医技项目的自费比例
     */
    public java.lang.String getZFBLforYJ(java.lang.String YJXH, java.lang.String BRXZ) throws java.rmi.RemoteException;

    /**
     * 获取药品项目的自费比例
     */
    public java.lang.String getZFBLforYP(java.lang.String YPXH, java.lang.String YPCD, java.lang.String BRXZ) throws java.rmi.RemoteException;

    /**
     * 返回指定数据库地址的单张表的指定行数据
     */
    public org.tempuri.GetSingleTableValueResponseGetSingleTableValueResult getSingleTableValue(java.lang.String tablename, java.lang.String top, java.lang.String columns, java.lang.String where) throws java.rmi.RemoteException;

    /**
     * 返回指定数据库地址的单张表的指定行数据
     */
    public org.tempuri.GetSingleTableValuedbResponseGetSingleTableValuedbResult getSingleTableValuedb(java.lang.String tablename, java.lang.String top, java.lang.String columns, java.lang.String where, java.lang.String dbname) throws java.rmi.RemoteException;

    /**
     * 新增用户反馈
     */
    public int insertYhfk(java.lang.String yhgh, java.lang.String fknr) throws java.rmi.RemoteException;

    /**
     * 获取同意书
     */
    public org.tempuri.GetTysListResponseGetTysListResult getTysList(java.lang.String clinic_id) throws java.rmi.RemoteException;

    /**
     * 获取同意书列表
     */
    public org.tempuri.GetTyssListResponseGetTyssListResult getTyssList() throws java.rmi.RemoteException;

    /**
     * 根据病人的门诊号和同意书模板号得到同意书文件信息
     */
    public org.tempuri.ReturnExTable getMzbrTys(java.lang.String CLINIC_ID, java.lang.String TEMPLATE_ID) throws java.rmi.RemoteException;

    /**
     * 插入一条新的同意书文书
     */
    public org.tempuri.ReturnExComm insertTysInfo(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 更新同意书文书信息
     */
    public org.tempuri.ReturnExComm updateTysInfo(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 删除指定同意书文书
     */
    public org.tempuri.ReturnExComm deleteTysInfo(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 侯症病人列表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getWaitSeeDoctorPage(java.lang.String visit_no, java.lang.String brxm, java.lang.String deptcode, java.lang.String mzks, java.lang.String doctor_code, java.lang.String dpB, java.lang.String dpO, java.lang.String regist_status, int pageIndex, int pageSize) throws java.rmi.RemoteException;

    /**
     * 选呼病人
     */
    public boolean callPatient(java.lang.String timeid, java.lang.String ysgh) throws java.rmi.RemoteException;

    /**
     * 暂挂
     */
    public org.tempuri.ZgPatientsResponseZgPatientsResult zgPatients(java.lang.String clinicid, java.lang.String czgh, java.lang.String ksdm, boolean zg) throws java.rmi.RemoteException;

    /**
     * 获取心电图
     */
    public org.tempuri.GetXtdbgResponseGetXtdbgResult getXtdbg(java.lang.String bah) throws java.rmi.RemoteException;

    /**
     * 得到所有的医保药品信息
     */
    public org.tempuri.ReturnExTable getAllYbYpxx() throws java.rmi.RemoteException;

    /**
     * 得到所有的医保费用信息
     */
    public org.tempuri.ReturnExTable getAllYbFyxx() throws java.rmi.RemoteException;

    /**
     * 得到指定类别的码表
     */
    public org.tempuri.ReturnExTable getYbDmzd(java.lang.String dmlb) throws java.rmi.RemoteException;

    /**
     * 得到所有医保的疾病编码
     */
    public org.tempuri.ReturnExTable getAllYbJbbm() throws java.rmi.RemoteException;

    /**
     * 得到所有医保的科室编码
     */
    public org.tempuri.ReturnExTable getAllYbKsbm() throws java.rmi.RemoteException;

    /**
     * 插入或更新确认交易记录
     */
    public java.lang.String saveOrUpdateJyjl(java.lang.String YWXLH, java.lang.String JYGN, java.lang.String QRBZ, java.lang.String SQSJ, java.lang.String QRSJ, java.lang.String YBKH, java.lang.String CZGH, java.lang.String ZXLSH) throws java.rmi.RemoteException;

    /**
     * 用事务的方式处理传入的SQL语句
     */
    public boolean excuteCommandAsSql(java.lang.String[] sqls, java.lang.String connection) throws java.rmi.RemoteException;

    /**
     * 设置指定医生和类型的最新票据号码
     */
    public int setPjhm(java.lang.String czgh, java.lang.String pjlx, java.lang.String pjhm) throws java.rmi.RemoteException;

    /**
     * 得到结算表的数据
     */
    public org.tempuri.ReturnExTable getYbJsjg(java.lang.String fphm, int jzlx) throws java.rmi.RemoteException;

    /**
     * 得到结算分段基金表的数据
     */
    public org.tempuri.ReturnExTable getYbJsjgFdjj(java.lang.String fphm, int jzlx) throws java.rmi.RemoteException;

    /**
     * 得到结算超限费用表的数据
     */
    public org.tempuri.ReturnExTable getYbJsjgCxfy(java.lang.String fphm, int jzlx) throws java.rmi.RemoteException;

    /**
     * 得到系统参数值
     */
    public java.lang.String gf_getpara(int li_xtsb, java.lang.String ls_csmc, java.lang.String ls_default, java.lang.String ls_bz) throws java.rmi.RemoteException;

    /**
     * 得到一卡通功能号列表
     */
    public org.tempuri.ReturnExTable gf_getYktSjJygn() throws java.rmi.RemoteException;

    /**
     * 得到医保交易功能列表
     */
    public org.tempuri.ReturnExTable gf_getEpsmJygn() throws java.rmi.RemoteException;

    /**
     * 得到一卡通的对帐流水号
     */
    public java.lang.String gf_getYktSjDzslh(java.lang.String as_ygxx, java.lang.String as_zczh, java.lang.String as_jydm) throws java.rmi.RemoteException;

    /**
     * 保存一卡通YKT_SJ_QDJL
     */
    public java.lang.String gf_saveYktSjQdjl(java.lang.String as_ygxx, java.lang.String as_zczh, java.lang.String as_dzlsh, java.lang.String as_jydm, java.lang.String as_qdsj) throws java.rmi.RemoteException;

    /**
     * 修改本地注册信息标志
     */
    public java.lang.String of_regoperator_logout(java.lang.String as_jydm, java.lang.String as_qdlx, java.lang.String as_dzlsh) throws java.rmi.RemoteException;

    /**
     * 得到一卡通药品信息
     */
    public org.tempuri.ReturnExTable gf_getYktSjYpxx() throws java.rmi.RemoteException;

    /**
     * 得到一卡通药品信息
     */
    public org.tempuri.ReturnExTable gf_getYktSjYpml() throws java.rmi.RemoteException;

    /**
     * 得到一卡通费用信息
     */
    public org.tempuri.ReturnExTable gf_getYktSjFyxx() throws java.rmi.RemoteException;

    /**
     * 得到一卡通费用目录信息
     */
    public org.tempuri.ReturnExTable gf_getYktSjFyml() throws java.rmi.RemoteException;

    /**
     * 得到医保药品信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmYpxx() throws java.rmi.RemoteException;

    /**
     * 得到医保药品对照目录信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmYpml() throws java.rmi.RemoteException;

    /**
     * 得到医保费用信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmFyxx() throws java.rmi.RemoteException;

    /**
     * 得到医保费用对照目录信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmFyml() throws java.rmi.RemoteException;

    /**
     * 取操作员医保端注册账号
     */
    public java.lang.String gf_getYktSjYbzh(java.lang.String as_czgh) throws java.rmi.RemoteException;

    /**
     * 得到所有的门诊科室代码
     */
    public org.tempuri.ReturnExTable gf_getKsdm() throws java.rmi.RemoteException;

    /**
     * 得到所有的门诊医生信息
     */
    public org.tempuri.ReturnExTable gf_getYgdm() throws java.rmi.RemoteException;

    /**
     * 得到所有的疾病信息(一卡通)
     */
    public org.tempuri.ReturnExTable gf_getYktSjJbxx(java.lang.String version) throws java.rmi.RemoteException;

    /**
     * 得到所有的疾病信息(医保)
     */
    public org.tempuri.ReturnExTable gf_getEpsmJbxx(java.lang.String version) throws java.rmi.RemoteException;

    /**
     * 一卡通常见码表数据
     */
    public org.tempuri.ReturnExTable gf_getYktSjDmzd() throws java.rmi.RemoteException;

    /**
     * 医保常见码表数据
     */
    public org.tempuri.ReturnExTable gf_getEpsmDmzd() throws java.rmi.RemoteException;

    /**
     * 一卡通结算记录数据列信息
     */
    public org.tempuri.ReturnExTable gf_getYktSjJsjlFields() throws java.rmi.RemoteException;

    /**
     * 医保结算记录数据列信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmJsjlFields() throws java.rmi.RemoteException;

    /**
     * 医保结算记录（分段基金）数据列信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmJsjlFdjjFields() throws java.rmi.RemoteException;

    /**
     * 医保结算记录(超限费用)数据列信息
     */
    public org.tempuri.ReturnExTable gf_getEpsmJsjlCxfyFields() throws java.rmi.RemoteException;

    /**
     * 得到指定医生和类型的最新票据号码
     */
    public java.lang.String gf_getPjhm(java.lang.String as_czgh, java.lang.String as_pjlx) throws java.rmi.RemoteException;

    /**
     * 得到公共医生的最新票据号码
     */
    public java.lang.String gf_getGgPjhm(java.lang.String czgh) throws java.rmi.RemoteException;

    /**
     * 判断票据号码是否存在如果已经存在重新生成一个票据号
     */
    public org.tempuri.ReturnExComm gy_GetGhMzPjhm(java.lang.String czgh, java.lang.String pjhm, java.lang.String pjlx) throws java.rmi.RemoteException;

    /**
     * 得到指定表的最新序列号
     */
    public java.lang.String gf_get_max(java.lang.String table_name, int need_count) throws java.rmi.RemoteException;

    /**
     * 更新一卡通交易记录
     */
    public java.lang.String gf_updateYktSjJyjl(java.lang.String as_jyjg, java.lang.String as_jssj, java.lang.String as_tradeid) throws java.rmi.RemoteException;

    /**
     * 挂号更新一卡通交易记录
     */
    public org.tempuri.ReturnExComm gf_updateYktSjJyjlInsertRegist(java.lang.String as_jyjg, java.lang.String as_jssj, java.lang.String as_zxlsh, java.lang.String as_tradeid, org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 挂号更新医保交易记录
     */
    public org.tempuri.ReturnExComm gf_updateEpsmJyjlInsertRegist(java.lang.String as_jyjg, java.lang.String as_jssj, java.lang.String as_zxlsh, java.lang.String as_tradeid, org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 更新医保结算结果的中心流水号
     */
    public java.lang.String gf_updateEpsmJsjlZxlsh(java.lang.String as_zxlsh, java.lang.String as_fphm, java.lang.String as_jzlx) throws java.rmi.RemoteException;

    /**
     * 更新医保交易记录
     */
    public java.lang.String gf_updateEpsmJyjl(java.lang.String as_jyjg, java.lang.String as_jssj, java.lang.String as_zxlsh, java.lang.String as_tradeid) throws java.rmi.RemoteException;

    /**
     * 结算时更新状态
     */
    public java.lang.String gf_updateYktSjJszt(java.lang.String as_zxlsh, java.lang.String as_ywxlh, java.lang.String as_jsrq, java.lang.String as_fphm, java.lang.String as_jzlx) throws java.rmi.RemoteException;

    /**
     * 保存医保结算数据
     */
    public java.lang.String gf_updateEpsmJsjgsj(org.tempuri.Gf_updateEpsmJsjgsjDs ds) throws java.rmi.RemoteException;

    /**
     * 更新处方和医技的状态（发票和自费比例）
     */
    public java.lang.String updateCfAndYjJssj(org.tempuri.UpdateCfAndYjJssjDs ds, java.lang.String jssjs) throws java.rmi.RemoteException;

    /**
     * 一卡通医保结算数据
     */
    public java.lang.String gf_updateYktSjJsjgsj(org.tempuri.Gf_updateYktSjJsjgsjDs ds) throws java.rmi.RemoteException;

    /**
     * 得到服务器时间
     */
    public java.lang.String gf_getSystemDatetime() throws java.rmi.RemoteException;

    /**
     * 插入或更新确认交易记录(一卡通)
     */
    public java.lang.String gf_saveOrUpdateYktSjJyjl(java.lang.String as_ywxlh, java.lang.String as_jygn, java.lang.String as_qrbz, java.lang.String as_sqsj, java.lang.String as_qrsj, java.lang.String as_ybkh, java.lang.String as_czgh, java.lang.String as_zxlsh, java.lang.String as_icmw) throws java.rmi.RemoteException;

    /**
     * 插入或更新确认交易记录(医保)
     */
    public java.lang.String gf_saveOrUpdateEpsmJyjl(java.lang.String as_ywxlh, java.lang.String as_jygn, java.lang.String as_qrbz, java.lang.String as_sqsj, java.lang.String as_qrsj, java.lang.String as_ybkh, java.lang.String as_czgh, java.lang.String as_zxlsh) throws java.rmi.RemoteException;

    /**
     * 得到中心流水号
     */
    public java.lang.String gf_getEpsmJsjlZxlsh(java.lang.String fphm) throws java.rmi.RemoteException;

    /**
     * 得到一卡通的中心流水号
     */
    public java.lang.String gf_getYKTJsjlZxlsh(java.lang.String fphm, java.lang.String JZLX) throws java.rmi.RemoteException;

    /**
     * 医保退费(医保)
     */
    public java.lang.String gf_updateEpsmJsjlZf(java.lang.String as_zflsh, java.lang.String as_zfrq, java.lang.String as_zxlsh) throws java.rmi.RemoteException;

    /**
     * 医保退费(医保)
     */
    public java.lang.String gh_updateEpsmJsjlZf(java.lang.String as_zflsh, java.lang.String as_zfrq, java.lang.String as_zxlsh, org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 一卡通退费
     */
    public java.lang.String gf_updateYktSjJsjlZf(java.lang.String as_zflsh, java.lang.String as_zfrq, java.lang.String as_zxlsh) throws java.rmi.RemoteException;

    /**
     * 一卡通挂号退费
     */
    public java.lang.String gh_updateYktSjJsjlZf(java.lang.String as_zflsh, java.lang.String as_zfrq, java.lang.String as_zxlsh, org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 一卡通本地医保记录作废
     */
    public java.lang.String gf_updateYktSjZfclLocal(java.lang.String as_fphm, java.lang.String as_jzlx, java.lang.String as_zfrq, java.lang.String as_zf_ybzh, java.lang.String as_zf_dzlsh, java.lang.String as_zdjbh) throws java.rmi.RemoteException;

    /**
     * 一卡通本地医保记录作废
     */
    public java.lang.String gf_updateEpsmZfclLocal(java.lang.String as_fphm, java.lang.String as_jzlx) throws java.rmi.RemoteException;

    /**
     * 得到一卡通最大的Jzxh
     */
    public java.lang.String gf_getMaxJzxh(java.lang.String as_brid) throws java.rmi.RemoteException;

    /**
     * 得到一卡通的Jbbhs
     */
    public org.tempuri.ReturnExTable gf_getJbbhs(java.lang.String as_version, java.lang.String as_jzxhs) throws java.rmi.RemoteException;

    /**
     * 得到一卡通的Jbbhs
     */
    public org.tempuri.ReturnExTable gf_getJbbhsAsPatientId(java.lang.String as_patientid, java.lang.String as_jzsj) throws java.rmi.RemoteException;

    /**
     * 得到一卡通的药品用法的每日次数
     */
    public java.lang.String gf_getMrcs(java.lang.String as_version, java.lang.String as_ypyf) throws java.rmi.RemoteException;

    /**
     * 得到一卡通最大的对帐日期
     */
    public java.lang.String gf_getYktSjMaxDzrq(java.lang.String as_tclx) throws java.rmi.RemoteException;

    /**
     * 性别码表
     */
    public org.tempuri.GetDICT_SEXResponseGetDICT_SEXResult getDICT_SEX() throws java.rmi.RemoteException;

    /**
     * 民族码表
     */
    public org.tempuri.GetDICT_NATIONResponseGetDICT_NATIONResult getDICT_NATION() throws java.rmi.RemoteException;

    /**
     * 三门地址码表
     */
    public org.tempuri.GetDICT_SMDZResponseGetDICT_SMDZResult getDICT_SMDZ(java.lang.String pydm) throws java.rmi.RemoteException;

    /**
     * 国籍码表
     */
    public org.tempuri.GetDICT_COUNTRYResponseGetDICT_COUNTRYResult getDICT_COUNTRY() throws java.rmi.RemoteException;

    /**
     * 婚姻状况码表
     */
    public org.tempuri.GetDICT_MARITAL_STATUSResponseGetDICT_MARITAL_STATUSResult getDICT_MARITAL_STATUS() throws java.rmi.RemoteException;

    /**
     * 文化程度码表
     */
    public org.tempuri.GetDICT_EDU_TYPEResponseGetDICT_EDU_TYPEResult getDICT_EDU_TYPE() throws java.rmi.RemoteException;

    /**
     * 职业码表
     */
    public org.tempuri.GetDICT_OCCUPATIONResponseGetDICT_OCCUPATIONResult getDICT_OCCUPATION() throws java.rmi.RemoteException;

    /**
     * 血型码表
     */
    public org.tempuri.GetDICT_BLOOD_GROUPResponseGetDICT_BLOOD_GROUPResult getDICT_BLOOD_GROUP() throws java.rmi.RemoteException;

    /**
     * 证件类型码表
     */
    public org.tempuri.GetDICT_ID_TYPEResponseGetDICT_ID_TYPEResult getDICT_ID_TYPE() throws java.rmi.RemoteException;

    /**
     * 诊断类型码表
     */
    public org.tempuri.GetDICT_DIAGNOSIS_TYPEResponseGetDICT_DIAGNOSIS_TYPEResult getDICT_DIAGNOSIS_TYPE() throws java.rmi.RemoteException;

    /**
     * 获取病人主索引表
     */
    public org.tempuri.GetPatientMasterbyIDResponseGetPatientMasterbyIDResult getPatientMasterbyID(java.lang.String patient_ID) throws java.rmi.RemoteException;

    /**
     * 根据证件号码获取病人主索引表
     */
    public org.tempuri.GetPatientMasterbyID_NOResponseGetPatientMasterbyID_NOResult getPatientMasterbyID_NO(java.lang.String ID_NO, java.lang.String ID_TYPE) throws java.rmi.RemoteException;

    /**
     * 消卡时判断病人除此卡还有没有别的卡
     */
    public org.tempuri.ReturnExTable getCancelCardCheck(java.lang.String strPatient_id, java.lang.String strCardNo) throws java.rmi.RemoteException;

    /**
     * 根据证件号码获取病人主索引表
     */
    public org.tempuri.ReturnExTable getPatientMasterInfobyIdNo(java.lang.String strSelIdType, java.lang.String strIdNo) throws java.rmi.RemoteException;

    /**
     * 根据卡号获取病人主索引表
     */
    public org.tempuri.ReturnExTable getPatientMasterInfobyCARD_NO(java.lang.String card_No) throws java.rmi.RemoteException;

    /**
     * 获取病人主索引表的Model
     */
    public org.tempuri.Patient_Master_Index getPatientMasterbyModel(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 获取门诊日志
     */
    public org.tempuri.GetMZRZResponseGetMZRZResult getMZRZ(java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 病人卡号解锁
     */
    public int brJs(java.lang.String car_no) throws java.rmi.RemoteException;

    /**
     * 根据病人标识获取病人联系人表
     */
    public org.tempuri.GetPatientRELATIVEbyPatientIDResponseGetPatientRELATIVEbyPatientIDResult getPatientRELATIVEbyPatientID(java.lang.String patient_ID) throws java.rmi.RemoteException;

    /**
     * 根据病人标识获取病人挂号表
     */
    public org.tempuri.GetRegist_Of_ClinicByPatientIDResponseGetRegist_Of_ClinicByPatientIDResult getRegist_Of_ClinicByPatientID(java.lang.String patient_ID) throws java.rmi.RemoteException;

    /**
     * 根据病人标识获取病人挂号表model
     */
    public org.tempuri.REGIST_OF_CLINIC getREGIST_OF_CLINICModelByWhere(java.lang.String sqlWhere) throws java.rmi.RemoteException;

    /**
     * 根据病人标识获取病人挂号表model
     */
    public org.tempuri.ReturnExComm updateREGIST_OF_CLINICbyModel(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 根据病人标识获取病人挂号表model
     */
    public org.tempuri.ReturnExComm insertREGIST_OF_CLINICbyModel(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * model联系人添加
     */
    public org.tempuri.ReturnExComm insertPATIENT_RELATIVE_INFO(org.tempuri.PATIENT_RELATIVE_INFO model) throws java.rmi.RemoteException;

    /**
     * 添加就诊记录
     */
    public org.tempuri.ReturnExComm addJZJL(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 根据model添加门诊日志
     */
    public org.tempuri.ReturnExComm insertMZRZ(org.tempuri.MZ_MZRZ_SM model) throws java.rmi.RemoteException;

    /**
     * 根据model添加门诊日志
     */
    public org.tempuri.ReturnExComm updateMZRZ(org.tempuri.MZ_MZRZ_SM model) throws java.rmi.RemoteException;

    /**
     * 门诊日志汇总
     */
    public org.tempuri.GetMzrzhxResponseGetMzrzhxResult getMzrzhx(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String sjd) throws java.rmi.RemoteException;

    /**
     * 日志汇总
     */
    public org.tempuri.GetRzhxResponseGetRzhxResult getRzhx(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String sjd) throws java.rmi.RemoteException;

    /**
     * 挂号科室对应的行政科室
     */
    public org.tempuri.GetGhXzKsDyResponseGetGhXzKsDyResult getGhXzKsDy(java.lang.String ghks) throws java.rmi.RemoteException;

    /**
     * 就诊卡消卡操作
     */
    public org.tempuri.ReturnExComm cancelCard(java.lang.String strPATIENT_ID, java.lang.String strCARD_NO, java.lang.String strUserCode) throws java.rmi.RemoteException;

    /**
     * 获取公用项目分类信息
     */
    public org.tempuri.ReturnExTable getPublicItemFl(java.lang.String CODE_INFO_ID, java.lang.String CODE) throws java.rmi.RemoteException;

    /**
     * 根据model修改病人主索引表
     */
    public org.tempuri.ReturnExComm updatePATIENT_MASTER_INDEXByModel(org.tempuri.Patient_Master_Index model) throws java.rmi.RemoteException;

    /**
     * 根据model添加病人主索引表
     */
    public org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEX(org.tempuri.Patient_Master_Index model) throws java.rmi.RemoteException;

    /**
     * 农保卡号解除绑定
     */
    public org.tempuri.ReturnExComm removeNbCard(java.lang.String strCardno) throws java.rmi.RemoteException;

    /**
     * 根据model添加病人主索引表
     */
    public org.tempuri.ReturnExComm insertPATIENT_MASTER_INDEXandCard(org.tempuri.Patient_Master_Index model, org.tempuri.ACCOUNT_CLINIC_CARD accountcard, java.lang.String addCardOper) throws java.rmi.RemoteException;

    /**
     * model联系人更新
     */
    public org.tempuri.ReturnExComm updatePATIENT_RELATIVE_INFO(org.tempuri.PATIENT_RELATIVE_INFO model) throws java.rmi.RemoteException;

    /**
     * 更新打印记录
     */
    public org.tempuri.ReturnExComm updatePring(java.lang.String pringbgId, java.lang.String type, java.lang.String bgsj, java.lang.String gh) throws java.rmi.RemoteException;

    /**
     * 得到打印数
     */
    public org.tempuri.GetPringListResponseGetPringListResult getPringList(java.lang.String pringbgId, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * 得到未发票打印信息
     */
    public org.tempuri.GetWdyFpxxResponseGetWdyFpxxResult getWdyFpxx(java.lang.String patientid, java.lang.String sfrq) throws java.rmi.RemoteException;

    /**
     * 根据日期得到未发票打印信息
     */
    public org.tempuri.GetWdyFpxxbyRQResponseGetWdyFpxxbyRQResult getWdyFpxxbyRQ(java.lang.String patientid, java.lang.String ksrq, java.lang.String jsrq) throws java.rmi.RemoteException;

    /**
     * 得到指定发票的明细信息(药物，医技)
     */
    public org.tempuri.GetFpmxxxResponseGetFpmxxxResult getFpmxxx(java.lang.String fphm) throws java.rmi.RemoteException;

    /**
     * 获取急诊挂号的号数
     */
    public org.tempuri.ReturnExComm getRegistClinicJzh(java.lang.String ksdm, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 获取急诊挂号的号数
     */
    public org.tempuri.ReturnExComm getRegistClinicJzhModify(java.lang.String ksdm, java.lang.String mzlb, java.lang.String jztime) throws java.rmi.RemoteException;

    /**
     * 获取挂号界面当前ScheduleId下可挂号
     */
    public org.tempuri.ReturnExTable getClinicScheduleTimeDataTable(java.lang.String scheduleId, java.lang.String regist_Status, java.lang.String patid) throws java.rmi.RemoteException;

    /**
     * 获取挂号界面当前ScheduleId下可挂号
     */
    public org.tempuri.ReturnExTable getClinicScheduleTimeDataTableForCall(java.lang.String scheduleId, java.lang.String regist_Status) throws java.rmi.RemoteException;

    /**
     * 获取挂号界面挂号科室和医生列表
     */
    public org.tempuri.ReturnExTable getRegisterDeptDoctList(java.lang.String registDate, java.lang.String registType, java.lang.String MZLB) throws java.rmi.RemoteException;

    /**
     * 获得预约挂号科室
     */
    public org.tempuri.ReturnExTable getReservationRegisterDept(java.lang.String registDate, java.lang.String registType) throws java.rmi.RemoteException;

    /**
     * 获得预约挂号医生
     */
    public org.tempuri.ReturnExTable getReservationRegisterDoctor(java.lang.String registDate, java.lang.String registType, java.lang.String deptCode) throws java.rmi.RemoteException;

    /**
     * 获得预约挂号排班时间
     */
    public org.tempuri.ReturnExTable getReservationRegisterScheduleTime(java.lang.String registDate, java.lang.String registType, java.lang.String deptCode, java.lang.String doctorCode) throws java.rmi.RemoteException;

    /**
     * 获得挂号排班时间
     */
    public org.tempuri.ReturnExTable getRegisterScheduleTime(java.lang.String registDate, java.lang.String registType, java.lang.String deptCode, java.lang.String doctorCode) throws java.rmi.RemoteException;

    /**
     * 判断预约号是否初占用或同一个科室已经挂过号
     */
    public org.tempuri.ReturnExComm reservationClinicRegist_zw(java.lang.String scheduleId, java.lang.String timeId, java.lang.String visit_no, java.lang.String registDate, java.lang.String deptid, java.lang.String patid) throws java.rmi.RemoteException;

    /**
     * 呼叫中心预约占号
     */
    public org.tempuri.ReturnExComm reservationClinicRegistForCall_zw(java.lang.String scheduleId, java.lang.String timeId, java.lang.String usercode) throws java.rmi.RemoteException;

    /**
     * 呼叫中心已经预约查询列表
     */
    public org.tempuri.ReturnExTable getScheduleTimeForCall(java.lang.String strDateTime, java.lang.String strTelNo) throws java.rmi.RemoteException;

    /**
     * 退占用
     */
    public org.tempuri.ReturnExComm clinicRegist_tzw(java.lang.String scheduleId, java.lang.String timeId, java.lang.String patid) throws java.rmi.RemoteException;

    /**
     * 获得预约挂号列表
     */
    public org.tempuri.ReturnExTable getReservationRegisterClinic(java.lang.String TELEPHONE) throws java.rmi.RemoteException;

    /**
     * 获得取号预约挂号列表
     */
    public org.tempuri.ReturnExTable getTakeReservationRegisterClinic(java.lang.String PATIENT_ID, java.lang.String TELEPHONE) throws java.rmi.RemoteException;

    /**
     * 获得退号挂号列表
     */
    public org.tempuri.ReturnExTable getBackRegisterClinic(java.lang.String PATIENT_ID, java.lang.String VISIT_NO) throws java.rmi.RemoteException;

    /**
     * 获得账户交易记录表
     */
    public org.tempuri.ReturnExTable getAccountTransaction(java.lang.String PAYMENT_ITEM_TYPE, java.lang.String PAYMENT_ITEM) throws java.rmi.RemoteException;

    /**
     * 获取预约电话是否在黑名单内
     */
    public boolean getRegistClinicXXforHMD(java.lang.String RESERVATIONLOCKNUM) throws java.rmi.RemoteException;

    /**
     * 获取角色表
     */
    public org.tempuri.GetRolesListResponseGetRolesListResult getRolesList() throws java.rmi.RemoteException;

    /**
     * 新增角色
     */
    public void inesntRoles(java.lang.String name) throws java.rmi.RemoteException;

    /**
     * 修改角色
     */
    public void upadetRoles(java.lang.String name, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * 删除角色
     */
    public void deteleRoles(java.lang.String id) throws java.rmi.RemoteException;

    /**
     * 获取该角色权限表
     */
    public org.tempuri.GetRolesQxListResponseGetRolesQxListResult getRolesQxList(java.lang.String id, java.lang.String cdid) throws java.rmi.RemoteException;

    /**
     * 删除该角色的权限
     */
    public void deteleRolesqx(java.lang.String id) throws java.rmi.RemoteException;

    /**
     * 添加角色权限
     */
    public void inesntRolesQx(java.lang.String jsid, java.lang.String cdid) throws java.rmi.RemoteException;

    /**
     * 用户登录记录
     */
    public boolean insertUserLogin(java.lang.String gh, java.lang.String xm, java.lang.String ip) throws java.rmi.RemoteException;

    /**
     * 医生电脑对应IP
     */
    public boolean insertOrUpdateXsIp(java.lang.String dnip, java.lang.String xsip, java.lang.String zsmc, java.lang.String xsxh, java.lang.String czlx, java.lang.String fpip) throws java.rmi.RemoteException;

    /**
     * 用户登录增加叫号排班
     */
    public boolean insertOrUpdateCallIp(java.lang.String gh, java.lang.String xm, java.lang.String ip, java.lang.String ksdm, java.lang.String ksmc) throws java.rmi.RemoteException;

    /**
     * 用户简介或者图片信息
     */
    public int insertorUpdateUserInfo(java.lang.String gh, java.lang.String jj, byte[] picture) throws java.rmi.RemoteException;

    /**
     * 获取手术申请单申请单号
     */
    public org.tempuri.GetsqdmResponseGetsqdmResult getsqdm() throws java.rmi.RemoteException;

    /**
     * 获取手术申请单所需码表
     */
    public org.tempuri.GetSssqdMbResponseGetSssqdMbResult getSssqdMb() throws java.rmi.RemoteException;

    /**
     * 获取手术申请单所需码表
     */
    public org.tempuri.GetSsmcResponseGetSsmcResult getSsmc(java.lang.String ssmc, java.lang.String ssdm) throws java.rmi.RemoteException;

    /**
     * 获取病人的手术信息
     */
    public org.tempuri.GetHisSsjlResponseGetHisSsjlResult getHisSsjl(java.lang.String hisylxh) throws java.rmi.RemoteException;

    /**
     * 获取手术记录
     */
    public org.tempuri.GetSsjlResponseGetSsjlResult getSsjl(java.lang.String patient_id) throws java.rmi.RemoteException;

    /**
     * 获取his里的手术记录
     */
    public org.tempuri.GetSsjlFromHisResponseGetSsjlFromHisResult getSsjlFromHis(java.lang.String patient_id) throws java.rmi.RemoteException;

    /**
     * 选择查询全院的申请单信息
     */
    public org.tempuri.GetHisSssqQyResponseGetHisSssqQyResult getHisSssqQy(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 获取手术安排记录
     */
    public org.tempuri.GetSsapResponseGetSsapResult getSsap(java.util.Calendar timebegin, java.util.Calendar timeend) throws java.rmi.RemoteException;

    /**
     * 获取指定病区的手术安排记录
     */
    public org.tempuri.GetSsapByKsResponseGetSsapByKsResult getSsapByKs(java.util.Calendar timebegin, java.util.Calendar timeend, java.lang.String bqdm) throws java.rmi.RemoteException;

    /**
     * 通过获取手术记录基本信息
     */
    public org.tempuri.GetSqjlBySqdhResponseGetSqjlBySqdhResult getSqjlBySqdh(java.lang.String ssbh, int bj) throws java.rmi.RemoteException;

    /**
     * 新增手术申请
     */
    public int insertSssqd(org.tempuri.PatientSssqdClass model, java.lang.String[] str) throws java.rmi.RemoteException;

    /**
     * 作废已申请的未安排手术申请记录
     */
    public int deleteSssq(java.lang.String sqdh) throws java.rmi.RemoteException;

    /**
     * 添加手术记录
     */
    public java.lang.String insertSsjl(java.lang.String[] ssnr, int bj, java.lang.String infos) throws java.rmi.RemoteException;

    /**
     * 获取检查报告
     */
    public org.tempuri.GetJcbgIdResponseGetJcbgIdResult getJcbgId(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 删除指定的检查申请单
     */
    public java.lang.String deleteBrjcSqd(java.lang.String sqdid, java.lang.String hiszyxh, java.lang.String scyy) throws java.rmi.RemoteException;

    /**
     * 检查申请单提交
     */
    public java.lang.String saveBrjcSqd(org.tempuri.SaveBrjcSqdDs ds) throws java.rmi.RemoteException;

    /**
     * 撤消已提交或已退费的检查申请单
     */
    public java.lang.String brjcSqdCx(java.lang.String sqdnum, java.lang.String ysgh, java.lang.String jcmc) throws java.rmi.RemoteException;

    /**
     * 获取全部检验项目
     */
    public org.tempuri.ReturnExTable getAllJyxm() throws java.rmi.RemoteException;

    /**
     * 得到所有的检验项目及明细对照表
     */
    public org.tempuri.ReturnExTable getAllJyzhmx() throws java.rmi.RemoteException;

    /**
     * 得到检验分类项目
     */
    public org.tempuri.ReturnExTable getJyfl(java.lang.String ksdm) throws java.rmi.RemoteException;

    /**
     * 获取检验报告项目列表
     */
    public org.tempuri.ReturnExTable getJybg(java.lang.String PATIENT_ID, java.lang.String dateBegin, java.lang.String dateOver, java.lang.String jymc) throws java.rmi.RemoteException;

    /**
     * 获取检验报告项目的详细指标列表,并对信息进行拼装整理
     */
    public org.tempuri.GetJybgMxResponseGetJybgMxResult getJybgMx(java.lang.String sampleno) throws java.rmi.RemoteException;

    /**
     * 获取检验报告明细数据
     */
    public org.tempuri.GetJybgMxDataResponseGetJybgMxDataResult getJybgMxData(java.lang.String bah, java.lang.String[] testid, java.lang.String dateBegin, java.lang.String dateOver) throws java.rmi.RemoteException;

    /**
     * 获取特殊参考范围
     */
    public org.tempuri.GetCkfwTestResponseGetCkfwTestResult getCkfwTest(java.lang.String testid) throws java.rmi.RemoteException;

    /**
     * 获取相应病案号的所有检验数据
     */
    public org.tempuri.GetPatientAllJybgResponseGetPatientAllJybgResult getPatientAllJybg(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 得到病人检验申请单列表
     */
    public java.lang.String saveBrbqJyyz(org.tempuri.SaveBrbqJyyzDsSqd dsSqd, org.tempuri.SaveBrbqJyyzDsMx dsMx, java.lang.String doctrequestno, java.lang.String CLINIC_ID, java.lang.String deptcode) throws java.rmi.RemoteException;

    /**
     * 得到病人检验申请单列表
     */
    public org.tempuri.ReturnExTable getZyjysqd(java.lang.String bah, java.lang.String kssj, java.lang.String jssj) throws java.rmi.RemoteException;

    /**
     * 得到病人检验申请单明细
     */
    public org.tempuri.ReturnExTable getZyjySqdmx(java.lang.String doctrequestno, java.lang.String examinaimcode, java.lang.String sqdstatus) throws java.rmi.RemoteException;

    /**
     * 得到当天相同检验项目开立个数
     */
    public org.tempuri.ReturnExComm getDqjyxmgs(java.lang.String bah, java.lang.String hyid) throws java.rmi.RemoteException;

    /**
     * 检验申请单删除
     */
    public java.lang.String deleteBrbqJyyz(java.lang.String doctrequestno, java.lang.String hisyzzh) throws java.rmi.RemoteException;

    /**
     * 撤消已执行未接收的检验申请单
     */
    public java.lang.String unExcuteBrbqJyyz(java.lang.String doctrequestno, java.lang.String patientid) throws java.rmi.RemoteException;

    /**
     * 执行已提交的检验申请单
     */
    public java.lang.String excuteBrbqJyyz(java.lang.String doctrequestno, java.lang.String ysgh) throws java.rmi.RemoteException;

    /**
     * 根据ID修改菜单
     */
    public java.lang.String deleteMenuByID(java.lang.String res_ID) throws java.rmi.RemoteException;

    /**
     * 获取菜单分页列表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getPageMenuList(java.lang.String strWhere, int pageSize, int pageIndex) throws java.rmi.RemoteException;

    /**
     * 获取菜单表
     */
    public org.tempuri.GetMenuListResponseGetMenuListResult getMenuList() throws java.rmi.RemoteException;

    /**
     * 获取子菜单表
     */
    public org.tempuri.GetMenuListbyParentResponseGetMenuListbyParentResult getMenuListbyParent(java.lang.String parent_Res_ID) throws java.rmi.RemoteException;

    /**
     * 获取菜单
     */
    public org.tempuri.GetMenuListbyIDResponseGetMenuListbyIDResult getMenuListbyID(int res_ID) throws java.rmi.RemoteException;

    /**
     * 增加一个菜单
     */
    public org.tempuri.ReturnExComm insertMenu(org.tempuri.MenuInfo menu) throws java.rmi.RemoteException;

    /**
     * 根据ID修改菜单
     */
    public org.tempuri.ReturnExComm updateMenu(org.tempuri.MenuInfo menu) throws java.rmi.RemoteException;

    /**
     * 得到该病人指定门诊记录的检验项目列表
     */
    public org.tempuri.GetMzbrJyxmListResponseGetMzbrJyxmListResult getMzbrJyxmList(java.lang.String mzhm, java.lang.String ylxhs) throws java.rmi.RemoteException;

    /**
     * 得到该病人指定门诊记录的检验组列表
     */
    public org.tempuri.GetMzbrJyxmListofCYXMResponseGetMzbrJyxmListofCYXMResult getMzbrJyxmListofCYXM(java.lang.String mzhm, java.lang.String ylxhs) throws java.rmi.RemoteException;

    /**
     * 得到该病人指定门诊记录的处方主记录的诊断列表
     */
    public org.tempuri.ReturnExTable getMzbrCfzds(java.lang.String jzxh, java.lang.String brid, java.lang.String cfsb) throws java.rmi.RemoteException;

    /**
     * 得到该病人指定门诊记录的处方主记录
     */
    public org.tempuri.ReturnExTable getMzbrCf01(java.lang.String jzkh, java.lang.String sfzh, java.lang.String mzxh, java.lang.String kfrq) throws java.rmi.RemoteException;

    /**
     * 得到该病人指定门诊记录的处方明细
     */
    public org.tempuri.ReturnExTable getMzbrCf02(java.lang.String cfsb) throws java.rmi.RemoteException;

    /**
     * 得到HIS库的用药方式码表
     */
    public org.tempuri.ReturnExTable getGyfsmb() throws java.rmi.RemoteException;

    /**
     * 得到HIS库的频次码表
     */
    public org.tempuri.ReturnExTable getYzpcmb() throws java.rmi.RemoteException;

    /**
     * 根据ypxh获得药品信息
     */
    public org.tempuri.ReturnExTable getXhYpxx(java.lang.String ypxh) throws java.rmi.RemoteException;

    /**
     * 得到医生的抗生素权限
     */
    public int getYsKsxQx(java.lang.String ysgh) throws java.rmi.RemoteException;

    /**
     * 得到某个药的医生抗生素权限
     */
    public int getYwKsxYsqx(java.lang.String ysgh, java.lang.String ypxh) throws java.rmi.RemoteException;

    /**
     * 根据CheckKsxSyqk的返回值返回提示信息
     */
    public java.lang.String checkKsxSyqkToStr(java.lang.String ypxh, java.lang.String ysgh, java.lang.String ycsl) throws java.rmi.RemoteException;

    /**
     * 根据传入的药品序号,药品一次数量和医生工号判断抗生素使用情况
     */
    public int checkKsxSyqk(java.lang.String ypxh, java.lang.String ysgh, java.lang.String ycsl) throws java.rmi.RemoteException;

    /**
     * 查询出符合条件的所有药品信息
     */
    public org.tempuri.ReturnExTable getYpxx(java.lang.String pym, java.lang.String yfsb, java.lang.String cflx, int count) throws java.rmi.RemoteException;

    /**
     * 查询出符合条件的所有药品信息(特殊病处方)
     */
    public org.tempuri.ReturnExTable getYpxxByTsbz(java.lang.String pym, java.lang.String yfsb, java.lang.String cflx, int count, java.lang.String tsbzs) throws java.rmi.RemoteException;

    /**
     * 得到特殊病列表
     */
    public org.tempuri.ReturnExTable getTsbzlb() throws java.rmi.RemoteException;

    /**
     * 得到指定药品的补充信息（价格、产地）
     */
    public org.tempuri.ReturnExTable getYpxxCdDj(java.lang.String ypxh, java.lang.String yfsb) throws java.rmi.RemoteException;

    /**
     * 保存或提交处方信息
     */
    public java.lang.String saveMzbrCfxx(org.tempuri.SaveMzbrCfxxDs ds, java.lang.String type) throws java.rmi.RemoteException;

    /**
     * 删除处方信息
     */
    public java.lang.String deleteMzbrCfxx(java.lang.String cfsb, java.lang.String sbxhs) throws java.rmi.RemoteException;

    /**
     * 获取挂号界面挂号科室和医生列表
     */
    public org.tempuri.ReturnExTable ptGetRegisterDeptDoctList(java.lang.String userID, java.lang.String password, java.lang.String registDate, java.lang.String registType, java.lang.String MZLB) throws java.rmi.RemoteException;

    /**
     * 获取挂号界面当前ScheduleId下可挂号
     */
    public org.tempuri.ReturnExTable ptGetClinicScheduleTimeDataTableForCall(java.lang.String userID, java.lang.String password, java.lang.String scheduleId) throws java.rmi.RemoteException;

    /**
     * 预约占号
     */
    public org.tempuri.ReturnExComm ptReservationClinicRegistForCall_zw(java.lang.String usercode, java.lang.String password, java.lang.String scheduleId, java.lang.String timeId) throws java.rmi.RemoteException;

    /**
     * 退占用
     */
    public org.tempuri.ReturnExComm ptClinicRegist_tzw(java.lang.String userID, java.lang.String password, java.lang.String scheduleId, java.lang.String timeId) throws java.rmi.RemoteException;

    /**
     * 确认预约/取消预约
     */
    public org.tempuri.ReturnExComm ptUpdateClinicScheduleTimeLockAndUnLock(java.lang.String userID, java.lang.String password, java.lang.String timeId, java.lang.String lockbz, java.lang.String lockNum) throws java.rmi.RemoteException;

    /**
     * 内镜登记接口
     */
    public java.lang.String insertPacsInfo(java.lang.String strlistvalue) throws java.rmi.RemoteException;

    /**
     * 内镜取消登记接口
     */
    public java.lang.String deletePacsInfo(java.lang.String SQDID) throws java.rmi.RemoteException;

    /**
     * 呼叫中心已经预约查询列表
     */
    public org.tempuri.ReturnExTable ptGetScheduleTimeForCall(java.lang.String userID, java.lang.String password, java.lang.String strDateTime, java.lang.String strTelNo) throws java.rmi.RemoteException;

    /**
     * 获取门诊科室
     */
    public org.tempuri.PagedItemReturnObjectDataSet getMzDeptList(java.lang.String strWhere, int pageSize, int pageIndex) throws java.rmi.RemoteException;

    /**
     * 修改门诊科室
     */
    public int insertUpdateDept(java.lang.String name, java.lang.String deptcode, java.lang.String lev, java.lang.String pt1, java.lang.String pt2, java.lang.String pt3, java.lang.String czpd, java.lang.String mzlb, java.lang.String pxh) throws java.rmi.RemoteException;

    /**
     * 短信发送记录
     */
    public void insertMeassage(java.lang.String czgh, java.lang.String dxnr, java.lang.String dhhm, java.lang.String sbcg) throws java.rmi.RemoteException;

    /**
     * 获取行政科室
     */
    public org.tempuri.PagedItemReturnObjectDataSet getDeptList(java.lang.String strWhere, int pageSize, int pageIndex, java.lang.String lx) throws java.rmi.RemoteException;

    /**
     * 更新行政科室
     */
    public org.tempuri.ReturnExComm updateDept(org.tempuri.DICT_DEPT model) throws java.rmi.RemoteException;

    /**
     * 添加行政科室
     */
    public org.tempuri.ReturnExComm insertDept(org.tempuri.DICT_DEPT model) throws java.rmi.RemoteException;

    /**
     * 根据科室代码删除门诊科室
     */
    public java.lang.String deleteDeptByID(java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 实时获取挂号信息
     */
    public org.tempuri.GetGhInfosResponseGetGhInfosResult getGhInfos(java.lang.String date, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 修改密码
     */
    public org.tempuri.ReturnExComm changePWD(java.lang.String user_CODE, java.lang.String oldPWD, java.lang.String newPWD) throws java.rmi.RemoteException;

    /**
     * 获取公告
     */
    public org.tempuri.GetAnnouncementsResponseGetAnnouncementsResult getAnnouncements(java.lang.String title, java.lang.String sendBegin, java.lang.String sendOver, java.lang.String TYPE) throws java.rmi.RemoteException;

    /**
     * 添加公告
     */
    public int addAnnouncements(java.lang.String fbgh, java.lang.String bqdm, java.lang.String title, java.lang.String note, java.util.Calendar sendTime, java.util.Calendar sendOverTime, java.lang.String TYPE) throws java.rmi.RemoteException;

    /**
     * 修改公告
     */
    public int editAnnouncements(java.lang.String id, java.lang.String xggh, java.lang.String bqdm, java.lang.String title, java.lang.String note, java.util.Calendar sendTime, java.util.Calendar sendOverTime, java.lang.String TYPE) throws java.rmi.RemoteException;

    /**
     * 删除公告
     */
    public int deleteAnnouncements(java.lang.String id, java.lang.String SCGH) throws java.rmi.RemoteException;

    /**
     * 票据添加
     */
    public org.tempuri.ReturnExComm addYGPJ(java.lang.String YGDM, java.lang.String LYRQ, java.lang.String PJLX, java.lang.String QSHM, java.lang.String ZZHM, java.lang.String SYHM) throws java.rmi.RemoteException;

    /**
     * 票据修改
     */
    public org.tempuri.ReturnExComm editYGPJ(java.lang.String YGDM, java.lang.String LYRQ, java.lang.String PJLX, java.lang.String QSHM, java.lang.String ZZHM, java.lang.String SYHM) throws java.rmi.RemoteException;

    /**
     * 票据删除
     */
    public org.tempuri.ReturnExComm delYGPJ(java.lang.String YGDM, java.lang.String PJLX, java.lang.String LYRQ) throws java.rmi.RemoteException;

    /**
     * 票据查询
     */
    public org.tempuri.GetYGPJResponseGetYGPJResult getYGPJ(java.lang.String PJLX, java.lang.String where) throws java.rmi.RemoteException;

    /**
     * 添加门诊科室
     */
    public org.tempuri.ReturnExComm insertMzDept(org.tempuri.REGIST_DEPT model) throws java.rmi.RemoteException;

    /**
     * 更新门诊科室
     */
    public org.tempuri.ReturnExComm updateMzDept(org.tempuri.REGIST_DEPT model) throws java.rmi.RemoteException;

    /**
     * 根据科室代码删除门诊科室
     */
    public java.lang.String deleteMzDeptByID(java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 获取医保类型码表
     */
    public org.tempuri.GetDICT_INSURANCEResponseGetDICT_INSURANCEResult getDICT_INSURANCE() throws java.rmi.RemoteException;

    /**
     * 获取社会关系码表
     */
    public org.tempuri.GetDICT_RELATIONSHIPResponseGetDICT_RELATIONSHIPResult getDICT_RELATIONSHIP() throws java.rmi.RemoteException;

    /**
     * 获取门诊科室表
     */
    public org.tempuri.ReturnExTable getDICT_DEPTmz(java.lang.String strWhere, java.lang.String strRoleId) throws java.rmi.RemoteException;

    /**
     * 获取该医生的排班表
     */
    public org.tempuri.GetDOCTORResponseGetDOCTORResult getDOCTOR(java.lang.String ysgh, java.lang.String apsj) throws java.rmi.RemoteException;

    /**
     * 检查挂号排班明细是否已经被挂号
     */
    public org.tempuri.ReturnExComm getCheckScheduleTimeRegistStatus(java.lang.String SCHEDULE_ID) throws java.rmi.RemoteException;

    /**
     * 添加排班表
     */
    public org.tempuri.ReturnExComm insertCLINIC_SCHEDULE(org.tempuri.CLINIC_SCHEDULE model) throws java.rmi.RemoteException;

    /**
     * 排班加号
     */
    public org.tempuri.ReturnExComm addTimeNumS(java.lang.String SCHEDULE_ID, java.lang.String SCHEDULE_DATE, java.lang.String strAmPm, int nums, int numMinute) throws java.rmi.RemoteException;

    /**
     * 排班添加检查
     */
    public org.tempuri.ReturnExTable getClinicScheduleForAddCheck(java.lang.String strDate, java.lang.String strDepts, java.lang.String strDocts, java.lang.String strAmpms) throws java.rmi.RemoteException;

    /**
     * 排班加班检查
     */
    public org.tempuri.ReturnExTable getCheckAddOverTime(org.tempuri.CLINIC_SCHEDULE model) throws java.rmi.RemoteException;

    /**
     * 排班加班
     */
    public org.tempuri.ReturnExComm addOverTime(org.tempuri.CLINIC_SCHEDULE model, java.lang.String strAmPm, int nums, int numMinute, int jjr) throws java.rmi.RemoteException;

    /**
     * 添加排班表new
     */
    public org.tempuri.ReturnExComm insertCLINIC_SCHEDULENew(org.tempuri.CLINIC_SCHEDULE model, java.lang.String strAmPm, java.lang.String strAddOrEditBz) throws java.rmi.RemoteException;

    /**
     * 得到排班修改时检查是否有预约电话信息
     */
    public org.tempuri.ReturnExTable getEditScheduleCheckForReservationDataTable(java.lang.String SCHEDULE_ID) throws java.rmi.RemoteException;

    /**
     * 得到排班复制时检查是否有预约电话信息
     */
    public org.tempuri.ReturnExTable getCopyScheduleCheckForReservationDataTable(java.lang.String strFirstDays, java.lang.String strFirstDayd, java.lang.String czgh, java.lang.String strKsdms, java.lang.String strGhlb) throws java.rmi.RemoteException;

    /**
     * 排班直接复制
     */
    public org.tempuri.ReturnExComm CLINIC_SCHEDULECopy(java.lang.String strFirstDays, java.lang.String strFirstDayd, java.lang.String czgh, java.lang.String strKsdms, java.lang.String strGhlb) throws java.rmi.RemoteException;

    /**
     * 排班修改时间复制
     */
    public org.tempuri.ReturnExComm CLINIC_SCHEDULEEditTimeCopy(java.lang.String strFirstDays, java.lang.String strFirstDayd, java.lang.String czgh, java.lang.String strKsdms, java.lang.String strGhlb, java.lang.String strAmStartTime, java.lang.String strPmStartTime) throws java.rmi.RemoteException;

    /**
     * 排班复制检查
     */
    public org.tempuri.ReturnExTable CLINIC_SCHEDULEChecks(java.lang.String strFirstDays, java.lang.String strEndDays, java.lang.String strKsdms, java.lang.String strGhlb) throws java.rmi.RemoteException;

    /**
     * 根据ID删除门诊医生排班表
     */
    public org.tempuri.ReturnExComm deleteCLINIC_SCHEDULEByID(java.lang.String SCHEDULE_ID) throws java.rmi.RemoteException;

    /**
     * 根据ID删除门诊时间段排班表
     */
    public java.lang.String deleteCLINIC_SCHEDULE_TIMEByID(java.lang.String TIME_ID) throws java.rmi.RemoteException;

    /**
     * 删除门诊时间段排班表
     */
    public java.lang.String deleteCLINIC_SCHEDULE_TIME(java.lang.String SCHEDULE_ID) throws java.rmi.RemoteException;

    /**
     * 锁号解锁记录
     */
    public org.tempuri.ReturnExComm insertShjl(org.tempuri.CLINIC_SCHEDULE_SHJL model) throws java.rmi.RemoteException;

    /**
     * 排班锁号和解锁
     */
    public org.tempuri.ReturnExComm updateClinicScheduleTimeLockAndUnLock(java.lang.String time_id, java.lang.String usercode, java.lang.String lockbz, java.lang.String locknum, java.lang.String RESERVATIONLOCKBZ) throws java.rmi.RemoteException;

    /**
     * 获取具体排班时间
     */
    public org.tempuri.PagedItemReturnObjectDataSet getCLINIC_SCHEDULE_TIMEList(java.lang.String SCHEDULE_ID) throws java.rmi.RemoteException;

    /**
     * 医生排班客户实际需求
     */
    public org.tempuri.ReturnExComm scheduleTimePb(java.lang.String SCHEDULE_ID, java.lang.String SCHEDULE_DATE, java.lang.String doctorCode) throws java.rmi.RemoteException;

    /**
     * 医生排班
     */
    public org.tempuri.ReturnExComm TIMEPbb(java.lang.String SCHEDULE_ID, java.lang.String SCHEDULE_DATE, java.lang.String startTime, java.lang.String endTime, int addmin) throws java.rmi.RemoteException;

    /**
     * 更新排班表，对排班进行预约
     */
    public org.tempuri.ReturnExComm upPbhzs(java.lang.String SCHEDULE_ID) throws java.rmi.RemoteException;

    /**
     * 排班医生是否存在
     */
    public org.tempuri.PagedItemReturnObjectDataSet upPbys(java.lang.String user) throws java.rmi.RemoteException;

    /**
     * 添加停诊信息
     */
    public org.tempuri.ReturnExComm addTzxx(java.lang.String YGDM, java.lang.String YGXM, java.lang.String GHKS, java.lang.String GHKSDM, java.lang.String TZRQ, java.lang.String CREATEUSER, java.lang.String GHLB) throws java.rmi.RemoteException;

    /**
     * 修改停诊信息
     */
    public org.tempuri.ReturnExComm updateTzxx(java.lang.String YGDM, java.lang.String YGXM, java.lang.String GHKS, java.lang.String GHKSDM, java.lang.String TZRQ, java.lang.String SERIAL_ID) throws java.rmi.RemoteException;

    /**
     * 删除停诊信息
     */
    public org.tempuri.ReturnExComm delTzxx(java.lang.String SERIAL_ID) throws java.rmi.RemoteException;

    /**
     * 获取停诊信息
     */
    public org.tempuri.GetTzxxResponseGetTzxxResult getTzxx(java.lang.String TZRQs, java.lang.String TZRQe, java.lang.String YSXM, java.lang.String GHKS) throws java.rmi.RemoteException;

    /**
     * 获取医生挂号科室
     */
    public org.tempuri.GetGHKSbyYSResponseGetGHKSbyYSResult getGHKSbyYS(java.lang.String YGDM) throws java.rmi.RemoteException;

    /**
     * 获取套餐组列表
     */
    public org.tempuri.GetTCXXResponseGetTCXXResult getTCXX(java.lang.String sWhere) throws java.rmi.RemoteException;

    /**
     * 添加套餐组信息
     */
    public org.tempuri.ReturnExComm addTCXX(java.lang.String TCMC, java.lang.String PYDM, java.lang.String MZSY, java.lang.String BQSY, java.lang.String TCLX) throws java.rmi.RemoteException;

    /**
     * 删除套餐组
     */
    public org.tempuri.ReturnExComm delTCXX(java.lang.String TCXH) throws java.rmi.RemoteException;

    /**
     * 获取套餐明细
     */
    public org.tempuri.GetTCMXResponseGetTCMXResult getTCMX(java.lang.String TCXH) throws java.rmi.RemoteException;

    /**
     * 更新套餐明细
     */
    public org.tempuri.ReturnExComm UPdateTCMX(org.tempuri.UPdateTCMXDt dt) throws java.rmi.RemoteException;

    /**
     * 删除套餐明细
     */
    public org.tempuri.ReturnExComm delTCMX(java.lang.String SBXH) throws java.rmi.RemoteException;

    /**
     * 添加医技科室设备表
     */
    public org.tempuri.ReturnExComm insertEXAM_EQUIPMENT(org.tempuri.EXAM_EQUIPMENT model) throws java.rmi.RemoteException;

    /**
     * 更新医技科室设备表
     */
    public org.tempuri.ReturnExComm updateEXAM_EQUIPMENT(org.tempuri.EXAM_EQUIPMENT model) throws java.rmi.RemoteException;

    /**
     * 根据ID删除医技科室设备表
     */
    public java.lang.String deleteEXAM_EQUIPMENTByID(java.lang.String SERIAL_ID) throws java.rmi.RemoteException;

    /**
     * 医技科室设备排班
     */
    public org.tempuri.ReturnExComm examPb(java.lang.String SERIAL_ID, java.lang.String EXAM_DATE, java.lang.String startTime, java.lang.String endTime) throws java.rmi.RemoteException;

    /**
     * 删除医技科室设备排班
     */
    public org.tempuri.ReturnExComm delExamPb(java.lang.String SERIAL_ID, java.lang.String EXAM_DATE) throws java.rmi.RemoteException;

    /**
     * 更新排班表，对排班进行预约
     */
    public org.tempuri.ReturnExComm upEXAMSCHEDULE(java.lang.String SERIAL_ID, java.lang.String CLINIC_ID, java.lang.String SQDNum) throws java.rmi.RemoteException;

    /**
     * 锁定检查排班预定号
     */
    public org.tempuri.ReturnExComm examPBSD(java.lang.String SERIAL_ID, java.lang.String remark) throws java.rmi.RemoteException;

    /**
     * 得到所有医技组套信息
     */
    public org.tempuri.GetYjZtXXResponseGetYjZtXXResult getYjZtXX() throws java.rmi.RemoteException;

    /**
     * 得到医技组套明细信息
     */
    public org.tempuri.GetYjZtMXXXResponseGetYjZtMXXXResult getYjZtMXXX() throws java.rmi.RemoteException;

    /**
     * 添加医技组套
     */
    public org.tempuri.ReturnExComm addYjZt(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 删除医技组套
     */
    public org.tempuri.ReturnExComm delYjZt(java.lang.String ZTBH) throws java.rmi.RemoteException;

    /**
     * 更新医技组套明细项目
     */
    public org.tempuri.ReturnExComm updateYjZtMx(org.tempuri.UpdateYjZtMxDt dt) throws java.rmi.RemoteException;

    /**
     * 删除医技组套明细项目
     */
    public org.tempuri.ReturnExComm deleteYjZtMx(java.lang.String JLBH) throws java.rmi.RemoteException;

    /**
     * 得到医技个人项目信息
     */
    public org.tempuri.GetYjZtXXbyGRResponseGetYjZtXXbyGRResult getYjZtXXbyGR(java.lang.String YSDM) throws java.rmi.RemoteException;

    /**
     * 得到医技个人组套信息
     */
    public org.tempuri.GetYjZtXXbyYSResponseGetYjZtXXbyYSResult getYjZtXXbyYS(java.lang.String YSDM) throws java.rmi.RemoteException;

    /**
     * 得到医技科室组套信息
     */
    public org.tempuri.GetYjZtXXbyKSResponseGetYjZtXXbyKSResult getYjZtXXbyKS(java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 得到医技公共组套信息
     */
    public org.tempuri.GetYjZtXXbyGGResponseGetYjZtXXbyGGResult getYjZtXXbyGG() throws java.rmi.RemoteException;

    /**
     * 获取组套医技明细
     */
    public org.tempuri.GetZTYjMxResponseGetZTYjMxResult getZTYjMx(java.lang.String ZTBH) throws java.rmi.RemoteException;

    /**
     * 获取常用项目默认项目
     */
    public org.tempuri.GetCyxmMrResponseGetCyxmMrResult getCyxmMr(java.lang.String SSLB) throws java.rmi.RemoteException;

    /**
     * 获取常用项目默认项目明细
     */
    public org.tempuri.GetCyxmMrMXResponseGetCyxmMrMXResult getCyxmMrMX() throws java.rmi.RemoteException;

    /**
     * 根据给药途径获取常用项目默认项目明细
     */
    public org.tempuri.GetCyxmMrMXbyTJResponseGetCyxmMrMXbyTJResult getCyxmMrMXbyTJ(java.lang.String gytjs, java.lang.String SSDM) throws java.rmi.RemoteException;

    /**
     * 获取常用项目是否添加
     */
    public boolean getCyxmIsAdd(java.lang.String BRID, java.lang.String SSDM) throws java.rmi.RemoteException;

    /**
     * 获取常用项目静脉采血默认项
     */
    public org.tempuri.GetCyxmJMCXXMResponseGetCyxmJMCXXMResult getCyxmJMCXXM(java.lang.String SSLB) throws java.rmi.RemoteException;

    /**
     * 添加常用项目默认项
     */
    public org.tempuri.ReturnExComm addCyxmMr(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 删除常用项目默认项
     */
    public org.tempuri.ReturnExComm delCyxmMr(java.lang.String MRID) throws java.rmi.RemoteException;

    /**
     * 更新常用项目默认明细项目
     */
    public org.tempuri.ReturnExComm updateCyxmMrMx(org.tempuri.UpdateCyxmMrMxDt dt) throws java.rmi.RemoteException;

    /**
     * 删除常用项目默认明细项目
     */
    public org.tempuri.ReturnExComm delCyxmMrMx(java.lang.String MXID) throws java.rmi.RemoteException;

    /**
     * 获取科室常用项目设置项
     */
    public org.tempuri.GetKSZTGRXMResponseGetKSZTGRXMResult getKSZTGRXM(java.lang.String KSDM, java.lang.String TYPE, java.lang.String SSDM) throws java.rmi.RemoteException;

    /**
     * 修改科室常用项目设置
     */
    public org.tempuri.ReturnExComm editKSGRCYXM(java.lang.String KSDM, java.lang.String SSDM, org.tempuri.EditKSGRCYXMDs ds) throws java.rmi.RemoteException;

    /**
     * 根据门诊类别获取挂号科室
     */
    public org.tempuri.GetREGIST_DEPTbyMZLBResponseGetREGIST_DEPTbyMZLBResult getREGIST_DEPTbyMZLB(java.lang.String GHLB, java.lang.String MZLB) throws java.rmi.RemoteException;

    /**
     * 得到自费诊断信息
     */
    public org.tempuri.GetZfzdXXResponseGetZfzdXXResult getZfzdXX(java.lang.String sWheres) throws java.rmi.RemoteException;

    /**
     * 添加自费诊断
     */
    public org.tempuri.ReturnExComm addZfZd(org.tempuri.AddZfZdDs ds) throws java.rmi.RemoteException;

    /**
     * 删除自费诊断
     */
    public org.tempuri.ReturnExComm delZfzd(java.lang.String JBXH) throws java.rmi.RemoteException;

    /**
     * 启用自费诊断
     */
    public org.tempuri.ReturnExComm qyZfzd(java.lang.String isQY, java.lang.String JBXH) throws java.rmi.RemoteException;

    /**
     * 获得住院病区信息
     */
    public org.tempuri.ReturnExTable getZYBQALL() throws java.rmi.RemoteException;

    /**
     * 新增入院申请信息
     */
    public org.tempuri.ReturnExComm insertInHospital(org.tempuri.CLINIC_INHOSPITAL inHospital) throws java.rmi.RemoteException;

    /**
     * 更新入院申请信息
     */
    public org.tempuri.ReturnExComm updateInHospital(org.tempuri.CLINIC_INHOSPITAL inHospital) throws java.rmi.RemoteException;

    /**
     * 获取门诊入院申请信息
     */
    public org.tempuri.ReturnExTable getInHospitalByCLINIC_ID(java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 得到检验科室列表
     */
    public org.tempuri.GetJcksListResponseGetJcksListResult getJcksList() throws java.rmi.RemoteException;

    /**
     * 根据拼音码得到指定个数的检查项目
     */
    public org.tempuri.GetJcxmResponseGetJcxmResult getJcxm(java.lang.String pym, int count) throws java.rmi.RemoteException;

    /**
     * 根据科室代码得到该科室的检查项目
     */
    public org.tempuri.GetJclxListAsJcksResponseGetJclxListAsJcksResult getJclxListAsJcks(java.lang.String jcks) throws java.rmi.RemoteException;

    /**
     * 得到所有的检查类型
     */
    public org.tempuri.GetJclxListResponseGetJclxListResult getJclxList() throws java.rmi.RemoteException;

    /**
     * 得到所有检查项目
     */
    public org.tempuri.GetAllJcxmResponseGetAllJcxmResult getAllJcxm() throws java.rmi.RemoteException;

    /**
     * 得到常用检查项目
     */
    public org.tempuri.GetCyjcxmResponseGetCyjcxmResult getCyjcxm(java.lang.String ysgh) throws java.rmi.RemoteException;

    /**
     * 得到病人的检查申请单信息
     */
    public org.tempuri.GetBrjcSqdResponseGetBrjcSqdResult getBrjcSqd(java.lang.String zyh, java.lang.String kssj, java.lang.String jssj) throws java.rmi.RemoteException;

    /**
     * 得到病人的主诉和诊断信息
     */
    public java.lang.String getZsxxAndZdxx(java.lang.String clinic_id) throws java.rmi.RemoteException;

    /**
     * 获取检查报告
     */
    public org.tempuri.GetJcbgResponseGetJcbgResult getJcbg(java.lang.String PATIENT_ID, java.lang.String dateBegin, java.lang.String dateOver, java.lang.String jcmc) throws java.rmi.RemoteException;

    /**
     * 获取病理报告
     */
    public org.tempuri.GetblbgResponseGetblbgResult getblbg(java.lang.String PATIENT_ID, java.lang.String dateBegin, java.lang.String dateOver, java.lang.String mc) throws java.rmi.RemoteException;

    /**
     * 获取报告
     */
    public org.tempuri.GetbgResponseGetbgResult getbg(java.lang.String PATIENT_ID, java.lang.String dateBegin, java.lang.String dateOver, java.lang.String mc) throws java.rmi.RemoteException;

    /**
     * 获取检查报告
     */
    public org.tempuri.GetJcbgridResponseGetJcbgridResult getJcbgrid(java.lang.String REP_ID) throws java.rmi.RemoteException;

    /**
     * 挂号门诊收费汇总未结账操作员
     */
    public org.tempuri.ReturnExTable getNotJzCzghReport(java.lang.String mzlb, java.lang.String usertype) throws java.rmi.RemoteException;

    /**
     * 获取操作员最后一次结账时间
     */
    public org.tempuri.ReturnExTable getLastJzCzgh(java.lang.String czgh, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 挂号门诊收费汇总未汇总查看
     */
    public org.tempuri.ReturnExTable getGhMzxxSfHzNotHzSee(java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 挂号门诊收费汇总合计
     */
    public org.tempuri.ReturnExTable getGhMzxxSfHzHj(java.lang.String strStartDate, java.lang.String strEndDate, java.lang.String mzlb, java.lang.String usertype) throws java.rmi.RemoteException;

    /**
     * 挂号操作员结账列表
     */
    public org.tempuri.ReturnExTable getCzJzGhList(java.lang.String czgh, java.lang.String mzlb, java.lang.String jzrq) throws java.rmi.RemoteException;

    /**
     * 挂号操作员结账退号列表
     */
    public org.tempuri.ReturnExTable getCzJzGhThList(java.lang.String czgh, java.lang.String mzlb, java.lang.String jzrq) throws java.rmi.RemoteException;

    /**
     * 全院账户核实
     */
    public org.tempuri.ReturnExTable getCzghAccountVerify() throws java.rmi.RemoteException;

    /**
     * 操作员结账时间列表
     */
    public org.tempuri.ReturnExTable getCzjzList(java.lang.String czoper, java.lang.String mzlb, java.lang.String strStartTime, java.lang.String strEndTime) throws java.rmi.RemoteException;

    /**
     * 自助机或诊间未结算用户列表
     */
    public org.tempuri.ReturnExTable getZUserSelectData(java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 获取挂号表挂号信息
     */
    public org.tempuri.GetMzghxxbResponseGetMzghxxbResult getMzghxxb(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String ghy, java.lang.String jzhm, java.lang.String ghks, java.lang.String mzhm, java.lang.String brxm, java.lang.String czlx, java.lang.String REGIST_STATUS) throws java.rmi.RemoteException;

    /**
     * 获取账户表信息
     */
    public org.tempuri.GetMzzhxxbResponseGetMzzhxxbResult getMzzhxxb(java.lang.String jzhm, java.lang.String brxm, java.lang.String ID_NO, java.lang.String RELATION_ID) throws java.rmi.RemoteException;

    /**
     * 获取身份证一样的账户信息
     */
    public org.tempuri.GetMzzhxxbbyDifferentResponseGetMzzhxxbbyDifferentResult getMzzhxxbbyDifferent() throws java.rmi.RemoteException;

    /**
     * 获取账户收支明细表信息
     */
    public org.tempuri.GetSzmxbResponseGetSzmxbResult getSzmxb(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 获取发票信息
     */
    public org.tempuri.GetFpxxResponseGetFpxxResult getFpxx(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String brxm, java.lang.String sky, java.lang.String fphm1, java.lang.String fphm2, java.lang.String INSURANCE_CODE, java.lang.String ID_NO, java.lang.String brid) throws java.rmi.RemoteException;

    /**
     * 作废发票查询
     */
    public org.tempuri.GetZffpxxResponseGetZffpxxResult getZffpxx(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 实时获取挂号科室
     */
    public org.tempuri.GetGHKSbyWhereResponseGetGHKSbyWhereResult getGHKSbyWhere(java.lang.String where) throws java.rmi.RemoteException;

    /**
     * 退号查询
     */
    public org.tempuri.GetGhthcxResponseGetGhthcxResult getGhthcx(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 根据发票号码得到发药窗口
     */
    public java.lang.String getFYCKbyFPHM(java.lang.String FPHM) throws java.rmi.RemoteException;

    /**
     * 根据病人ID得到身份证号
     */
    public java.lang.String getSFZHbyBRID(java.lang.String BRID) throws java.rmi.RemoteException;

    /**
     * 得到发票收费项目列表
     */
    public org.tempuri.GetFpsfxmlbResponseGetFpsfxmlbResult getFpsfxmlb(java.lang.String fphm) throws java.rmi.RemoteException;

    /**
     * 得到处方项目列表
     */
    public org.tempuri.GetFpcfxmlbResponseGetFpcfxmlbResult getFpcfxmlb(java.lang.String lx, java.lang.String hm) throws java.rmi.RemoteException;

    /**
     * 得到作废发票收费项目列表
     */
    public org.tempuri.GetZffpsfxmlbResponseGetZffpsfxmlbResult getZffpsfxmlb(java.lang.String fphm) throws java.rmi.RemoteException;

    /**
     * 得到作废处方项目列表
     */
    public org.tempuri.GetZffpcfxmlbResponseGetZffpcfxmlbResult getZffpcfxmlb(java.lang.String lx, java.lang.String hm, java.lang.String FPHM) throws java.rmi.RemoteException;

    /**
     * 得到医保类型
     */
    public org.tempuri.GetYbDeptResponseGetYbDeptResult getYbDept() throws java.rmi.RemoteException;

    /**
     * 得到挂号科室
     */
    public org.tempuri.GetGhDeptResponseGetGhDeptResult getGhDept() throws java.rmi.RemoteException;

    /**
     * 获取门诊日志信息
     */
    public org.tempuri.PagedItemReturnObjectDataSet getMzRzXX(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String ys, java.lang.String jzhm, java.lang.String jzks, java.lang.String mzhm, java.lang.String brxm, java.lang.String zd, java.lang.String isYF, java.lang.String isMXB, java.lang.String isCRB, java.lang.String isZJ, int pageIndex, int pageSize, java.lang.String nl, java.lang.String nl1, java.lang.String nl2, java.lang.String isSYJS, java.lang.String sjd, java.lang.String blsx) throws java.rmi.RemoteException;

    /**
     * 导出门诊日志信息
     */
    public org.tempuri.GetExcelMzRzXXResponseGetExcelMzRzXXResult getExcelMzRzXX(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String ys, java.lang.String jzhm, java.lang.String jzks, java.lang.String mzhm, java.lang.String brxm, java.lang.String zd, java.lang.String isYF, java.lang.String isMXB, java.lang.String isCRB, java.lang.String isZJ, java.lang.String nl, java.lang.String nl1, java.lang.String nl2, java.lang.String isSYJS, java.lang.String sjd, java.lang.String blsx) throws java.rmi.RemoteException;

    /**
     * 得到报卡
     */
    public org.tempuri.GetBKResponseGetBKResult getBK(java.lang.String mbid, java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 获取详细资料病人列表
     */
    public org.tempuri.GetXxzlResponseGetXxzlResult getXxzl(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String brxm, java.lang.String INSURANCE_CODE, java.lang.String ID_NO, java.lang.String brid, java.lang.String DOCTOR_CODE) throws java.rmi.RemoteException;

    /**
     * 获取病人详细资料
     */
    public org.tempuri.GetXxcfjcResponseGetXxcfjcResult getXxcfjc(java.lang.String brid, java.lang.String dateBegin, java.lang.String dateOver, java.lang.String ysdm) throws java.rmi.RemoteException;

    /**
     * 获取医生登录信息
     */
    public org.tempuri.GetYsdlcxResponseGetYsdlcxResult getYsdlcx(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String ghy, java.lang.String ghks) throws java.rmi.RemoteException;

    /**
     * 获取门诊预约汇总
     */
    public org.tempuri.GetMzyyhzResponseGetMzyyhzResult getMzyyhz(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String lx) throws java.rmi.RemoteException;

    /**
     * 获取医生预约汇总
     */
    public org.tempuri.GetyyyshzResponseGetyyyshzResult getyyyshz(java.lang.String dateBegin, java.lang.String dateOver) throws java.rmi.RemoteException;

    /**
     * 获取锁号记录
     */
    public org.tempuri.GetShjlResponseGetShjlResult getShjl(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String lx, java.lang.String pbys) throws java.rmi.RemoteException;

    /**
     * 获取排班记录
     */
    public org.tempuri.GetPbjlResponseGetPbjlResult getPbjl(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String pbys) throws java.rmi.RemoteException;

    /**
     * 查询自助机钱的张数
     */
    public org.tempuri.GetZzjQZSResponseGetZzjQZSResult getZzjQZS(java.lang.String dateBegin, java.lang.String dateOver, java.lang.String CZGH) throws java.rmi.RemoteException;

    /**
     * 获取自助机用户信息
     */
    public org.tempuri.GetZzjUserResponseGetZzjUserResult getZzjUser() throws java.rmi.RemoteException;

    /**
     * 统计医生诊间结算数据
     */
    public org.tempuri.GetZJJSofYSResponseGetZJJSofYSResult getZJJSofYS(java.lang.String startTime, java.lang.String endTime, java.lang.String mzDEPT_CODE, java.lang.String YSCZGH) throws java.rmi.RemoteException;

    /**
     * 门诊手术业务量统计
     */
    public org.tempuri.GetMZSSYWResponseGetMZSSYWResult getMZSSYW(java.lang.String startTime, java.lang.String endTime, java.lang.String mzDEPT_CODE) throws java.rmi.RemoteException;

    /**
     * 病人退费信息查询
     */
    public org.tempuri.GetTfxxResponseGetTfxxResult getTfxx(java.lang.String startTime, java.lang.String endTime, java.lang.String OPERATE_MACHINE_ID, java.lang.String PATIENT_NAME) throws java.rmi.RemoteException;

    /**
     * 获取病人相应诊断类型的诊断
     */
    public org.tempuri.GetRybrZdlxZdsResponseGetRybrZdlxZdsResult getRybrZdlxZds(java.lang.String patient_id, java.lang.String zdlxdm) throws java.rmi.RemoteException;

    /**
     * 获取获取医生个人常用诊断代码
     */
    public org.tempuri.GetGRZDDMResponseGetGRZDDMResult getGRZDDM(java.lang.String doctor_Code, java.lang.String DEPT_CODE) throws java.rmi.RemoteException;

    /**
     * 获取输入的诊断
     */
    public org.tempuri.GetZdsResponseGetZdsResult getZds(java.lang.String zd) throws java.rmi.RemoteException;

    /**
     * 获取输入的诊断
     */
    public org.tempuri.GetNbZdsResponseGetNbZdsResult getNbZds(java.lang.String zd, java.lang.String NBYBBZ, java.lang.String zyxy) throws java.rmi.RemoteException;

    /**
     * 新增病人诊断
     */
    public int addBrZd(java.lang.String[] infos) throws java.rmi.RemoteException;

    /**
     * 保存诊断
     */
    public org.tempuri.ReturnExComm mzZDSave(org.tempuri.MzZDSaveDt dt) throws java.rmi.RemoteException;

    /**
     * 护士保存诊断
     */
    public org.tempuri.ReturnExComm hsZDSave(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 更新病人诊断,注：SGSJ为ZDSJ。ZDSJ为第一次的诊断时间
     */
    public int updateBrZd(java.lang.String[] infos) throws java.rmi.RemoteException;

    /**
     * 删除病人诊断
     */
    public int deleteBrZd(java.lang.String zdlxdm, java.lang.String autoid, java.lang.String scz, java.lang.String patient_id) throws java.rmi.RemoteException;

    /**
     * 更新诊断顺序
     */
    public boolean updateBrZdPxh(java.lang.String pxh) throws java.rmi.RemoteException;

    /**
     * 判断报卡是否上报
     */
    public org.tempuri.GetBksfsbResponseGetBksfsbResult getBksfsb(java.lang.String ICD10, java.lang.String brid, java.lang.String zdrq1, java.lang.String zdrq2) throws java.rmi.RemoteException;

    /**
     * 判断一个月内是否有糖尿病
     */
    public org.tempuri.GetTnbBkBzResponseGetTnbBkBzResult getTnbBkBz(java.lang.String brid) throws java.rmi.RemoteException;

    /**
     * 获取历史诊断
     */
    public org.tempuri.GetLSZDResponseGetLSZDResult getLSZD(java.lang.String BRID, java.lang.String CLINIC_ID, java.lang.String DOCTOR_CODE) throws java.rmi.RemoteException;

    /**
     * 修正历史诊断
     */
    public org.tempuri.ReturnExComm editLSZD(java.lang.String SERIAL_ID, java.lang.String DIAGNOSIS_CODE, java.lang.String DIAGNOSIS_NAME, java.lang.String JBXH, java.lang.String USER_CODE, java.lang.String USER_NAME) throws java.rmi.RemoteException;

    /**
     * 根据模板号查找模板内容
     */
    public java.lang.String getYyfEditorMb(java.lang.String mbid) throws java.rmi.RemoteException;

    /**
     * 根据模板号查找模板内容，与指定版本不同
     */
    public org.tempuri.GetYyfEditorMbAllInfoResponseGetYyfEditorMbAllInfoResult getYyfEditorMbAllInfo(java.lang.String mbid, java.lang.String version) throws java.rmi.RemoteException;

    /**
     * 更新模板内容
     */
    public java.lang.String updateYyfEditorMb(java.lang.String mbid, java.lang.String mbmc, java.lang.String ywy, java.lang.String mbxml, java.lang.String version, java.lang.String ksdm) throws java.rmi.RemoteException;

    /**
     * 拼音码转换
     */
    public void addIdcPym() throws java.rmi.RemoteException;

    /**
     * 得到医技科室设备表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getPageExam_EquipmentList(java.lang.String strWhere, int pageSize, int pageIndex) throws java.rmi.RemoteException;

    /**
     * 获取设备操作安排表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getPageExam_ScheduleList(java.lang.String strWhere, int pageSize, int pageIndex) throws java.rmi.RemoteException;

    /**
     * 获取检查排班
     */
    public org.tempuri.GetExam_ScheduleByItemIDResponseGetExam_ScheduleByItemIDResult getExam_ScheduleByItemID(java.lang.String itemID, java.lang.String EXAM_DATE, java.lang.String EQUIPMENT_NUMstr, java.lang.String ID_NO, java.lang.String TELEPHONE) throws java.rmi.RemoteException;

    /**
     * 获取机器的诊室号和机器号
     */
    public org.tempuri.GetExamRoomNumAndEquipmentNumByItemIDResponseGetExamRoomNumAndEquipmentNumByItemIDResult getExamRoomNumAndEquipmentNumByItemID(java.lang.String itemID) throws java.rmi.RemoteException;

    /**
     * 用于检查医生在同一天同一时间段是否存在相同的排班
     */
    public org.tempuri.ReturnExTable checkScheduleDoctorTime(java.lang.String scheduleDate, java.lang.String scheduleId) throws java.rmi.RemoteException;

    /**
     * 获取排班主表定义跟据ScheduleId
     */
    public org.tempuri.ReturnExTable getClinicScheduleByScheduleId(java.lang.String scheduleId) throws java.rmi.RemoteException;

    /**
     * 获取排班号跟据TimeId
     */
    public org.tempuri.ReturnExTable getClinicScheduleTimeByTimeId(java.lang.String timeId) throws java.rmi.RemoteException;

    /**
     * 排班审核确认
     */
    public org.tempuri.ReturnExComm updateClinicScheduleAudit(java.lang.String scheduleId, java.lang.String auditusercode) throws java.rmi.RemoteException;

    /**
     * 排班提交审核
     */
    public org.tempuri.ReturnExComm updateClinicScheduleSubmitAudit(java.lang.String scheduleId, java.lang.String submitusercode) throws java.rmi.RemoteException;

    /**
     * 节假日确认与取消
     */
    public org.tempuri.ReturnExComm updateClinicJjzOk(java.lang.String scheduleId, java.lang.String opertype) throws java.rmi.RemoteException;

    /**
     * 排班主表已审核打删除标志
     */
    public org.tempuri.ReturnExComm updateClinicScheduleApproveedDeleteByScheduleId(java.lang.String scheduleId, java.lang.String deleteusercode) throws java.rmi.RemoteException;

    /**
     * 获取排班时间段定义
     */
    public org.tempuri.ReturnExTable getScheduleTimeAmPmByScheduleId(java.lang.String scheduleId) throws java.rmi.RemoteException;

    /**
     * 获取排班医生定义
     */
    public org.tempuri.ReturnExTable getScheduleDoctorsByScheduleId(java.lang.String scheduleId) throws java.rmi.RemoteException;

    /**
     * 获取科室或者医生排班时间定义模版
     */
    public org.tempuri.PagedItemReturnObjectDataSet getScheduleTimeTemplateList(java.lang.String strWhere, int pageSize, int pageIndex) throws java.rmi.RemoteException;

    /**
     * 获取单个科室或者医生排班时间定义模版
     */
    public org.tempuri.ReturnExTable getScheduleTimeTemplateByDefineId(java.lang.String defineid) throws java.rmi.RemoteException;

    /**
     * 获取单个医生排班时间定义模版
     */
    public org.tempuri.ReturnExTable getScheduleTimeTemplateByDoctorCode(java.lang.String doctorCode) throws java.rmi.RemoteException;

    /**
     * 获取科室排班时间定义模版
     */
    public org.tempuri.ReturnExTable getScheduleTimeTemplateByKsdm(java.lang.String ksdm) throws java.rmi.RemoteException;

    /**
     * 删除科室或者医生排班时间定义模版
     */
    public org.tempuri.ReturnExComm delScheduleTimeTemplate(java.lang.String[] defineS) throws java.rmi.RemoteException;

    /**
     * 新增科室或者医生排班时间定义模版
     */
    public org.tempuri.ReturnExComm insertScheduleTimeTemplate(java.lang.String ksdm, java.lang.String ksmc, java.lang.String doctor_code, java.lang.String time_start, java.lang.String time_end, java.lang.String registernums, java.lang.String create_code) throws java.rmi.RemoteException;

    /**
     * 更新科室或者医生排班时间定义模版
     */
    public org.tempuri.ReturnExComm updateScheduleTimeTemplate(java.lang.String defineid, java.lang.String time_start, java.lang.String time_end, java.lang.String registernums, java.lang.String update_code) throws java.rmi.RemoteException;

    /**
     * 删除科室或者医生排班时间定义模版
     */
    public org.tempuri.GetCLINIC_SCHEDULEResponseGetCLINIC_SCHEDULEResult getCLINIC_SCHEDULE() throws java.rmi.RemoteException;

    /**
     * 根据查询条件获取排班表
     */
    public org.tempuri.GetCLINIC_SCHEDULElistResponseGetCLINIC_SCHEDULElistResult getCLINIC_SCHEDULElist(java.lang.String PBKSTime, java.lang.String PBJSTime, java.lang.String ks, java.lang.String pblx) throws java.rmi.RemoteException;

    /**
     * 根据查询条件获取排班表
     */
    public org.tempuri.ReturnExTable getCLINIC_SCHEDULElistByWhere(java.lang.String strWhere, java.lang.String strRoleId) throws java.rmi.RemoteException;

    /**
     * 取分屏正叫号列表
     */
    public org.tempuri.QueryReadyPatientinfoResponseQueryReadyPatientinfoResult queryReadyPatientinfo(org.tempuri.Timeinfo ti) throws java.rmi.RemoteException;

    /**
     * 下一个叫号
     */
    public java.lang.String callNext(org.tempuri.PatientinfoCall patientinfo) throws java.rmi.RemoteException;

    /**
     * 取电视屏正叫号列表
     */
    public org.tempuri.QueryReadyPatientinfoTvResponseQueryReadyPatientinfoTvResult queryReadyPatientinfoTv(org.tempuri.Timeinfo ti) throws java.rmi.RemoteException;

    /**
     * 获取电视屏显示科室或医生
     */
    public org.tempuri.QueryIpshowinfoTvResponseQueryIpshowinfoTvResult queryIpshowinfoTv(org.tempuri.Ipshowinfo ip) throws java.rmi.RemoteException;

    /**
     * 获取分屏显示科室或医生
     */
    public org.tempuri.QueryIpshowinfoResponseQueryIpshowinfoResult queryIpshowinfo(org.tempuri.Ipshowinfo ip) throws java.rmi.RemoteException;

    /**
     * 获取电视屏等待信息
     */
    public org.tempuri.QueryDoctorWaitResponseQueryDoctorWaitResult queryDoctorWait(org.tempuri.Timeinfo ti) throws java.rmi.RemoteException;

    /**
     * 获取未叫号未就诊列表
     */
    public org.tempuri.QueryPatientinfoWjzResponseQueryPatientinfoWjzResult queryPatientinfoWjz(org.tempuri.PatientinfoCall patientinfo) throws java.rmi.RemoteException;

    /**
     * 获取未叫号列表
     */
    public org.tempuri.QueryPatientinfoResponseQueryPatientinfoResult queryPatientinfo(org.tempuri.PatientinfoCall patientinfo) throws java.rmi.RemoteException;

    /**
     * 获取已挂失就诊卡信息
     */
    public org.tempuri.GetOldCardResponseGetOldCardResult getOldCard(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 获取用户信息跟据条件
     */
    public org.tempuri.ReturnExTable getCardInfoByCARD_NO(java.lang.String strCARD_NO) throws java.rmi.RemoteException;

    /**
     * 获取正常就诊卡信息
     */
    public org.tempuri.GetCardResponseGetCardResult getCard(java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 是否已存在监护人病人信息
     */
    public boolean isHavePatient(java.lang.String RELATION_ID, java.lang.String PATIENT_NAME, java.lang.String SEX) throws java.rmi.RemoteException;

    /**
     * 账户是否有足够的费用
     */
    public org.tempuri.ReturnExComm isEnoughCost(java.lang.String PATIENT_ID, java.math.BigDecimal cost) throws java.rmi.RemoteException;

    /**
     * 获取指定报卡的xml文件
     */
    public org.tempuri.GetBkXmlResponseGetBkXmlResult getBkXml(java.lang.String guid) throws java.rmi.RemoteException;

    /**
     * 审核/未审核/删除报卡
     */
    public java.lang.String updateBkXml(java.lang.String[] info, java.lang.String zth) throws java.rmi.RemoteException;

    /**
     * 新增修改病人报卡
     */
    public java.lang.String updateBk(org.tempuri.PatientBkClass prc, java.lang.String xml, java.lang.String data) throws java.rmi.RemoteException;

    /**
     * 删除报卡
     */
    public boolean deleteBk(java.lang.String CLINIC_ID, java.lang.String scz, java.lang.String mr_id) throws java.rmi.RemoteException;

    /**
     * 报卡查询列表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getFbkBk(java.lang.String[] infos, int pageIndex, int pageSize) throws java.rmi.RemoteException;

    /**
     * 报卡查询列表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getYsBk(java.lang.String[] infos, int pageIndex, int pageSize) throws java.rmi.RemoteException;

    /**
     * 慢病卡导出
     */
    public org.tempuri.GetMbBkExcelResponseGetMbBkExcelResult getMbBkExcel(java.lang.String[] infos) throws java.rmi.RemoteException;

    /**
     * 根据发票获取病人收费项目
     */
    public org.tempuri.GetPaymentXMResponseGetPaymentXMResult getPaymentXM(java.lang.String FPHM, java.lang.String ZFPB) throws java.rmi.RemoteException;

    /**
     * 获取病人收费项目组
     */
    public org.tempuri.GetPaymentGroupXMResponseGetPaymentGroupXMResult getPaymentGroupXM(java.lang.String PATIENT_ID, java.lang.String CLINIC_ID, java.lang.String as_kfrq) throws java.rmi.RemoteException;

    /**
     * 获取医技码表
     */
    public org.tempuri.GetPaymentYjMbResponseGetPaymentYjMbResult getPaymentYjMb(java.lang.String queryStr) throws java.rmi.RemoteException;

    /**
     * 获取药品码表
     */
    public org.tempuri.GetPaymentYpMbResponseGetPaymentYpMbResult getPaymentYpMb(java.lang.String queryStr) throws java.rmi.RemoteException;

    /**
     * 获取his医生码表
     */
    public org.tempuri.GetPaymentYSMbResponseGetPaymentYSMbResult getPaymentYSMb(java.lang.String strWhere) throws java.rmi.RemoteException;

    /**
     * 获取his科室码表
     */
    public org.tempuri.GetPaymentKSMbResponseGetPaymentKSMbResult getPaymentKSMb() throws java.rmi.RemoteException;

    /**
     * 费用归别码表
     */
    public org.tempuri.GetPaymentFYGBMbResponseGetPaymentFYGBMbResult getPaymentFYGBMb() throws java.rmi.RemoteException;

    /**
     * 医疗类别码表
     */
    public org.tempuri.GetPaymentYLLBMbResponseGetPaymentYLLBMbResult getPaymentYLLBMb() throws java.rmi.RemoteException;

    /**
     * 获取套餐信息
     */
    public org.tempuri.GetPaymentTCXXResponseGetPaymentTCXXResult getPaymentTCXX(java.lang.String TCXH) throws java.rmi.RemoteException;

    /**
     * 获取已作废发票
     */
    public org.tempuri.GetPaymentZFFPResponseGetPaymentZFFPResult getPaymentZFFP(java.lang.String CZGH, java.lang.String queryDateS, java.lang.String queryDateE) throws java.rmi.RemoteException;

    /**
     * 获取要作废发票信息
     */
    public org.tempuri.GetPaymentZFFPXXResponseGetPaymentZFFPXXResult getPaymentZFFPXX(java.lang.String FPHM) throws java.rmi.RemoteException;

    /**
     * 获取处方类型组
     */
    public org.tempuri.GetPaymentZFFPLXGroupResponseGetPaymentZFFPLXGroupResult getPaymentZFFPLXGroup(java.lang.String FPHM, java.lang.String ZFPB) throws java.rmi.RemoteException;

    /**
     * 是否发药
     */
    public boolean getIsFy(java.lang.String FPHM) throws java.rmi.RemoteException;

    /**
     * 检验是否执行
     */
    public boolean getIsZx(java.lang.String FPHM) throws java.rmi.RemoteException;

    /**
     * 发票作废病人信息
     */
    public org.tempuri.GetBackPaymentBRXXResponseGetBackPaymentBRXXResult getBackPaymentBRXX(java.lang.String BRID) throws java.rmi.RemoteException;

    /**
     * 发票作废
     */
    public org.tempuri.ReturnExComm backPayment(java.lang.String FPHM, java.lang.String CZGH, java.lang.String as_zf_ybzh, java.lang.String as_zf_dzlsh, java.lang.String as_zdjbh, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 取消预约
     */
    public java.lang.String cancelJcyy(java.lang.String[] yjxhs) throws java.rmi.RemoteException;

    /**
     * 取消发票作废
     */
    public org.tempuri.ReturnExComm cancelBackPayment(java.lang.String FPHM) throws java.rmi.RemoteException;

    /**
     * 获取发票打印列表
     */
    public org.tempuri.GetPrintFPListResponseGetPrintFPListResult getPrintFPList(java.lang.String BRID, java.lang.String KSRQ, java.lang.String JSRQ) throws java.rmi.RemoteException;

    /**
     * 添加新的收费项目
     */
    public org.tempuri.AddPaymentXMResponseAddPaymentXMResult addPaymentXM(org.tempuri.AddPaymentXMPaymentds paymentds) throws java.rmi.RemoteException;

    /**
     * 获取特殊病药品医技码表
     */
    public org.tempuri.GetTSBZYPDYResponseGetTSBZYPDYResult getTSBZYPDY() throws java.rmi.RemoteException;

    /**
     * 获取HIS库门诊号码
     */
    public java.lang.String getHisMZXH(java.lang.String BRID) throws java.rmi.RemoteException;

    /**
     * 获取诊间收费公共工号和姓名
     */
    public java.lang.String getZJSFCZGH() throws java.rmi.RemoteException;

    /**
     * 收费出错医保回退后删除医保记录
     */
    public org.tempuri.ReturnExComm delYBandYKTJL(java.lang.String INSURANCE, java.lang.String FPHM, java.lang.String JZLX) throws java.rmi.RemoteException;

    /**
     * 根据诊断判断是否自费结算
     */
    public java.lang.String getIsZFbyZD(java.lang.String BRID, java.lang.String SFRQ) throws java.rmi.RemoteException;

    /**
     * 获取以前未结算数据
     */
    public java.lang.String getOldJssj(java.lang.String BRID, java.lang.String SFRQ, int day) throws java.rmi.RemoteException;

    /**
     * 制卡
     */
    public org.tempuri.ReturnExComm makeCard(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 挂失
     */
    public org.tempuri.ReturnExComm reportTheLoss(java.lang.String CARD_NO) throws java.rmi.RemoteException;

    /**
     * 补卡
     */
    public org.tempuri.ReturnExComm fillCard(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 充值
     */
    public org.tempuri.ReturnExComm recharge(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 退费
     */
    public org.tempuri.ReturnExComm refund(java.lang.String PATIENT_ID, java.lang.String BALANCE, java.lang.String USER_CODE, java.lang.String MZLB) throws java.rmi.RemoteException;

    /**
     * 结束就诊或结算
     */
    public org.tempuri.ReturnExComm endVisitOrPay(java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 结束就诊或结算
     */
    public org.tempuri.ReturnExComm endVisitOrPayByID(java.lang.String PATIENT_ID, java.lang.String ZZCZGH) throws java.rmi.RemoteException;

    /**
     * 锁定就诊号
     */
    public org.tempuri.ReturnExComm lockCLINIC(java.lang.String PATIENT_ID, java.lang.String CZGH) throws java.rmi.RemoteException;

    /**
     * 会诊单列表
     */
    public org.tempuri.PagedItemReturnObjectDataSet getHzList(java.lang.String kssj, java.lang.String jssj, java.lang.String xzlx, java.lang.String clinic_id, java.lang.String userid, java.lang.String ksid, int pageIndex, int pageSize) throws java.rmi.RemoteException;

    /**
     * 得到单个会诊信息
     */
    public org.tempuri.GetHzdResponseGetHzdResult getHzd(java.lang.String autoid) throws java.rmi.RemoteException;

    /**
     * 新增会诊信息
     */
    public org.tempuri.ReturnExComm insertHzd(org.tempuri.PatientHzdClass hzd) throws java.rmi.RemoteException;

    /**
     * 更新会诊信息
     */
    public org.tempuri.ReturnExComm updateHzd(org.tempuri.PatientHzdClass hzd) throws java.rmi.RemoteException;

    /**
     * 删除会诊信息
     */
    public org.tempuri.ReturnExComm deleteHzd(java.lang.String autoid) throws java.rmi.RemoteException;

    /**
     * 获取档案病人信息
     */
    public org.tempuri.GetBrdaxxbResponseGetBrdaxxbResult getBrdaxxb(java.lang.String jzhm, java.lang.String mzhm, java.lang.String brxm) throws java.rmi.RemoteException;

    /**
     * 获取医生挂号汇总表
     */
    public org.tempuri.GetGhhzForYSResponseGetGhhzForYSResult getGhhzForYS(java.lang.String startTime, java.lang.String endTime, java.lang.String SJPB) throws java.rmi.RemoteException;

    /**
     * 获取科室挂号汇总表
     */
    public org.tempuri.GetGhhzForGHKSResponseGetGhhzForGHKSResult getGhhzForGHKS(java.lang.String startTime, java.lang.String endTime, java.lang.String SJPB) throws java.rmi.RemoteException;

    /**
     * 获取门诊科室挂号汇总表
     */
    public org.tempuri.GetGhhzForMZKSResponseGetGhhzForMZKSResult getGhhzForMZKS(java.lang.String startTime, java.lang.String endTime, java.lang.String SJPB) throws java.rmi.RemoteException;

    /**
     * 获取门诊科室挂号汇总表
     */
    public org.tempuri.GetYwhzForMZKSResponseGetYwhzForMZKSResult getYwhzForMZKS(java.lang.String startTime, java.lang.String endTime, java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 住院情况查询
     */
    public org.tempuri.GetZyxxcxByKSResponseGetZyxxcxByKSResult getZyxxcxByKS(java.lang.String KSDM) throws java.rmi.RemoteException;

    /**
     * 住院科室
     */
    public org.tempuri.GetZyKSResponseGetZyKSResult getZyKS() throws java.rmi.RemoteException;

    /**
     * 部门信息
     */
    public org.tempuri.GetDictDeptReportResponseGetDictDeptReportResult getDictDeptReport(java.lang.String pym) throws java.rmi.RemoteException;

    /**
     * 医技费用
     */
    public org.tempuri.GetYjSfReportResponseGetYjSfReportResult getYjSfReport(java.lang.String strStartDate, java.lang.String strEndDate, java.lang.String ylxh) throws java.rmi.RemoteException;

    /**
     * 医生医技费用
     */
    public org.tempuri.GetYsYjMxforReportResponseGetYsYjMxforReportResult getYsYjMxforReport(java.lang.String strStartDate, java.lang.String strEndDate, java.lang.String ylxh, java.lang.String ysdm) throws java.rmi.RemoteException;

    /**
     * 医技项目名称
     */
    public org.tempuri.GetYlsfMcforReportResponseGetYlsfMcforReportResult getYlsfMcforReport(java.lang.String pydm) throws java.rmi.RemoteException;

    /**
     * 医生名称
     */
    public org.tempuri.GetYsDmforReportResponseGetYsDmforReportResult getYsDmforReport(java.lang.String pydm) throws java.rmi.RemoteException;

    /**
     * 医技项目医生
     */
    public org.tempuri.GetMxfyhsReportResponseGetMxfyhsReportResult getMxfyhsReport(java.lang.String strStartDate, java.lang.String strEndDate, java.lang.String ylxh) throws java.rmi.RemoteException;

    /**
     * 明细费用核算项目名称
     */
    public org.tempuri.GetMxfyhsListResponseGetMxfyhsListResult getMxfyhsList(java.lang.String pydm) throws java.rmi.RemoteException;

    /**
     * 一卡通核拨表
     */
    public org.tempuri.GetYktReportResponseGetYktReportResult getYktReport(java.lang.String strXzdm, java.lang.String strStartDate, java.lang.String strEndDate) throws java.rmi.RemoteException;

    /**
     * 磁卡发放报表
     */
    public org.tempuri.GetCkReportResponseGetCkReportResult getCkReport(java.lang.String strMzlb, java.lang.String strStartDate, java.lang.String strEndDate) throws java.rmi.RemoteException;

    /**
     * 医保核拨表
     */
    public org.tempuri.GetYbhbbReportResponseGetYbhbbReportResult getYbhbbReport(java.lang.String strJzlx, java.lang.String strStartDate, java.lang.String strEndDate) throws java.rmi.RemoteException;

    /**
     * 科室医生汇总
     */
    public org.tempuri.GetDoctDeptXmHzReportResponseGetDoctDeptXmHzReportResult getDoctDeptXmHzReport(java.lang.String bbbh, java.lang.String type, java.lang.String mzlb, java.lang.String strStartDate, java.lang.String strEndDate, java.lang.String strDeptCode) throws java.rmi.RemoteException;

    /**
     * 门诊收入日汇总报表
     */
    public org.tempuri.GetGhMzSrHzReportResponseGetGhMzSrHzReportResult getGhMzSrHzReport(java.lang.String mzlb, java.lang.String strStartDate, java.lang.String strEndDate) throws java.rmi.RemoteException;

    /**
     * 获取挂号门诊日报统计
     */
    public org.tempuri.GetGhMzxxCreateTjResponseGetGhMzxxCreateTjResult getGhMzxxCreateTj(java.lang.String czgh, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 获取挂号门诊已结账统计
     */
    public org.tempuri.GetGhMzxxJzTjResponseGetGhMzxxJzTjResult getGhMzxxJzTj(java.lang.String czgh, java.lang.String jzrq, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 挂号门诊收费结账
     */
    public org.tempuri.ReturnExComm ghMzxxCzJz(java.lang.String czgh, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 挂号门诊收费已经结账列表
     */
    public org.tempuri.ReturnExTable getGhMzxxCzJzList(java.lang.String czgh, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 挂号门诊收费汇总操作结账
     */
    public org.tempuri.ReturnExComm ghMzxxHzCzJz(java.lang.String czghtype, java.lang.String mzlb) throws java.rmi.RemoteException;

    /**
     * 获取报卡诊断表
     */
    public org.tempuri.GetBkzdResponseGetBkzdResult getBkzd(java.lang.String MRID, java.lang.String sWhere) throws java.rmi.RemoteException;

    /**
     * 获取HIS诊断表
     */
    public org.tempuri.GetHisZDResponseGetHisZDResult getHisZD(java.lang.String sWhere) throws java.rmi.RemoteException;

    /**
     * 添加报卡诊断
     */
    public org.tempuri.ReturnExComm addBkzd(org.tempuri.AddBkzdDs ds) throws java.rmi.RemoteException;

    /**
     * 删除报卡诊断
     */
    public org.tempuri.ReturnExComm delBkzd(java.lang.String JBXH) throws java.rmi.RemoteException;

    /**
     * 获取病人病理内镜报告
     */
    public org.tempuri.GetBlNjbgResponseGetBlNjbgResult getBlNjbg(java.lang.String brid, java.lang.String bglx, java.lang.String lx, java.lang.String dateBegin, java.lang.String dateOver) throws java.rmi.RemoteException;

    /**
     * 获取病理或内镜图片
     */
    public org.tempuri.GetBgImgResponseGetBgImgResult getBgImg(java.lang.String jch, java.lang.String xm, java.lang.String sjjcrq) throws java.rmi.RemoteException;

    /**
     * 获取知识库列表
     */
    public org.tempuri.GetKbListResponseGetKbListResult getKbList() throws java.rmi.RemoteException;

    /**
     * 获取知识库列表
     */
    public org.tempuri.GetKbListaResponseGetKbListaResult getKbLista() throws java.rmi.RemoteException;

    /**
     * 加载指定业务ID的知识库数据
     */
    public org.tempuri.GetKBliarbryDataSetResponseGetKBliarbryDataSetResult getKBliarbryDataSet(java.lang.String ywid, java.lang.String gh, java.lang.String ks) throws java.rmi.RemoteException;

    /**
     * 加载指定业务ID的知识库数据
     */
    public org.tempuri.GetKBliarbryDataSetaResponseGetKBliarbryDataSetaResult getKBliarbryDataSeta(java.lang.String ywid, java.lang.String gh, java.lang.String ks) throws java.rmi.RemoteException;

    /**
     * 返回指定数据库地址的单张表指定字段
     */
    public java.lang.Object getSingleColumnValue(java.lang.String kbseq) throws java.rmi.RemoteException;

    /**
     * 返回指定数据库地址的单张表指定字段
     */
    public java.lang.Object getSingleColumnValuea(java.lang.String kbseq) throws java.rmi.RemoteException;

    /**
     * 返回指定数据库地址的单张表的指定行数据
     */
    public org.tempuri.GetSingleTableResponseGetSingleTableResult getSingleTable(java.lang.String where) throws java.rmi.RemoteException;

    /**
     * 返回指定数据库地址的单张表的指定行数据
     */
    public org.tempuri.GetSingleTableaResponseGetSingleTableaResult getSingleTablea(java.lang.String where) throws java.rmi.RemoteException;

    /**
     * 更新知识库
     */
    public boolean insertOrUpdateKblibrary(java.lang.String strlistvalue, org.tempuri.InsertOrUpdateKblibraryDtitem dtitem, java.lang.String action) throws java.rmi.RemoteException;

    /**
     * 更新知识库
     */
    public boolean insertOrUpdateKblibrarya(java.lang.String strlistvalue, org.tempuri.InsertOrUpdateKblibraryaDtitem dtitem, java.lang.String action) throws java.rmi.RemoteException;

    /**
     * 检索
     */
    public org.tempuri.GetKBliarbryJsDataSetResponseGetKBliarbryJsDataSetResult getKBliarbryJsDataSet(java.lang.String ywid, java.lang.String ks, java.lang.String gh, java.lang.String lx, java.lang.String qy, java.lang.String jsmc) throws java.rmi.RemoteException;

    /**
     * 检索
     */
    public org.tempuri.GetKBliarbryJsDataSetaResponseGetKBliarbryJsDataSetaResult getKBliarbryJsDataSeta(java.lang.String ywid, java.lang.String ks, java.lang.String gh, java.lang.String lx, java.lang.String qy, java.lang.String jsmc) throws java.rmi.RemoteException;

    /**
     * 上移
     */
    public boolean insertOrUpdatey(java.lang.String strlistvalue, java.lang.String action) throws java.rmi.RemoteException;

    /**
     * 上移
     */
    public boolean insertOrUpdateya(java.lang.String strlistvalue, java.lang.String action) throws java.rmi.RemoteException;

    /**
     * 删除多张表的指定数据
     */
    public boolean deleteMoreTableValue(java.lang.String strdictables) throws java.rmi.RemoteException;

    /**
     * 得到未确认检验危急值项目
     */
    public org.tempuri.GetBqWqrJYwjzxmResponseGetBqWqrJYwjzxmResult getBqWqrJYwjzxm(java.lang.String ysgh, java.lang.String kssj, java.lang.String jssj) throws java.rmi.RemoteException;

    /**
     * 确认未确认的检验危急值
     */
    public java.lang.String qrJywjz(org.tempuri.QrJywjzDt dt, java.lang.String ysxm, java.lang.String ksdm, java.lang.String ksmc, java.lang.String ysgh) throws java.rmi.RemoteException;

    /**
     * 得到未处置的检验危急值项目
     */
    public org.tempuri.GetBqWczJywjzxmResponseGetBqWczJywjzxmResult getBqWczJywjzxm(java.lang.String ksdm, java.lang.String kssj, java.lang.String jssj) throws java.rmi.RemoteException;

    /**
     * 得到未处置的检验危急值项目
     */
    public org.tempuri.GetBqYczJywjzxmResponseGetBqYczJywjzxmResult getBqYczJywjzxm(java.lang.String bqdm, java.lang.String kssj, java.lang.String jssj) throws java.rmi.RemoteException;

    /**
     * 处置未处置的检验危急值项目
     */
    public java.lang.String czJywjz(java.lang.String jlxh, java.lang.String ysxm, java.lang.String czff, java.lang.String czbc, java.lang.String czsj) throws java.rmi.RemoteException;

    /**
     * 获取住院历史病历
     */
    public org.tempuri.GetPatientLsDoucumentsPathResponseGetPatientLsDoucumentsPathResult getPatientLsDoucumentsPath(java.lang.String zjhm) throws java.rmi.RemoteException;

    /**
     * 获取某次入院病历
     */
    public org.tempuri.GetlsmxPatientLsDoucumentsPathResponseGetlsmxPatientLsDoucumentsPathResult getlsmxPatientLsDoucumentsPath(java.lang.String brylxh) throws java.rmi.RemoteException;

    /**
     * 获取住院病程记录
     */
    public org.tempuri.GetBcjlInfoResponseGetBcjlInfoResult getBcjlInfo(java.lang.String guid, java.lang.String brylxh) throws java.rmi.RemoteException;

    /**
     * 获取住院医嘱
     */
    public org.tempuri.GetBrAllYpyzAndZlyzResponseGetBrAllYpyzAndZlyzResult getBrAllYpyzAndZlyz(java.lang.String brylxh, java.lang.String zybz, java.lang.String yzlx) throws java.rmi.RemoteException;

    /**
     * 根据门诊序号得到病人门诊信息
     */
    public org.tempuri.ReturnExTable getMzbrMzjlxx(java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 病人再次就诊病更新挂号表中的正在操作员工号
     */
    public org.tempuri.ReturnExComm updateRegistClinicZzczgh(java.lang.String registId, java.lang.String czgh) throws java.rmi.RemoteException;

    /**
     * 插入一条新的病人门诊信息
     */
    public org.tempuri.ReturnExComm insertMzbrMzjlxx(org.tempuri.CLINIC_MASTER model, java.lang.String DOCTOR_NAME, java.lang.String mzDEPT_CODE) throws java.rmi.RemoteException;

    /**
     * 获取His病人信息通过医保和农保卡
     */
    public org.tempuri.ReturnExTable getHisMSBRDA(java.lang.String strCardNo) throws java.rmi.RemoteException;

    /**
     * 得到指定表的最新序列号
     */
    public java.lang.String gf_get_max2013(java.lang.String table_name, int need_count) throws java.rmi.RemoteException;

    /**
     * 更新病人门诊信息
     */
    public org.tempuri.ReturnExComm updateMzbrMzjlxx(org.tempuri.CLINIC_MASTER model) throws java.rmi.RemoteException;

    /**
     * 删除病人门诊信息
     */
    public org.tempuri.ReturnExComm deleteMzbrMzjlxx(org.tempuri.CLINIC_MASTER model) throws java.rmi.RemoteException;

    /**
     * 撤消病人门诊信息
     */
    public org.tempuri.ReturnExComm undoMzbrMzjlxx(java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 点击刷卡按钮，获得病人基本信息
     */
    public org.tempuri.ReturnExTable getMzbrjbxx(java.lang.String CARD_NO, java.lang.String DEPT_CODE, java.lang.String DOCTOR_CODE) throws java.rmi.RemoteException;

    /**
     * 跟据卡号获得病人门诊基本信息
     */
    public org.tempuri.ReturnExTable getMzXxByCard(java.lang.String CARD_NO) throws java.rmi.RemoteException;

    /**
     * 跟据门诊号码获得病人门诊基本信息
     */
    public org.tempuri.ReturnExTable getMzXxByMZHM(java.lang.String MZHM) throws java.rmi.RemoteException;

    /**
     * 跟据病人ID获得病人就诊信息和日志信息
     */
    public org.tempuri.GetCLINICAndMZRZbyIDResponseGetCLINICAndMZRZbyIDResult getCLINICAndMZRZbyID(java.lang.String BRID) throws java.rmi.RemoteException;

    /**
     * 跟据门诊序号获得病人基本信息
     */
    public org.tempuri.ReturnExTable getMzbrjbxxByCLINIC_ID(java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 跟据就诊卡或者医保卡获得病人基本信息
     */
    public org.tempuri.ReturnExTable getMzbrjbxxByCardNo(java.lang.String card_No) throws java.rmi.RemoteException;

    /**
     * 得到指定病人的所有门诊记录信息
     */
    public org.tempuri.ReturnExTable getAllMzjzxx(java.lang.String PATIENT_ID, java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 得到所有门诊的操作情况
     */
    public org.tempuri.ReturnExTable getAllMzCzqk(java.lang.String PATIENT_ID, java.lang.String CLINIC_ID) throws java.rmi.RemoteException;

    /**
     * 根据病人的门诊号和病历模板号得到病历文件信息
     */
    public org.tempuri.ReturnExTable getMzbrBlws(java.lang.String CLINIC_ID, java.lang.String PATIENT_ID) throws java.rmi.RemoteException;

    /**
     * 插入一条新的病历文书
     */
    public org.tempuri.ReturnExComm insertBlwsInfo(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 保存病历模版
     */
    public org.tempuri.ReturnExComm saveBlmb(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 更新病历文书信息
     */
    public org.tempuri.ReturnExComm updateBlwsInfo(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 删除指定病历文书
     */
    public org.tempuri.ReturnExComm deleteBlwsInfo(org.tempuri.CLINIC_RECORDS model) throws java.rmi.RemoteException;

    /**
     * 设置默认病历类型
     */
    public org.tempuri.ReturnExComm setMrbllx(java.lang.String gh, java.lang.String bllx) throws java.rmi.RemoteException;

    /**
     * 设置默认诊断类型
     */
    public org.tempuri.ReturnExComm setMrzdlx(java.lang.String gh, java.lang.String zdlx) throws java.rmi.RemoteException;

    /**
     * 得到挂号信息通过Registid
     */
    public org.tempuri.ReturnExTable getRegistOfClinicByRegistId(java.lang.String registid) throws java.rmi.RemoteException;

    /**
     * 得到挂号信息通过Jzhm
     */
    public org.tempuri.ReturnExTable getRegistOfClinicByJzhm(java.lang.String jzhm) throws java.rmi.RemoteException;

    /**
     * 新增预约挂号信息
     */
    public org.tempuri.ReturnExComm insertReservationRegistOfClinic(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 判断挂号是否初占用或同一个科室已经挂过号
     */
    public org.tempuri.ReturnExComm clinicRegist_zw(java.lang.String scheduleId, java.lang.String timeId, java.lang.String visit_no, java.lang.String registDate, java.lang.String deptid, java.lang.String patid) throws java.rmi.RemoteException;

    /**
     * 新增会诊挂号信息
     */
    public org.tempuri.ReturnExComm insertYzRegistOfClinic(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 预约取号判断此病人是否已经挂号未就症信息
     */
    public org.tempuri.ReturnExComm checkReservationRegistOfClinic(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 验证挂号信息
     */
    public java.lang.String checkInsertRegistOfClinic(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 新增挂号信息
     */
    public org.tempuri.ReturnExComm insertRegistOfClinic(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 退号结算
     */
    public org.tempuri.ReturnExComm backRegistSettleAccounts(org.tempuri.REGIST_OF_CLINIC model) throws java.rmi.RemoteException;

    /**
     * 去消预约挂号信息
     */
    public org.tempuri.ReturnExComm unReservationRegistOfClinic(java.lang.String REGIST_ID, java.lang.String SCHEDULE_ID, java.lang.String TIME_ID) throws java.rmi.RemoteException;

    /**
     * 添加未挂号就诊挂号信息
     */
    public org.tempuri.ReturnExComm addWGHJZ(java.lang.String[] info) throws java.rmi.RemoteException;

    /**
     * 修改病人
     */
    public boolean updatePatientinfo(org.tempuri.PatientinfoCall[] pfcs) throws java.rmi.RemoteException;

    /**
     * 增加病人
     */
    public int insertPatientinfo(org.tempuri.PatientinfoCall pfc) throws java.rmi.RemoteException;

    /**
     * 取最小已叫号
     */
    public org.tempuri.GetMinCalledPatientinfoResponseGetMinCalledPatientinfoResult getMinCalledPatientinfo(org.tempuri.Timeinfo ti) throws java.rmi.RemoteException;
    public java.lang.String helloWorld() throws java.rmi.RemoteException;

    /**
     * 图片上传
     */
    public java.lang.String imageUpload(byte[] stream, java.lang.String id) throws java.rmi.RemoteException;

    /**
     * 函数执行通用接口
     */
    public org.tempuri.ResultSet executeFunction(org.tempuri.ParameterSet ps) throws java.rmi.RemoteException;

    /**
     * 银医通接口
     */
    public org.tempuri.MedicalBankResponseMedicalBankResult medicalBank(org.tempuri.MedicalBankXe xe) throws java.rmi.RemoteException;
}
