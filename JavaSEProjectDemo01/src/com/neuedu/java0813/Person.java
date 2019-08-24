package com.neuedu.java0813;

public class Person {
	private String name;
	private int age;
	private int height;
	
	
	// 提供公有的方法  放
	
	public void setAge(int age) {
		if(age<=0) {
			this.age=0;
		}else {
			this.age = age;
		}
	}
	//拿 方法
	/* public int getAge() {
		 
		 return this.age; 
	 }
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}*/


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getAge() {
		return age;
	}
	
	
	
	
	
	
	
}
