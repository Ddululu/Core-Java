/*
 * 스태틱 변수를 초기화하기 위해서는 static Initialization Block을 사용해야 한다.
 *  Static을 사용하는 4가지 이유: 주소 공유, InnerClass 쉽게 접근,
 *  Static variable
 *  Static Method
 *  Static initializer
 */
public class _5_Static {
	public static void main(String[] args) {
		System.out.println("나는 메인 메소드");
	}

	private static int a= test(); //test()는 b를 출력하지만, 아직 b가 초기화되지 않아 0 출력
	private static int b = 100;
	
	private int c;
	private final int d;
	{ // initialization Block, 멤버 변수를 객체가 생성될 때 초기화
		c=5; d=100;
	}
	
	private static int e;
	private static final int f;
	static { // static initialization Block; class 로딩 시 단 한번만 수행
		e=500; f=1000;
	}
	
	static int print() {
		System.out.println("나는 스태틱 메소드");
		return 300000000;
	}
	
	static int test() {
		System.out.println(b);
		return 10000000;
	}
	
	
}
