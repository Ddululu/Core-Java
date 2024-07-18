/* 
============Arrays에서 가장 많이 사용하는 메소드=================
 - asList() : Array를 List로 만들어주는 메소드
public | static <T> List<T> | asList(T... a)

- sort() : Array를 입력받아 Dual-Pivot Quicksort 하는 메소드
public | static void | sort( Object[] )
public | static void | sort( Object[], int fromIndex, int toIndex )

*/

import java.util.Arrays;
import java.util.List;

public class _1_Arrays {
	public static void main(String[] args) {
		//List<Integer> list = Arrays.aslist(4,6,8,1,2);
		//List<String> list1 = Arrays.asList("한지민","홍지민","이지민","박지민");
		int [] array= {5,7,1,2,7,2,9,5};
		Arrays.sort(array);
		for(int a:array) System.out.print(a+", ");

	}

}
