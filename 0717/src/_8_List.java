import java.util.List;
import java.util.Vector;
import java.util.ArrayList;
import java.util.LinkedList;
// 컬렉션 프레임워크는 컬렉션 (객체의 저장)과 프레임워크 (라이브러리 모음)의 조합.
// 컬렉션 프레임워크는 크게 List, Set, Map 계열로 나눠진다.
// List 컬렉션은 배열과 같지만 크기가 동적으로 늘어나고, 인덱스가 있어 객체를 중복할 수 있는 특징이 있다.
// 즉, 넣은대로 출력된다.


public class _8_List {
	public static void main(String[] args) {
		String [] array = {"한지민","박지민","홍지민","한지민","홍지민","신지민","곽지민"};
		List<String> list = new ArrayList<String>(5); // 초기 사이즈 5개 생성, 숫자 지정을 안했다면 기본 사이즈 10
		List<String> vector = new Vector<String>(5,3); // 초기사이즈 5, 추가분을 3개씩 증분, 5개-> 모자라면 +3 -> 모자라면 +3
		for(String element : array) {
			list.add(element);
		}
		
		//------------------------------Array List ---------------------------//
		System.out.println("현재 방 갯수는?\t"+list.size()); // 현재 방 갯수는?		7 , 동적으로 늘어났다.
		System.out.println(list); // [한지민, 박지민, 홍지민, 한지민, 홍지민, 신지민, 곽지민]
		list.remove(0); // 0번째 요소를 제거한다.
		System.out.println(list); // [박지민, 홍지민, 한지민, 홍지민, 신지민, 곽지민]
		System.out.println(list.get(1)); // 홍지민 , .get(1)은 1번째 요소를 가져오라는 뜻
		
		//------------------------------Vector--------------------------------//
		/* Vector는 동기화(Synchronized)된 메소드로 구성되어 있다.
		 * 이는 멀티 스레드 환경에서 vector를 동시에 실행할 수 없음을 의미
		 * 즉, 하나의 스레드가 메소드를 완료해야 다른 스레드가 메소드를 실행할 수 있는 구조
		 * new Vector<String>(1,1)와 같이 메모리를 
		 */
		
		//------------------------------LinkedList----------------------------//
		/* 요소를 저장할 때, 메모리의 여러 지점에 흩어서 저장.
		 * 메모리의 어떤 곳에 저장될 지는 모르지만, 인접한 요소들은 서로의 위치를 알고 있음.
		 * Linkedlist는 인접 참조를 링크해서 체인처럼 관리
		 */
	}

}
