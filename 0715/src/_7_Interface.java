
public class _7_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_7_Product pencil = new _7_Product("모나미연필");
//		_7_Product ballpen = pencil; // 주소복사
//		System.out.println(ballpen.name); 
//		// 주소 복사는 같은 객체를 가리킨다.
		
		_7_Product ballpen = pencil.copy(); // cloneable 인터페이스를 이용하면 값을 복사한다.
		System.out.println(ballpen.name); // 출력 : 모나미연필
		pencil.name = "컴퓨터";
		System.out.println(ballpen.name); // 출력: 모나미연필
		
	}
}
// Cloneable 인터페이스는 상속할 메서드나 필드가 없는 인터페이스로 
// 특정 기능를 활성화 할 수 있도록 선언하는 flag interface.
class _7_Product extends Object implements Cloneable{ 
	String name;
	public _7_Product(String name) {this.name=name;}
	public _7_Product copy()  {
		_7_Product target = null;
		try {
			Object obj = this.clone();
			if(obj instanceof _7_Product) target=(_7_Product)obj;
			else System.out.println("형변환 안됨");
		} catch (CloneNotSupportedException e) {
			System.out.println("복제불가");
		}
		return target;
	}
}
