import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashSet;
// 컬렉션 프레임워크는 컬렉션 (객체의 저장)과 프레임워크 (라이브러리 모음)의 조합.
// 컬렉션 프레임워크는 크게 List, Set, Map 계열로 나눠진다.
// Set 컬렉션은 배열과 같지만 크기가 동적으로 늘어나고, 객체를 중복해서 저장하지 않는 특징이 있다.


public class _6_Set {
	
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","홍지민","신지민","곽지민"};
		Set<String> hashset = new HashSet<String>(); // 입력 순서를 유지하지 않음.
		Set<String> linkedhashset = new LinkedHashSet<String>(); //입력 순서를 유지
		Set<String> treeset = new TreeSet<String>(); // 입력 순서와 상관없이 오름차순 정렬
		for(String element : array) {
			hashset.add(element);
			linkedhashset.add(element);
			treeset.add(element);
		}
		System.out.println(hashset); // [한지민, 홍지민, 신지민, 박지민, 곽지민]
		System.out.println(linkedhashset); // [한지민, 박지민, 홍지민, 신지민, 곽지민]
		System.out.println(treeset); // [곽지민, 박지민, 신지민, 한지민, 홍지민]
	}

}
