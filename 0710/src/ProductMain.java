/*
 * <제품관리프로그램>
1. 입력양식
    상품명   |    수량   |    판매단가  |    매입단가  |   운송료
2. 입력 데이터
    첨부파일 참조
3. 출력양식
    
                     <<상품별 판매 이익금 및 이익율표>>
-------------------------------------------------------------------------------------------
상품명            수량         판매단가         매입단가         운송료        이익금         이익율
-------------------------------------------------------------------------------------------
NOTEBOOK   36000         5000             4700            2000        798000        15.60
4. 처리조건
   1) 판매금액 = 수량 * 판매단가
   2) 매입금액 = 수량 * 매입단가
   3) 이익금 =판매금액 - (매입금액 + 운송료)
   4) 이익율 = 이익금 / 매입금액 * 100
   5) 이익율은 소수점 이하 셋째 자리에서 반올림하여 둘째 자리까지 구한다.
 */

import java.util.Scanner;

public class ProductMain {
	public static void main(String[] args) throws java.io.IOException{
		/*
		 * <제품관리프로그램>
			1. 데이터 테이블 클래스 정의 >> ProductTable
			2. 테이블 배열 생성
			3. 반복문 시행 
				./src/product.dat 의 1행 가져오기 
				-> 테이블 배열에 저장 (set 메소드 사용)
				-> 테이블 배열에 추가 데이터(판매금액, 매입금액, 이익금, 이익율) 저장
			3. 테이블 출력 클래스 정의 >> Output(테이블 배열 입력)
			4. 헤더 문구 출력 + 반복문 시행
				-> 배열 요소를 한 줄에 모두 출력
		 */
		ProductTable [] content = new ProductTable[7];
		output out_put = new output();
		Scanner sc = new Scanner(new java.io.File("./src/product.dat"));
		int i= 0;
		do { 
			String line= sc.nextLine();
			String [] array = line.split("\\s+");

// Product; Count; PanDan; MaeDan; DelPrice; PanPrice; MaePrice; Income; IncomeRate; 
			content[i] = new ProductTable();
			content[i].Product(array[0].trim()); //trim은 String의 메소드로 문자열의 선,후행 white_space을 제거
			content[i].Count(Integer.parseInt(array[1].trim()));
			content[i].PanDan(Integer.parseInt(array[2].trim()));
			content[i].MaeDan(Integer.parseInt(array[3].trim()));
			content[i].DelPrice(Integer.parseInt(array[4].trim()));
			content[i].PanPrice();
			content[i].MaePrice();
			content[i].Income();
			content[i].IncomeRate();
			i++;        
		}while(i<7);
			
		out_put.output(content);
	}

}
