
public class _7_Input {
	void input(_7_Student std) { // std로 _2_Student 인스턴스의 주소를 입력한다.
		java.util.Scanner sc = new java.util.Scanner(System.in);

/*		기존의 코드는 Student 클래스의 변수들이 private로 설정되면서 접근 및 쓰기가 불가능해졌다.
 		System.out.print("학번: ");	std.Std_ID = sc.next(); 
		System.out.print("국어: ");	std.kor = sc.nextInt();
		System.out.print("영어: ");	std.eng = sc.nextInt();
		System.out.print("수학: ");	std.math = sc.nextInt();
*/	
		// 변수의 직접 접근이 어려워도 set과 get 메소드를 구성해 다른 방식으로 접근할 수 있다.
		System.out.print("학번: ");	std.setStd_ID( sc.next( ) ); 
		System.out.print("국어: ");	std.setKor(sc.nextInt());
		System.out.print("영어: ");	std.setEng(sc.nextInt());
		System.out.print("수학: ");	std.setMath(sc.nextInt());
		
	}
}
