package com.neuedu.java0822;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
* @ClassName: Test6
* @Description: �ַ��������
* @author neuedu_wjx
* @date 2019��8��22�� ����7:21:28
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
			String str = "����һ��С�ɰ�";
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
