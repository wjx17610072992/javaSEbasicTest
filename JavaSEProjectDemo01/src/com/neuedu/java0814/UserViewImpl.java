package com.neuedu.java0814;

import java.util.Scanner;

public class UserViewImpl implements UserView {
	private Scanner scanner = new Scanner(System.in);
	
	//引用userBiz
	private UserBizImpl userBizImpl = new UserBizImpl();
	
	@Override
	public void login() {
		System.out.println("请输入您的用户名：");
		String username = scanner.next();
		System.out.println("请输入您的密码：");
		String password = scanner.next();
		userBizImpl.login(username, password);

	}

	@Override
	public void register() {
		System.out.println("请输入您的用户名：");
		String username = scanner.next();
		System.out.println("请输入您的密码：");
		String password = scanner.next();
		System.out.println("请输再次入您的密码：");
		String password2 = scanner.next();
		System.out.println("请输入您的名字：");
		String name = scanner.next();
		System.out.println("请输入您的邮箱地址：");
		String email = scanner.next();
		userBizImpl.register(username, password, password2, name, email);

	}

}
