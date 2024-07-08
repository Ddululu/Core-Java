// 변수에 값을 할당하기까지
//	int age;  변수의 선언(Declaration)
//	age = 28;  변수의 할당(Assignment)
// age2 = 30; 변수의 초기화(Initialization)

// ==========배열에 값을 할당하기까지
//	1) int [] ages; // 배열의 선언(Declaration), int형 배열 ages를 선언한다.
//	2) ages = new int[4]; // 배열 생성(Creation), ages에 값을 할당하기 위해서는 먼저 heap 메모리에 공간이 있어야 한다.
//	3) ages[0]=6; ages[1]=7; ages[2]=8; ages[3]=9;  // 배열의 할당(Assignment)
//  @ char [] array= {'a','b','c','d'}; // initialization 배열도 선언하며 바로 초기화가 가능하다. 변수와 마찬가지로 값을 바로 할당하며 선언해야 함.

// *** 참조(Reference) 변수의 크기가 모두 다르더라도 배열로 선언할 수 있는 이유 -> 참조 변수의 배열은 8바이트 주소값의 배열이다.

public class AraayDemo {
	public static void main(String[] args) {
		String [] array= {"Hello","World","Good","Java","A"}; // Initialization
		array[3]="Python";
		for(int i=0; i <5; i++) {
			System.out.println("array[" + i + "] = " + array[i]);
		}
	}

}
