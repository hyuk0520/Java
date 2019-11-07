package controller;

import java.util.Scanner;

import service.UserService$;
import service.UserServiceImpl$;

public class Controller$ {

	UserService$ userService = UserServiceImpl$.getInstance();
	public static void main(String[] args) {
		
	}
	public void start() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1.회원가입");
		System.out.println("2.로그인");
		System.out.println("0.프로그램 종료");
		System.out.println("입력>>");
		
		int menu;
		
		try {
			menu = Integer.parseInt(s.nextLine());
			
			switch(menu) {
			case 1: //회원가입
				userService$.join
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
	
	
	}
	

}
