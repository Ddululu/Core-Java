// 생성자는 상속하지 않는다.
// 자식 생성자는 부모의 기본 생성자만 상속받는다. 
// 다른 생성자를 호출할 경우 명시적으로 선언해야 한다. super( 생성자 )

public class _3_InheritanceDemo //extends Object
{
	public static void main(String[] args) {
		Sonata s = new Sonata("sonata",30_000_000);
		/* 출력 1) 자식이 부모 생성자를 명시하지 않은 경우: 
		 * 나는 부모의 생성자 -> 자식 클래스를 만들기 위해 부모 클래스를 먼저 만들기 때문
		 * 나는 자식의 생성자*/
		
		/*출력 2) 자식이 부모 생성자를 명시한 경우: Super(name,price)
		 * sonata			300000000
		 * 나는 자식의 생성자 */
		
	}
}

class Car // extends vehicle // final 클래스 상속으로 오류
{ 
	String name;
	int price;
	
	public Car() {System.out.printf("나는 부모의 생성자\n");};
	public Car(String name, int price){
		this.name=name; this.price=price;
		System.out.println(name +"\t"+ price);
	}
}

// final 클래스는 더 이상 상속하지 않는다는 뜻, 상속 받아 덮어 쓰기가 불가능. 언제나 동일한 기능을 사용하도록 제한
//final class vehicle{
//	System.out.println("나는 final 클래스");
//}


// 상속할때, 자식 클래스는 부모 클래스보다 제공 범위가 좁아질 수 없다.
// 즉, Override 된 자식 메소드의 접근 범위는 부모 메소드보다 같거나 더 넓어야 ss한다.
// public > protected > (default) > private
class Sonata extends Car{
	public Sonata(String name, int price) {
		super(name, price);
		System.out.printf("나는 자식의 생성자\n");
		// super(name, price); 다른 생성자를 가져올 때, 항상 첫 줄에 선언해야 한다. 
	}
}