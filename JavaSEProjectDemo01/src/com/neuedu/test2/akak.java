package com.neuedu.test2;

import java.util.Scanner;

public class akak {
	public static void main(String[] args) {
		System.out.print("������һ���·ݣ�");
		Scanner scanner1 = new Scanner(System.in);
		int month1 = scanner1.nextInt();
		if(month1==2) {
			System.out.println("������28�졣");	
		}else if(month1==1||month1==3||month1==5||month1==7||month1==8||month1==10||month1==12) {
			System.out.println("������31�졣");
		}else if(month1==4||month1==6||month1==9||month1==11){
			System.out.println("������30��");
		}else {
			System.out.println("�������󣡣���");
		} 
	// �žų˷��ھ�
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+"*"+j+"="+(i*j)+" ");
				
			}
			System.out.println();
		}
		
		
		
		
	}
}
