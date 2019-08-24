package com.neuedu.shape;

public class Circle extends Shape {
	private int r;
	
	 public Circle(int x, int y, int r) {
		location = new Point(x, y);
		this.r =r;
	}
	
	
// ��Բ����ķ���
	@Override
	public double area() {
		return Math.PI * r * r;
	}
// �жϵ��Ƿ���Բ�ڵķ���
	@Override
	public boolean contains(int x, int y) {
		
		return this.location.distance(x,y)<=r;
	}

}
