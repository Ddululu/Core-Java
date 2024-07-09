// 스택 영역에 저장되는 값은 초기화가 필요하다!
// 힙 영역에 저장되는 값은 따로 초기화를 하지 않으면 초기값이 저장된다.
// 정수 배열은 할당하지 않으면 자동적으로 0으로 초기화 된다.
// int [] array= new int[4];
//		for(int i =0; i<4; i++) {
//			System.out.printf("array[%d} = %d\t",i,array[i]);
//		}
// 결과: array[0]= 0	array[1]= 0	array[2]= 0	array[3]= 0
import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] array) {
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<4; i++) {
			System.out.printf("array[%s] = %s\n",i,array[i]);
		}
		
	}
}
