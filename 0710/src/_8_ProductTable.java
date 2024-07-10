/*
 * 처리조건
   1) 판매금액 = 수량 * 판매단가
   2) 매입금액 = 수량 * 매입단가
   3) 이익금 =판매금액 - (매입금액 + 운송료)
   4) 이익율 = 이익금 / 매입금액 * 100
   5) 이익율은 소수점 이하 셋째 자리에서 반올림하여 둘째 자리까지 구한다.
 */
import java.util.Scanner;
public class _8_ProductTable {
	public void Table(_8_ProductInfo content) throws java.io.IOException{
		Scanner sc = new Scanner(new java.io.File("./src/product.dat"));
		int i= 0;
		do { 
			String line= sc.nextLine();
			String [] array = line.split("\\s+");
			// Product | count | sa_price | in_price | de_price;
			content.setProduct(array[0].trim()); //trim은 String의 메소드로 문자열의 선,후행 white_space을 제거
			content.setCount(Integer.parseInt(array[1].trim()));
			content.setSa_price(Integer.parseInt(array[2].trim()));
			content.setIn_price(Integer.parseInt(array[3].trim()));
			content.setDe_price(Integer.parseInt(array[4].trim()));
			i++;
		}while(i<7);
		
		
	}
	

}
