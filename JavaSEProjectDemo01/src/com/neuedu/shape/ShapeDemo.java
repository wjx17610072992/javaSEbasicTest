package com.neuedu.shape;

public class ShapeDemo {
	 public static void main(String[] args) {
		Shape a = new Circle(5, 5, 5);
		Point b = new Point(0, 0);
		
		System.out.println(a.area());
		System.out.println(a.contains(b));

	 }
}
