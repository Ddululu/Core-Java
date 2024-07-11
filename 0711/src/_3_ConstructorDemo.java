/* 
*/
public class _3_ConstructorDemo {
	public static void main(String[] args) {
		Employee man = new Employee();
		System.out.println(man.salary);
		// 출력 : null과 0.0
		// 이유 : 생성자에 의해 new Employee 클래스가 다시 생성되었고, 거기에 값이 저장되었다.
		// 수정 방법: new Employee("임시사번",10000000); 대신
		// this("임시사번",100000000);으로 선언해야 한다.
		// this 생성자 메소드는 다른 클래스에서는 사용할 수 없고 반드시 생성자의 첫 줄에서만 사용가능.
	}
}
class Employee{
	static String tmp_sabun="임시사번";
	static double tmp_salary=1000000;
	String sabun;
	double salary;
	
	
	public Employee() {}
	// 원래라면 변수인 sabun과 salary는 기본 생성자에 의해 초기화 된다.
	// 이 값들을 다른 값으로 초기화 하기 위해 재정의하는 것을 Overriding이라고 한다.
	
	// public Employee(String sabun){ this(sabun,salary);} 
	//-> this(sabun,salary)에서 오류가 출력.
	// why? 구조 상 salary는 인스턴스의 salary 값이 들어갈 것이라 생각된다.
	// 하지만 인스턴스가 생성되어야 salary가 생성되는데, salary가 생성되기 전에 참조를 하려하니 오류 발생.
	// static으로 선언한다면 인스턴스가 생성되기 전에 올라가기 때문에오류가 발생하지 않음.
	// But. Static으로 선언하면 값 수정이 안된다.
	
	public Employee(double salary) {this(tmp_sabun,salary);}
	public Employee(String sabun,double salary){ this.sabun=sabun; this.salary=salary;}
	
	
	
}
