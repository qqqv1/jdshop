package com.zhou.jdshop.util;

import java.util.UUID;

public class CommonsUtils {

	//生成uuid方法
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
		
	}
	public static void main(String[] args) {
		System.out.println(getUUID());
	}
}
