package com.neuedu.java0814;

import java.util.Scanner;

public class UserViewImpl implements UserView {
	private Scanner scanner = new Scanner(System.in);
	
	//����userBiz
	private UserBizImpl userBizImpl = new UserBizImpl();
	
	@Override
	public void login() {
		System.out.println("�����������û�����");
		String username = scanner.next();
		System.out.println("�������������룺");
		String password = scanner.next();
		userBizImpl.login(username, password);

	}

	@Override
	public void register() {
		System.out.println("�����������û�����");
		String username = scanner.next();
		System.out.println("�������������룺");
		String password = scanner.next();
		System.out.println("�����ٴ����������룺");
		String password2 = scanner.next();
		System.out.println("�������������֣�");
		String name = scanner.next();
		System.out.println("���������������ַ��");
		String email = scanner.next();
		userBizImpl.register(username, password, password2, name, email);

	}

}
