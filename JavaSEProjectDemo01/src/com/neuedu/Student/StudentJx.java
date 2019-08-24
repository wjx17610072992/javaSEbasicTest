package com.neuedu.Student;

public class StudentJx {
	
	public String id;
	public String name;
	public char sex;
	public int age;
	public String grade;
	public String address;
	public String phone;
	public String email;
	 
	
	public StudentJx() {
		
	}
	
	public StudentJx(String id, String name, char sex, int age, String grade, String address, String phone,
			String email) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}


	@Override
	public String toString() {
		return "StudentJx [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", grade=" + grade
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
