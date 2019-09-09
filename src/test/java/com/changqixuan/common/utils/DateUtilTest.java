/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: DateUtilTest.java 
 * @Prject: changqixuan-common
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 下午3:54:44 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

/** 
 * @ClassName: DateUtilTest 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月5日 下午3:54:44  
 */
public class DateUtilTest {

	/**
	 * Test method for {@link com.changqixuan.common.utils.DateUtil#getDateByInitMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByInitMonth() {
		//调用日历类
		Calendar c = Calendar.getInstance();
		
		//根据传入的时间初始化日历类
		c.set(2020, 3, 25);
		
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(date);
		System.out.println(format);
		
		
		
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.DateUtil#getDateByFullMonth(java.util.Date)}.
	 */
	@Test
	public void testGetDateByFullMonth() {
		
		//调用日历类
		Calendar c = Calendar.getInstance();
		
		//根据传入的时间初始化日历类
		c.set(2020, 3, 25);
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = df.format(date);
		System.out.println(format);
	}

}
