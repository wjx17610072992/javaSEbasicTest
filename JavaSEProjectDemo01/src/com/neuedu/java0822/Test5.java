package com.neuedu.java0822;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
* @ClassName: Test5
* @Description: 字符流
* @author neuedu_wjx
* @date 2019年8月22日 下午6:46:52
*
*/
public class Test5 {
	public static void main(String[] args) {
		fileReaderData("E:\\hello.txt");
	}
	
	// 字符输入流 读取 数据
	public static void fileReaderData(String pathName) {
		FileReader fr = null;
		BufferedReader br = null;
		try {
			 fr = new FileReader(pathName);
			 char[] buffer = new char[1024];
			 // 将文件中的字符全部存到char数组
//			 fr.read(buffer);
//			 System.out.println(Arrays.toString(buffer));
			// 缓冲流 
			 
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
