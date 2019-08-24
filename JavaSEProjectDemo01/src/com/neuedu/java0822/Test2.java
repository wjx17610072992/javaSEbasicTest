package com.neuedu.java0822;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * @ClassName: Test2
 * @Description: 字节流输入
 * @author neuedu_wjx
 * @date 2019年8月22日 下午4:00:13
 *
 */
public class Test2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("E:\\hello.txt");
			byte[] buffer = new byte[1024];
			//			int read = fis.read(buffer);
			//			// String
			//			String string = new String(buffer);
			//			System.out.println(string);
			int len=0;
			while((len = fis.read(buffer)) !=-1) {
				String string = new String(buffer,0,len);
				System.out.println(string);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(null !=fis) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
