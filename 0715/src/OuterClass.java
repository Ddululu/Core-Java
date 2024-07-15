// member inner class
public class OuterClass {
	public static void main(String[] args) {
		// InnerClass ic = new InnerClass(); 
		// 오류 발생. inner 클래스는 Outer 클래스의 멤버 클래스라 OuterClass를 생성해야 만들 수 있다.
		
		OuterClass oc = new OuterClass();
		InnerClass ic = oc.new InnerClass(); // 안쪽 클래스는 바깥쪽 클래스를 만들어야 만들 수 있다.
		
		System.out.println(ic.c);
		System.out.println(InnerClass.d);  // d는 InnerClass의 static 변수이기 때문에 인스턴스인 ic가 없어도 호출 가능.
	}
	private int a = 5; //outer 클래스의 멤버변수
	private static int b=10; //outer 클래스의 스태틱 변수

	private class InnerClass{ // outer 클래스의 멤버 클래스
		private int c = 100; // Inner 클래스의 멤버변수
		private static int d=500; // Inner 클래스의 스태틱 변수
		
		public void display() { //Inner 클래스의 멤버 메소드
			System.out.println(a+","+b +","+c+","+d); 
			// 내부 클래스는 바깥쪽 클래스의 모든 것을 사용할 수 있다. 
			// 상위 클래스가 private여도 같은 패키지기 때문에 사용할 수 있다,
		}
		
		public static void print() { //Inner 클래스의 스태틱 메소드
			System.out.println();
		}
		}
}
