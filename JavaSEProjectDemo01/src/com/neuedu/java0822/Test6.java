package com.neuedu.java0822;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
* @ClassName: Test6
* @Description: 字符的输出流
* @author neuedu_wjx
* @date 2019年8月22日 下午7:21:28
*
*/
public class Test6 {

	public static void main(String[] args) {
		fileWriterDate("E:\\hello1.txt");
	}
	
	
	
	
	public static void fileWriterDate(String pathName) {
		FileWriter fw = null;
		BufferedWriter bufferedWriter = null;
		try {
			fw =new FileWriter(pathName);
			bufferedWriter = new BufferedWriter(fw);
			String str = "我是一个小可爱";
			bufferedWriter.write(str);
			bufferedWriter.newLine();
			bufferedWriter.write(str);
			bufferedWriter.flush();
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	finally {
			if(null!=fw) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					if(null !=fw) {
						try {
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					if(null !=bufferedWriter) {
						try {
							bufferedWriter.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		
		
		
		
		
	}
	
	
	
}
