package com.example.view;

import java.util.Scanner;

class Menu {
	static int  view() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌────────────┐");
		System.out.println("│ 새싹 사원 관리 프로그램 │");
		System.out.println("└────────────┘");
		int choice = 0;
		
			System.out.println("┌────────────────┐");
			System.out.println("│01. 사원 입력                              │");
			System.out.println("│02. 사원 출력                              │");
			System.out.println("│99. 프로그램 종료                        │");
			System.out.println("└────────────────┘");
			System.out.print("원하시는 메뉴 번호를 선택해주세요. :  ");
			choice = scan.nextInt();
			
			return choice;
	}
}
