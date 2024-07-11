
public class _5_InheritanceDemo {

	public static void main(String[] args) {
		_5_InheritSuper su = new _5_InheritSuper();
		// su.SUB(); // 부모클래스는 SUB() 메소드를 모른다. -> 자식 클래스의 메소드이기 때문
		System.out.println(su.overshadow);
		su.not_overshadow();
		su.override();
		
		System.out.println("===================================");
		_5_InheritSub sb = new _5_InheritSub();
		sb.SUB();		
		// 자식 클래스에서 동일한 이름의 변수가 있다면 변수를 상속하지 않는다!
		System.out.println(sb.overshadow);
		sb.not_overshadow(); 
		//단, 자식 클래스가 부모 클래스의 메소드를 통해 사용하는 변수라면 부모 클래스의 변수를 사용한다.
		
		sb.override(); // 같은 시그니처를 가진 메소드가 자식에 정의되어 있다면 상속하지 않는다!

	}

}
