package com.neuedu.test2;
/**
 * @author neuedu_wjx
 * @version 1.0
 * @since 08.08
 * */
import java.lang.Math;
public class Circle{
	// Բ�뾶
	int r;
	Point p;



	
		// ����Բ���
		public double getArea() {
			return Math.PI*this.r*this.r;
		}

		// ����Բ�Ƿ����ָ���ĵ�
		public boolean contains(Point p2) {
			Point point = new Point(1,1);
			 double instance = point.getInstance(2, 2);
			 if(instance<=r) {
				 return true;
			 }else {
				 return false;
			 }

		}
		public class Point {
			int x;
			int y;
			public Point(int x,int y){
				this.x=x;
				this.y=y;
			}
			public double getInstance(int x1,int y1) {
				return Math.sqrt(Math.pow((this.x-x1),2)+Math.pow((this.y-y1),2));
			}
		}
	
}













/*public class Test1 {
	public static void main(String[] args) {
		Circle c = new Circle(5);
		// �ܳ�
		System.out.println(c.getPerimeter());
		// �뾶
		System.out.println(c.getRadius());

	}
}*/
