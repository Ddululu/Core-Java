import java.util.Arrays;
import java.util.List;

// 리스트 요소 출력
public class _10_Lambda {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("사과","배","딸기","복숭아","레몬","망고","수박");
		
		// 1. 그냥 반복문
		for(int i = 0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		
		// 2. 강화 반목문
		for (String str : list) {
			System.out.println(str+", ");
		}
		
		// 3. list의 forEach 메소드
		// public void forEach(Consumer<? super E> action)
		// Consumer: 모든 요소가 처리되거나 예외가 생길때까지 action을 수행.
		list.forEach(str -> System.out.println(str+", "));
	}
}
