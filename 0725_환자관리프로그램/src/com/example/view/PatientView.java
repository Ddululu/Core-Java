package com.example.view;

import java.util.Scanner;

import com.example.controller.InsertController;
import com.example.model.PatientVO;

public class PatientView {
	private InsertController ic;
	private Scanner scan;
	
	private void insertMenu(){
		System.out.println("───── 환자 등록 메뉴 ─────");
		System.out.print("  등록 번호: "); int number = this.scan.nextInt();
		System.out.print("  진료 코드: "); String code = this.scan.next();
		System.out.print("  입원 일수: "); int days = this.scan.nextInt();
		System.out.print("  환자 나이: "); int age = this.scan.nextInt();
		System.out.println("─────────────────");
		PatientVO p = new PatientVO(number, code, days, age);
		try {
			this.ic.insert(p);
			System.out.println("환자 등록 완료");
		} catch (Exception e) {
			System.out.println("환자 등록 실패");
		}
	}
	
	public PatientView(){
		this.ic = new InsertController();
		this.scan = new Scanner(System.in);
		Boolean isContinue = true;
		do{
			switch(showMenu()) {
			case 1: insertMenu(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 99: isContinue = false; break;
			default : break;
			}
	}while(isContinue);
		System.out.println("──── Program is Over.... ────");
}
	
	private int showMenu() {
		System.out.println("┌────────────────┐");
		System.out.println("│ 새싹 정형외과 환자 관리 프로그램 │");
		System.out.println("└────────────────┘");
		int choice = 0;
		
			System.out.println("┌────────────────┐");
			System.out.println("│01. 환자 등록                              │");
			System.out.println("│02. 환자 검색                              │");
			System.out.println("│03. 환자 목록                              │");
			System.out.println("│04. 환자 수정                              │");
			System.out.println("│05. 환자 삭제                              │");
			System.out.println("│99. 프로그램 종료                        │");
			System.out.println("└────────────────┘");
			System.out.print("원하시는 메뉴 번호를 선택해주세요. :  ");
			choice = this.scan.nextInt();
			
			return choice;
	}
	
	
}