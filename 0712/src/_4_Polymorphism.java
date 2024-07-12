/* Polymorphism (다형성)을 구현하는 방법
 * 1. 객체 형변환
 * 		1) 자동 형변환 : 자식 객체가 부모 객체로 형변환 할때
 * 		2) 강제 형변환 : 부모 객체가 자식 객체로 형변환 할때, 단 형변환이 가능할 때만(instanceof가 true)
 * 2. Override Method
 */
public class _4_Polymorphism {
	public static void main(String[] args) {
		pMother m = new pMother();
		// pAnother a = new pAnother();
		pSon s = new pSon();
// m = a; 서로 다른 객체끼리는 형변환이 불가능하다.
// m = (Mother) a; 마찬가지로 다른 객체끼리는 강제 형변환도 불가능하다.
		
		// 각자 자신의 pDisplay()를 사용함. 
				m.pDisplay();
				s.pDisplay();
				
		
//객체 형변환		
//1) 자동 형변환 : 자식 객체를 부모 객체에 대입할때
		m = s; // -> m = (Mother)s; 로 자동 변환
		m.pDisplay();  //
		
/*2) 강제 형변환 : 부모 객체를 자식 객체에 대입할때
 s = m; 		부모 객체은 자식 타입으로 자동 형변환이 되지 않는다.
 s=(Son)m;	부모 객체를 자식 타입으로 강제 형변환을 하면 대입이 가능하다.
 				단, instanceof 명령어로 변환이 가능한지 확인을 해야 한다. -> 형 변환이 안될 수 있다*/		
		if(s instanceof pMother) {System.out.println("변형됨");  s=m; }
		else 						{System.out.println("형변환 불가");}
		
		
	}
}

class pMother {
	void pDisplay() { System.out.println("나는 부모 클래스"); 
	} 
}
class pSon extends pMother {
	@Override
	public void pDisplay() { System.out.println("나는 자식 클래스");
}
class pAnother {}
}