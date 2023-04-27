package main;

import java.util.Scanner;

import gaxifan.xifan;
import login.login;
import member.MemberService;


public class MainClass {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		login lg = new login();
		MemberService mem = new MemberService();
		xifan xi = new xifan();
	
		while (true) {
			System.out.println("1. 로그인 기능");
			System.out.println("2. 회원 기능");
			System.out.println("3. 게시판 기능");
			num = input.nextInt();
			switch (num) {
			case 1:
				lg.test01();
				break;
			case 2:
				mem.member();
				break;
			case 3:
				xi.xifanfan();
				break;
			}
		}
	}
}
