// 박쥐는 포유류이면서 조류.
// 자바에서는 이중 상속이 불가능, 오직 하나만 상속할 수 있다.
// 따라서 동종(클래스-클래스)는 extends를 이용해 상속, 
// 이종(클래스-인터페이스)는 implements를 이용해 다중 상속을 구현한다. 인터페이스는 여러 개를 사용할 수 있음.
public class _4_Bat extends _4_Mammal implements _4_Birds{ // 포유류를 상속하고, 조류 인터페이스를 구현. 마치 다중상속

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("하늘을 날다.");
	}

	@Override
	public void giveBirthto() {
		// TODO Auto-generated method stub
		System.out.println("새끼를 낳다.");
	}
	
}