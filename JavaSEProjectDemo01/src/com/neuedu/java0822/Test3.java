package com.neuedu.java0822;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
* @ClassName: Test3
* @Description: �ֽ������
* @author neuedu_wjx
* @date 2019��8��22�� ����4:45:50
*
*/
public class Test3 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			fos =new FileOutputStream("E:\\hello.txt",true);
			String str = "neueduqweqq!!!!";
			fos.write(str.getBytes());
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(null !=fos) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
