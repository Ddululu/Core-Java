import java.util.Scanner;

public class LeapYear_TEST {

	public static void main(String[] args) {
		// 윤년은 4로 떨어져야 한다.
		// 윤년은 400으로 떨어지지만 100으로는 떨어지면 안된다.
		System.out.print("Year:");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
	
		if (year%4==0) {
			if(year%400==0 && year%100==0) System.out.printf("%d년은 윤년입니다.",year);
			else System.out.printf("%d년은 평년입니다.",year);
		}else System.out.printf("%d년은 평년입니다.",year);

	}

}
