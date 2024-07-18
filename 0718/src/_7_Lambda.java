
public class _7_Lambda {

	public static void main(String[] args) {
		//파라미터가 2개 있고 리턴이 있는 람다
		@FunctionalInterface
		interface Say{
			int something(int a, int b);
		}
		class Person{
			public void greeting(Say say) {
				int value = say.something(5, 10);
				System.out.println(value);
			}
		}
		
		Person jimin = new Person();
		jimin.greeting(new Say() {
			@Override
			public int something(int a ,int b) {
				System.out.println("I'm Jimin..");
				System.out.println("Nice to meet you");
				return a*b;
			}
		});

		// 람다로 표현
		jimin.greeting( (a,b)-> {
			System.out.println("I'm Jimin..");
			System.out.println("Nice to meet you");
			return 2*a*b; // 다른 구문도 있기 때문에 리턴을 명시
		});
	}
}


