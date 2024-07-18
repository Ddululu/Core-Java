/*
 * Collection Framework와 Lambda Expression
 */

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _8_Lambda_Collection {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,7,1,2,9,3,5,8);
		List<String> list2 = Arrays.asList("가","나","다","라","마","바");
		// 1st way
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer front, Integer back) {
				return front - back;
			}});
		
		// 2nd lambda
		Collections.sort(list,(front,back)->front-back); 
		Collections.sort(list2,(front,back)->back.compareTo(front)); //문자 내림차순, 바꾸면 오름차순
	
	System.out.println(list);
	System.out.println(list2); // [바, 마, 라, 다, 나, 가]
	}
}
