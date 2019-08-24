package com.neuedu.java0816;
public class Test2 {
	public static void main(String[] args) {
		System.out.println(
			test(null)+","+test("0")+","+test("")
			);
	}
	
	public static int test(String str) {
		try {
			return str.charAt(0)-'0';
		} catch (NullPointerException e) {
			e.printStackTrace();return 1;
		} catch (RuntimeException e) {
			e.printStackTrace();return 2;
		}	catch (Exception e) {
			e.printStackTrace();return 3;
		}	finally {
			return 4;
		}
	}

}
