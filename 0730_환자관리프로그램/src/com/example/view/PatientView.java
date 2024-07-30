package com.example.view;

import java.util.List;
import java.util.Scanner;

import com.example.controller.DeleteController;
import com.example.controller.InsertController;
import com.example.controller.SelectController;
import com.example.model.PatientVO;

public class PatientView {
	private Scanner scan;
	private String i_o = null;
	private void insertMenu(){
		System.out.println("───── 환자 등록 메뉴 ─────");
		System.out.print("  등록 번호: "); int number = this.scan.nextInt();
		System.out.print("  진료 코드: "); String code = this.scan.next();
		System.out.print("  입원 일수: "); int days = this.scan.nextInt();
		System.out.print("  환자 나이: "); int age = this.scan.nextInt();
		System.out.println("─────────────────");
		PatientVO p = new PatientVO(number, code, days, age);
		InsertController ic = new InsertController(); 
		// 기존 insertMenu() 바깥에 선언했을때, driver가 close되면 재 연결이 불가능 했음.
		// 이를 개선하기 위해 insertMenu가 호출되면 driver 커넥션을 생성하도록 코드 수정
		try {
			ic.insert(p);
			System.out.println("환자 등록 완료");
		} catch (Exception e) {
			System.out.println("환자 등록 실패");
		}
	}
	
	public PatientView(){
		
		this.scan = new Scanner(System.in);
		Boolean isContinue = true;
		
		do{
			switch(showMenu()) {
			case 1: insertMenu(); break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: deleteMenu(); break;
			case 99: 
				isContinue = false; 
				break;
			default : break;
			}
			System.out.println("입력 / 출력 (I/O)");
			
			this.i_o = this.scan.nextLine().toUpperCase();
	}while(isContinue&& i_o=="I");
		System.out.println("──── Program is Over.... ────");
}
	
	private void deleteMenu() {
		SelectController sc = new SelectController();
		List<PatientVO> list = sc.selectAllPatient();
		System.out.println("번호  진찰부서  진찰비  입원비  진료비");
		list.forEach( p-> System.out.printf("%d\t%s\t, %d\t, %d\t, %d\n",
														p.getNumber(), p.getDept(), 
														p.getOperFee(), p.getHospitalFee(), p.getMoney() ));
		System.out.print("삭제할 환자 등록 번호: ");
		int number = this.scan.nextInt();
		DeleteController dc = new DeleteController();
		if(dc.delete(number)) System.out.println(number +"번 환자의 정보가 삭제 되었습니다.");
		else System.out.println("삭제 실패");
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