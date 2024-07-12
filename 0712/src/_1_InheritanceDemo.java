// 메소드의 Override
// TMI. 암묵적으로 모든 기본 클래스는 superclass인 Object 클래스로부터 상속받는다.

public class _1_InheritanceDemo //extends Object
{
	public static void main(String[] args) {
		Horse h = new Horse(); 
		h.display(); // override 된 display 출력
	}
}

class Mammal{ 
	private String name = "포유류";
	public int weight = 10;

	public void display(){
		System.out.printf("나는 %s 무게는 %d\n",name,weight);
	}
}

class Horse extends Mammal{
	@Override // Anotation, 컴파일러에게 재정의(Override) 했음을 알려주는 지시어. 그냥 하면 컴파일러가 오류임을 알려줌
	public void display() {
		super.display(); // Override 하지 않고 부모(super)의 display()를 사용.
		System.out.printf("나는 제주말이야.");
	}
}