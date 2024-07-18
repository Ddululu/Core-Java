/*
 * @FunctionalInterface
 * 1. 일반적으로 interface는 한 개 이상의 추상메소드를 가질 수 있다.
 * 2. 하지만 여러개의 추상메소드가 있다면 Lambda Expression에 에러가 발생한다.
 * 3. @FunctionalInterface는 Lambda Expression에서 사용하기 위한 인터페이스를 지정하기 위한 Annotation이다.
 */
public class _3_Lambda {

	public static void main(String[] args) {
		// 1-1) 익명객체 만들기.
		Comparable com = new Comparable() {
		@Override
			public int compare (int front, int back) { return front - back; }
		};
		
		// 1-2) 위 코드를 대신 람다 표현
		Comparable comp = (a,b) -> a-b;
		
		
		int max = com.compare(5, 3);
		System.out.println(max);
		
		// 2-1) FunctionInterface로 메소드를 만들고 익명객체 대입
		calculator(new Comparable() {
			@Override
			public int compare(int front, int back) {
				return front - back;}
		});
		
		// 2-2) 위 코드를 람다로 표현
		calculator( (front,back) -> front-back );
		
	}

	private static void calculator(Comparable comp) {
		int a=5, b=10;
		int result = comp.compare(a,b);
		System.out.println("result = "+result);
	}

}
@FunctionalInterface
interface Comparable{
	int compare(int front, int back);
}