package com.longj.products.ea.standard.bu.action.bl;

import java.lang.reflect.Method;

import net.sf.json.JSONObject;

import org.wdk.WDK;
import org.wdk.core.bean.WDKContext;

import com.longj.platform.busi.wdk.base.BaseActionMethod;

public class BUExamBLAction  extends BaseActionMethod {
	
	private boolean IsNullOrEmpty(String instr){
		if(instr==null||"".equals(instr.trim())){
			return true;
		}
		return false;
	}
	
	public String TrimEnd(String instr,String replaceStr){
		if(instr!=null){
			instr = instr.trim();
			if(instr.endsWith(replaceStr)){
				instr = instr.substring(0,instr.length() - 1);
			}
		}
		return instr;
	}
	
	public void ProcessRequest(WDKContext context)throws Exception 
    {
        String m = context.getString("m");
        Method method = this.getClass().getDeclaredMethod(m, WDKContext.class);
        method.invoke(this, context);
    }

    protected void saveTCTSQD(WDKContext context) throws Exception 
    {
        RetrunResult rr = new RetrunResult();
        rr.IsSuccess = false;
        String r = context.getString("j");
        String sqdnum = context.getString("sqdnum");
        try
        {
                Object sqd = "";
//                = db.A_SQD.FirstOrDefault(x => x.SQDNum == sqdnum);
                if (sqd != null)
                {
//                    sqd.ResultDetail = r;
//                    sqd.HasFilledForm = true;
                    rr.IsSuccess = true;


                    //生成标本

                    boolean IsNew = false;


                   // sqd.SQBZ = 7;
                    A_BLSQD blsqd = null;
//                    blsqd = db.A_BLSQD.FirstOrDefault(x => x.SQDNum == sqd.SQDNum);
                    if (null == blsqd)
                    {
                        blsqd = new A_BLSQD();
                        blsqd.Id = WDK.getUUID();
                        IsNew = true;
                    }
                   // Guid sqdid = Guid.NewGuid();
                    //blsqd.Id = sqdid;
//                    blsqd.SQDNum = sqd.SQDNum;
//                    blsqd.CreatedTime = WDK.getDateTime();
//                    blsqd.CreatedBy = sqd.Ysdm;
//                    blsqd.SQYS = sqd.Ysdm;
//                    blsqd.SQKS = sqd.Ksdm;
//                    blsqd.IsMZ = sqd.Source == "0";
//                    blsqd.BRID = sqd.Pat_id;
//                    blsqd.BRSFZH = "";
//                    blsqd.ItemId = (Guid)sqd.ItemId;
                    blsqd.SQDStatus = 0;
                    blsqd.SQDDetail = "";
                    if (IsNew)
                    {
//                        db.A_BLSQD.AddObject(blsqd);
//                        db.SaveChanges();
                    }


                    try
                    {
                    	Object bb = null;
                        //var bb = db.A_BLBB.FirstOrDefault(x => x.SQDId == blsqd.Id);
                        if (bb == null)
                        {
                            A_BLBB b = new A_BLBB();
                            b.Id = WDK.getUUID();
                            b.A_BLSQD = blsqd;
                            b.SQDId = blsqd.Id;
                            b.BBBW = "宫颈";
                            b.BBMC = "TCT标本";
                            b.BBBZ = "";
                            b.BBStatus = 0;
//                            b.BBHM = Common.GetBBHM("BBHM");
//                            b.XH = 1;
//                            b.HIS_ID = sqd.his_id;
//                            db.A_BLBB.AddObject(b);
                            rr.Tip = b.BBHM;
                        }
                        else
                        {
//                            rr.Tip = bb.BBHM;
                        }


                    }
                    catch (Exception ex)
                    {
                        rr.IsSuccess = false;
                        rr.Tip = ex.getMessage();


                    }
                   // db.SaveChanges();



                }

        }
        catch (Exception ex)
        {
            rr.Tip = ex.getMessage();
            //  throw;
        }
        context.setPrintOut(JSONObject.fromObject(rr).toString());


    }


    /// <summary>
    /// 取TCT申请单的信息 如果申请单的状态为1 则取基本信息，如果为7 ，则取sqd的resultdetail
    /// </summary>
    /// <param name="ctx"></param>
    protected void GetTCTBaseInfo(WDKContext context) throws Exception 
    {
        RetrunResult r = new RetrunResult();
        r.IsSuccess = true;
        String sqdnum = context.getString("sqdnum");
        //HIS.A_SQD sqd = HIS.A_SQD.FirstOrDefault("select * from a_sqd where sqdnum=@0", sqdnum);
        //if (sqd.HasFilledForm != true)
        if("1".equals("1"))
        {
            r.Tip = "0";
            TCTBaseView tctbv = new TCTBaseView();
            if (!IsNullOrEmpty(sqdnum))
            {
//                DataSet ds = DZKD.Core.EntlibHelper.GetDSByP("A_GetTCTBaseInfo", sqdnum);
//                if (ds.Tables[0].Rows.Count > 0)
//                {
//                    var dr = ds.Tables[0].Rows[0];
//                    tctbv.brxm = dr["brxm"].ToString();
//                    tctbv.nl = dr["nl"].ToString();
//                    tctbv.ks = dr["ks"].ToString();
//                    tctbv.lxdh = dr["lxdh"].ToString();
//                    tctbv.dz = dr["dz"].ToString();
//                    tctbv.blh = dr["blh"].ToString();
//                    tctbv.sqys = dr["sqys"].ToString();
//                    tctbv.zd = dr["zd"].ToString();
//                    r.Obj = tctbv;
//                }
            }
        }
        else
        {
            r.Tip = "1";
            //r.Obj = sqd.ResultDetail;
        }

        //if (sqd.SQBZ == 7)
        //{
          
        //}
//        ctx.Response.Write(JsonConvert.SerializeObject(r));
//        ctx.Response.End();
    }

    protected void GetSZ(WDKContext context) throws Exception 
    {
        String c = context.getString("c");
        String f = context.getString("f");
        if (!IsNullOrEmpty(c) && !IsNullOrEmpty(f))
        {
                //var mysz = db.A_BLSZ.SingleOrDefault(x => x.Code == c && x.CreatedBy == f);
//                var mysz = db.A_BLSZ.FirstOrDefault(x => x.Code == c  && x.CreatedBy ==f);
//                if (null != mysz)
//                {
//                    ctx.Response.Write(mysz.JS);
//                    ctx.Response.End();
//                }
        }
    }

    protected void GetBBList(WDKContext context) throws Exception 
    {
        String sql = "select ROW_NUMBER() over( order by b.SQSJ) as XH, b.sqdnum, b.Id,b.BRXM,b.MZHM,b.BLXM,b.SQSJ,a.BBBW,a.BBMC,a.BBHM from A_BLBB a,V_BLSQD b where a.SQDId=b.Id order by b.SQSJ";
//        DataSet ds = DZKD.Core.EntlibHelper.GetDataSetBySql(sql, "HIS");
//        ctx.Response.Write(Newtonsoft.Json.JsonConvert.SerializeObject(ds.Tables[0]));
//        ctx.Response.End();
    }


    protected void GetBB(WDKContext context) throws Exception 
    {
        String hm = context.getString("hm");
        if (!IsNullOrEmpty(hm))
        {
            String[] hmlist = TrimEnd(hm,";").split(";");
            StringBuilder sb = new StringBuilder();
            if (hmlist.length > 0)
            {
                for (String h: hmlist)
                {

                    sb.append("'" + h + "',");
                }
            }
            String sql = "";
            	//String.Format("select c.BRXM, d.his_id as BBHM,b.BBMC,b.BBBW, b.XH from A_BLSQD a,A_BLBB b ,MS_BRDA c ,a_sqd d where a.sqdnum=d.sqdnum and  a.Id=b.SQDId and a.BRID=c.BRID and  a.IsMZ=1 and a.Id in ({0}) union all select c.BRXM, d.his_id as BBHM,b.BBMC,b.BBBW, b.XH from A_BLSQD a,A_BLBB b ,ZY_BRRY c,a_sqd d where d.sqdnum=a.sqdnum and  a.Id=b.SQDId and c.zyhm=a.brid and a.IsMZ=0   and a.Id in ({0})", sb.toString().trim());
//            DataSet ds = DZKD.Core.EntlibHelper.GetDataSetBySql(sql, "HIS");
//            ctx.Response.Write(Newtonsoft.Json.JsonConvert.SerializeObject(ds.Tables[0]));
//            ctx.Response.End();

        }


    }
    
    public void GetBLSQD(WDKContext context) throws Exception {
    	String id = context.getString("Id");
    	//根据id获取表A_BLSQD中的值，全部返回
    	 String qt = context.getString("QT");
    }
    
}
