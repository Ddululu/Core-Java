
public class _3_Input {
	void input(_2_Student std) { // std로 _2_Student 인스턴스의 주소를 입력한다.
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("학번: ");	std.Std_ID = sc.next();
		System.out.print("국어: ");	std.kor = sc.nextInt();
		System.out.print("영어: ");	std.eng = sc.nextInt();
		System.out.print("수학: ");	std.math = sc.nextInt();
	}
}
