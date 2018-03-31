package com.longj.platform.pb.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 有关日期转换的工具类。
 * 
 * @author daru.zheng
 * @version 
 */
public class DateTransUtil {   
    
    /**
	 * String 转为日期型
	 */
	public static Date stringTransDate(String stringTime,String dateStringType)  throws  Exception{
		SimpleDateFormat format = new SimpleDateFormat(dateStringType);
		Date date=null;
		if(StringUtil.isNotBlank(stringTime)){
			try {
				date = format.parse(stringTime);
			} catch (ParseException e) {
				throw new Exception ("字符串转为日期型异常：", e); //
			}
		}
	    return date;
	}
	
	/**
	 * String 转为timestamp型
	 */
	public static Timestamp stringTransTimeStamp(String stringTime,String dateStringType)  throws Exception{
		SimpleDateFormat format = new SimpleDateFormat(dateStringType);
		Timestamp time=null;
		if(StringUtil.isNotBlank(stringTime)){
			try {
				Date date = format.parse(stringTime);
				time = new Timestamp(date.getTime());
			} catch (ParseException e) {
				throw new Exception ("方法：stringTransTimeStamp()异常：错误参数为："+stringTime, e); //
			}
		}
	    return time;
	}

	/**
	 * 日期 转为String
	 */
	public static String dateTransString(Date date,String dateStringType)  throws  Exception{
		SimpleDateFormat format = new SimpleDateFormat(dateStringType);
		String string="";
		try {
			if(date!=null){
				string = format.format(date);
			}
		} catch (Exception e) {
			throw new Exception ("日期型转为字符串异常：", e); //
		}
	    return string;
	}
	
	/**
	 * timestamp型 转为 String
	 */
	public static String timestampTransString(Timestamp time,String dateStringType)  throws  Exception{
		
		SimpleDateFormat format = new SimpleDateFormat(dateStringType);
		String string="";
		try {
			if(time!=null){
				string = format.format(time);
			}
		} catch (Exception e) {
			throw new Exception ("timestamp型转为字符串异常：", e); //
		}
	    return string;
	}
	
	/**
	 * Date型 转为 Calendar
	 */
	public static Calendar dateTransCalendar(Date time){		
		Calendar cal=Calendar.getInstance();
		cal.setTime(time);
		return cal;
	}
	
	/**
	 * 与当前时间比较
	 * @param end
	 * @return true(大于当前时间)
	 */
	public static boolean timeComparie(String end) throws Exception{
		boolean flag = false;
		try {
			Date endTime = DateTransUtil.stringTransDate(end, FinalUtil.DATE_STRING_TYPE_SECOND);
			Date currTime = DateTransUtil.stringTransDate(DateTransUtil.timestampTransString(new Timestamp(System.currentTimeMillis()), FinalUtil.DATE_STRING_TYPE_SECOND), FinalUtil.DATE_STRING_TYPE_SECOND);
			if(endTime.getTime() > currTime.getTime()) {
				flag = true;
			}
		} catch (Exception e) {
			throw new Exception ("方法timeComparie异常：", e); //
		}
		return flag;
	}
	
	/**
	 * 两个日期之间相差多少天
	 * @return
	 */
	public static long daysBetween(Calendar startDate, Calendar endDate) {
		Calendar date = (Calendar) startDate.clone();
		long daysBetween = 0;
		while (date.before(endDate)) {
			date.add(Calendar.DAY_OF_MONTH, 1);
			daysBetween++;
		}
		return daysBetween;
	}

	/**
	 * 当天开始时间
	 * @return
	 */
	public static Long getStartTime(){  
	    Calendar todayStart = Calendar.getInstance();  
	    todayStart.set(Calendar.HOUR_OF_DAY, 0);  
	    todayStart.set(Calendar.MINUTE, 0);  
	    todayStart.set(Calendar.SECOND, 0);  
	    todayStart.set(Calendar.MILLISECOND, 0);  
	    return todayStart.getTime().getTime();  
	}  
	
	/**
	 * 当天结束时间 整型
	 * @return
	 */	      
	public static Long getEndTime(){  
		Calendar todayEnd = Calendar.getInstance();  
		todayEnd.set(Calendar.HOUR_OF_DAY, 23);  
        todayEnd.set(Calendar.MINUTE, 59);  
        todayEnd.set(Calendar.SECOND, 59);  
        todayEnd.set(Calendar.MILLISECOND, 999);  
        return todayEnd.getTime().getTime();  
	}
	
	/**
	 * 当天结束时间 日期型
	 * @return
	 */	      
	public static Date getEndDate(){  
		Calendar todayEnd = Calendar.getInstance();  
		todayEnd.set(Calendar.HOUR_OF_DAY, 23);  
        todayEnd.set(Calendar.MINUTE, 59);  
        todayEnd.set(Calendar.SECOND, 59);  
        todayEnd.set(Calendar.MILLISECOND, 999);  
        return todayEnd.getTime();  
	}
	
	
	/**
	 * 获取当前时间（String）
	 */
	public static String getCurrDateTime(String dateStringType){		
		Calendar cal=Calendar.getInstance();
		String currDateTime=null;
		try {
			currDateTime = dateTransString(cal.getTime(),dateStringType);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return currDateTime;
	}
}
