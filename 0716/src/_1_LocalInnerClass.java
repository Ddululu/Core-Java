
public class _1_LocalInnerClass {
	public static void main(String[] args) {
		// InnerClass ic = new InnerClass; // 오류 발생, InnerClass는 직접 호출 불가.
		OuterClass out = new OuterClass();
		out.display();
	}
}
class OuterClass{
	private int a = 5;
	private static int b = 10;
	public void display() {
		int c = 100; // 지역 변수는 final이 생략. 값 변경이 불가.
		// InnerClas가 display() 메소드 안에 선언되었다.
		// 즉 display() 메소드가 동작 중에만 클래스를 사용할 수 있다.
		// 메소드가 종료될때, InnerClass가 사라지지 않을 수 있다.
		class InnerClass{
			public void print() {
				System.out.println(c);
				// c=1000; // 오류 발생, 지역변수 c는 이미 OuterClass에서 선언되었고, 상수라 재할당 불가. 
				
				/* 지역변수는 왜 상수일까?
				display() 메소드가 종료되었지만, 
				종료되지 않은 InnerClass에 의해 c가 1000으로 바뀐다면 문제 발생.
				이로인해 지역변수 c는 자동으로 final이 붙어 상수처럼 사용한다. */
			}
		}
		InnerClass ic = new InnerClass();
		ic.print();s
	}
}