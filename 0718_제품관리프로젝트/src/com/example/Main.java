package com.example;

import java.util.ArrayList;
import java.util.List;

/* 프로젝트 목표
  		1) product.txt 파일을 읽어 모두 리스트에 저장,
  		2) 리스트의 각 요소를 이용해 이익금, 이익율을 계산
  		3) 리스트를 각 요소를 정렬
  		4) 리스트의 각 요소를 출력
*/
public class Main {
	public static void main(String[] args) {
		List<Product> list =new ArrayList<Product>();
		Input input = new Input(list);
		input.fileInput();
		Calc calc = new Calc(list);
		calc.calc();
		Sort sort = new Sort(list);
		sort.quickSort();
		Output output = new Output(list);
		output.print();
		System.out.println("Program is over...");
	}
	
}
