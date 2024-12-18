// 메소드를 사용하는 이유: 반복 사용하거나 특수하게 사용하는 코드를 미리 정의

// 이름을 결정하는 방법
// 대,소문자를 구분하는 백엔드 언어에서 사용
// 1. PassingCasing : 단어의 앞글자를 대문자로 사용, Class, Interface, Enum에서 사용
// 2. camelCasing : 변수의 앞글자만 소문자로 나머지 단어는 대문자를 사용, variable, method

// 대소문자를 구분하지 못하는 HTML이나 React 등 프론트엔드 언어에서 사용
// 3. Sneak_Casing : 단어와 단어 사이에 _(언더 바)를 사용
// 4. Kebbab(케밥)-Casing : 단어와 단어 사이에 -(대시) 사용

/*
 * 메소드를 호출하는 방법 3가지
 * 1) 이름으로 호출, Call (Pass) by name
 * 2) 메소드를 값으로 호출, Call (Pass) by value
 * 3) 메소드를 주소로 호출, Call (Pass) by reference
 */


public class MethodDemo {
// 리턴타입 메소드명 ([매개변수]...) {
//		...
//  	} 이런 구조를 메소드 시그니처라 하고 리턴타입, 메소드명, 괄호 중 하나라도 다르면 다른 메소드
	int calcSum() {
		int sum=0;	
		for (int i=1; i<101; i++) {
				sum +=i;
			}
		return sum;
		
	}

	public static void main(String[] args) {
		MethodDemo tmp = new MethodDemo();
		int sum = tmp.calcSum();
		
		System.out.println("1부터 100까지의 합은?" +sum +"입니다.");
	}
	
}
