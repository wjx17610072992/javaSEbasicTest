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
		System.out.println("--------------------------------��ӭ ��¼ѧ����Ϣ����ϵͳ---------------------------------");
	    System.out.println("                   1.��¼                                                                                2.�˳�");
	    System.out.println("-----------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��");
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
		System.out.println("��ӭ��¼��");
		System.out.println("�������û�����");
		String userNames = scanner.next(); 
		System.out.println("���������룺");
		String pwds = scanner.next();
		if(userNames=="admin" && pwds=="admin") 	
		System.out.println("��¼�ɹ�");
	    System.out.println("��ӭ����admin");
			operateStudentInfo();
		
	}
	public static void back() {
		System.exit(0);
	}
	//����
	public static void operateStudentInfo() {
		System.out.println("------------------------------ѡ��Ҫ��������Ϣ��Ӧ��Ϣ-----------------------------------");
	    System.out.println("*1.�鿴ѧ����Ϣ       2.���ѧ����Ϣ       3.ɾ��ѧ����Ϣ       4.�޸�ѧ����Ϣ       5.�˳�");
	    System.out.println("-----------------------------------------------------------------------------------");
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("��ѡ��");
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

	//2.���ѧ����Ϣ
	public static void getAddStudentInfo() {
		System.out.println("--------------------------------------���ѧ����Ϣ-----------------------------------");
		Scanner scanner = new Scanner(System.in);
//		System.out.println("������ѧ��id:");
//		String id = scanner.next();
//		if(id=="3") {
//			System.out.println("��id3�Ѵ��ڣ����������룺");
//		}
		System.out.println("������ѧ��id:");
		String id1 = scanner.next();
		System.out.println("������ѧ��������");
		String name = scanner.next();
		System.out.println("������ѧ���Ա�");
		char sex = scanner.next().charAt(0);
		System.out.println("������ѧ�����䣨ֻ��1-120֮�ڵ����֣���");
		int age = scanner.nextInt();
		System.out.println("������ѧ�������꼶��ֻ�ܳ������м����߼���");
		String grade = scanner.next();
		System.out.println("������ѧ����ַ��");
		String address = scanner.next();
		System.out.println("������ѧ����ϵ��ʽ��11λ�ֻ����룩��");
		String phone = scanner.next();
		System.out.println("������ѧ���������䣨����@��.com��");
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
			System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�~");
		}
		operateStudentInfo();	
	}
	//1.�鿴ѧ����Ϣ
	public static void queryStudentInfo() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("+ 1.�鿴����ѧ����Ϣ                   2.����id��ѯѧ����Ϣ                    3.����id��ѯѧ������                     4.������һ��");
		System.out.println("-----------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��˵���");
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
	//1.1�鿴����ѧ����Ϣ
	public static void queryWholeStudentInfo() {
		for (int i = 0; i < students.length; i++) 
		System.out.println(students[i]);
	    operateStudentInfo();
	}
	//1.2����id��ѯѧ����Ϣ
	public static void queryStudentInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ��id:");
		String id2 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id2)) {
				System.out.println(students[i]);
			}
		}
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼.......");
		queryStudentInfo();
	}
	//1.3����id��ѯѧ������
	public static void queryStudentNameById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ��id:");
		String id3 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id3)) {
				System.out.println(students[i].name);
			}
		}
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼.......");
		queryStudentInfo();
	}
	//3.ɾ��ѧ����Ϣ
	public static void deleteStudentInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫɾ��ѧ����id:");
		String id4 = scanner.next();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id.equals(id4)) {
				//ɾ��
				students[i] = students[students.length-1];
				students = Arrays.copyOf(students, students.length-1);
			}
		}
		System.out.println("ɾ���ɹ�");
		operateStudentInfo();
	}
	//4.�޸�ѧ����Ϣ
	public static void updateStudentInfo() {
		System.out.println("-----------------------------------------------------------------------------------");
		System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ                     2.����ID�޸�ѧ��������Ϣ                     3.�����ϼ�Ŀ¼                      4.ϵͳ�˳�");
		System.out.println("-----------------------------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��");
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
	//4.1����ID�޸�ѧ��ȫ����Ϣ
	public static void updateStudentInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ID:");
		String id = scanner.next();
		System.out.println("�������޸ĺ��ѧ��������");
		String name1 = scanner.next();
		System.out.println("�������޸ĺ��ѧ���Ա�");
		char sex1 = scanner.next().charAt(0);
		System.out.println("�������޸ĺ��ѧ�����䣨ֻ��1-120֮�ڵ����֣���");
		int age1 = scanner.nextInt();
		System.out.println("�������޸ĺ��ѧ�������꼶��ֻ�ܳ������м����߼���");
		String grade1 = scanner.next();
		System.out.println("�������޸ĺ��ѧ����ַ��");
		String address1 = scanner.next();
		System.out.println("�������޸ĺ��ѧ����ϵ��ʽ��11λ�ֻ����룩��");
		String phone1 = scanner.next();
		System.out.println("�������޸ĺ��ѧ���������䣨����@��.com��");
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
				System.out.println("�޸ĳɹ�");
				System.out.println("ϵͳ�Զ������ϲ�Ŀ¼.......");
				System.out.println("�޸ĺ����ϢΪ��["+students[i]+"]");
			}
		}
		updateStudentInfo();
		
	}
	
	//4.2����ID�޸�ѧ��������Ϣ
	public static void updateStudentPartInfoById() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Ҫ�޸ĵ�ID:");
		String id = scanner.next();
		System.out.println("������Ҫ�޸ĵ�����:");
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
	//4.2:->����ID�޸�ѧ������
	public static void updateStudentAgeInfoById() {
		Scanner scanner  =new Scanner(System.in);
		System.out.println("��������Ҫ�޸ĵ����ݣ�");
		int age2 = scanner.nextInt();
		for (int i = 0; i < students.length; i++) {
			students[i].age = age2;
		}
		System.out.println("�޸ĳɹ�");
		updateStudentInfo();
	}
	//4.2:->����ID�޸�ѧ���Ա�
		public static void updateStudentSexInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("��������Ҫ�޸ĵ����ݣ�");
			char sex2 = scanner.next().charAt(0);
			for (int i = 0; i < students.length; i++) {
				students[i].sex = sex2;
			}
			System.out.println("�޸ĳɹ�");
			updateStudentInfo();
		}
		//4.2:->����ID�޸�ѧ���꼶
		public static void updateStudentGradeInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("��������Ҫ�޸ĵ����ݣ�");
			String grade2 = scanner.next();
			for (int i = 0; i < students.length; i++) {
				students[i].grade = grade2;
			}
			System.out.println("�޸ĳɹ�");
			updateStudentInfo();
		}
		//4.2:->����ID�޸�ѧ����ַ
				public static void updateStudentAddressInfoById() {
					Scanner scanner  =new Scanner(System.in);
					System.out.println("��������Ҫ�޸ĵ����ݣ�");
					String address2 = scanner.next();
					for (int i = 0; i < students.length; i++) {
						students[i].address = address2;
					}
					System.out.println("�޸ĳɹ�");
					updateStudentInfo();
				}
		//4.2:->����ID�޸�ѧ����ϵ��ʽ
		public static void updateStudentPhoneInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("��������Ҫ�޸ĵ����ݣ�");
			String phone2 = scanner.next();
			for (int i = 0; i < students.length; i++) {
				students[i].phone = phone2;
			}
			System.out.println("�޸ĳɹ�");
			updateStudentInfo();
		}
		//4.2:->����ID�޸�ѧ������
		public static void updateStudentEmailInfoById() {
			Scanner scanner  =new Scanner(System.in);
			System.out.println("��������Ҫ�޸ĵ����ݣ�");
			String email2 = scanner.next();
			for (int i = 0; i < students.length; i++) {
				students[i].email = email2;
			}
			System.out.println("�޸ĳɹ�");
			updateStudentInfo();
		}
}
