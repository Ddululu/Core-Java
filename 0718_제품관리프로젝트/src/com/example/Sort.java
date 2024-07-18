package com.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort {
	
	private List<Product> list;

	public Sort(List<Product> list) {
		this.list = list;
	}

	public void quickSort() {
		Collections.sort(this.list, new Comparator<Product>(){

			@Override
			public int compare(Product front, Product back) {
				/* 이 메서드는 두 인자를 비교하여 순서를 결정합니다. 
				첫 번째 인자가 두 번째 인자보다 작으면 음의 정수, 
				같으면 0, 크면 양의 정수를 반환합니다.
				*/
				return back.getBenefit() - front.getBenefit();
			}
			
		});
		System.out.println("정렬완료");
		
	}

}
