package service;

import java.util.Scanner;

import controller.Controller$;
import vo.UserVO$;

public class UserServiceImpl$ implements UserService$ {

	@Override
	public void join() {
		Scanner s = new Scanner(System.in);
		
		String id;
		String password;
		String name;
		
		
		UserVO$ user = new UserVO$();
		//나중에 정규식 추가
		
		//id
		System.out.println("-1입력시 종료.");
		System.out.println("id : ");
		id = s.nextLine();
		
		if(id.equals("-1"))
		{
			new Controller$().start();
		}
		
		//password
		System.out.println("비밀번호 : ");
		password = s.nextLine();
		
		if(password.equals("-1"))
		{
			new Controller$().start();
		}
		
		//name
		System.out.println("이름 : ");
		name = s.nextLine();
		
		if(name.equals("-1"))
		{
			new Controller$().start();
		}
		
		user.setId(id);
		user.setPassword(password);
		user.setName(name);
		
//		userDao.insertUser(user);


	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}

	@Override
	public void userList() {
		// TODO Auto-generated method stub

	}

	

}
