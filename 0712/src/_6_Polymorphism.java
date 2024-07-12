// 다형성이란 여러 형태로 변할 수 있는 능력.
// 부모 - 자식 간 형변환을 이용해 하나의 변수가 여러 값을 갖도록 구성할 수 있다.

// 다형성을 이용하면 부모 클래스 배열에 자식 클래스 객체를 넣을 수 있다.
// Heterogeneous Collections, 서로 다른 클래스로 이루어진 배열 
// 자식이 부모형으로 바뀌는 것이 Casts up, 부모가 자식형으로 바뀌는 것이 Downward casts
import java.util.Scanner;
public class _6_Polymorphism {
	public static void main(String[] args) {
		_5_Mammal [] array = new _5_Mammal[4];
		array[0] = new _5_Dog();
		array[1] = new _5_Cat();
		array[2] = new _5_American();
		array[3] = new _5_Korean();
		for(_5_Mammal m : array) m.sayThing();
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
