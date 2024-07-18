
public class _6_Lambda {

	public static void main(String[] args) {
		//파라미터도 있고 리턴도 있는 람다
		@FunctionalInterface
		interface Say{
			int something(int a);
		}
		class Person{
			public void greeting(Say say) {
				int value = say.something(5);
				System.out.println(value);
			}
		}
		
		Person jimin = new Person();
		jimin.greeting(new Say() {
			@Override
			public int something(int a) {
				System.out.println("I'm Jimin..");
				System.out.println("Nice to meet you");
				return a*10;
			}
		});

		// 람다로 표현
		jimin.greeting( (a)-> {
			System.out.println("I'm Jimin..");
			System.out.println("Nice to meet you");
			return a*20; // 다른 구문도 있기 때문에 리턴을 명시
		});
	}
}


