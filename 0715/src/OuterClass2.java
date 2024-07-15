// member inner class
public class OuterClass2 {
	public static void main(String[] args) {
		OuterClass2 oc = new OuterClass2();
		oc.display();
	}
	void display() { //Inner 클래스의 멤버 메소드
		int a = 5; // local 변수는 static을 사용할 수 없음.
		// InnerClass ic = new InnerClass(); // 메소드 안에서는 순서를 고려, 오류 발생
		class InnerClass2{
			int b= 100;
			static int c= 500;
			void print() {
				
				}
	}
		InnerClass2 ic = new InnerClass2();
		System.out.println(ic.b); //  
		System.out.println(InnerClass2.c);

	}
}
