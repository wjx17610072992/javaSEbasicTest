package com.neuedu.shape;

/**
* @ClassName: Shape
* @Description: ͼ����
* @author neuedu_wjx
* @date 2019��8��14�� ����7:28:55
*
*/
public abstract class Shape {
	protected Point location;
	
	//���󷽷��������
	public abstract double area();
	
	public boolean contains(Point p) {
		return contains(p.x,p.y);
	}
	public abstract boolean contains(int x,int y);
	
	
	
	
	
}
