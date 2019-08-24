package com.neuedu.shape;

/**
* @ClassName: Shape
* @Description: 图形类
* @author neuedu_wjx
* @date 2019年8月14日 下午7:28:55
*
*/
public abstract class Shape {
	protected Point location;
	
	//抽象方法计算面积
	public abstract double area();
	
	public boolean contains(Point p) {
		return contains(p.x,p.y);
	}
	public abstract boolean contains(int x,int y);
	
	
	
	
	
}
