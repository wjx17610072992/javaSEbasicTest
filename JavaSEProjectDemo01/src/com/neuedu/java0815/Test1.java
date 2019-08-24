package com.neuedu.java0815;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Integer> ac = new ArrayList<Integer>();
		ac.add(1);
		ac.add(15);
		ac.add(23);
		ac.add(23);
		ac.add(3, 513);
		System.out.println(ac);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(22);
		list.add(2);
		list.add(123);
		list.add(10);
		System.out.println(list);
		list.add(0, 111);
		System.out.println(list);
		// ac.addAll(list);
		// System.out.println(ac);
		
		ac.addAll(1, list);
		System.out.println(ac);
		ac.remove(1);
		ac.set(0, 88);
		System.out.println(ac);
		ac.get(0);
		System.out.println(ac.get(0));
	}
}
