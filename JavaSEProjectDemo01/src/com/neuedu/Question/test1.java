package com.neuedu.Question;

public class test1 {
	public static void main(String[] args) {
		// 构建多选题
		MultiChoice mc = new MultiChoice("赵佳喜欢吃什么？", new String[] {"1.小龙虾","2.皮皮虾","3.芒果","4.桃子"}, new int[] {1,2});
		int[]as = new int[] {1,4};
		boolean check = mc.check(as);
		System.out.println(check);
		
		// 构建单选题
		SingleChoice sc = new SingleChoice("你要吃哪个？", new String[] {"1.小龙虾","2.皮皮虾","3.芒果","4.桃子"}, 1);
		boolean check2=sc.check(new int[] {1});
		System.out.println(check2);
	
	
	}
}
