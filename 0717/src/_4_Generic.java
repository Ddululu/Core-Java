
public class _4_Generic {

	public static void main(String[] args) {
		
		// Integer와 Double은 Number의 하위 클래스이기 때문에 사용 가능.
		Car4 <Integer>carnival = new Car4<Integer>(4000000); 
		Car4 <Double>sonata = new Car4<Double>(45000000.0);
		
//		// String은 Number의 하위 클래스가 아니기 때문에 사용 불가
//		Car4 <String> matiz = new Car4<String>(("10000000"));
//		carnival.setPrice("45_000_000");
		System.out.println(carnival);
	}
}
//<T extends Number>는 Generic 하게 타입을 바꿀 수 있지만, 그 범위를 Number와 그 하위 클래스로 제한한다.
class Car4 <T extends Number>{ 
	private T price; 
	public Car4() { };
	public Car4(T price) {
		this.price = price;
	}

	public T getPrice() {
		return price;
	}

	public void setPrice(T price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.valueOf(price);
	}
	
}