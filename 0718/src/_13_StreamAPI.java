import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class _13_StreamAPI {

	public static void main(String[] args) {
		DoubleStream ds1 = new Random().doubles(10L,1.0,10.0); // 1.0 ~ 10.0 중 10개의 실수 추출
		// 1) new Random().doubles(10L,1.0,10.0)으로 10개의 실수가 저장된 객체가 생성된다.
		// 2) ds에는 10개의 실수가 Stream 형태로 저장된다. 
		// -> Stream은 배열과 같이 보이지만, 원본을 변경하지 않는다. 
		ds1.forEach(d->System.out.printf("%.2f\t", d)); 
		System.out.println();
		
		int result = IntStream.rangeClosed(1,100).sum();
		System.out.println(result);
		
	}

}
