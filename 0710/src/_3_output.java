
public class _3_output {
	void output(_2_Student std) {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\n", 
				std.Std_ID, std.kor, std.eng, std.math, std.total, std.avg, std.grade);
	}
}
