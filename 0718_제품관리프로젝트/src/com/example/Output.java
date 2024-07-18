package com.example;

import java.util.List;

public class Output {

	private List<Product> list;

	public Output(List<Product> list) {
		this.list=list;
	}

	public void print() {
		// TODO Auto-generated method stub
		this.labelPrint();
		for(Product p : this.list) {
			//System.out.println(p); // p.toString() -> Product 클래스의 toString() 양식
		System.out.printf("%-12s	%-7d	 	%-7d		%-7d		%-7d		%-10d		%-7.2f\n", 					
			p.getName(),p.getQuantity(), p.getBuyPrice(), 
			p.getSellPrice(), p.getTransport(), p.getBenefit(), p.getRate());
		}
		
	}
	private void labelPrint() {
		System.out.println("                              <<제품관리프로그램>>");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.printf("상품명\t수량\t구매단가\t매입단가\t운송료\t이익금\t이익율\n");
		System.out.println("-------------------------------------------------------------------------------------------");
	}
}
