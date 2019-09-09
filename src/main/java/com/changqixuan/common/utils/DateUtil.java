/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtil.java 
 * @Prject: changqixuan_day03
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 上午10:44:38 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import java.util.Calendar;
import java.util.Date;
/** 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月5日 上午10:44:38  
 */
public class DateUtil {

	/*
	* 方法1：(5分)
	* 给一个时间对象，返回该时间所在月的1日0时0分0秒。例如一个Date对象的值是2019-05-18 11:37:22
	* 则返回的结果为2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//获取日历类
		Calendar c = Calendar.getInstance();
		//根据传入时间来初始化日历类
		c.setTime(src);
		
		c.set(Calendar.DAY_OF_MONTH, 1);//本月第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//本日第0个小时
		c.set(Calendar.MINUTE, 0);//本小时第0分钟
		c.set(Calendar.SECOND, 0);//本小时第0秒
		
		return c.getTime();
	}
	/*
	* 方法2：(5分)
	* 给一个时间对象，返回该时间所在月的最后日23时59分59秒，需要考虑月大月小和二月特殊情况。
	* 例如一个Date对象的值是2019-05-18 11:37:22，则返回的时间为2019-05-31 23:59:59
	* 例如一个Date对象的值是2019-02-05 15:42:18，则返回的时间为2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		
		//获取日历类
		Calendar c = Calendar.getInstance();
		
		//使用传入的时间初始化日历类
		c.setTime(src);
		
		//让传入的月份加1
		c.add(Calendar.MONTH,1);
		
		//让传入的日期变成下个月月初
		Date date = getDateByInitMonth(c.getTime());
		
		//根据月初的时间初始化日历类
		c.setTime(date);
		
		//让秒减一 成为月末的时间
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
}
