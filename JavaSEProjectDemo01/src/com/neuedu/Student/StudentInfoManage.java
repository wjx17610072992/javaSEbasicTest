package com.neuedu.Student;

import java.security.KeyStore.Entry.Attribute;
import java.util.Arrays;
import java.util.Scanner;

public class StudentInfoManage {
	static Student[] students = {};
	public static void main(String[] args) {
		welcome();
	}
	public String userName;
	public String pwd;
	public static void welcome() {
		System.out.println("--------------------------------欢迎 登录学生信息管理系统---------------------------------");
	    System.out.println("                   1.登录                                                                                2.退出");
	    System.out.println("-----------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择：");
	    int num = scanner.nextInt();
	    switch (num) {
		case 1:
			login();
			break;
		case 2:
			back();		
			break;
		default:
			break;
		}
	}
	public static void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎登录！");
		System.out.println("请输入用户名：");
		String userNames = scanner.next(); 
		System.out.println("请输入密码：");
		String pwds = scanner.next();
		if(userNames=="admin" && pwds=="admin") 	
		System.out.println("登录成功");
	    System.out.println("欢迎您，admin");
			operateStudentInfo();
		
	}
	public static void back() {
		System.exit(0);
	}
	//操作
	public static void operateStudentInfo() {
		System.out.println("------------------------------选择要操作的信息对应信息-----------------------------------");
	    System.out.println("*1.查看学生信息       2.添加学生信息       3.删除学生信息       4.修改学生信息       5.退出");
	    System.out.println("-----------------------------------------------------------------------------------");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("请选择：");
	    int operate = scanner.nextInt();
	    switch (operate) {
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
        	back();
			break;
		default:
			break;
		}
	}

	//2.添加学生信息
	public static void getAddStudentInfo() {
		System.out.println("--------------------------------------添加学生信息-----------------------------------");
		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入学生id:");
//		String id = scanner.next();
//		if(id=="3") {
//			System.out.println("此id3已存在，请重新输入：");
//		}
		System.out.println("请输入学生id:");
		String id1 = scanner.next();
		System.out.println("请输入学生姓名：");
		String name = scanner.next();
		System.out.println("请输入学生性别：");
		char sex = scanner.next().charAt(0);
		System.out.println("请输入学生年龄（只能1-120之内的数字）：");
		int age = scanner.nextInt();
		System.out.println("请输入学生所属年级（只能初级、中级、高级）");
		String grade = scanner.next();
		System.out.println("请输入学生地址：");
		String address = scanner.next();
		System.out.println("请输入学生联系方式（11位手机号码）：");
		String phone = scanner.next();
		System.out.println("请输入学生电子邮箱（包含@和.com）");
		String email = scanner.next();
		Student student = new Student();
		student.id = id1;
		student.name = name;
		student.sex = sex;
		student.age = age;
		student.grade = grade;
		student.address = address;
		student.phone = phone;
		student.email  =email;
		students =Arrays.copyOf(students, students.length+1);
		students[students.length-1] = student;
		if(students!=null) {
			System.out.println("数据保存成功，系统将自动返回上层~");
		}
		operateStudentInfo();	
	}
	//1.查看学生信息
	public static void queryStudentInfo() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("+ 1.查看所有学生信息                   2.根据id查询学生信息                    3.根据id查询学生姓名                     4.返回上一层");
		System.out.println("-----------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择菜单：");
		int menu = scanner.nextInt();
		switch (menu) {
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
			operateStudentInfo();
			break;
		default:
			break;
		}
	}
	//1.1查看所有学生信息
	public static void queryWholeStudentInfo() {
		for (int i = 0; i < students.length; i++) 
		System.out.println(students[i]);
	    operateStudentInfo();
	}
	//1.2根据id查询学生信息
	public static void queryStudentInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询的id:");
		String id2 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id2)) {
				System.out.println(students[i]);
			}
		}
		System.out.println("数据查询完毕，系统将自动返回目录.......");
		queryStudentInfo();
	}
	//1.3根据id查询学生姓名
	public static void queryStudentNameById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询的id:");
		String id3 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id3)) {
				System.out.println(students[i].name);
			}
		}
		System.out.println("数据查询完毕，系统将自动返回目录.......");
		queryStudentInfo();
	}
	//3.删除学生信息
	public static void deleteStudentInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要删除学生的id:");
		String id4 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id4)) {
				//删除
				students[i] = students[students.length-1];
				students = Arrays.copyOf(students, students.length-1);
			}
		}
		System.out.println("删除成功");
		operateStudentInfo();
	}
	//4.修改学生信息
	public static void updateStudentInfo() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1.根据ID修改学生全部信息                     2.根据ID修改学生部分信息                     3.返回上级目录                      4.系统退出");
		System.out.println("-----------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请选择：");
		int select = scanner.nextInt();
		switch (select) {
		case 1:
			updateStudentInfoById();
			break;
        case 2:
        	updateStudentPartInfoById();
			break;
        case 3:
        	operateStudentInfo();
			break;
        case 4:
        	back();
			break;
		default:
			break;
		}
		
	}
	//4.1根据ID修改学生全部信息
	public static void updateStudentInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要修改的ID:");
		String id = scanner.next();
		System.out.println("请输入修改后的学生姓名：");
		String name1 = scanner.next();
		System.out.println("请输入修改后的学生性别：");
		char sex1 = scanner.next().charAt(0);
		System.out.println("请输入修改后的学生年龄（只能1-120之内的数字）：");
		int age1 = scanner.nextInt();
		System.out.println("请输入修改后的学生所属年级（只能初级、中级、高级）");
		String grade1 = scanner.next();
		System.out.println("请输入修改后的学生地址：");
		String address1 = scanner.next();
		System.out.println("请输入修改后的学生联系方式（11位手机号码）：");
		String phone1 = scanner.next();
		System.out.println("请输入修改后的学生电子邮箱（包含@和.com）");
		String email1 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id)) {
				students[i].name = name1;
				students[i].sex = sex1;
				students[i].age = age1;
				students[i].grade = grade1;
				students[i].address = address1;
				students[i].phone = phone1;
				students[i].email = email1;
				System.out.println("修改成功");
				System.out.println("系统自动返回上层目录.......");
				System.out.println("修改后的信息为：["+students[i]+"]");
			}
		}
		updateStudentInfo();
		
	}
	
	//4.2根据ID修改学生部分信息
	public static void updateStudentPartInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要修改的ID:");
		String id = scanner.next();
		System.out.println("请输入要修改的属性:");
		String attribute = scanner.next();
		switch (attribute) {
		case "age":
			updateStudentAgeInfoById();
			break;
		case "sex":
			updateStudentSexInfoById();
			break;
		case "grade":
			updateStudentGradeInfoById();
			break;
		case "address":
			updateStudentAddressInfoById();
			break;
		case "phone":
			updateStudentPhoneInfoById();
			break;
		case "email":
			updateStudentEmailInfoById();
			break;

		default:
			break;
		}
		
		
	}
	//4.2:->根据ID修改学生年龄
	public static void updateStudentAgeInfoById() {
		Scanner scanner  =new Scanner(System.in);
		System.out.println("请输入你要修改的数据：");
		int age2 = scanner.nextInt();
		for (int i = 0; i < students.length; i++) {
			students[i].age = age2;
		}
		System.out.println("修改成功");
		updateStudentInfo();
	}
	//4.2:->根据ID修改学生性别
		public static void updateStudentSexInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("请输入你要修改的数据：");
			char sex2 = scanner.next().charAt(0);
			for (int i = 0; i < students.length; i++) {
				students[i].sex = sex2;
			}
			System.out.println("修改成功");
			updateStudentInfo();
		}
		//4.2:->根据ID修改学生年级
		public static void updateStudentGradeInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("请输入你要修改的数据：");
			String grade2 = scanner.next();
			for (int i = 0; i < students.length; i++) {
				students[i].grade = grade2;
			}
			System.out.println("修改成功");
			updateStudentInfo();
		}
		//4.2:->根据ID修改学生地址
				public static void updateStudentAddressInfoById() {
					Scanner scanner  =new Scanner(System.in);
					System.out.println("请输入你要修改的数据：");
					String address2 = scanner.next();
					for (int i = 0; i < students.length; i++) {
						students[i].address = address2;
					}
					System.out.println("修改成功");
					updateStudentInfo();
				}
		//4.2:->根据ID修改学生联系方式
		public static void updateStudentPhoneInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("请输入你要修改的数据：");
			String phone2 = scanner.next();
			for (int i = 0; i < students.length; i++) {
				students[i].phone = phone2;
			}
			System.out.println("修改成功");
			updateStudentInfo();
		}
		//4.2:->根据ID修改学生邮箱
		public static void updateStudentEmailInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("请输入你要修改的数据：");
			String email2 = scanner.next();
			for (int i = 0; i < students.length; i++) {
				students[i].email = email2;
			}
			System.out.println("修改成功");
			updateStudentInfo();
		}
}
