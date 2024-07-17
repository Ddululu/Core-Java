// Generic은 타입을 고정하지 않고 들어오는 형식에 맞게 Auto-Boxing Auto-Unboxing 하여 저장
// Generic은 형식을 추상적으로 표현해 가장 효율적인 형식으로 변환하는 알고리즘
// Generic의 목적은 자동 형변환을 이용하지 말고 자신의 형식에 맞게 사용하자
public class _5_Generic {

	public static void main(String[] args) {
		
		
		// wildcard type은 최상위 객체인 Object와 같은 의미이지만, 기본적으로 Generic에서는 형변환이 안된다.
		// Car4<Object> obj = new Car4<Integer>(); // 오류 출력 Object형에 Integer형 대입 불가
		Car5<?> cube = new Car5<Integer>(); // -> <?>를 쓰면 Object 하위에 뭐가 나올지 모르겠지만 그거에 맞게 바꾼다는 의미
		System.out.printf("price= %f\n",cube.getPrice());
		
		Car5<? extends Number> num = new Car5<Integer>(100); //-> the List must contain Numbers, Integers, Longs, Floats or one of the other subtypes of Number.
		Car5<? super Number> num2 = new Car5<Integer>(100); // -> the List must contain either Numbers of Objects
		// super인 경우에는 실체형을 따라가고,
		// extends인 경우에는 선언형을 따라간다.
		// ?는 Object 형을 따라간다
		
		// Car3<T>라는 의미는 Car3 클래스는 어떠한 형도 들어올 수 있다. 단, 정해진 <T>는 바꿀 수 없다. 
		// Car3<?>라는 의미는 Car3 클래스에 어떠한 형도 들어올 수 있고, 그 형식 또한 형변환이 가능하다는 뜻
	}

}


class Car5<T extends Number>{ 
	private T price; 
	public Car5() { };
	public Car5(T price) {
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