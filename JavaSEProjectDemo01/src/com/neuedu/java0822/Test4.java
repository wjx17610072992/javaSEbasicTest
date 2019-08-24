package com.neuedu.java0822;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
* @ClassName: Test4
* @Description: 文件复制
* @author neuedu_wjx
* @date 2019年8月22日 下午6:24:49
*
*/
public class Test4 {
	public static void main(String[] args) {
		
		File file = new File("E:\\hello.txt");
		File file2 = new File("E:\\hello1.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			byte[] butter = new byte[1024];
			int len = 0;
			while((len=fis.read(butter))!=-1) {
				fos.write(butter,0,len);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
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
			if(null !=fis) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
