package com.neuedu.java0822;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
* @ClassName: IPwork
* @Description: 上机晨测
* @author neuedu_wjx
* @date 2019年8月23日 上午9:27:19
*
*/
public class IPwork {
	
	public static void main(String[] args) {
		Map<String, Integer> workCount = workCount("E:\\IP.txt");
		System.out.println(workCount);
	}
	
	
	
	
	
	public static Map<String,Integer> workCount(String pathName){
		FileReader fr = null;
		BufferedReader br = null;
		HashMap<String,Integer> hashMap = new HashMap<String, Integer>();
		try {
			fr = new FileReader(pathName);
			br = new BufferedReader(fr);
			String str = null;
			while(null!=(str=br.readLine())) {
				// System.out.println(str);
				if(!hashMap.containsKey(str)) {
					hashMap.put(str, 1);
				}else {
					hashMap.put(str, hashMap.get(str)+1);
				}
	
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	finally {
			if(null!=br) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(null!=fr) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}return hashMap;
	}
}
