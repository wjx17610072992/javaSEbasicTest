package com.neuedu.java0822;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
* @ClassName: Test5
* @Description: �ַ���
* @author neuedu_wjx
* @date 2019��8��22�� ����6:46:52
*
*/
public class Test5 {
	public static void main(String[] args) {
		fileReaderData("E:\\hello.txt");
	}
	
	// �ַ������� ��ȡ ����
	public static void fileReaderData(String pathName) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			 fr = new FileReader(pathName);
			 char[] buffer = new char[1024];
			 // ���ļ��е��ַ�ȫ���浽char����
//			 fr.read(buffer);
//			 System.out.println(Arrays.toString(buffer));
			// ������ 
			 
			  br = new BufferedReader(fr);
			 String str = null;
			 while((str=br.readLine())!=null) {
				 System.out.print(str);
			 }
			 
//			 String readLine = br.readLine();
//			 System.out.println(readLine);
			 
			 
			 
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(null !=br) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(null !=fr) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
	}
	
}
