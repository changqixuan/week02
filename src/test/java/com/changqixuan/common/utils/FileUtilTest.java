/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtilTest.java 
 * @Prject: changqixuan-common
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 下午4:37:03 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import java.io.File;

import org.junit.Test;

/** 
 * @ClassName: FileUtilTest 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月5日 下午4:37:03  
 */
public class FileUtilTest {

	/**
	 * Test method for {@link com.changqixuan.common.utils.FileUtil#getExtendName(java.lang.String)}.
	 */
	@Test
	public void testGetExtendName() {
		String fileName = "aaa.jpg";
		String extendName = FileUtil.getExtendName(fileName);
		System.out.println(extendName);
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.FileUtil#getTempDirectory()}.
	 */
	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.FileUtil#getUserDirectory()}.
	 */
	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}

}
