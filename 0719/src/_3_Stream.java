import java.util.stream.IntStream;

public class _3_Stream {

	public static void main(String[] args) {
		IntStream is = IntStream.range(1, 101);
		int total = is.reduce(0, (a,b) ->a+b); // reduce는 Stream을 소비해 연산하는 최종연산
		// int reduce(int identity, IntBinaryOperator op), identity는 누적을 위한 초기값, op는 연산으로 결과를 identity에 저장하는 역할.
		System.out.println(total);
	}

}
