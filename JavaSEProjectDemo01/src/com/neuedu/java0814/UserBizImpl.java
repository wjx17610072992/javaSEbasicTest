package com.neuedu.java0814;
// 用户接口实现类
public class UserBizImpl implements UserBiz{

	// 创建数组  存放用户
	public static User[] users = {

			new User("admin","admin","Administrator","admin@123.com"),
			new User("tom","cat","tomcat","tomcat@cat.com")
	};


	@Override
	public void register(String username, String password, String password2, String name, String email) {
		// 用户名存在 输出错误信息
		boolean a = cheakUserName(username);
		if(a) {
			System.err.println("用户名已存在。。");
			return;
		}

		// 两次密码输入不一致
		if(!password.equals(password2)) {
			System.err.println("两次密码输入不一致");
			return;
		}
	}


	@Override
	public void login(String username, String password) {
		boolean b = cheakUserName(username);
		if(!b) {
			System.err.println("用户名不存在。。。请检查");
			return;
		}
		// 用户名和密码不匹配 显示错误信息
		// 根据用户名查询对应的密码
		String psw = queryPasswordByUserName(username);
		if(!psw.equals(password)) {
			System.err.println("密码错误");
			return;
		}
	}

	// 检查用户名是否存在
	private boolean cheakUserName(String username) {
		for(int i =0;i<users.length;i++) {
			if(username.equals(users[i].getUsername())) {
				return true;
			}
		}
		return false;

	}
	// 根据用户名查询密码
	private String queryPasswordByUserName(String username) {
		for(int i =0;i<users.length;i++) {
			if(username.equals(users[i].getUsername())) {
				return users[i].getPassword();
			}
		}
		return null;

	}



}
