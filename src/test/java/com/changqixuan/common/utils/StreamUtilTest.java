/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: StreamUtilTest.java 
 * @Prject: changqixuan-common
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 下午4:49:58 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

/** 
 * @ClassName: StreamUtilTest 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月5日 下午4:49:58  
 */
public class StreamUtilTest {

	/**
	 * Test method for {@link com.changqixuan.common.utils.StreamUtil#closeAll(java.lang.AutoCloseable[])}.
	 * @throws FileNotFoundException 
	 */
	@Test
	public void testCloseAll() throws FileNotFoundException {
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.StreamUtil#readTextFile(java.io.InputStream)}.
	 */
	@Test
	public void testReadTextFileInputStream() {
		try {
			String string = StreamUtil.readTextFile(new FileInputStream("E:/test.txt"));
			System.out.println(string);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.StreamUtil#readTextFile(java.io.File)}.
	 */
	@Test
	public void testReadTextFileFile() {
		try {
			String string = StreamUtil.readTextFile(new FileInputStream("E:/test.txt"));
			System.out.println(string);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
