
public class _7_output {
	void output(_7_Student std) {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------------------------");
		// System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\n", 
		// 		std.Std_ID, std.kor, std.eng, std.math, std.total, std.avg, std.grade);
		std.print(); // 학생 클래스에서 print() 메서드 안에 출력을 위한 모든 데이터와 코드를 가지고 있다.
	}
}
