package com.neuedu.java0813;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;

/**
 * 
 * @author neuedu_wjx
 *
 */






public class Data {
	public static void main(String[] args) {
		Date date = new Date();
		// 年 月 日 时 分 秒
		// 通过构造器创建格式化类
		
		SimpleDateFormat adf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today1 = adf.format(date);
		System.out.println(today1);
		
		// 将字符串类型的日期转换成为 date类型
		// String str = "2019-08-15 09:41:11";
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
