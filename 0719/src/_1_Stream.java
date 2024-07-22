import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.IntStream;

public class _1_Stream {
	public static void mian() {
		int sum =IntStream.rangeClosed(1, 100).sum(); // rangeClosed는 뒤의 수가 포함된 범위
		long count = IntStream.rangeClosed(1, 100).count();
		
		//1.0 ~ 100.0 까지 난수 15개 중 최대값은?
		OptionalDouble max =new Random().doubles(15L,1.0,100.0).max(); // max()는 요소 중 최대값
		System.out.println(max.getAsDouble());

//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//
//		numbers.stream()
//		       .filter(n -> n % 2 != 0)   // 홀수만 필터링
//		       .map(n -> n * n)           // 제곱 계산
//		       .forEach(System.out::print);  // 출력

	}
	
}
