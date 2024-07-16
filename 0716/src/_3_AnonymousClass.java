
public class _3_AnonymousClass {
	public static void main(String[] args) {
		_3_AnonymousClass acd = new _3_AnonymousClass();
		Dog dog = new Dog();
		acd.display(dog);
		
		// Mammal 익명 객체를 만들어 저장할 수 있다.
		Mammal cat = new Mammal() {
			@Override
			public void sound() {System.out.println("야옹야옹");}
		};
		acd.display(cat);
		
		// 익명 객체를 메소드 동작 중에만 사용할 수 있다.
		acd.display(new Mammal() {
			@Override
			public void sound() {System.out.println("왈왈왈왈");}
		}); // acd.display 구문이 끝날때 까지만 익명 객체를 생성, 사용
	}
	
	void display(Mammal m) {
		m.sound();
	}
}

interface Mammal{
	void sound();
}

class Dog implements Mammal{
	public void sound() {
		System.out.println("멍멍멍멍");
	}
}