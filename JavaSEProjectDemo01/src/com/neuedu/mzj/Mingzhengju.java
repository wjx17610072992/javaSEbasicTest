package com.neuedu.mzj;
// 编号、名字、性别、年龄、婚否、身份证号、地址、电话、伴侣
public class Mingzhengju {
	public static void main(String[] args) {
		Person person1=new Person(001,"王嘉兴",'男',(byte)25,false,"210724199404035015","辽宁省锦州市","188888888",null);
		Person person2=new Person(0012,"赵佳",'女',(byte)22,false,"210724199404035211","辽宁省锦州市","188888888",null);
		boolean marry=person1.marry(person2);
		System.out.print(marry);
	}
	

}
