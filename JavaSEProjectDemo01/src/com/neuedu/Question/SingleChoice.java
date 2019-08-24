package com.neuedu.Question;
/**
 * @ClassName:Question
 * @Description: ��ѡ
 * @author neuedu_wjx
 * @date 2019��8��12��15:41:24
 */ 
public class SingleChoice extends Question {
	// ѡ��
	String[] options;
	
	// ��ѡ��
	int answer;
	// ������
	public SingleChoice(String text,String[] options, int answer) {
		this.text = text;
		this.options = options;
		this.answer = answer;
	}
	
	@Override
	public boolean check(int[] as) {
		return this.answer == as[0];
	}
	
	
}
