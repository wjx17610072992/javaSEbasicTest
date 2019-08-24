package com.neuedu.java0814;
// �û��ӿ�ʵ����
public class UserBizImpl implements UserBiz{

	// ��������  ����û�
	public static User[] users = {

			new User("admin","admin","Administrator","admin@123.com"),
			new User("tom","cat","tomcat","tomcat@cat.com")
	};


	@Override
	public void register(String username, String password, String password2, String name, String email) {
		// �û������� ���������Ϣ
		boolean a = cheakUserName(username);
		if(a) {
			System.err.println("�û����Ѵ��ڡ���");
			return;
		}

		// �����������벻һ��
		if(!password.equals(password2)) {
			System.err.println("�����������벻һ��");
			return;
		}
	}


	@Override
	public void login(String username, String password) {
		boolean b = cheakUserName(username);
		if(!b) {
			System.err.println("�û��������ڡ���������");
			return;
		}
		// �û��������벻ƥ�� ��ʾ������Ϣ
		// �����û�����ѯ��Ӧ������
		String psw = queryPasswordByUserName(username);
		if(!psw.equals(password)) {
			System.err.println("�������");
			return;
		}
	}

	// ����û����Ƿ����
	private boolean cheakUserName(String username) {
		for(int i =0;i<users.length;i++) {
			if(username.equals(users[i].getUsername())) {
				return true;
			}
		}
		return false;

	}
	// �����û�����ѯ����
	private String queryPasswordByUserName(String username) {
		for(int i =0;i<users.length;i++) {
			if(username.equals(users[i].getUsername())) {
				return users[i].getPassword();
			}
		}
		return null;

	}



}
