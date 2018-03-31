package com.longj.products.ea.standard.bi.bean;

public class EAPatientZY {
//	序号	列名	数据类型	长度	小数位	标识	主键	外键	允许空	默认值	说明
	private String BRYLXH;		//int	4	0	是	是		否		病人医疗序号。病人在本系统中的唯一标识号，也就是ZYXH
	private String XM;		//	nvarchar	20	0				是		病人姓名
	private String XBDM;		//	varchar	2	0				是		性别代码。详见T_PUBLIC_ITEMS中item='GB2261.1'或《GB 02261.1-2003-T 人的性别代码.pdf》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String ZJLXDM;		//	varchar	4	0				是		证件类型代码。详见T_PUBLIC_ITEMS中item='CV0100.03'或《CV0100.03 个体标识号类别代码.xlsx》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String ZJHM;		//	varchar	25	0				是		证件号码。
	private String CSRQ;		//	varchar	40	0				是		出生日期。格式：2000-01-23
	private String GJDM;		//	varchar	4	0				是		国籍代码。详见T_PUBLIC_ITEMS中item='QJ1002.01'或《国家（地区）编码QJ1002.01.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String MZDM;		//	varchar	3	0				是		名族代码。详见T_PUBLIC_ITEMS中item='QJ1003.01'或《中国民族编码QJ1003.01.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String WHCDDM;		//	varchar	3	0				是		文化程度代码。详见T_PUBLIC_ITEMS中item='GB4658.84'或《文化程度编码GB4658.84.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String ZYDM;		//	varchar	5	0				是		职业分类代码。详见T_PUBLIC_ITEMS中item='QJ1005.01'或《职业编码QJ1005.01.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String CSD;		//	nvarchar	50	0				是		出生地。
	private String XXDM;		//	varchar	2	0				是		ABO血型代码。详见T_PUBLIC_ITEMS中item='CV5103.02'或《CV5103.02 ABO血型代码.xlsx》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String YLBXDM;		//	varchar	10	0				是		医疗保险类别代码。详见T_PUBLIC_ITEMS中item='CV0209.01'或《CV0209.01 医疗保险类别代码.xlsx》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String GTWXXDM;		//	varchar	3	0				是		个体危险性代码。详见T_PUBLIC_ITEMS中item='CV0103.01'或《CV0103.01 个体危险性标识代码.xlsx》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String HISYLXH;		//	varchar	20	0		是		是		HIS医疗序号。HIS系统中的唯一号，也就是HISZYXH
	private String MZH;		//	varchar	15	0				是		门诊号。病人可见
	private String BAH;		//	varchar	10	0		是		是		病案号。病人可见
	private String HYZKDM;		//	varchar	2	0				是		婚姻状况代码。详见T_PUBLIC_ITEMS中item='GB4766.84'或《婚姻状况编码GB4766.84.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String ZFFSDM;		//	varchar	3	0				是		支付方式代码。详见T_PUBLIC_ITEMS中item='CV5600.02'或《CV5600.02 支付方式代码.xlsx》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String DJSJ;		//	datetime	8	3				是		入院登记时间
	private String DJRGXDM;		//	varchar	5	0				是		登记人与病员关系。详见t_public_item表itemtyid='QJ1008.01'
	private String RYSJ;		//	datetime	8	3		是		是		住院时间、入院时间、HIS住院时间。
	private String CYSJ;		//	datetime	8	3		是		是		出院时间，HIS出院时间。
	private String RYZK;		//	varchar	2	0				是		入院状况。详见T_PUBLIC_ITEMS中item='QJ1006.01'或《入院状况编码QJ1006.01.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String CYZK;		//	varchar	3	0				是		出院状况，对应病案首页出院情况。详见T_PUBLIC_ITEMS中item='CV5501.11'或《CV5501.11 治疗结果代码.xlsx》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String ZDQZRQ;		//	varchar	10	0				是		诊断确诊日期。入院后诊断确诊日期，格式：2012-05-11
	private String BLZTDM;		//	varchar	2	0				是		病历状态代码。详见T_PUBLIC_ITEMS中item='QJ1007.01'或《病历状态编码QJ1007.01.xls》。若文件中的数据与T_PUBLIC_ITEMS数据不一致，则以T_PUBLIC_ITEMS表中数据为准。
	private String BLTJSJ;		//	datetime	8	3				是		病历提交时间。
	private String XGSJ;		//	datetime	8	3				是	getdate	最后修改时间。
	private String XGZ;		//	varchar	10	0				是		最后修改者（用户工号）。
	private String KSDM;		//	varchar	20	0				是		科室代码
	private String BQDM;		//	varchar	20	0		是		是		病区代码
	private String RYBQDM;		//	varchar	20	0				是		入院病区代码
	private String CYBQDM;		//	varchar	20	0				是		出院病区代码
	private String YLXZ;		//	varchar	20	0				是		医疗小组序号
	private String ZZYS;		//	varchar	20	0				是		主治医师
	private String ZRYS;		//	varchar	20	0				是		主任医师
	private String ZYYS;		//	varchar	20	0				是		住院医师
	private String ZGHS;		//	varchar	20	0				是		主管护士
	private String CH;		//	nvarchar	10	0				是		床号
	private String AGE;		//	int	4	0				是		住院时候的年龄
	private String ZYCS;		//	int	4	0				是		住院次数（ps.第几次住院）
	private String BLLX;		//	int	4	0				是		病历类型，详见itemid=‘BL7800’
	private String NLDW;		//	int	4	0				是		年龄单位,详见ITEMID='QJ1001.01'
	private String ZJXY;		//	varchar	50	0				是		宗教信仰
	private String Tl;		//	varchar	50	0				是		初生儿胎龄
	private String MQBRYLXH;		//	int	4	0				是		母亲医疗序号
	private String FMXM;		//	varchar	50	0				是		新生儿父母姓名
	private String ZYZT;		//	int	4	0				是		在院状态，itemid='ZY5790'
	private String HLJB;		//	int	4	0				是		护理级别,itemid='HL7328'
	private String XSRTZ;		//	varchar	50	0				是		新生儿体重
	private String XSRRYTZ;		//	varchar	50	0				是		新生儿入院体重
	private String BRDH;		//	varchar	20	0				是		病人电话
	private String BRTELPHONE;		//	varchar	20	0				是		病人手机
	private String LXRXM;		//	varchar	20	0				是		第一联系人姓名
	private String LXRGXDM;		//	varchar	2	0				是		第一联系人与病人关系代码
	private String LXRZZ;		//	varchar	100	0				是		第一联系人住址
	private String LXRDH;		//	varchar	20	0				是		第一联系人电话
	private String LXRXM1;		//	varchar	20	0				是		第二联系人姓名
	private String LXRGXDM1;		//	varchar	2	0				是		第二联系人与病人关系代码
	private String LXRZZ1;		//	varchar	100	0				是		第二联系人住址
	private String LXRDH1;		//	varchar	20	0				是		第二联系人电话
	private String JG;		//	varchar	50	0				是		籍贯
	private String GDBJ;		//	varchar	50	0				是		归档标记，1代表已归档，0，null都代表未归档
	private String bqjb;		//	nvarchar	1	0				是		病情级别，0：常规，1：病重，2：病危
	private String HFBZ;		//	varchar	10	0				是		是否回访标志，0不需要回访,1需生成回访,2已生成回访,3需修改回访
	private String RYZDS;		//	varchar	MAX	0				是		入院诊断集合
	private String HSRYSJ;		//	varchar	20	0				是		护士输入入院时间
	private String CYZDS;		//	varchar	MAX	0				是		出院诊断集合
	private String GMS;		//	varchar	200	0				是		过敏史
	private String SSBJ;		//	varchar	1	0				是		手术标志
	private String CYFS;		//	varchar	1	0				是		出院方式
	private String JCGL;		//	varchar	200	0				是		接触隔离
	private String ZKHFBZ;		//	bit	1	0				是		专科回访标志
	
	public EAPatientZY() {
		// TODO Auto-generated constructor stub
	}

	public String getBRYLXH() {
		return BRYLXH;
	}

	public void setBRYLXH(String bRYLXH) {
		BRYLXH = bRYLXH;
	}

	public String getXM() {
		return XM;
	}

	public void setXM(String xM) {
		XM = xM;
	}

	public String getXBDM() {
		return XBDM;
	}

	public void setXBDM(String xBDM) {
		XBDM = xBDM;
	}

	public String getZJLXDM() {
		return ZJLXDM;
	}

	public void setZJLXDM(String zJLXDM) {
		ZJLXDM = zJLXDM;
	}

	public String getZJHM() {
		return ZJHM;
	}

	public void setZJHM(String zJHM) {
		ZJHM = zJHM;
	}

	public String getCSRQ() {
		return CSRQ;
	}

	public void setCSRQ(String cSRQ) {
		CSRQ = cSRQ;
	}

	public String getGJDM() {
		return GJDM;
	}

	public void setGJDM(String gJDM) {
		GJDM = gJDM;
	}

	public String getMZDM() {
		return MZDM;
	}

	public void setMZDM(String mZDM) {
		MZDM = mZDM;
	}

	public String getWHCDDM() {
		return WHCDDM;
	}

	public void setWHCDDM(String wHCDDM) {
		WHCDDM = wHCDDM;
	}

	public String getZYDM() {
		return ZYDM;
	}

	public void setZYDM(String zYDM) {
		ZYDM = zYDM;
	}

	public String getCSD() {
		return CSD;
	}

	public void setCSD(String cSD) {
		CSD = cSD;
	}

	public String getXXDM() {
		return XXDM;
	}

	public void setXXDM(String xXDM) {
		XXDM = xXDM;
	}

	public String getYLBXDM() {
		return YLBXDM;
	}

	public void setYLBXDM(String yLBXDM) {
		YLBXDM = yLBXDM;
	}

	public String getGTWXXDM() {
		return GTWXXDM;
	}

	public void setGTWXXDM(String gTWXXDM) {
		GTWXXDM = gTWXXDM;
	}

	public String getHISYLXH() {
		return HISYLXH;
	}

	public void setHISYLXH(String hISYLXH) {
		HISYLXH = hISYLXH;
	}

	public String getMZH() {
		return MZH;
	}

	public void setMZH(String mZH) {
		MZH = mZH;
	}

	public String getBAH() {
		return BAH;
	}

	public void setBAH(String bAH) {
		BAH = bAH;
	}

	public String getHYZKDM() {
		return HYZKDM;
	}

	public void setHYZKDM(String hYZKDM) {
		HYZKDM = hYZKDM;
	}

	public String getZFFSDM() {
		return ZFFSDM;
	}

	public void setZFFSDM(String zFFSDM) {
		ZFFSDM = zFFSDM;
	}

	public String getDJSJ() {
		return DJSJ;
	}

	public void setDJSJ(String dJSJ) {
		DJSJ = dJSJ;
	}

	public String getDJRGXDM() {
		return DJRGXDM;
	}

	public void setDJRGXDM(String dJRGXDM) {
		DJRGXDM = dJRGXDM;
	}

	public String getRYSJ() {
		return RYSJ;
	}

	public void setRYSJ(String rYSJ) {
		RYSJ = rYSJ;
	}

	public String getCYSJ() {
		return CYSJ;
	}

	public void setCYSJ(String cYSJ) {
		CYSJ = cYSJ;
	}

	public String getRYZK() {
		return RYZK;
	}

	public void setRYZK(String rYZK) {
		RYZK = rYZK;
	}

	public String getCYZK() {
		return CYZK;
	}

	public void setCYZK(String cYZK) {
		CYZK = cYZK;
	}

	public String getZDQZRQ() {
		return ZDQZRQ;
	}

	public void setZDQZRQ(String zDQZRQ) {
		ZDQZRQ = zDQZRQ;
	}

	public String getBLZTDM() {
		return BLZTDM;
	}

	public void setBLZTDM(String bLZTDM) {
		BLZTDM = bLZTDM;
	}

	public String getBLTJSJ() {
		return BLTJSJ;
	}

	public void setBLTJSJ(String bLTJSJ) {
		BLTJSJ = bLTJSJ;
	}

	public String getXGSJ() {
		return XGSJ;
	}

	public void setXGSJ(String xGSJ) {
		XGSJ = xGSJ;
	}

	public String getXGZ() {
		return XGZ;
	}

	public void setXGZ(String xGZ) {
		XGZ = xGZ;
	}

	public String getKSDM() {
		return KSDM;
	}

	public void setKSDM(String kSDM) {
		KSDM = kSDM;
	}

	public String getBQDM() {
		return BQDM;
	}

	public void setBQDM(String bQDM) {
		BQDM = bQDM;
	}

	public String getRYBQDM() {
		return RYBQDM;
	}

	public void setRYBQDM(String rYBQDM) {
		RYBQDM = rYBQDM;
	}

	public String getCYBQDM() {
		return CYBQDM;
	}

	public void setCYBQDM(String cYBQDM) {
		CYBQDM = cYBQDM;
	}

	public String getYLXZ() {
		return YLXZ;
	}

	public void setYLXZ(String yLXZ) {
		YLXZ = yLXZ;
	}

	public String getZZYS() {
		return ZZYS;
	}

	public void setZZYS(String zZYS) {
		ZZYS = zZYS;
	}

	public String getZRYS() {
		return ZRYS;
	}

	public void setZRYS(String zRYS) {
		ZRYS = zRYS;
	}

	public String getZYYS() {
		return ZYYS;
	}

	public void setZYYS(String zYYS) {
		ZYYS = zYYS;
	}

	public String getZGHS() {
		return ZGHS;
	}

	public void setZGHS(String zGHS) {
		ZGHS = zGHS;
	}

	public String getCH() {
		return CH;
	}

	public void setCH(String cH) {
		CH = cH;
	}

	public String getAGE() {
		return AGE;
	}

	public void setAGE(String aGE) {
		AGE = aGE;
	}

	public String getZYCS() {
		return ZYCS;
	}

	public void setZYCS(String zYCS) {
		ZYCS = zYCS;
	}

	public String getBLLX() {
		return BLLX;
	}

	public void setBLLX(String bLLX) {
		BLLX = bLLX;
	}

	public String getNLDW() {
		return NLDW;
	}

	public void setNLDW(String nLDW) {
		NLDW = nLDW;
	}

	public String getZJXY() {
		return ZJXY;
	}

	public void setZJXY(String zJXY) {
		ZJXY = zJXY;
	}

	public String getTl() {
		return Tl;
	}

	public void setTl(String tl) {
		Tl = tl;
	}

	public String getMQBRYLXH() {
		return MQBRYLXH;
	}

	public void setMQBRYLXH(String mQBRYLXH) {
		MQBRYLXH = mQBRYLXH;
	}

	public String getFMXM() {
		return FMXM;
	}

	public void setFMXM(String fMXM) {
		FMXM = fMXM;
	}

	public String getZYZT() {
		return ZYZT;
	}

	public void setZYZT(String zYZT) {
		ZYZT = zYZT;
	}

	public String getHLJB() {
		return HLJB;
	}

	public void setHLJB(String hLJB) {
		HLJB = hLJB;
	}

	public String getXSRTZ() {
		return XSRTZ;
	}

	public void setXSRTZ(String xSRTZ) {
		XSRTZ = xSRTZ;
	}

	public String getXSRRYTZ() {
		return XSRRYTZ;
	}

	public void setXSRRYTZ(String xSRRYTZ) {
		XSRRYTZ = xSRRYTZ;
	}

	public String getBRDH() {
		return BRDH;
	}

	public void setBRDH(String bRDH) {
		BRDH = bRDH;
	}

	public String getBRTELPHONE() {
		return BRTELPHONE;
	}

	public void setBRTELPHONE(String bRTELPHONE) {
		BRTELPHONE = bRTELPHONE;
	}

	public String getLXRXM() {
		return LXRXM;
	}

	public void setLXRXM(String lXRXM) {
		LXRXM = lXRXM;
	}

	public String getLXRGXDM() {
		return LXRGXDM;
	}

	public void setLXRGXDM(String lXRGXDM) {
		LXRGXDM = lXRGXDM;
	}

	public String getLXRZZ() {
		return LXRZZ;
	}

	public void setLXRZZ(String lXRZZ) {
		LXRZZ = lXRZZ;
	}

	public String getLXRDH() {
		return LXRDH;
	}

	public void setLXRDH(String lXRDH) {
		LXRDH = lXRDH;
	}

	public String getLXRXM1() {
		return LXRXM1;
	}

	public void setLXRXM1(String lXRXM1) {
		LXRXM1 = lXRXM1;
	}

	public String getLXRGXDM1() {
		return LXRGXDM1;
	}

	public void setLXRGXDM1(String lXRGXDM1) {
		LXRGXDM1 = lXRGXDM1;
	}

	public String getLXRZZ1() {
		return LXRZZ1;
	}

	public void setLXRZZ1(String lXRZZ1) {
		LXRZZ1 = lXRZZ1;
	}

	public String getLXRDH1() {
		return LXRDH1;
	}

	public void setLXRDH1(String lXRDH1) {
		LXRDH1 = lXRDH1;
	}

	public String getJG() {
		return JG;
	}

	public void setJG(String jG) {
		JG = jG;
	}

	public String getGDBJ() {
		return GDBJ;
	}

	public void setGDBJ(String gDBJ) {
		GDBJ = gDBJ;
	}

	public String getBqjb() {
		return bqjb;
	}

	public void setBqjb(String bqjb) {
		this.bqjb = bqjb;
	}

	public String getHFBZ() {
		return HFBZ;
	}

	public void setHFBZ(String hFBZ) {
		HFBZ = hFBZ;
	}

	public String getRYZDS() {
		return RYZDS;
	}

	public void setRYZDS(String rYZDS) {
		RYZDS = rYZDS;
	}

	public String getHSRYSJ() {
		return HSRYSJ;
	}

	public void setHSRYSJ(String hSRYSJ) {
		HSRYSJ = hSRYSJ;
	}

	public String getCYZDS() {
		return CYZDS;
	}

	public void setCYZDS(String cYZDS) {
		CYZDS = cYZDS;
	}

	public String getGMS() {
		return GMS;
	}

	public void setGMS(String gMS) {
		GMS = gMS;
	}

	public String getSSBJ() {
		return SSBJ;
	}

	public void setSSBJ(String sSBJ) {
		SSBJ = sSBJ;
	}

	public String getCYFS() {
		return CYFS;
	}

	public void setCYFS(String cYFS) {
		CYFS = cYFS;
	}

	public String getJCGL() {
		return JCGL;
	}

	public void setJCGL(String jCGL) {
		JCGL = jCGL;
	}

	public String getZKHFBZ() {
		return ZKHFBZ;
	}

	public void setZKHFBZ(String zKHFBZ) {
		ZKHFBZ = zKHFBZ;
	}
	
}
