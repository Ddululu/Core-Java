import java.util.Random;
import java.util.stream.IntStream;

public class _2_Stream {

	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1,100);
		int sum = is.sum(); // sum()은 Stream의 최종 연산 -> 모든 요소를 소모해서 더해라
		
		//  long count = is.count(); // java.lang.IllegalStateException: stream has already been operated upon or closed
		
		// 1. 오류 발생 : IllegalStateException, 스트림이 이미 최종 연산 되었는데 다시 사용하려 할 경우
		// 2. 필요하다면 스트림을 다시 생성해야 한다.
		
		System.out.println(sum);
		
		/* 1부터 100사이에 난수를 발생하여 중복을 배제하고 Sort까지 수행.
				1) 1~ 100 사이 난수 생성. Random()의 ints() 사용
				ints()는 지정된 원점(포함)과 경계(제외)에 맞는 실질적으로 무제한의 의사난수 값 스트림을 반환
				2) distinct()는 스트림을 입력받아 고유한 요소로 구성된 스트림, 중복이 제거된 스트림을 반환합니다.
				3) limit()는 스트림을 입력받아 크기를 지정. 이 크기로 잘라진 스트림을 반환합니다.
				4) sorted()는 스트림을 입력받아 요소를 오름차순으로 정렬된 순서로 구성된 스트림을 반환합니다.
				*/

		IntStream is2 = new Random()
				.ints(1, 101) // IntStream  ints(int randomNumberOrigin, int randomNumberBound) -> 결과물이 Stream이다.
				.distinct() // IntStream distinct() -> Stream의 메소드
				.limit(5) // IntStream limit(long maxSize)
				.sorted(); // IntStream sorted()
		is2.forEach(d->System.out.printf("%d\t", d));

	}

}
