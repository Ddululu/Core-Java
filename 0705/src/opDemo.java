import java.util.Scanner;

public class opDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("값을 입력하세요 (초 단위)");
		int time = sc.nextInt();
		
		int hour = time/3600;
		int minuite = (time%3600)/60;
		int second = time%60;
		
		System.out.printf("%d초는 ", time);
		if (hour!=0) System.out.printf("%d시간 ", hour);
		if (minuite!=0) System.out.printf("%d분 ", minuite);
		if (second!=0)System.out.printf("%d초입니다.\n", second);
		
		if (hour!=0) System.out.printf("%d시간은 %d초 ", hour, (hour*3600));
		if (minuite!=0) System.out.printf("%d 분은 %d초 ", minuite, (minuite*60));
		if (second!=0) System.out.printf("%d초.\n", second);
		System.out.printf("모두 더하면 %d초", (hour*3600+ minuite*60+ second) );
		
	}

}
