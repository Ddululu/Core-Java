/* 메소드 Overloading 이란, 동일 클래스 안에서 같은 이름을 사용하는 방식이다.
이런 이유는 메소드는 시그니처로 구분하기 때문이다.
메소드의 구조는 Type Name( arg )인데 이를 메소드 시그니처라 한다.
 
자바는 이를 이용해 Name, arg 중 하나라도 다르다면 다른 메소드로 본다는 것이다.
(Type이 다른 경우는 타입캐스트를 고려한다면 같은 메소드로 볼 수 있다.)

API 문서의 printf(char c), printf(int d), printf(float f)와 같은 메소드 구조가 Overloading이다.
-> 파라미터의 입력값마다 다른 메소드명을 가지면 찾아가기 힘듦, 
대신 하나의 이름으로 입력값에 따라 그에 맞는 메소드가 동작하도록 하기 위해 Overloading 사용
*/
public class _5_OverloadingDemo {
	// 같은 이름일 때, Parameter(수와 순서)와 Type에 영향을 받는다.
	// Parameter의 이름과 메소드의 Type은 영향을 주지 않는다.
	void change() {}
	void change(int a, short b) {}
	// void change(int b, short a){} -> 파라미터 충돌
 	void change(short a, int b) {} // 사용 가능.
	
	void change(double a) {}
	
	public static void main(String[] args) {

	}

}
/*
 * 객체지향방법론에서는 자연에 존재하는 객체를 
 * 속성(State, Attribute, Property 등)과 행동(Behavior, function, Method 등)으로 구분해 코드로 표현한다.
 * 일반적으로 객체를 표현할때, 다음과 같이 표현할 수 있다.
 * 객체 {
 * 			속성1 = "Value"
 * 			속성2 = "Value"
 * 			행동1() = "앞으로 간다" 
 * 			}
 * 여기서 속성을 Filed라고 하고 행동을 method라고 한다.
 * 접근하기 위해서는 객체를 생성하고 객체.속성1이나 객체.method()를 통해 접근
 * 
*/

