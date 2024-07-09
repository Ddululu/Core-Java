
public class HelloWorld5 {
	static void s_print() {
		System.out.println("Hello, static");
	}
	
	void m_print() {
		System.out.println("Hello, non_static");
	}
	
	
	public static void main(String[] args) {
		s_print(); // 동일 클래스의 스태틱 메소드는 클래스 이름을 생략할 수 있다. (HelloWorld5.)print() 가 생략.
		new HelloWorld5().m_print(); // 동일 클래스의 멤버 메소드는 new로 클래스를 생성해야 사용할 수 있다.
		
		Employee.cs_print(); // 다른 클래스의 스태틱 메소드는 클래스 이름으로 접근한다.
		new Employee().cm_print();// 다른 클래스의 인스턴스 메소드는 클래스를 생성하고 그 주소로 접근한다.
	}
}
class Employee{
	static void cs_print() {
		System.out.println("Hello, Static");
	}
	
	void cm_print() {
		System.out.println("Hello, Non_Static");
	}
	
}