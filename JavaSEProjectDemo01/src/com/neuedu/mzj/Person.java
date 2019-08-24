package com.neuedu.mzj;
/**
 * @author neuedu_wjx
 * @since 2019.08.08
 * @version 1.0
 * @apiNote 人类
 * */
public class Person {
	// 定义属性：编号、名字、性别、年龄、婚否、身份证号、地址、电话、伴侣
	
	int num;
	String name;
	char sex;
	byte age;
	boolean isMarry;  // 布尔类型(婚否)
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



	// 结婚
	// 年龄男>=22,女>=20     性别不同   未婚
	public boolean marry(Person anotherPerson) {
		if(this.age>=(this.sex=='男'?22:20)&&anotherPerson.age>=(anotherPerson.age=='女'?20:22)) {
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
