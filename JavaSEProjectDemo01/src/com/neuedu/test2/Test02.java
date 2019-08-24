package com.neuedu.test2;

import java.util.Arrays;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		int[] arrs = new int[30];
		Random r = new Random();
		for(int i=0;i<arrs.length;i++) {
			arrs[i]=r.nextInt();
		}
		int[] a =Arrays.copyOf(arrs,arrs.length);
		int[] b =Arrays.copyOf(arrs,arrs.length);

		long start = System.currentTimeMillis();
		Arrays.sort(a);
		long end = System.currentTimeMillis();
		System.out.println("系统API花费的时间为:"+(end-start));


		long start2 = System.currentTimeMillis();
		chooseSort(b);
		long end2 = System.currentTimeMillis();
		System.out.println("系统API花费的时间为:"+(end2-start2));
		
		long max=Long.MAX_VALUE;
		long maxYears= max/1000/60/60/24/365;
		System.out.println(maxYears);
	}

	public static int[] chooseSort(int[] b) {
		for(int i=0;i<b.length-1;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i] > b[j]){
					int temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}

		}return b;
	}
}
