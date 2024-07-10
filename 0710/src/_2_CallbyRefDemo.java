
public class _2_CallbyRefDemo {
	// input 메소드는 사용자로부터 입력을 받기 위한 메소드
	void input(_2_Student std) { // std로 _2_Student 인스턴스의 주소를 입력한다.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("학번: ");	std.Std_ID = sc.next();
		System.out.print("국어: ");	std.kor = sc.nextInt();
		System.out.print("영어: ");	std.eng = sc.nextInt();
		System.out.print("수학: ");	std.math = sc.nextInt();
	}
	
	// calc 메소드는 입력받은 데이터로 계산하는 메소드
	void calc(_2_Student std) {
		std.total = std.kor + std.eng+ std.math;
		std.avg = std.total/3.0;
		std.grade = (std.avg >= 90.0) ? 
				'A' : (std.avg>=80.0) ? 
				'B' : (std.avg>=70.0) ? 
				'C' :  (std.avg>=60.0) ? 
				'D' : 'F';
	}
	
	// output 메소드는 모든 데이터를 출력하는 메소드
	void output(_2_Student std) {
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t평점");
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\n", 
				std.Std_ID, std.kor, std.eng, std.math, std.total, std.avg, std.grade);
	}
	
	
	public static void main(String[] args) {
		_2_Student younghee = new _2_Student();
		_2_CallbyRefDemo d = new _2_CallbyRefDemo();
		
		// input과 calc, output에서 younghee를 사용할 수 있는 이유
		// 메소드의 입력을 참조 변수로 받았기 때문에 younghee 인스턴스의 주소를 알고있다.
		// 즉 main과 input, calc, output 모두 동일한 인스턴스를 보고있기 때문에 사용 가능.
		d.input(younghee);
		
		System.out.println("영희의 국어 점수: "+ younghee.kor);

		d.calc(younghee);
		
		d.output(younghee);
	}
	
}
