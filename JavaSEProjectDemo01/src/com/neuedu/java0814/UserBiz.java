package com.neuedu.java0814;

public interface UserBiz {
	
	// 注册接口
	void register(String username, String password, String password2, String name, String email);


	// 登陆接口
	void login(String username, String password);



}
