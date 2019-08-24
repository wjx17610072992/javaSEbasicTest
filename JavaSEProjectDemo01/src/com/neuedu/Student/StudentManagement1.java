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
		System.out.println("--------��ӭ��½ѧ����Ϣ����ϵͳ--------");
		System.out.println("          1.��½      2.�˳�");
		System.out.println("----------------------------------------");
		Scanner scanner=new Scanner(System.in);
		System.out.println("��ѡ��");
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
		System.out.println("��ӭ��½��");
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������û�����");
		String userNames = scanner.next();
		System.out.println("���������룺");
		String pwds = scanner.next();
		String abc = "admin";
		if(userNames.equals(abc) && pwds.equals(abc)){
			System.out.println("��½�ɹ�");
			System.out.println("��ӭ����admin");
			operateStudentInof();
			}else {System.out.println("��������ȷ���˺ż����룡");
			System.exit(0);
				}		
	}
	public static void over(){
		System.exit(0);
	}
	// ����
	public static void operateStudentInof() {
		System.out.println("--------------------------------------------------");
		System.out.println("*1.�鿴ѧ����Ϣ   2.���ѧ����Ϣ   3.ɾ��ѧ����Ϣ  4.�޸�ѧ����Ϣ  5.�˳�");
		System.out.println("---------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��ѡ��");
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
	 // 2���ѧ����Ϣ
	public static void getAddStudentInfo() {
		System.out.println("------  ------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѧ����id��");
		String id1 = scanner.next();
		System.out.println("������ѧ����������");
		String name1 = scanner.next();
		System.out.println("������ѧ�����Ա�");
		char sex1 = scanner.next().charAt(0);
		System.out.println("������ѧ��������(ֻ����1-120֮�ڵ�����)��");
		int age1 = scanner.nextInt();
		System.out.println("������ѧ���������꼶(ֻ�ܳ������м����߼�)��");
		String grade1 = scanner.next();
		System.out.println("������ѧ���ĵ�ַ��");
		String address1 = scanner.next();
		System.out.println("������ѧ������ϵ��ʽ(11λ�ֻ�����)��");
		String phone1 = scanner.next();
		System.out.println("������ѧ���ĵ�������(����@��.com)��");
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
			 System.out.println("���ݱ���ɹ���ϵͳ���Զ�������һ��");
		 }
		 operateStudentInof();	
	}
		 
		public static void queryStudentInfo() {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("+ 1.�鿴����ѧ����Ϣ                   2.����id��ѯѧ����Ϣ                    3.����id��ѯѧ������                     4.������һ��");
			System.out.println("-----------------------------------------------------------------------------------");
			Scanner scanner = new Scanner(System.in);
			System.out.println("��ѡ��");
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
	// 1.1�鿴����ѧ������Ϣ
		public static void queryWholeStudentInfo(){
			for(int i =0;i<students.length;i++) {
				System.out.println(students[i]);
				operateStudentInof();
			}
		}
	
	// 1.2����id��ѯѧ����Ϣ
		public static void queryStudentInfoById() {
			Scanner scanner =new Scanner(System.in);
			System.out.println("������Ҫ��ѯ��id��");
			String id2 = scanner.next();
			for(int i =0;i<students.length;i++) {
				if(students[i].id.equals(id2)) {
					System.out.println(students[i]);
				}
			}
			System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼��������");
			queryStudentInfo();
		}
	
	// 1.3����id��ѯѧ������
		public static void queryStudentNameById() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫ��ѯ��id��");
			String id3 = scanner.next();
			for(int i = 0;i<students.length;i++) {
				if(students[i].id.equals(id3)) {
					System.out.println("students[i].name");
				}
			}
		System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼������");
		queryStudentInfo();
		
		}
		
	// 3.ɾ��ѧ����Ϣ
		public static void deleteStudentInfoById() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("������Ҫɾ��ѧ����id��");
			String id4 = scanner.next();
			for(int i = 0;i<students.length;i++) {
				if(students[i].id.equals(id4)) {
					//ɾ��ѧ����Ϣ
					students[i] = students[students.length-1];
					students = Arrays.copyOf(students, students.length-1);
				}
			}
			System.out.println("ɾ���ɹ���");
			operateStudentInof();	
		}
		
		//4.�޸�ѧ����Ϣ
		public static void updateStudentInfo() {
			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println("1.����ID�޸�ѧ��ȫ����Ϣ                     2.����ID�޸�ѧ��������Ϣ                     3.�����ϼ�Ŀ¼                      4.ϵͳ�˳�");
			System.out.println("-----------------------------------------------------------------------------------");
			Scanner scanner=new Scanner(System.in);
			System.out.println("��ѡ��");
			int select = scanner.nextInt();
		}
	
	
	
	
	
	
	
	
	
}

