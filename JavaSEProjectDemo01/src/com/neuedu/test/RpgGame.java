package com.neuedu.test;
import java.util.*;

import java.util.Scanner;

public class RpgGame {
	// ����
	String name;
	// �Ա�
	char sex;
	// ����
	String race;
	// ְҵ
	String occupation;
	// ����
	int strength=0;
	// ����
	int smart=0;
	// ����
	int body=0;
	// ����
	int talent=0;
	// �ǻ�
	int wisdom=0;
	// ����ֵ
	int life=0;
	// ħ��ֵ
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
		System.out.println("����һ��RPG��Ϸ");
		System.out.println("1.��ʼ��Ϸ");
		System.out.println("2.��Ϸ����");
		System.out.println("3.������Ϸ");
		System.out.print("������������еĲ���(1-3):");
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
			System.out.println("�˳�ϵͳ");
		}	
		}
		
	}
	

	// ��Ϸ����
	 class rule1{
		 public void rule(){
		System.out.println("��ӭ������;��Ϸ�������ְҵѡ���������Ƶġ�");
		
		
		
	}
}
	
	





