
public class _4_Lambda {

	public static void main(String[] args) {
		@FunctionalInterface
		interface Say{ void something(); }
		class Person{
			public void greeting(Say say) {
				say.something();
			};
		}
		
		Person jimin = new Person();
/*		jimin.greeting(new Say() {
			@Override
			public void something() {
				System.out.println("I'm Jimin..");
				System.out.println("Nice to meet you");
			}
		});
*/
		// 람다로 표현
		jimin.greeting(()-> {
			System.out.println("I'm Jimin..");
			System.out.println("Nice to meet you");
		});
	}
}
