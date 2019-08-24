package com.neuedu.Student;

import java.util.Arrays;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class StudentManagement1 {
	static StudentJx[] students = {};
	public static void main(String[] args) {
		welcome();
	}
	public String userName;
	public String pwd;
	public static void welcome() {
		System.out.println("--------欢迎登陆学生信息管理系统--------");
		System.out.println("          1.登陆      2.退出");
		System.out.println("----------------------------------------");
		Scanner scanner=new Scanner(System.in);
		System.out.println("请选择");
		int num = scanner.nextInt();
		switch(num){
			case 1:
				login();
				break;
			
			case 2:	
				over();
				break;
			default:
				break;	
		}
	}
	public static void login() {
		System.out.println("欢迎登陆！");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userNames = scanner.next();
		System.out.println("请输入密码：");
		String pwds = scanner.next();
		String abc = "admin";
		if(userNames.equals(abc) && pwds.equals(abc)){
			System.out.println("登陆成功");
			System.out.println("欢迎您：admin");
			operateStudentInof();
			}else {System.out.println("请输入正确的账号及密码！");
			System.exit(0);
				}		
	}
	public static void over(){
		System.exit(0);
	}
	// 操作
	public static void operateStudentInof() {
		System.out.println("--------------------------------------------------");
		System.out.println("*1.查看学生信息   2.添加学生信息   3.删除学生信息  4.修改学生信息  5.退出");
		System.out.println("---------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择：");
		int num2 = scanner.nextInt();
		switch (num2) {
		case 1:
			queryStudentInfo();
			break;
		case 2:
			getAddStudentInfo();
			break;
		case 3:
			deleteStudentInfoById();
			break;
		case 4:
			updateStudentInfo();
			break;
		case 5:
			over();
			break;
		default:
			break;
		}
	}
	 // 2添加学生信息
	public static void getAddStudentInfo() {
		System.out.println("------  ------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的id：");
		String id1 = scanner.next();
		System.out.println("请输入学生的姓名：");
		String name1 = scanner.next();
		System.out.println("请输入学生的性别：");
		char sex1 = scanner.next().charAt(0);
		System.out.println("请输入学生的年龄(只能是1-120之内的数字)：");
		int age1 = scanner.nextInt();
		System.out.println("请输入学生的所属年级(只能初级、中级、高级)：");
		String grade1 = scanner.next();
		System.out.println("请输入学生的地址：");
		String address1 = scanner.next();
		System.out.println("请输入学生的联系方式(11位手机号码)：");
		String phone1 = scanner.next();
		System.out.println("请输入学生的电子邮箱(包含@和.com)：");
		String email1 = scanner.next();
		 StudentJx studentJx = new StudentJx();
		 studentJx.id = id1;
		 studentJx.name = name1;
		 studentJx.age = age1;
		 studentJx.sex = sex1;
		 studentJx.grade = grade1;
		 studentJx.address = address1;
		 studentJx.phone = phone1;
		 studentJx.email = email1;
		 students = Arrays.copyOf(students,students.length+1);
		 students[students.length-1] = studentJx;
		 if(students!=null) {
			 System.out.println("数据保存成功，系统将自动返回上一层");
		 }
		 operateStudentInof();	
	}
		 
		public static void queryStudentInfo() {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("+ 1.查看所有学生信息                   2.根据id查询学生信息                    3.根据id查询学生姓名                     4.返回上一层");
			System.out.println("-----------------------------------------------------------------------------------");
			Scanner scanner = new Scanner(System.in);
			System.out.println("请选择：");
			int num3 = scanner.nextInt();
			switch (num3) {
			case 1:
				queryWholeStudentInfo();
				break;
			case 2:
				queryStudentInfoById();
				break;
			case 3:
				queryStudentNameById();
				break;
			case 4:
				operateStudentInof();
				break;
			default:
				break;
			}
		}
	// 1.1查看所有学生的信息
		public static void queryWholeStudentInfo(){
			for(int i =0;i<students.length;i++) {
				System.out.println(students[i]);
				operateStudentInof();
			}
		}
	
	// 1.2根据id查询学生信息
		public static void queryStudentInfoById() {
			Scanner scanner =new Scanner(System.in);
			System.out.println("请输入要查询的id：");
			String id2 = scanner.next();
			for(int i =0;i<students.length;i++) {
				if(students[i].id.equals(id2)) {
					System.out.println(students[i]);
				}
			}
			System.out.println("数据查询完毕，系统将自动返回目录···：");
			queryStudentInfo();
		}
	
	// 1.3根据id查询学生姓名
		public static void queryStudentNameById() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要查询的id：");
			String id3 = scanner.next();
			for(int i = 0;i<students.length;i++) {
				if(students[i].id.equals(id3)) {
					System.out.println("students[i].name");
				}
			}
		System.out.println("数据查询完毕，系统将自动返回目录···");
		queryStudentInfo();
		
		}
		
	// 3.删除学生信息
		public static void deleteStudentInfoById() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("请输入要删除学生的id：");
			String id4 = scanner.next();
			for(int i = 0;i<students.length;i++) {
				if(students[i].id.equals(id4)) {
					//删除学生信息
					students[i] = students[students.length-1];
					students = Arrays.copyOf(students, students.length-1);
				}
			}
			System.out.println("删除成功：");
			operateStudentInof();	
		}
		
		//4.修改学生信息
		public static void updateStudentInfo() {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("1.根据ID修改学生全部信息                     2.根据ID修改学生部分信息                     3.返回上级目录                      4.系统退出");
			System.out.println("-----------------------------------------------------------------------------------");
			Scanner scanner=new Scanner(System.in);
			System.out.println("请选择：");
			int select = scanner.nextInt();
		}
	
	
	
	
	
	
	
	
	
}

