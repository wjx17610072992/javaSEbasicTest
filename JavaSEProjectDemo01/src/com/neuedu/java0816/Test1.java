package com.neuedu.java0816;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

/**
* @ClassName: Test1
* @Description: Map����
* @author neuedu_wjx
* @date 2019��8��16�� ����11:34:59
*
*/
public class Test1 {
	public static void main(String[] args) {
		HashMap<String, Product> hashMap = new HashMap<String, Product>();
		hashMap.put("a",new Product("100", "쫷�", 188000.0f));
		
		
		 Product product = new Product("11", "�޻���", 289000.9f);
		hashMap.put("����", product);
		System.out.println(hashMap);
		
		// boolean containsKey = hashMap.containsKey("����");
		// boolean containsValue = hashMap.containsValue(product);
		// System.out.println(containsValue);
		// System.out.println(hashMap.get("����"));
		
		
		// boolean empty = hashMap.isEmpty();
		// System.out.println(empty);
		
		HashMap<String, Product> hashMap2 = new HashMap<String, Product>();
		hashMap2.put("b", new Product("1232", "����", 391991.8f));
		hashMap2.put("c", new Product("123", "��è", 888989.0f));
		
		System.out.println(hashMap2);
		 hashMap.putAll(hashMap2);
		// System.out.println(hashMap);
		// Product remove = hashMap.remove("����");
		 System.out.println(hashMap);
		
		
	}
}
