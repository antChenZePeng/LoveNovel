package com.wenzhi.novel.util;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Title: Description: 此类实现封装日期常用操作
 * 
 * @author ange_zhao
 * @version 1.0
 */
public class DateUtil {
	protected static Log logger = LogFactory.getLog(DateUtil.class);

	// 格式：年－月－日 小时：分钟：秒
	public static final String FORMAT_ONE = "yyyy-MM-dd HH:mm:ss";

	// 格式：年－月－日 小时：分钟
	public static final String FORMAT_TWO = "yyyy-MM-dd HH:mm";

	// 格式：年月日 小时分钟秒
	public static final String FORMAT_THREE = "yyyyMMdd-HHmmss";

	// 格式：年－月－日
	public static final String LONG_DATE_FORMAT = "yyyy-MM-dd";

	// 格式：月－日
	public static final String SHORT_DATE_FORMAT = "MM-dd";

	// 格式：小时：分钟：秒
	public static final String LONG_TIME_FORMAT = "HH:mm:ss";

	// 格式：年-月
	public static final String MONTG_DATE_FORMAT = "yyyy-MM";

	public static final String DATE_FORMATE_YMDSS = "yyyyMMddHHmmssSSS";
	
	public static final String DATE_FORMATE_YMDHMS = "yyyyMMddHHmmss";
	
	// 年的加减
	public static final int SUB_YEAR = Calendar.YEAR;

	// 月加减
	public static final int SUB_MONTH = Calendar.MONTH;

	// 天的加减
	public static final int SUB_DAY = Calendar.DATE;

	// 小时的加减
	public static final int SUB_HOUR = Calendar.HOUR;

	// 分钟的加减
	public static final int SUB_MINUTE = Calendar.MINUTE;

	// 秒的加减
	public static final int SUB_SECOND = Calendar.SECOND;

	public final static SimpleDateFormat DATEFORMAT_DAY = new SimpleDateFormat("yyyy-MM-dd");

	private static final SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static final SimpleDateFormat timeFormatm = new SimpleDateFormat("yyyy-MM-dd HH:mm");
	
	private static final DecimalFormat digitalDf = new DecimalFormat("00");
	
	public static final int ONE_HOUR_TIME = 60 * 60 * 1000;
	public static final long ONE_DAY_TIME = 24 * ONE_HOUR_TIME;
	public static final long ONE_MONTH_TIME = 30 * ONE_DAY_TIME;
	

	public DateUtil() {
	}

	/**
	 * 字符串转时间
	 * @param time
	 * @return
	 * @throws Exception
	 */
	public static Date getTime(String time){
        try {
            return timeFormat.parse(time);
        } catch (ParseException e) {
            try {
                return DATEFORMAT_DAY.parse(time);
            } catch (ParseException e1) {
                return new Date();
            }
        }
    }

	/**
	 * 取默认开始时间-一个星期前
	 * 
	 * @param startTime
	 * @return
	 * @throws Exception
	 */
	public static String getStartDate(String startDate) {
		if (StringUtils.isEmpty(startDate)) {
			startDate = DATEFORMAT_DAY.format(new Date().getTime() - 7 * 24 * 60 * 60 * 1000);
		}
		return startDate;
	}
	/**
	 * 取默认开始时间- 的上一个月的时间
	 */		
	public static String getMinMonthDate(String repeatDate){  
        Calendar calendar = Calendar.getInstance();          
        try {
        	 if(StringUtils.isNotBlank(repeatDate) && !"null".equals(repeatDate)){         	
             	calendar.setTime(DATEFORMAT_DAY.parse(repeatDate)); 
             }else{
             	calendar.setTime(DATEFORMAT_DAY.parse(currDay()));  
             }
        } catch (ParseException e) {  
            e.printStackTrace();  
        }             
        calendar.add(calendar.MONTH, -1);
        return DATEFORMAT_DAY.format(calendar.getTime());
    }  
	
	

	/**
	 * 取默认结束时间
	 * 
	 * @param startTime
	 * @return
	 * @throws Exception
	 */
	public static String getEndDate(String endDate) {
		if (StringUtils.isEmpty(endDate)) {
			endDate = DATEFORMAT_DAY.format(new Date());
		}
		return endDate;
	}

	/**
	 * 取默认开始时间-一个星期前
	 * 
	 * @param startTime
	 * @return
	 * @throws Exception
	 */
	public static String getStartTime(String startDate) {
		if (StringUtils.isEmpty(startDate)) {
			startDate = timeFormat.format(new Date().getTime() - 7 * 24 * 60 * 60 * 1000);
		}
		return startDate;
	}

	/**
	 * 取默认结束时间
	 * 
	 * @param startTime
	 * @return
	 * @throws Exception
	 */
	public static String getEndTime(String endDate) {
		if (StringUtils.isEmpty(endDate)) {
			endDate = timeFormat.format(new Date());
		}
		return endDate;
	}

	/**
	 * 把符合日期格式的字符串转换为日期类型
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date stringtoDate(String dateStr) {
		Date d = null;
		try {
			DATEFORMAT_DAY.setLenient(false);
			d = DATEFORMAT_DAY.parse(dateStr);
		} catch (Exception e) {
			// log.error(e);
			d = null;
		}
		return d;
	}

	public static Date stringtoDateTime(String dateStr) {
		Date d = null;
		try {
			timeFormat.setLenient(false);
			d = timeFormat.parse(dateStr);
		} catch (Exception e) {
			// log.error(e);
			d = null;
		}
		return d;
	}
	
	public static Date stringtoDateMinute(String dateStr) {
		Date d = null;
		try {
			timeFormatm.setLenient(false);
			d = timeFormatm.parse(dateStr);
		} catch (Exception e) {
			// log.error(e);
			d = null;
		}
		return d;
	}

	/**
	 * 把符合日期格式的字符串转换为日期类型
	 * 
	 * @param dateStr
	 * @return
	 */
	public static Date stringtoDate(String dateStr, String format) {
		Date d = null;
		SimpleDateFormat formater = new SimpleDateFormat(format);
		try {
			formater.setLenient(false);
			d = formater.parse(dateStr);
		} catch (Exception e) {
			// log.error(e);
			d = null;
		}
		return d;
	}

	/**
	 * 把符合日期格式的字符串转换为日期类型
	 */
	public static Date stringtoDate(String dateStr, String format, ParsePosition pos) {
		Date d = null;
		SimpleDateFormat formater = new SimpleDateFormat(format);
		try {
			formater.setLenient(false);
			d = formater.parse(dateStr, pos);
		} catch (Exception e) {
			// log.error(e);
			d = null;
		}
		return d;
	}

	/**
	 * 把日期转换为字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date, String format) {
		String result = "";
		SimpleDateFormat formater = new SimpleDateFormat(format);
		try {
			result = formater.format(date);
		} catch (Exception e) {
			// log.error(e);
		}
		return result;
	}

	/**
	 * 获取当前时间的指定格式
	 * 
	 * @param format
	 * @return
	 */
	public static String getCurrDate(String format) {
		return dateToString(new Date(), format);
	}

	/**
	 * 
	 * @param dateStr
	 * @param amount
	 * @return
	 */
	public static String dateSub(int dateKind, String dateStr, int amount) {
		Date date = stringtoDate(dateStr, FORMAT_ONE);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(dateKind, amount);
		return dateToString(calendar.getTime(), FORMAT_ONE);
	}

	/**
	 * 两个日期相减
	 * 
	 * @param firstTime
	 * @param secTime
	 * @return 相减得到的秒数
	 */
	public static long timeSub(String firstTime, String secTime) {
		long first = stringtoDate(firstTime, FORMAT_ONE).getTime();
		long second = stringtoDate(secTime, FORMAT_ONE).getTime();
		return (second - first) / 1000;
	}

	/**
	 * 获得某月的天数
	 * 
	 * @param year
	 *            int
	 * @param month
	 *            int
	 * @return int
	 */
	public static int getDaysOfMonth(String year, String month) {
		int days = 0;
		if (month.equals("1") || month.equals("3") || month.equals("5") || month.equals("7") || month.equals("8")
				|| month.equals("10") || month.equals("12")) {
			days = 31;
		} else if (month.equals("4") || month.equals("6") || month.equals("9") || month.equals("11")) {
			days = 30;
		} else {
			if ((Integer.parseInt(year) % 4 == 0 && Integer.parseInt(year) % 100 != 0)
					|| Integer.parseInt(year) % 400 == 0) {
				days = 29;
			} else {
				days = 28;
			}
		}

		return days;
	}

	/**
	 * 获取某年某月的天数
	 * 
	 * @param year
	 *            int
	 * @param month
	 *            int 月份[1-12]
	 * @return int
	 */
	public static int getDaysOfMonth(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);
		return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 获得当前日期
	 * 
	 * @return int
	 */
	public static int getToday() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.DATE);
	}

	/**
	 * 获得当前月份
	 * 
	 * @return int
	 */
	public static int getToMonth() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 获得当前年份
	 * 
	 * @return int
	 */
	public static int getToYear() {
		Calendar calendar = Calendar.getInstance();
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 返回日期的天
	 * 
	 * @param date
	 *            Date
	 * @return int
	 */
	public static int getDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DATE);
	}

	/**
	 * 返回日期的年
	 * 
	 * @param date
	 *            Date
	 * @return int
	 */
	public static int getYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 返回日期的月份，1-12
	 * 
	 * @param date
	 *            Date
	 * @return int
	 */
	public static int getMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 计算两个日期相差的天数，如果date2 > date1 返回正数，否则返回负数
	 * 
	 * @param date1
	 *            Date
	 * @param date2
	 *            Date
	 * @return long
	 */
	public static long dayDiff(Date date1, Date date2) {
		return (date2.getTime() - date1.getTime()) / 86400000;
	}

	/**
	 * 比较两个日期的年差
	 * 
	 * @param befor
	 * @param after
	 * @return
	 */
	public static int yearDiff(String before, String after) {
		Date beforeDay = stringtoDate(before, LONG_DATE_FORMAT);
		Date afterDay = stringtoDate(after, LONG_DATE_FORMAT);
		return getYear(afterDay) - getYear(beforeDay);
	}

	/**
	 * 比较指定日期与当前日期的差
	 * 
	 * @param befor
	 * @param after
	 * @return
	 */
	public static int yearDiffCurr(String after) {
		Date beforeDay = new Date();
		Date afterDay = stringtoDate(after, LONG_DATE_FORMAT);
		return getYear(beforeDay) - getYear(afterDay);
	}

	public static long dayDiffCurr(String before) {
		Date currDate = DateUtil.stringtoDate(currDay(), LONG_DATE_FORMAT);
		Date beforeDate = stringtoDate(before, LONG_DATE_FORMAT);
		return (currDate.getTime() - beforeDate.getTime()) / 86400000;

	}

	public static int getFirstWeekdayOfMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.SATURDAY); // 星期天为第一天
		c.set(year, month - 1, 1);
		return c.get(Calendar.DAY_OF_WEEK);
	}

	public static int getLastWeekdayOfMonth(int year, int month) {
		Calendar c = Calendar.getInstance();
		c.setFirstDayOfWeek(Calendar.SATURDAY); // 星期天为第一天
		c.set(year, month - 1, getDaysOfMonth(year, month));
		return c.get(Calendar.DAY_OF_WEEK);
	}


	/**
	 * 获得当前日期字符串，格式"yyyy-MM-dd HH:mm:ss"
	 * 
	 * @return
	 */
	public static String getNow() {
		Calendar today = Calendar.getInstance();
		return dateToString(today.getTime(), FORMAT_ONE);
	}

	/**
	 * 根据生日获取星座
	 * 
	 * @param birth
	 *            YYYY-mm-dd
	 * @return
	 */
	public static String getAstro(String birth) {
		if (!isDate(birth)) {
			birth = "2000" + birth;
		}
		if (!isDate(birth)) {
			return "";
		}
		int month = Integer.parseInt(birth.substring(birth.indexOf("-") + 1, birth.lastIndexOf("-")));
		int day = Integer.parseInt(birth.substring(birth.lastIndexOf("-") + 1));
		// logger.debug(month + "-" + day);
		String s = "魔羯水瓶双鱼牡羊金牛双子巨蟹狮子处女天秤天蝎射手魔羯";
		int[] arr = { 20, 19, 21, 21, 21, 22, 23, 23, 23, 23, 22, 22 };
		int start = month * 2 - (day < arr[month - 1] ? 2 : 0);
		return s.substring(start, start + 2) + "座";
	}

	/**
	 * 判断日期是否有效,包括闰年的情况
	 * 
	 * @param date
	 *            YYYY-mm-dd
	 * @return
	 */
	public static boolean isDate(String date) {
		StringBuffer reg = new StringBuffer("^((\\d{2}(([02468][048])|([13579][26]))-?((((0?");
		reg.append("[13578])|(1[02]))-?((0?[1-9])|([1-2][0-9])|(3[01])))");
		reg.append("|(((0?[469])|(11))-?((0?[1-9])|([1-2][0-9])|(30)))|");
		reg.append("(0?2-?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][12");
		reg.append("35679])|([13579][01345789]))-?((((0?[13578])|(1[02]))");
		reg.append("-?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))");
		reg.append("-?((0?[1-9])|([1-2][0-9])|(30)))|(0?2-?((0?[");
		reg.append("1-9])|(1[0-9])|(2[0-8]))))))");
		Pattern p = Pattern.compile(reg.toString());
		return p.matcher(date).matches();
	}

	/**
	 * 取得指定日期过 months 月后的日期 (当 months 为负数表示指定月之前);
	 * 
	 * @param date
	 *            日期 为null时表示当天
	 * @param month
	 *            相加(相减)的月数
	 */
	public static Date nextMonth(Date date, int months) {
		Calendar cal = Calendar.getInstance();
		if (date != null) {
			cal.setTime(date);
		}
		cal.add(Calendar.MONTH, months);
		return cal.getTime();
	}

	/**
	 * 取得指定日期过 day 天后的日期 (当 day 为负数表示指定月之前);
	 * 
	 * @param date
	 *            日期 为null时表示当天
	 * @param month
	 *            相加(相减)的月数
	 */
	public static Date nextDay(Date date, int day) {
		Calendar cal = Calendar.getInstance();
		if (date != null) {
			cal.setTime(date);
		}
		cal.add(Calendar.DAY_OF_YEAR, day);
		return cal.getTime();
	}

	/**
	 * 取得指定日期过 day 周后的日期 (当 day 为负数表示指定月之前)
	 * 
	 * @param date
	 *            日期 为null时表示当天
	 */
	public static Date nextWeek(Date date, int week) {
		Calendar cal = Calendar.getInstance();
		if (date != null) {
			cal.setTime(date);
		}
		cal.add(Calendar.WEEK_OF_MONTH, week);
		return cal.getTime();
	}

	/**
	 * 获取当前的日期(yyyy-MM-dd)
	 */
	public static String currDay() {
		return DateUtil.dateToString(new Date(), DateUtil.LONG_DATE_FORMAT);
	}

	/**
	 * 获取昨天的日期
	 * 
	 * @return
	 */
	public static String befoDay() {
		return befoDay(DateUtil.LONG_DATE_FORMAT);
	}

	public static String befoDay(String format) {
		return DateUtil.dateToString(DateUtil.nextDay(new Date(), -1), format);
	}

	/**
	 * 获取明天的日期
	 */
	public static String afterDay() {
		return DateUtil.dateToString(DateUtils.addDays(new Date(), -1), DateUtil.LONG_DATE_FORMAT);
	}

	/**
	 * 取得当前时间距离1900/1/1的天数
	 * 
	 * @return
	 */
	public static int getDayNum() {
		int daynum = 0;
		GregorianCalendar gd = new GregorianCalendar();
		Date dt = gd.getTime();
		GregorianCalendar gd1 = new GregorianCalendar(1900, 1, 1);
		Date dt1 = gd1.getTime();
		daynum = (int) ((dt.getTime() - dt1.getTime()) / (24 * 60 * 60 * 1000));
		return daynum;
	}

	/**
	 * getDayNum的逆方法(用于处理Excel取出的日期格式数据等)
	 * 
	 * @param day
	 * @return
	 */
	public static Date getDateByNum(int day) {
		GregorianCalendar gd = new GregorianCalendar(1900, 1, 1);
		Date date = gd.getTime();
		date = nextDay(date, day);
		return date;
	}

	/** 针对yyyy-MM-dd HH:mm:ss格式,显示yyyymmdd */
	public static String getYmdDateCN(String datestr) {
		if (datestr == null)
			return "";
		if (datestr.length() < 10)
			return "";
		StringBuffer buf = new StringBuffer();
		buf.append(datestr.substring(0, 4)).append(datestr.substring(5, 7)).append(datestr.substring(8, 10));
		return buf.toString();
	}

	public static String datetoString(Date date) {
		try {
			return DATEFORMAT_DAY.format(date);
		} catch (Exception e) {
		}
		return "";
	}

	public static String timetoString(Date date) {
		try {
			return timeFormat.format(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * 把日期转换为字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToStringOne(Date date) {
		String result = "";
		SimpleDateFormat formater = new SimpleDateFormat(FORMAT_ONE);
		try {
			result = formater.format(date);
		} catch (Exception e) {
			// log.error(e);
		}
		return result;
	}
	
	/**
	 * 把日期转换为字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToStringOneTime(Date date) {
		String result = "";
		SimpleDateFormat formater = new SimpleDateFormat(LONG_TIME_FORMAT);
		try {
			result = formater.format(date);
		} catch (Exception e) {
			// log.error(e);
		}
		return result;
	}
	
	/**
	 * 把日期转换为字符串
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToStringOnedate(Date date) {
		String result = "";
		SimpleDateFormat formater = new SimpleDateFormat(LONG_DATE_FORMAT);
		try {
			result = formater.format(date);
		} catch (Exception e) {
			// log.error(e);
		}
		return result;
	}

	/**
	 * 把long型转换成时间类型
	 */
	public static Date getLongByDate(long adddatetime) {
		Date date = new Date(adddatetime);
		return date;
	}

	// 获取明天的时间
	public static Long getBegin(Date date) {
		Calendar time = Calendar.getInstance();
		time.setTime(date);
		time.set(Calendar.HOUR_OF_DAY, 0);
		time.set(Calendar.MINUTE, 0);
		time.set(Calendar.SECOND, 0);
		return time.getTime().getTime();
	};

	// 获取指定时间后的日期(留存率用)
	public static Long getRetentionDate(Date date, int i) {
		// 天转化为毫秒
		Long time = 24 * 60 * 60 * 1000 * i * 1L;
		long time2 = date.getTime();
		return time + time2;
	}

	/**
	 * 获取两个日期之间的日期 包括开始与结束时间
	 * 
	 * @param start
	 *            开始日期
	 * @param end
	 *            结束日期
	 * @return 日期集合 yyyy-MM-dd
	 */
	public static List<String> getBetweenDates(Date start, Date end) {
		List<String> result = new ArrayList<String>();
		Calendar tempStart = Calendar.getInstance();
		tempStart.setTime(start);
		tempStart.add(Calendar.DAY_OF_YEAR, 1);
		result.add(datetoString(start));
		Calendar tempEnd = Calendar.getInstance();
		tempEnd.setTime(end);
		while (tempStart.before(tempEnd)) {
			result.add(datetoString(tempStart.getTime()));
			tempStart.add(Calendar.DAY_OF_YEAR, 1);
		}
		if (!start.equals(end)) {
			result.add(datetoString(end));
		}
		return result;
	}

	/**
	 * 获取后一天的时间
	 */
	public static Date getAfterDate(Date date) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动 
		return calendar.getTime();   //这个时间就是日期往后推一天的结果 
	}
	
	public static Date parseYMD(String str) {
		try {
			return DateUtils.parseDate(str, new String[] { LONG_DATE_FORMAT });
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Long getEnd(Date date){
		Calendar time = Calendar.getInstance();
		time.setTime(date);
		time.add(Calendar.DAY_OF_YEAR, 1);
		time.add(Calendar.SECOND, -1);
		return time.getTime().getTime();
	}
	
	//获取当前时间的零点
	public static Date getTimePoint(Date date) {
		return stringtoDateTime(formatYMD(date) + " 00:00:00");
	}
	
	public static String formatYMD(Date date) {
		return DateFormatUtils.format(date, LONG_DATE_FORMAT);
	}
	
	/**
	 * 获取当前的日期(yyyy-MM-dd hh:mm:ss)
	 */
	public static String currDayBys() {
		return DateUtil.dateToString(new Date(), DateUtil.FORMAT_ONE);
	}
	
	/**
	 * 取默认开始时间-一个星期前
	 * 
	 * @param startTime
	 * @return
	 * @throws Exception
	 */
	public static String getStartDateBys(String startDate) {
		if (StringUtils.isEmpty(startDate)) {
			startDate = timeFormat.format(new Date().getTime() - 7 * 24 * 60 * 60 * 1000);
		}
		return startDate;
	}
	
	/**
	 * 把long 转换成 日期 再转换成String类型
	 * @param millSec
	 * @param dateFormat
	 * @return
	 */
    public static String transferLongToDate(Long millSec, String dateFormat) {
    	if (StringUtils.isEmpty(dateFormat))
    		dateFormat = LONG_DATE_FORMAT;
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        Date date = new Date(millSec);
        return sdf.format(date);
    }

    public static Date getPreOneMonth(Date cur) {
    	if (null != cur) {
			Calendar c = Calendar.getInstance();
			c.setTime(cur);
			c.add(Calendar.MONTH, -1);
			return c.getTime();
		}
    	return null;
	}
}
