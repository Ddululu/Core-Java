// 다형성이란 여러 형태로 변할 수 있는 능력.
// 부모 - 자식 간 형변환을 이용해 하나의 변수가 여러 값을 갖도록 구성할 수 있다.

// 다형성을 이용하면 부모 클래스로 선언하고 런타임때는 자식 클래스로 사용할 수 있다.
// Employee e = new Manager(); -> 부모 객체를 만들건데, 자식 클래스로 만들거다. (자식의 성격을 그대로 가져감
// 
import java.util.Scanner;
public class _5_Polymorphism {
	public static void main(String[] args) {
		_5_Mammal m = new _5_Mammal();
		for(int i = 0; i<3;i++) {
			int choice=choice();
			switch(choice) {
				case 1: m= new _5_Dog(); break;
				case 2: m= new _5_Cat(); break;
				case 3: m= new _5_American(); break;
				case 4: m= new _5_Korean(); break;
				}
			m.sayThing(); // 자식 객체가 부모 객체로 형변환, 하나의 객체를 여러 형태로 사용할 수 있다.
		}
	}
	static int choice() {
		System.out.println("****************Chioce****************");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. American");
		System.out.println("4. Korean");
		
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
		
	}
}
