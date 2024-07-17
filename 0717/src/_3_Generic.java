// Generic은 타입을 고정하지 않고 들어오는 형식에 맞게 Auto-Boxing Auto-Unboxing 하여 저장
// Generic은 형식을 추상적으로 표현해 가장 효율적인 형식으로 변환하는 알고리즘
// Generic의 목적은 자동 형변환을 이용하지 말고 자신의 형식에 맞게 사용하자
public class _3_Generic {

	public static void main(String[] args) {
		// Car3 carnival = new Car3(40_000_000); // 기존에는 입력을 int형으로 고정했으니 int 외 다른 형식으로 입력하면 오류 출력.
		Car3 carnival = new Car3("40_000_000"); 
		carnival.setPrice("45_000_000");
		System.out.println(carnival);
		
		// Type Erasure, Generic은 타입을 명시 안해도 알아서 처리해줌
		Car3 sonata = new Car3(45000000.0);
		System.out.printf("price= %f\n",sonata.getPrice());
		
		// 하지만 타입을 바꿀 때는 Integer, Double, String과 같은 객체로 변경할 것이라고 라벨을 부착해야 가독성이 높음
		Car3 <String> matiz = new Car3<String>(("10000000"));
		System.out.printf("price= %s\n",matiz.getPrice());
		
		// 마찬가지로 Generic은 자동 형변환을 하지않기 위해 사용하기 때문에
		// 원래라면 형변환이 이루어졌지만 Generic에서는 <Double>형 객체에 <Float> 형 객체를 저장할 수 없다. 
		// Type Mismatch 오류
		//Car3 <Double> bentz = new Car3 <Float>(200000000.0)
		
		// 형변환이 안되는 점을 이용해 입력할 타입에 대한 개런티를 할 수 있다.
		
		// Car3<T>라는 의미는 Car3 클래스는 어떠한 형도 들어올 수 있다. 단, 정해진 <T>는 바꿀 수 없다. 

	}
}
//<T>는 "클래스 내에서 T라는 Generic 형식을 사용할 것이다." 라는 뜻
// 일반적으로 <> 사이에는 의미있는 대문자 1글자를 사용한다.
class Car3 <T>{ 
	private T price; 
	public Car3() {}
	
	public Car3(T price) {
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