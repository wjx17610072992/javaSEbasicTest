package com.neuedu.Question;

import java.util.Arrays;

/**
 * @ClassName:Question
 * @Description: ��ѡ
 * @author neuedu_wjx
 * @date 2019��8��12��15:41:24
 */
public class MultiChoice extends Question {
	// ѡ��
	String[] options;
	
	// ��ѡ��
	int[] answers;
	// ������
	public MultiChoice(String text,String[] options, int[] answers) {
		this.text = text;
		this.options = options;
		this.answers = answers;
	}
	
	@Override
	public boolean check(int[] as) {
		// �жϴ��Ƿ�Ϊnull
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
