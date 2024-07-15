// member inner class
public class OuterClass1 {
	public static void main(String[] args) {
		InnerClass ic = new InnerClass(); // 안쪽 클래스는 바깥쪽 클래스의 주소를 요구하지 않는다.
		ic.display();
		ic.print();
	}
	private int a = 5; //outer 클래스의 멤버변수
	private static int b=10; //outer 클래스의 스태틱 변수

	private static class InnerClass{ // outer 클래스의 스태틱 클래스
		private int c = 100; // Inner 클래스의 멤버변수
		private static int d=500; // Inner 클래스의 스태틱 변수
		
		public void display() { //Inner 클래스의 멤버 메소드
			System.out.println(a+","+b +","+c+","+d); 
			// 내부 클래스가 스태틱 클래스라면, 바깥쪽의 멤버 변수 a는 사용할 수 없다.
			// 내부 클래스라도 static은 바깥쪽 멤버 변수보다 먼저 생김.
		}
		
		public static void print() { //Inner 클래스의 스태틱 메소드
			System.out.println(a+","+b +","+c+","+d); // a,c는 사용 불가.
		}
		}
}
