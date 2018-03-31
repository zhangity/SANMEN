package com.longj.platform.pb.util;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.internet.MimeUtility;

import org.apache.tools.zip.ZipOutputStream;
import org.wdk.core.bean.WDKLogger;


public class EncodeUtil {
	
	private static WDKLogger logger = new WDKLogger(EncodeUtil.class.getName());
	
	/**
	 * 从字符串中匹配 yyyy-MM-dd HH:mm:ss 的日期字符串，并按 pattern 的格式定义返回
	 * @param strng  要从中筛选的字符串 
	 * @param pattern    如果 pattern="", 按 yyyy-MM-dd hh:mm:ss 的格式返回
	 * @return 指定日期格式的字符串, 如果匹配失败，返回空字符串
	 */
	static public String ReturnDateTime(String strng, String pattern) {
		String RetStr = "";
		Pattern p = Pattern
				.compile("\\d{4}\\-\\d{1,2}\\-\\d{1,2} \\d{1,2}\\:\\d{1,2}\\:\\d{1,2}");
		
		SimpleDateFormat dateformat1 = 
			new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		SimpleDateFormat dateformat2 = 
			new java.text.SimpleDateFormat(pattern);
		
		Matcher matches = p.matcher(strng);
		try {
			while (matches.find()) {
				if (!RetStr.trim().equals("")) {
					java.util.Date date1 = dateformat1.parse(matches.group(0));
					java.util.Date date2 = dateformat1.parse(RetStr);
					
					if (date1.after(date2)) {
						RetStr = matches.group(0);
					}
					
				} else {
					RetStr = matches.group(0);
				}
			}
			
			if (!RetStr.trim().equals("") && !pattern.trim().equals("")) {
				RetStr = dateformat2.format(
						dateformat1.parse(RetStr));
			}
		} catch (ParseException ex) {
			RetStr = "";
			logger.errorWithNoException(ex.getMessage());
			ex.printStackTrace();
		}
		return RetStr;
	}
	
	/**
	 * 从字符串中匹配 yyyy-MM-dd 的日期字符串，并按 pattern 的格式定义返回
	 * @param strng  要从中筛选的字符串 
	 * @param pattern    如果 pattern="", 按 yyyy-MM-dd 的格式返回
	 * @return 指定日期格式的字符串, 如果匹配失败，返回空字符串
	 */
	static public String ReturnDate(String strng, String pattern) {
		String RetStr = "";
		if (strng != null && !strng.equals("")) {
			Pattern p = Pattern.compile("\\d{4}\\-\\d{1,2}\\-\\d{1,2}");
			
			String dateFormat = "yyyy-MM-dd";
			//传入的日期字符串，没有横杠，需要按照新的方式解析
			if(strng.indexOf("-")==-1){
				dateFormat = "yyyyMMdd";
				p = Pattern.compile("\\d{4}\\d{1,2}\\d{1,2}");
			}
			
			SimpleDateFormat dateformat1 = 
				new java.text.SimpleDateFormat(dateFormat);
			
			SimpleDateFormat dateformat2 = 
				new java.text.SimpleDateFormat(pattern);
			
			Matcher matches = p.matcher(strng);
			try {
				while (matches.find()) {
					if (!RetStr.trim().equals("")) {
						java.util.Date date1 = dateformat1.parse(matches.group(0));
						java.util.Date date2 = dateformat1.parse(RetStr);
						
						if (date1.after(date2)) {
							RetStr = matches.group(0);
						}
						
					} else {
						RetStr = matches.group(0);
					}
				}
				
				if (!RetStr.trim().equals("") && !pattern.trim().equals("")) {
					RetStr = dateformat2.format(
							dateformat1.parse(RetStr));
				}
			} catch (ParseException ex) {
				RetStr = "";
				logger.errorWithNoException(ex.getMessage());
				ex.printStackTrace();
			}
		}
		return RetStr;
	}
	
	/**
	 * 从字符串返回成文日期（格式二零零四年十二月十号）
	 * @param strng  要从中筛选的字符串 
	 * @param pattern    如果 pattern="", 按 yyyy-MM-dd 的格式返回
	 * @return 指定日期格式的字符串, 如果匹配失败，返回空字符串
	 */
	static public String ReturnMakeDocDate(String strng) {
		String RetStr = "";
		if (strng != null && !strng.equals("")) {
			RetStr = ReturnDate(strng,"yyyy年M月d日");
			RetStr = Get_Full_Date(RetStr);
		}
		return RetStr;
	}
	
	
	static public String Get_Full_Date(String str) {
		String str1 = "";
		String year1 = "0";
		String month1 = "0";
		String day1 = "0";
		String return_str = "";
		
		str1 = str;

		if (str1.indexOf("年") > 0 && str1.indexOf("月") > 0 && str1.indexOf("日") > 0){
			try{
				year1 = str1.substring(0,str1.indexOf("年"));
				month1 = str1.substring(str1.indexOf("年") + 1, str1.indexOf("月"));
				day1 = str1.substring(str1.indexOf("月") + 1, str1.indexOf("日"));		
			
				if (Integer.parseInt(month1) > 0 && Integer.parseInt(month1) < 13 && Integer.parseInt(day1) > 0 && Integer.parseInt(day1) < 32 )
				{
					return_str = Get_ChangeNumber(year1) + "年" + Get_ChangeNumber1(month1) + "月" + Get_ChangeNumber1(day1) + "日";
				}
				else
				{
					return_str = "表达式非法";
				}
			} catch (Exception ex) {
				return_str = "表达式非法";
			}
		} 
		return return_str;
	}

	static private String ChangeNumber(String str){
		String returnValue = "";		
		switch (Integer.parseInt(str)){
			case 1:
				returnValue = "一";
				break;
			case 2:
				returnValue = "二";
				break;
			case 3:
				returnValue = "三";
				break;
			case 4:
				returnValue = "四";
				break;
			case 5:
				returnValue = "五";
				break;
			case 6:
				returnValue = "六";
				break;
			case 7:
				returnValue = "七";
				break;
			case 8:
				returnValue = "八";
				break;
			case 9:
				returnValue = "九";
				break;
			case 0:
				returnValue = "零";
				break;
			default:
				returnValue = str;
				break;
		}
		return returnValue;
	}

	static private String Get_ChangeNumber(String str){
		String return_str = "";
		for (int i = 0;i<=str.length()-1;i++){
		   return_str = return_str + ChangeNumber(str.substring(i,i+1));
		}
		return return_str;
	}

	static private String Get_ChangeNumber1(String str){
		String return_str = "";

		if (str.length() == 1 ){
			return_str = Get_ChangeNumber(str);	
		}
		else{
			if (str.substring(0,1).equals("1")){
				if (str.substring(1,2).equals("0")){
					return_str = "十";
				}
				else {
					return_str = "十" + Get_ChangeNumber(str.substring(1,2));
				}
			}
			else{
				if (str.substring(1,2).equals("0")){
					return_str = Get_ChangeNumber(str.substring(0,1)) + "十";
				}
				else{
					return_str = Get_ChangeNumber(str.substring(0,1)) + "十" + Get_ChangeNumber(str.substring(1,2));
				}

			}
		}

		return return_str;
	}

	static public String ConvertChinesePunctuation(String strng){			
		strng = strng.replace('?','？');
		strng = strng.replace('!','！');
		strng = strng.replace('(','（');
		strng = strng.replace(')','）');
		strng = strng.replace('.','。');
		strng = strng.replace(',','，');
		strng = strng.replaceAll("<<","《");
		strng = strng.replaceAll(">>","》");
		strng = strng.replace('<','＜');
		strng = strng.replace('>','＞');
		strng = strng.replace('|','｜');
		strng = strng.replaceAll("'","＇");
		strng = strng.replace('\"','＂');
		strng = strng.replace('\\','＼');
		strng = strng.replace('/','／');
		strng = strng.replace(';','；');
		strng = strng.replace(':','：');
		strng = strng.replace('*','＊');
		return strng;
	}
	
	static public String ConvertToFilename(String strng) {
    if (strng == null) {
      return strng;
    }
		// 文件名中不能含有以下字符? \ / : * " < > |
		strng = strng.replace('?','？');
		strng = strng.replace('\\','＼');
		strng = strng.replace('/','／');
		strng = strng.replace(':','：');
		strng = strng.replace('*','＊');
		strng = strng.replace('\\','＼');
		strng = strng.replaceAll("<<","《");
		strng = strng.replaceAll(">>","》");
		strng = strng.replace('<','＜');
		strng = strng.replace('>','＞');
		strng = strng.replace('|','｜');
		strng = strng.replaceFirst("\"","“");
		strng = strng.replaceFirst("\"","”");
		strng = strng.replaceFirst("\"","“");
		strng = strng.replaceFirst("\"","”");
		strng = strng.replaceFirst("\"","“");
		strng = strng.replaceFirst("\"","”");
		return strng;
	}
	
	
	/**
	 * 对密文用quoted-printable编码方式进行MIME解码
	 * @param plaintext
	 * @return
	 * @throws Exception
	 */
	public static String MimeDecode(String Str0) throws Exception	{
		String returnValue = "";
		InputStream stream;
		stream = MimeUtility.decode(new ByteArrayInputStream(Str0.getBytes()), "quoted-printable");		
		BufferedReader br = new BufferedReader(new InputStreamReader(stream));
		char[] cbuf = new char[4096];
		br.read(cbuf);
		returnValue = new String(cbuf);
		returnValue = returnValue.trim();
		cbuf = null;
		return returnValue;
	}
	
	/**
	 * 对明文用quoted-printable编码方式进行MIME编码
	 * @param plaintext
	 * @return
	 * @throws Exception
	 */
	public static String MimeEncode(String plaintext) throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		byte[] in = plaintext.getBytes();
		ByteArrayOutputStream inStream = new ByteArrayOutputStream();
		inStream.write(in, 0, in.length);
		// pad
		if ((in.length % 3) == 1) {
			inStream.write(0);
			inStream.write(0);
		} else if ((in.length % 3) == 2) {
			inStream.write(0);
		}
		inStream.writeTo(MimeUtility.encode(out, "quoted-printable"));
		return out.toString();
	}
	
	public static String getCurrentShortDateTime(){
		String result=null;
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date nowDate=new Date();
		result=sdf.format(nowDate);
		return result;
	}
	
	
	
	public static String encodeFileStream(File file) throws Exception {
		 // 压缩正文
		String toFilePath = "";
		toFilePath = file.getParent() + "/" + file.getName() + ".zip";
	  ZipOutputStream out = new ZipOutputStream(new FileOutputStream(toFilePath));
	  out.setEncoding("GBK");
	  out.putNextEntry(new org.apache.tools.zip.ZipEntry(file.getName()));
	  FileInputStream in = new FileInputStream(file);
	  int b;
	  while ((b = in.read()) != -1) {
	    out.write(b);
	  }
	  in.close();
	  out.close();
	  // -----------------------------------------------
	  // 删除临时的压缩文件
	  return toFilePath;
	}
	
	/**
	 * 压缩文件
	 * @param file 要压缩的文件
	 * @param newFileName 压缩包中的文件名
	 * @return
	 * @throws Exception
	 */
	public static String encodeFileStream(File file, String newFileName) throws Exception {
		 // 压缩正文
		String toFilePath = "";
		//newFileName = new String(newFileName.getBytes(),"utf-8");
		toFilePath = file.getParent() + "/" + file.getName() + ".zip";
	  ZipOutputStream out = new ZipOutputStream(new FileOutputStream(toFilePath));
	  out.putNextEntry(new org.apache.tools.zip.ZipEntry(newFileName));
	  FileInputStream in = new FileInputStream(file);
	  int b;
	  while ((b = in.read()) != -1) {
	    out.write(b);
	  }
	  in.close();
	  out.close();
	  // -----------------------------------------------
	  // 删除临时的压缩文件
	  return toFilePath;
	}
	

	public static String filterXmlData(String text) {
		StringBuffer outString = new StringBuffer(); 
		if (text == null) {
			return "";
		}
		char[] data = text.toCharArray();
		for (int i = 0, len = data.length; i < len; i++) {
			char c = data[i];
			int result = c;
			if (result >= 0xD800 && result <= 0xDBFF) {
				int high = c;
				try {
					int low = text.charAt(i + 1);
					if (low < 0xDC00 || low > 0xDFFF) {
						char ch = (char) low;
						System.err.println(ch);
					}
					// Algorithm defined in Unicode spec
					result = (high - 0xD800) * 0x400 + (low - 0xDC00) + 0x10000;
					i++;
				} catch (IndexOutOfBoundsException e) {
					e.printStackTrace();
				}
			}

			String retString = retXMLCharacter(result);
			if (retString.equals("*")) {
				outString.append(c);
			} else {
				outString.append(retString);
				// Likely this character can't be easily displayed
				// because it's a control so we use its hexadecimal
				// representation in the reason.
				// errorChar++;
			}
		} 
		// If we got here, everything is OK
		return outString.toString();
	}
	
	public static String retXMLCharacter(int c) {
		if (c <= 0xD7FF) {
			if (c >= 0x20) {
				return "*";
			} else {
				if (c == '\n')
					return "";
				if (c == '\r')
					return "";
				if (c == '\t')
					return "";
				return "?";
			}
		}
		if (c < 0xE000) {
			return "?";
		}
		if (c <= 0xFFFD) {
			return "*";
		}
		if (c < 0x10000) {
			return "?";
		}
		if (c <= 0x10FFFF) {
			return "*";
		}
		return "?";
	}

	public static String stripNonValidXMLCharacters(String in) {
	    StringBuffer out = new StringBuffer(); // Used to hold the output.
	    char current; // Used to reference the current character.
	
	    if (in == null || ("".equals(in))) return ""; // vacancy test.
	    for (int i = 0; i < in.length(); i++) {
	        current = in.charAt(i); // NOTE: No IndexOutOfBoundsException caught here; it should not happen.
	        if ((current == 0x9) ||
	            (current == 0xA) ||
	            (current == 0xD) ||
	            ((current >= 0x20) && (current <= 0xD7FF)) ||
	            ((current >= 0xE000) && (current <= 0xFFFD)) ||
	            ((current >= 0x10000) && (current <= 0x10FFFF)))
	            out.append(current);
	    }
	    return out.toString();
	}    

	public static String stripNonValidXMLCharacters1(String in){
		String oaReturn = in;
		
		if (oaReturn.indexOf("\n") != -1) {
			oaReturn = oaReturn.replaceAll("\n", "");
		}
		if (oaReturn.indexOf("\t") != -1) {
			oaReturn = oaReturn.replaceAll("\t", "");
		}

		if (oaReturn.indexOf("") != -1) {
			oaReturn = oaReturn.replaceAll("", ".");
		}
		
		return oaReturn;
	}
	
	/** 
	 * 文件转化为字节数组
	 */
	public static byte[] getBytesFromFile(File f) {
		if (f == null) {
			return null;
		}
		try {
			FileInputStream stream = new FileInputStream(f);
			ByteArrayOutputStream out = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while ((n = stream.read(b)) != -1)
				out.write(b, 0, n);
			stream.close();
			out.close();
			return out.toByteArray();
		} catch (IOException e) {
		}
		return null;
	}

	/**
	 * 把字节数组保存为一个文件
	 */
	public static File getFileFromBytes(byte[] b, String outputFile) {
		BufferedOutputStream stream = null;
		File file = null;
		try {
			file = new File(outputFile);
			FileOutputStream fstream = new FileOutputStream(file);
			stream = new BufferedOutputStream(fstream);
			stream.write(b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (stream != null) {
				try {
					stream.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
		return file;
	}
	
	public static boolean convertToBoolean(Object obj) {
		boolean returnValue = false;
		if (obj != null) {
			if (String.valueOf(obj).equals("1") ||
				String.valueOf(obj).equalsIgnoreCase("true")){
				return true;
			}
		}
		return returnValue;
	}
	
	public static String highLightkeyWords(String orignal, String[] keyWords) {
		if (orignal == null || orignal.trim().length() == 0 
				|| keyWords == null || keyWords.length == 0)
			return orignal;
		for (int i=0; i<keyWords.length; i++) {
			if (!keyWords[i].equals("")) {
				orignal = orignal.replaceAll(keyWords[i], "<font color='red'>" + keyWords[i] + "</font>");
			}
		}
		return orignal;		
	}
	
	public static String highLightkeyWord(String orignal, String keyWord) {
		if (orignal == null || orignal.trim().length() == 0 
				|| keyWord == null || keyWord=="")
			return orignal;
		if (!keyWord.equals("")) {
			orignal = orignal.replaceAll(keyWord, "<font color='red'>" + keyWord + "</font>");
		}
		return orignal;		
	}
}
