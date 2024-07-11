/* 
 * 클래스를 생성하면 보이지 않는 특별한 메소드가 자동으로 생성된다.
 * 이를 기본 생성자, Constructor 메소드라 한다.
 * 
 * #인스턴스 생성을 위한 Constructor 메소드
 * 
 * 메소드는 new 클래스()와 같은 형식으로 파라미터와 리턴 타입이 없는 것이 특징
 * 인스턴스를 생성할때만 사용하고 항상 클래스명과 동일한 메소드명을 갖는다.
 * new로 인스턴스를 생성할때, Constructor(생성자)에 의해 값이 초기화된다.
*/
public class _2_ConstructorDemo {
	public static void main(String[] args) {
		
		// 생성자가 없기 때문에 기본 생성자가 만들어졌다.
		_1_Car sonata = new _1_Car();  
		// -> 값을 넣지 않았더라도 오류가 발생하지 않고 호출가능.
		
		System.out.println(sonata.getName()); // 스트링와 같이 참조 타입은 null
		System.out.println(sonata.getPrice()); // price와 같이 정수 타입은 0
		
		// _2_Car sonata1 = new _2_Car(); _2_Car에는 이미 생성자가 있기 때문에 기본 생성자가 안 만들어졌다.
		
		_2_Car sonata2 = new _2_Car("sonata",100000);
		System.out.println(sonata2.getName()); // 출력: sonata
		System.out.println(sonata2.getPrice()); // 출력: 100000
		// 이전 클래스에서 이미 초기화가 된 경우에는 기본값 대신 해당 값으로 초기화
	
	}
	

}
