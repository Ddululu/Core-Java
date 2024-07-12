// static과 private로 선언한 것은 상속받지 않음.

public class _2_InheritanceDemo //extends Object
{
	public static void main(String[] args) {
		_Son s = new _Son(); 
		s.display(); // override 된 display 출력
	}
}

class _Mother{ 
	private String name = "엄마";
	private int weight = 45;
	public static int height=160;
	
	public void display(){
		System.out.printf("엄마는 %s 무게는 %d 키는 %d\n",name,weight, height);
	}
}

class _Son extends _Mother{
	//@Override // Anotation, 컴파일러에게 재정의(Override) 했음을 알려주는 지시어. 그냥 하면 컴파일러가 오류임을 알려줌
	String name = "아들";
	int weight = 60;
	int height = 180;
	
	public void display() {
		super.display(); // Override 하지 않고 부모(super)의 display()를 사용.
		System.out.printf("엄마는 %s 무게는 %d 키는 %d\n",name,weight, super.height); //name은 private라 상속받지 못함.
	}
}