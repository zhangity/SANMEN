package com.longj.platform.pb.util;

/**
 * 常量工具类。
 * 
 * @author daru.zheng
 * @version $Id: FinalUtil.java,v 1.1 2014/11/07 00:23:16 zhengdr Exp $
 */
public class FinalUtil {
	
    /* ============================================================================ */
    /*  常量
    /* ============================================================================ */

	/*** 空字符串。***/
    public static final String EMPTY_STRING = "";
    
    /*** 日期字符串类型  年月日时分秒 ***/
    public static final String DATE_STRING_TYPE_SECOND = "yyyy-MM-dd HH:mm:ss";
    
    /*** 日期字符串类型  年月日时分 ***/
    public static final String DATE_STRING_TYPE_MINUTE = "yyyy-MM-dd HH:mm";
    
    /*** 日期字符串类型  年月日 ***/
    public static final String DATE_STRING_TYPE_DAY = "yyyy-MM-dd";
    
    /*** 日期字符串类型  年月 ***/
    public static final String DATE_STRING_TYPE_MONTH = "yyyy-MM";
    
   	
	/* ============================================================================ */
    /*  常量：返回值
    /* ============================================================================ */	
	
	/*** 成功KEY ***/
	public static final int RETURN_SUCCESS = 1;
	
	/*** 失败KEY ***/
	public static final int RETURN_FAIL = 0;

	
	/*** 成功VALUE->0 ***/
	public static final String RETURN_SUCCESS_RESULT = "操作成功";
	
	/*** 失败VALUE->-1 ***/
	public static final String RETURN_FAIL_RESULT = "操作失败";	
	

}
