package com.example;

	
import java.util.List;

public class Calc {
	
	private List<Product> list;

	public Calc(List<Product> list) {
		this.list=list;
	}

	public void calc() {
		/* calc()의 메소드 목표, 입력받은 리스트에 이익금과 이익율을 계산해서 입력
		1) 판매금액 = 수량 * 판매단가
		2) 매입금액 = 수량 * 매입단가
		3) 이익금 =판매금액 - (매입금액 + 운송료)
		4) 이익율 = 이익금 / 매입금액 * 100
		5) 이익율은 소수점 이하 셋째 자리에서 반올림하여 둘째 자리까지 구한다.
		*/
		for(Product p : this.list) {
			int sellMoney= p.getQuantity()*p.getSellPrice();
			int buyMoney= p.getQuantity()*p.getBuyPrice();
			int benefit = sellMoney - (buyMoney+p.getTransport());
			double rate = (double)benefit / buyMoney * 100;
			p.setBenefit(benefit);
			//System.out.println(rate);
			p.setRate(rate);
		}
		System.out.println("계산 완료");
	}

}
