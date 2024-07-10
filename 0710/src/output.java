/*
 * <<상품별 판매 이익금 및 이익율표>>
	-------------------------------------------------------------------------------------------
	상품명            수량         판매단가         매입단가         운송료        이익금         이익율
	-------------------------------------------------------------------------------------------
	NOTEBOOK   36000         5000             4700            2000        798000        15.60
 */
public class output {
	public void output(ProductTable [] productTables ) {
		System.out.println("<<상품별 판매 이익금 및 이익율표>>");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.printf("상품명\t\t수량\t\t구매단가\t매입단가\t운송료\t이익금\t\t이익율\n");
		System.out.println("-------------------------------------------------------------------------------------------");
		for (ProductTable PT :productTables) {
			System.out.printf("%s\t\t", PT.Product());
			System.out.printf("%,d개\t", PT.Count());
			System.out.printf("%,d원\t\t", PT.PanDan());
			System.out.printf("%,d원\t\t", PT.MaeDan());
			System.out.printf("%,d원\t\t", PT.DelPrice());
			System.out.printf("%,d원\t\t", PT.Income());
			System.out.printf("%.2f \n", PT.IncomeRate());
		}

	}

}
