// 인터페이스는 생성자를 가질 수 없다.
// 인터페이스는 변수를 가질 수 없다.
// 인터페이스에는 상수와 Body가 없는 추상 메소드만 포함될 수 있다.
public class _3_Interface {
	 public static void main(String[] args) {
		 //5. Interface도 추상 클래스처럼 인스턴스화가 안된다.
		 // _3_Mammal m = new Mammal();
		 
		_3_Mammal m = new Dog(); m.display();
		_3_Mammal m1 = new Cat(); m.display();
		
		
		//6. Interface에 선언된 상수는 바꿀 수 없다.
		m.PI = 3.15;
		
		//_3_Mammal [] array= {new Dog(), new Cat() };
		_3_Mammal [] array = new _3_Mammal[2];
		array[0] = new Dog();
		array[1] = new Cat();
		for(_3_Mammal m2 :array) m2.display();
	}

}


// 3. interface를 구현 시 implements 키워드를 사용해야 한다.
class Dog implements _3_Mammal{
	// 4. interface 추상메소드를 재정의 시 반드시 public이어야 한다.
	@Override
	public void display() {
		System.out.println("개에 맞게 재정의 된 메소드");
	}
}

class Cat implements _3_Mammal{
	@Override
	public void display() {
		System.out.println("고양이에 맞게 재정의 된 메소드");
	}
}
}


