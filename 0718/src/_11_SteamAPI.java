import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
 * Stream API
 * 1. Stream이란 배열이나 Collection과 같이 여러 개의 데이터를 일관되게 처리하기 위해 추가된 문법
 * 2. Data를 Stream으로 처리하기 위해서는 먼저 Stream 객체를 생성해야 한다.
 * 3. Stream API의 3가지 종류
 * 		1) Stream 생성
 * 			배열을 이용할 것인가 Collection을 이용할 것인가에 따라 약간 다르다.
 * 		2) 생성된 Stream을 Stream으로 리턴하는 중간 연산 (Stream -> Stream), 
 * 			결과가 Stream 형식이기에 다른 Stream 연산에 사용하는 Chain 형식으로 사용할 수 있다.
 * 		3) Stream으로 결과(Output)를 만드는 최종 연산 (Stream -> Output), 
 * 			결과가 Stream이 아닌 형식이기에 다시 Stream 연산에 사용할 수 없다. 
 * 			Output의 동작으로 가지고 있던 Stream을 Consume(소비) 하면서 처리하기 때문이다. 
 * 4. Stream 연산은 원본의데이터를 읽어서 기능을 수행하지만, 그 내용을 변경하지는 않는다.
 * 		Lazy evaluation(지연 처리)로 필요한 요소만 그때그때 메모리에 올려 처리 (배열은 모든 요소를 메모리에 올려야 함)
 */

public class _11_SteamAPI {
	public static void main(String[] args) {
		// 배열로부터 Stream 생성하기.
		Integer [] intArray = {1,2,3,4,5};
		String [] strArray = {"사과","배","딸기","복숭아","레몬","망고","수박"};		
		
		// Stream 클래스를 이용해 스트림 생성
		Stream<Integer> s1 = Stream.of(intArray); // Stream의 메소드를 이용해 배열로부터 스트림을 만들때는 Stream.of(배열)
		Stream<String> s2 = Stream.of(strArray);

		// Arrays로부터 Stream 생성하기
		Stream<Integer> s3 = Arrays.stream(intArray); // Array의 메소드를 이용해 배열로부터 스트림을 만들때는 Arrays.stream(배열)
		Stream<String> s4 = Arrays.stream(strArray); 
		
		// Collection으로부터 Stream 생성하기 -> Set, List 각 계열마다 Stream 메소드를 가지고 있다.
		List<Integer> intlist = Arrays.asList(1,2,3,4,5);
		List<String> strlist = Arrays.asList("사과","배","딸기","복숭아","레몬","망고","수박");
		
		Stream<Integer> s5 = intlist.stream(); // 리스트의 스트림
		Stream<String> s6 = strlist.stream();
		
		Set<String> set = new HashSet<String>(Arrays.asList("사과","배","딸기","복숭아","레몬","망고","수박"));
		Stream<String> s7 = set.stream(); // 셋의 스트림
		
		//지정된 범위를 이용해서 만드는 Stream
		IntStream is = IntStream.range(1,11); // 1~ 10까지 11은 Exclusive, 제외
 		DoubleStream ds = DoubleStream.of(10.5);
 		
 		//난수를 발생하여 Stream 생성하기
 		DoubleStream ds1 = new Random().doubles(15L,1.0,10.0); // 1.0 ~ 10.0 중 15개 추출
 		IntStream is1 = new Random().ints(5,1,10); // 1부터 10까지 중 난수 5개 추출
	}

}
