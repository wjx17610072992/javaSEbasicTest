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
		// �� �� �� ʱ �� ��
		// ͨ��������������ʽ����
		
		SimpleDateFormat adf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String today1 = adf.format(date);
		System.out.println(today1);
		
		// ���ַ������͵�����ת����Ϊ date����
		// String str = "2019-08-15 09:41:11";
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
