/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: FileUtils.java 
 * @Prject: changqixuan-common
 * @Package: com.changqixuan.common.utils 
 * @Description: TODO
 * @author: lenovo   
 * @date: 2019年9月5日 下午4:30:08 
 * @version: V1.0   
 */
package com.changqixuan.common.utils;

import java.io.File;

/** 
 * @ClassName: FileUtils 
 * @Description: TODO
 * @author: 常琪宣
 * @date: 2019年9月5日 下午4:30:08  
 */
public class FileUtil {

	/*
	* 方法1：给定一个文件名，返回该文件名的扩展名，例如“aaa.jpg”，返回“.jpg”(3分)
	*/
	public static String getExtendName(String fileName){
		if(fileName!=null && fileName.length()!=0)
		return fileName.substring(fileName.lastIndexOf("."));
		return null;
		
	}
	/*
	* 方法2：返回操作系统临时目录(5分)
	*/
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/*
	* 方法3：返回操作系统用户目录(5分)
	* 例如Linux系统是在/home/{用户账号名}，Windows系统是在C:\Users\{用户账号名}> 
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}

}
