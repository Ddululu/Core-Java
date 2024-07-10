// 클래스 이름은 Japanki, Money는 145678
// 
// 5만원 2 / 만원 4 / 5천원 1 / 1000원 0 / 500원 1 / 100원 1 / 50원 1 / 5원 1 / 1원 3
// 입력에 따라 단위로 나눠주는 함수 구현

import java.util.Scanner;
public static void main(String[] args) {
	public class Japanki {
		String y_n=null;
		Scanner sc = new Scanner(System.in);
		int [] array = {50000,10000,5000,1000,500,100,50,10,5,1};

		
		// 2. 화폐를 나누는 배열을 만든다.
		
		// 1. 돈을 입력받는다.
		 // 배열이 아니면 초기화 필요.
		do {
			System.out.print("money: ");
			int money = sc.nextInt(); //145678
			
			// 3. 입력받은 돈을 각각 단위로 몫과 나머지를 구해 저장한다.
			for (int i=0; i<array.length; i++) {
				int mok = money / array[i];
				System.out.println(array[i]+"원권"+mok);
				money=money%array[i];
				}
			
			System.out.print("Again(y/n) ? : ");
			y_n=sc.next();
			y_n=y_n.toLowerCase(); // 문자를 소문자로 바꾸는 함수
			}while(y_n.equals("y"));
			System.out.println("Program is over...");
		}
	}
}
