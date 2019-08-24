package com.neuedu.shape;

/**
* @ClassName: Point
* @Description: 点
* @author neuedu_wjx
* @date 2019年8月14日 下午7:52:59
*
*/
public class Point {
	public int x;
	public int y;
	
	// 构造器
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	// 当前点到原地的距离
	public double distance() {
		return Math.sqrt(this.x * this.x+this.y * this.y);
	}
	
	
	public double distance(int x , int y) {
		return Math.sqrt((this.x-x) * (this.x-x)+(this.y-y) * (this.y-y));
	}
	
	
	
	
	
	
}
