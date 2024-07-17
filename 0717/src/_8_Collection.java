import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class _8_Collection {

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
