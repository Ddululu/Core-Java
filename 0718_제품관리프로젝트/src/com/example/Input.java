package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Input {

	private List<Product> list;
	private File file;
	private Scanner sc;

	public Input(List<Product> list) {
		// ./productdata.txt를 읽어 입력받은 list에 저장.
		this.list=list;
		this.file = new File("productdata.txt");
		try {
			this.sc = new Scanner(this.file);
		}catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			System.exit(0); // 프로그램 종료
		}catch (Exception e) {
			System.out.println("알 수 없는 오류 발생");
			System.exit(0);
		}finally{
			System.out.println("파일 읽기 완료");
		}
			
	}

	public void fileInput() {
		// 리스트의 모든 열을 가져오기
		while(this.sc.hasNextLine()) {
			String line = this.sc.nextLine(); // NOTEBOOK    36000   5000    4700    2000
		// 각 열의 요소들을 파싱
		/* 1. split()을 이용한 구분 후 파싱
		 * 2. Scanner's useDelemeter()
		 * 3. StringTokenizer
		 */
			// 문자열 line을 Scanner 객체에 넣어 useDelimiter()를 이용해 파싱
			Scanner scLine = new Scanner(line).useDelimiter("\\s+");
			
			Product p = new Product(scLine.next(), scLine.nextInt(), scLine.nextInt(), scLine.nextInt(), scLine.nextInt());
			this.list.add(p);
		}
	}
	
}
