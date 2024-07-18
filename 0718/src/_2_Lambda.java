/*
 * Lambda & Stream API
 * 1) 람다는 원래 객체지향언어에서 사용하지 않고 Scala나 Groovy 같은 함수형 언어에서 사용하던 문법
 * 2) 자바의 람다는 Lambda Expression, AWS의 람다는 Lambda Function
 * 			자바의 람다도 Function이나 Method 처럼 동작하지만 Lambda Method라고 하지 않는 이유는 
 * 			메소드는 클래스 안에서 객체의 행위를 정의하지만 람다는 특정 클래스의 소속이 아니기 때문
 * 3) 람다 표현식을 사용하면 매개변수와 리턴타입만으로 간결한 코드 작성.
 * 			병렬 프로그래밍을 하지 않아도 되어 Collection Framework에서 효과적인 코드 작성 가능
 * 4) 순서
 * 		- 객체의 생성 부분(new)을 삭제한다.
 * 		- Override Annotation을 삭제한다.
 * 		- 접근지정자, 리턴타입, 메소드 이름을 삭제한다.
 * 		- 파라미터 타입을 삭제한다.
 * 			-- 굳이 파라미터 타입을 정의하지 않아도 추론이 가능하다면 파라미터 타입을 삭제.
 * 			-- 추론이 불가능하면 파라미터 타입을 명시하는데, 모든 대상에 대해 명시한다. (모두 삭제 or 모두 명시)
 * 		- 메소드 return을 삭제한다.
 * 		- 메소드 () 뒤의 {}를 삭제한다.
 * 			-- 메소드의 구현부의 문장이 한 개일 경우에만.
 * 		- 메소드의 파라미터 선언부 괄호 뒤와 ㅖ{ 사이였던 부분을 -> (화살표)로 연결한다.
 * 
 */
public class _2_Lambda {
	public static void main(String[] args) {
		// 기존: Anonymous 객체 만들기
		MyInterface my = new MyInterface() {
			@Override
			public int add(int a, int b) {return a+b;}
			};
		my.add(3, 5);
		
		// 람다 표현: Anonymous 객체를 한줄로 표현 가능
		MyInterface lambda = (a,b) -> a+b;
		lambda.add(3, 5);
	}
}
@FunctionalInterface // 컴파일러에게 람다 용 인터페이스라고 알려줌
interface MyInterface{
	int add(int a, int b);
}

