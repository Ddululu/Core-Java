
public class _5_Lambda {

	public static void main(String[] args) {
		//파라미터는 없지만 리턴은 있는 람다
		@FunctionalInterface
		interface Say{ int something(); }
		class Person{
			public void greeting(Say say) {
				int value = say.something();
				System.out.println(value);
			}
		}
		
		Person jimin = new Person();
		jimin.greeting(new Say() {
			@Override
			public int something() {
				System.out.println("I'm Jimin..");
				System.out.println("Nice to meet you");
				return 100;
			}
		});

		// 람다로 표현
		jimin.greeting(()-> {
			System.out.println("I'm Jimin..");
			System.out.println("Nice to meet you");
			return 200; // 다른 구문도 있기 때문에 리턴을 명시
		});
	}
}
