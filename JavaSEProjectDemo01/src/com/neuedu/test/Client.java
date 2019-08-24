package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

public class Client {
	// 客户端
	public static void main(String[] args) {
		welcome();
	}

	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("===========");
		System.out.println("这是一个RPG游戏");
		System.out.println("===========");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.结束游戏");
		System.out.print("请输入您想进行的操作:(1-3)");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			// 执行开始游戏
			createNewGame();
			break;
		case 2:
			// 执行输出游戏规则
			gameRules();
			welcome();
			break;
		case 3:
			// 执行游戏结束
			gameOver();
			break;
		default:
			System.out.println("输入有误请重新输入");
			welcome();
			break;
		}
	}

	// 创建开始游戏
	public static void createNewGame() {
		// 创建有一个容器来存放角色信息
		// 数组
		GamePlayer[] player = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您的游戏角色名字:");
		String name = scanner.next();
		System.out.print("请输入角色的种族:（1人类、2精灵、3兽人、4矮人、5元素）");
		int race = scanner.nextInt();
		//构建游戏角色
		GamePlayer gp = new GamePlayer();
		gp.name = name;
		gp.race = race;
		// 游戏角色容器长度+1
		GamePlayer[] copyOf= Arrays.copyOf(player, player.length+1);
		copyOf[copyOf.length-1] = gp;
	}
	// 创建游戏规则的方法
	public static void gameRules() {
		System.out.println("游戏规则就是充值");
	}
	// 结束游戏的方法
	public static void gameOver() {
		System.out.println("游戏结束");
		System.exit(0);
	}
}










