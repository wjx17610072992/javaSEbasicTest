package com.neuedu.mzj;
/**
 * @author neuedu_wjx
 * @since 2019.08.08
 * @version 1.0
 * @apiNote ����
 * */
public class Person {
	// �������ԣ���š����֡��Ա����䡢������֤�š���ַ���绰������
	
	int num;
	String name;
	char sex;
	byte age;
	boolean isMarry;  // ��������(���)
	String idCard;
	String addRess;
	String tell;
	String partnerName;
	
	
	
	public Person(int num, String name, char sex, byte age, boolean isMarry, String idCard, String addRess, String tell,
			String partnerName) {
		this.num = num;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.isMarry = isMarry;
		this.idCard = idCard;
		this.addRess = addRess;
		this.tell = tell;
		this.partnerName = partnerName;
	}



	// ���
	// ������>=22,Ů>=20     �Ա�ͬ   δ��
	public boolean marry(Person anotherPerson) {
		if(this.age>=(this.sex=='��'?22:20)&&anotherPerson.age>=(anotherPerson.age=='Ů'?20:22)) {
			if(this.sex!=anotherPerson.sex) {
				if(this.isMarry==false&&anotherPerson.isMarry==false) {
					this.isMarry=true;
					anotherPerson.isMarry=true;
					this.partnerName=anotherPerson.name;
					anotherPerson.partnerName=this.name;
					return true;
				}
			}
		}else return false;
	}
	
	
	
}
