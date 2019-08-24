package com.neuedu.test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 客户端
 * @author neuedu_yhl
 */
public class Clienta {
	
	public static void main(String[] args) {
		welcome();
	}
	

    // 写一个方法 输出欢迎界面
	public static void welcome() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("============================");
		System.out.println("==============欢迎来到王者荣耀...==============");
		System.out.println("============================");
		System.out.println("1.开始游戏...");
		System.out.println("2.游戏规则...");
		System.out.println("3.结束游戏...");
		System.out.println("请输入您想进行的操作:(1-3)");
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
			//执行结束游戏
			gameOver();
			break;
		default:
			System.out.println("输入有误,请重新输入");
			welcome();
			break;
		}
	}
	/*
	 * 请输入您游戏角色的姓名:李白  
	      请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)
	      创建成功!!!
	 * */
	// 创建开始游戏的方法
	public static void createNewGame() {
		// 创建一个容器来存放角色信息
		// 数组
		GamePlayer[] players = {};
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您游戏角色的姓名:");
		String name = scanner.next();
		System.out.println("请输入游戏角色的种族:(1.人类 2.精灵 3.兽人 4.矮人 5.元素)");
	    int race = scanner.nextInt();
	    // 构建游戏角色
	    GamePlayer gp = new GamePlayer();
	    gp.name = name;
	    gp.race = race;
	    // 游戏角色容器长度+1
	    GamePlayer[] copyOf = Arrays.copyOf(players, players.length+1);
	    copyOf[copyOf.length-1] = gp;
	    // 判断
	    if(copyOf != null) {
	    	System.out.println("创建成功");
	    	System.out.println("您的英雄名叫:"+gp.name);
	    	System.out.println("您的英雄种族叫:"+gp.race);
	    	int power = gp.getPower();
	    	System.out.println("您的英雄力量初识为:"+power);
	    }
	    welcome();
	}
	// 创建游戏规则的方法
	public static void gameRules() {
		System.out.println("这是游戏规则》。。。");
	}
	
	// 结束游戏的方法
	public static void gameOver() {
		System.exit(0);
	}
}