// 상품명   |    수량   |    판매단가  |    매입단가  |   운송료 | 판매 금액 | 매입 금액 | 이익금 | 이익율
/*
 * 1) 판매금액 = 수량 * 판매단가
   2) 매입금액 = 수량 * 매입단가
   3) 이익금 =판매금액 - (매입금액 + 운송료)
   4) 이익율 = 이익금 / 매입금액 * 100
   5) 이익율은 소수점 이하 셋째 자리에서 반올림하여 둘째 자리까지 구한다.
 */
public class ProductTable {
		
		private String Product; // 상품명
		private int Count; // 수량
		private int PanDan; 	// 판매단가
		private int MaeDan; // 매입단가
		private int DelPrice; // 운송비용
		private int PanPrice; // 판매금액 = 수량 * 판매단가
		private int MaePrice; // 매입금액 = 수량 * 매입단가
		private int Income; // 이익금 =판매금액 - (매입금액 + 운송료)
		private double IncomeRate; // 이익율 = 이익금 / 매입금액 * 100

// =====================================================//		
		public String Product() {return Product;}
		public void Product(String product) {Product = product;}
		
		public int Count() {return Count;}
		public void Count(int count) {this.Count = count;}
		
		public int PanDan() {return PanDan;}
		public void PanDan(int sa_price) {this.PanDan = sa_price;}
		
		public int MaeDan() {return MaeDan;}
		public void MaeDan(int in_price) {this.MaeDan = in_price;}
		
		public int DelPrice() {return DelPrice;}
		public void DelPrice(int de_price) {this.DelPrice = de_price;}
		
		public int PanPrice() {return this.PanPrice = Count*PanDan;}
		
		public int MaePrice() {return this.MaePrice= Count*MaeDan;}
		
		public int Income() {
			return this.Income= PanPrice-(MaePrice+DelPrice);}
			
		public double IncomeRate() {
			return this.IncomeRate= (Income/(double)MaePrice)*100;}
}
