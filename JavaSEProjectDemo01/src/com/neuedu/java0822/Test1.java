package com.neuedu.java0822;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		
//		File file = new File("E:\\abc11.txt");
//		try {
//			boolean createNewFile = file.createNewFile();
//			System.out.println(createNewFile);
//			
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		System.out.println(file.canRead());
		
		File file = new File("E:\\hello2.txt");
		File file1 = new File("E:\\hello3.txt");
		if(file.exists()) {
			try {
				file1.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		 file.delete();
		
	// 判断是否是隐藏文件
		 boolean hidden = file.isHidden();
		 System.out.println(hidden);
	// 表示文件夹
		 
		 File file2 = new File("E:\\21111\\1\\22");
		 String[] list = file2.list();
		 System.out.println(Arrays.toString(list));
		 boolean mkdirs = file2.mkdirs();
		 System.out.println(mkdirs);
		 
		}
	
}
