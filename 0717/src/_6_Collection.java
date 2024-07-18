import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

/*
 * Collection은 특정 순서가 없는 객체 그룹
 * 		- Set은 중복 요소가 없는 객체 그룹
 * 			+ SortedSet은 Set과 같이 중복이 없지만 정렬된 그룹 
 * 		- List는 중복이 허용된 객체 그룹
 * Map은 키와 값으로 매핑한 그룹
 * 		- SortedMap은 키, 값으로 된 그룹으로 키로 정렬된 그룹
 * 
 * 각 요소별 추가, 가져오기, 삭제 메소드는 기억
 */

public class _6_Collection {

	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","홍지민","신지민","곽지민"};
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		Vector<String>vector = new Vector<String>();
		for(String element: array) {
			set.add(element);
			list.add(element);
			vector.add(element);
		}
		
		//덩어리(bulk)로 데이터를 추출하고자 할 때, Enumeration, Iterator
		Iterator<String> iters = set.iterator();
		while(iters.hasNext()) { // .hasNext() 다음 요소가 있다면 True, 아니면 False -> 크기는 모르지만 아무튼 끝날때까지
			System.out.print(iters.next()+",");
		}
		System.out.println();
		
		Enumeration<String> enums = vector.elements();
		while(enums.hasMoreElements()) {
			System.out.print(enums.nextElement()+",");
		}
		
		
		
	}
}
