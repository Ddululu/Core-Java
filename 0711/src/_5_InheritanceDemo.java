
public class _5_InheritanceDemo {

	public static void main(String[] args) {
		_5_InheritSuper su = new _5_InheritSuper();
		// su.SUB(); // 부모클래스는 SUB() 메소드를 모른다. -> 자식 클래스의 메소드이기 때문
		su.overshadow();
		su.override();
		
		System.out.println("===================================");
		_5_InheritSub sb = new _5_InheritSub();
		sb.SUB();
		sb.overshadow(); // 자식 클래스는 부모 클래스의 SUPER()를 사용할 수 있다.
		sb.override(); // 같은 시그니처를 가진 메소드가 자식에 정의되어 있다면 상속하지 않는다!

	}

}
