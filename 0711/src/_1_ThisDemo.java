// this는 클래스 내에서 객체 자기 자신의 주소를 가르킨다.
/*	this의 용법
 *  	1) this		: 나(클래스) 자신의 주소
 *  	2) this.[]	: 나 자신이 가진 []의 주소, 
 *  	3) this()		: 내가 나의 또다른 생성자를 호출할때 사용한다.
 *  
 */
public class _1_ThisDemo {
	public static void main(String[] args) {
	_1_Car sonata = new _1_Car();
	sonata.setName("현대소나타");
	sonata.setPrice(30_000_000);
	System.out.println();
	
	}
}
