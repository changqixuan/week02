/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: RandomUtilTest.java 
 * @Prject: changqixuan-common
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 下午7:14:11 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import org.junit.Test;

/** 
 * @ClassName: RandomUtilTest 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月5日 下午7:14:11  
 */
public class RandomUtilTest {

	/**
	 * Test method for {@link com.changqixuan.common.utils.RandomUtil#random(int, int)}.
	 */
	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			int l = RandomUtil.random(0,1);
			System.out.print(l + ",");
		}
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.RandomUtil#subRandom(int, int, int)}.
	 */
	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1,120,10);
		for (int i : is) {
			System.out.print(i + "  ");
		}
		
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.RandomUtil#randomCharacter()}.
	 */
	@Test
	public void testRandomCharacter() {
		for (int i = 0; i < 5; i++) {
			System.out.print(RandomUtil.randomCharacter());
		}
	}

	/**
	 * Test method for {@link com.changqixuan.common.utils.RandomUtil#randomString(int)}.
	 */
	@Test
	public void testRandomString() {
		System.out.println(RandomUtil.randomString(6));
	}

}
