
public class _11_Exception {
	public static void main(String[] args) {
		try { a();
	}catch(Exception e) {
		e.printStackTrace(); // 기본은 printStackTrace();
		}
	}
	
	static void a() {
		b();
	}
	static void b() {
		c();
	}
	static void c() {
		d();
	}
	static void d() {
		System.out.println(5/0);
	}
}
/*Exception in thread "main" java.lang.ArithmeticException: / by zero
		at _11_Exception.d(_11_Exception.java:16) >> 최초 System.out.println(5/0); 에서 런타임예외 발생. 처리 불가
		at _11_Exception.c(_11_Exception.java:13) >> d()를 호출한 c()에게 처리 요청
		at _11_Exception.b(_11_Exception.java:10) >> c()를 호출한 b()에게 처리 요청
		at _11_Exception.a(_11_Exception.java:7)   >>> b()를 호출한 a()에게 처리 요청
		at _11_Exception.main(_11_Exception.java:4) >> a()를 호출한 main()에게 처리 요청
		main은 최종적으로 컴파일러에게 물어봄 --> 컴파일러가 ArithmeticException을 리턴.
		이 과정을 콜스택이라고 하고 스택에서 이루어진 실행을 따라간다 하여 StackTrace라고 한다.
*/
