package com.neuedu.shape;

public class Circle extends Shape {
	private int r;
	
	 public Circle(int x, int y, int r) {
		location = new Point(x, y);
		this.r =r;
	}
	
	
// 求圆面积的方法
	@Override
	public double area() {
		return Math.PI * r * r;
	}
// 判断点是否在圆内的方法
	@Override
	public boolean contains(int x, int y) {
		
		return this.location.distance(x,y)<=r;
	}

}
