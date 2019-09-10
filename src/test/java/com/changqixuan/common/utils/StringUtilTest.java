/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StringUtilTest.java 
 * @Prject: changqixuan-common
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月6日 下午1:50:37 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import org.junit.Test;

/** 
 * @ClassName: StringUtilTest 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月6日 下午1:50:37  
 */
public class StringUtilTest {

	/**
	 * Test method for {@link com.changqixuan.common.utils.StringUtil#hasLength(java.lang.String)}.
	 */
	@Test
	public void testHasLength() {
		
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.StringUtil#hasText(java.lang.String)}.
	 */
	@Test
	public void testHasText() {
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.StringUtil#randomChineseString()}.
	 */
	@Test
	public void testRandomChineseString() {
		System.out.println(StringUtil.randomChineseString(100)+",");
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.StringUtil#randomChineseString(int)}.
	 */
	@Test
	public void testRandomChineseStringInt() {
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.StringUtil#generateChineseName()}.
	*/
	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			System.out.println(StringUtil.generateChineseName());
		}
	}
	
	@Test
	public void isPhoneNumber() {
		String number = "19111275035";
		/**
		 * 验证手机号
		 */
		boolean hasText = StringUtil.isPhoneNumber(number);
		System.out.println(hasText);
	}
	
	@Test
	public void isEmail() {
		String email = "1031273669qq.com";
		/**
		 * 验证邮箱
		 */
		boolean hasText = StringUtil.isEmail(email);
		System.out.println(hasText);
	}
}
