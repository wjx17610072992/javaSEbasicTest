package com.neuedu.shape;

/**
* @ClassName: Point
* @Description: ��
* @author neuedu_wjx
* @date 2019��8��14�� ����7:52:59
*
*/
public class Point {
	public int x;
	public int y;
	
	// ������
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// ��ǰ�㵽ԭ�صľ���
	public double distance() {
		return Math.sqrt(this.x * this.x+this.y * this.y);
	}
	
	
	public double distance(int x , int y) {
		return Math.sqrt((this.x-x) * (this.x-x)+(this.y-y) * (this.y-y));
	}
	
	
	
	
	
	
}
