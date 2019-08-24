package com.neuedu.Question;
/**
 * @ClassName:Question
 * @Description: 单选
 * @author neuedu_wjx
 * @date 2019年8月12日15:41:24
 */ 
public class SingleChoice extends Question {
	// 选项
	String[] options;
	
	// 单选答案
	int answer;
	// 构造器
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
