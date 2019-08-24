package com.neuedu.Question;

import java.util.Arrays;

/**
 * @ClassName:Question
 * @Description: 多选
 * @author neuedu_wjx
 * @date 2019年8月12日15:41:24
 */
public class MultiChoice extends Question {
	// 选项
	String[] options;
	
	// 多选答案
	int[] answers;
	// 构造器
	public MultiChoice(String text,String[] options, int[] answers) {
		this.text = text;
		this.options = options;
		this.answers = answers;
	}
	
	@Override
	public boolean check(int[] as) {
		// 判断答案是否为null
		if(answers != null && as.length==answers.length) {
			Arrays.sort(as);
			for(int i=0;i<as.length;i++) {
				if(as[i] != answers[i]) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
