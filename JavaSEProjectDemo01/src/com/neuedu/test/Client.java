package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
	// �ͻ���
	public static void main(String[] args) {
		welcome();
	}

	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===========");
		System.out.println("����һ��RPG��Ϸ");
		System.out.println("===========");
		System.out.println("1.��ʼ��Ϸ");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ");
		System.out.print("������������еĲ���:(1-3)");
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
			// ִ����Ϸ����
			gameOver();
			break;
		default:
			System.out.println("������������������");
			welcome();
			break;
		}
	}

	// ������ʼ��Ϸ
	public static void createNewGame() {
		// ������һ����������Ž�ɫ��Ϣ
		// ����
		GamePlayer[] player = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("������������Ϸ��ɫ����:");
		String name = scanner.next();
		System.out.print("�������ɫ������:��1���ࡢ2���顢3���ˡ�4���ˡ�5Ԫ�أ�");
		int race = scanner.nextInt();
		//������Ϸ��ɫ
		GamePlayer gp = new GamePlayer();
		gp.name = name;
		gp.race = race;
		// ��Ϸ��ɫ��������+1
		GamePlayer[] copyOf= Arrays.copyOf(player, player.length+1);
		copyOf[copyOf.length-1] = gp;
	}
	// ������Ϸ����ķ���
	public static void gameRules() {
		System.out.println("��Ϸ������ǳ�ֵ");
	}
	// ������Ϸ�ķ���
	public static void gameOver() {
		System.out.println("��Ϸ����");
		System.exit(0);
	}
}










