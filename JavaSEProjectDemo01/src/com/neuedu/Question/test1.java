package com.neuedu.Question;

public class test1 {
	public static void main(String[] args) {
		// ������ѡ��
		MultiChoice mc = new MultiChoice("�Լ�ϲ����ʲô��", new String[] {"1.С��Ϻ","2.ƤƤϺ","3.â��","4.����"}, new int[] {1,2});
		int[]as = new int[] {1,4};
		boolean check = mc.check(as);
		System.out.println(check);
		
		// ������ѡ��
		SingleChoice sc = new SingleChoice("��Ҫ���ĸ���", new String[] {"1.С��Ϻ","2.ƤƤϺ","3.â��","4.����"}, 1);
		boolean check2=sc.check(new int[] {1});
		System.out.println(check2);
	
	
	}
}
