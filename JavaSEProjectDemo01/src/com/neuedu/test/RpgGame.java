package com.neuedu.test;
import java.util.*;

import java.util.Scanner;

public class RpgGame {
	// 名字
	String name;
	// 性别
	char sex;
	// 种族
	String race;
	// 职业
	String occupation;
	// 力量
	int strength=0;
	// 敏捷
	int smart=0;
	// 体力
	int body=0;
	// 智力
	int talent=0;
	// 智慧
	int wisdom=0;
	// 生命值
	int life=0;
	// 魔法值
	int magic=0;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public RpgGame(String name, char sex, String race, String occupation, int strength, int smart, int body, int talent,
			int wisdom, int life, int magic) {
		super();
		this.name = name;
		this.sex = sex;
		this.race = race;
		this.occupation = occupation;
		this.strength = strength;
		this.smart = smart;
		this.body = body;
		this.talent = talent;
		this.wisdom = wisdom;
		this.life = life;
		this.magic = magic;
	}

















	public static void main(String[] args) {
		System.out.println("这是一个RPG游戏");
		System.out.println("1.开始游戏");
		System.out.println("2.游戏规则");
		System.out.println("3.结束游戏");
		System.out.print("请输入您想进行的操作(1-3):");
		Scanner xx = new Scanner(System.in);
		int num = xx.nextInt();
		switch(num) {
		case 1:
			Start g=new Start();
			g.start();
			break;
		
		case 2:
			rule1 r=new rule1();
			r.rule();
			break;
			
		case 3:
			System.out.println("退出系统");
		}	
		}
		
	}
	

	// 游戏规则
	 class rule1{
		 public void rule(){
		System.out.println("欢迎来到征途游戏，种族和职业选择是有限制的。");
		
		
		
	}
}
	
	





