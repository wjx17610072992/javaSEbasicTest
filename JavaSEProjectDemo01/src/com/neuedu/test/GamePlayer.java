package com.neuedu.test;

import java.util.Random;

public class GamePlayer {
	// 姓名
	public String name;
	// 性别
	public char sex;
	// 种族
	public int race;
	// 职业
	public String professional;
	// 力量
	public int power;
	// 敏捷
	public int agile;
	// 体力
	public int physical;
	//智慧
	public int wisdom;
	//智力
	public int intelligence;
	// 生命值
	public int php;
	// 魔法值
	public int mp;
	
	
	
	// 随机生成力量的方法
	public int getPower() {
		Random random = new Random();
		int nextInt = random.next(10000);
		return nextInt;
	}
	

}
