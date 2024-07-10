// 상품명   |    수량   |    판매단가  |    매입단가  |   운송료 | 판매 금액 | 매입 금액 | 이익금 | 이익율
/*
 * 1) 판매금액 = 수량 * 판매단가
   2) 매입금액 = 수량 * 매입단가
   3) 이익금 =판매금액 - (매입금액 + 운송료)
   4) 이익율 = 이익금 / 매입금액 * 100
   5) 이익율은 소수점 이하 셋째 자리에서 반올림하여 둘째 자리까지 구한다.
 */
public class _8_ProductInfo {
		private String Product;
		public String getProduct() {return Product;}
		public void setProduct(String product) {Product = product;}
		
		private int count;
		public int getCount() {return count;}
		public void setCount(int count) {this.count = count;}
		
		private int sa_price;
		public int getSa_price() {return sa_price;}
		public void setSa_price(int sa_price) {this.sa_price = sa_price;}
		
		private int in_price;
		public int getIn_price() {return in_price;}
		public void setIn_price(int in_price) {this.in_price = in_price;}
		
		private int de_price;
		public int getDe_price() {return de_price;}
		public void setDe_price(int de_price) {this.de_price = de_price;}
		
		// 1) 판매금액 = 수량 * 판매단가
		private int sa_total;
		public int getSa_total() {return sa_total;}
		public void setSa_total(int sa_total) {this.sa_total = sa_total;}
		
		// 2) 매입금액 = 수량 * 매입단가
		private int in_total;
		public int getIn_total() {return in_total;}
		public void setIn_total(int in_total) {this.in_total = in_total;}
		
		//  3) 이익금 =판매금액 - (매입금액 + 운송료)
		private int income;
		public int getIncome() {return income;}
		public void setIncome(int income) {this.income = income;}
		
		// 4) 이익율 = 이익금 / 매입금액 * 100
		private double income_rate;
		public double getIncome_rate() {return income_rate;}
		public void setIncome_rate(double income_rate) {this.income_rate = income_rate;}
		
		
		
		
		
		
		
}
