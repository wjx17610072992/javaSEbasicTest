package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * �ͻ���
 * @author neuedu_yhl
 */
public class Clienta {
	
	public static void main(String[] args) {
		welcome();
	}
	

    // дһ������ �����ӭ����
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("==============��ӭ����������ҫ...==============");
		System.out.println("============================");
		System.out.println("1.��ʼ��Ϸ...");
		System.out.println("2.��Ϸ����...");
		System.out.println("3.������Ϸ...");
		System.out.println("������������еĲ���:(1-3)");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			// ִ�п�ʼ��Ϸ
			createNewGame();
			break;

		case 2:
			// ִ�������Ϸ����
			gameRules();
			welcome();
			break;
		case 3:
			//ִ�н�����Ϸ
			gameOver();
			break;
		default:
			System.out.println("��������,����������");
			welcome();
			break;
		}
	}
	/*
	 * ����������Ϸ��ɫ������:���  
	      ��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)
	      �����ɹ�!!!
	 * */
	// ������ʼ��Ϸ�ķ���
	public static void createNewGame() {
		// ����һ����������Ž�ɫ��Ϣ
		// ����
		GamePlayer[] players = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("����������Ϸ��ɫ������:");
		String name = scanner.next();
		System.out.println("��������Ϸ��ɫ������:(1.���� 2.���� 3.���� 4.���� 5.Ԫ��)");
	    int race = scanner.nextInt();
	    // ������Ϸ��ɫ
	    GamePlayer gp = new GamePlayer();
	    gp.name = name;
	    gp.race = race;
	    // ��Ϸ��ɫ��������+1
	    GamePlayer[] copyOf = Arrays.copyOf(players, players.length+1);
	    copyOf[copyOf.length-1] = gp;
	    // �ж�
	    if(copyOf != null) {
	    	System.out.println("�����ɹ�");
	    	System.out.println("����Ӣ������:"+gp.name);
	    	System.out.println("����Ӣ�������:"+gp.race);
	    	int power = gp.getPower();
	    	System.out.println("����Ӣ��������ʶΪ:"+power);
	    }
	    welcome();
	}
	// ������Ϸ����ķ���
	public static void gameRules() {
		System.out.println("������Ϸ���򡷡�����");
	}
	
	// ������Ϸ�ķ���
	public static void gameOver() {
		System.exit(0);
	}
}