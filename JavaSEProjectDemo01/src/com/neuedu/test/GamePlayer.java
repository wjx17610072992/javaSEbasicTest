package com.neuedu.test;

import java.util.Random;

public class GamePlayer {
	// ����
	public String name;
	// �Ա�
	public char sex;
	// ����
	public int race;
	// ְҵ
	public String professional;
	// ����
	public int power;
	// ����
	public int agile;
	// ����
	public int physical;
	//�ǻ�
	public int wisdom;
	//����
	public int intelligence;
	// ����ֵ
	public int php;
	// ħ��ֵ
	public int mp;
	
	
	
	// ������������ķ���
	public int getPower() {
		Random random = new Random();
		int nextInt = random.next(10000);
		return nextInt;
	}
	

}
