package com.neuedu.mzj;
// ��š����֡��Ա����䡢������֤�š���ַ���绰������
public class Mingzhengju {
	public static void main(String[] args) {
		Person person1=new Person(001,"������",'��',(byte)25,false,"210724199404035015","����ʡ������","188888888",null);
		Person person2=new Person(0012,"�Լ�",'Ů',(byte)22,false,"210724199404035211","����ʡ������","188888888",null);
		boolean marry=person1.marry(person2);
		System.out.print(marry);
	}
	

}
