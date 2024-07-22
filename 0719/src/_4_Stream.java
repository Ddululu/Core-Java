import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//filter(조건) :주어진 술어와 일치하는 이 스트림의 요소로 구성된 스트림을 반환합니다.
//filter에 Lambda를 사용하면 (스트림요소 -> 조건(스트림요소))와 같이 사용

//map( Function() ) : 주어진 함수를 이 스트림의 요소에 적용한 결과로 구성된 스트림을 반환합니다.
//map에 Lambda를 사용하면 (스트림요소 -> 함수(스트림요소)와 같이 사용

//map과 forEach는 동일한 형식으로 사용하지만, map은 스트림을 반환하는 중간 연산. forEach는 최종 연산
public class _4_Stream {

	public static void main(String[] args) {
		String [] array = {"abc", "Hello", "Hi~", "Java Language"};
		
		Stream<String> sStream = Stream.of(array); // 배열을 Stream 형식으로 값 복제..? -> 원본 사용 X
		
		sStream
		.filter(str->str.length()>=5) // filter(Predicate<? super T> predicate) 
		.forEach(s->System.out.println(s));

		List<Customer> list = new ArrayList<Customer>();
		Customer c1 = new Customer("한지민", 28); list.add(c1);
		Customer c2 = new Customer("김지민", 38); list.add(c2);
		Customer c3 = new Customer("박지민", 48); list.add(c3);
		Customer c4 = new Customer("홍지민", 58); list.add(c4);
		
		Stream<Customer> CSList = list.stream(); // 리스트을 이용해 스트림 생성
		CSList
		.map(c->c.getName()) // map(Function<? super T,? extends R> mapper)
		.forEach(s -> System.out.println(s));		
		
		
		
		}
	public static class Customer{
		private String name;
		private int age;
		
		public Customer(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}
}
