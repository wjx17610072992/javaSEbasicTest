package com.neuedu.java0813;

public class test2 {
	public static void main(String[] args) {
		Person person = new Person();
		person.setAge(200);
		person.setName("������");
		int[] num = {1,2,3};
		System.out.println(person.getAge());
		System.out.println(num.length);

		Integer num2 = 0;
		System.out.println(Double.MAX_VALUE);
		
		
		
		// Integer �� int֮���ת��
		int num1 = 100;
		Integer integer = new Integer(num1);
		// Integer ת int
		Integer integer2 = new Integer(10 );
		int a = integer2.intValue();
		long b = integer2.longValue();
		byte c = integer2.byteValue();
		System.out.println(a);
		System.out.println(c);

		String str = "159";
		int aa = Integer.parseInt(str);
		System.out.println(aa);
		
		String str1 = "true";
		boolean aaa = Boolean.parseBoolean(str1);
		System.out.println(aaa);
		
		Integer numss = Integer.valueOf(15);
		System.out.println(numss);
		
		
		
		
		
		
		
		
		







	}





}
