// 다차원 배열은 대괄호의 수로 판단.
// 대괄호가 2개면 2차원 배열
public class ArrayDemo2 {
	public static void main(String[] args) {
		//int [] [] array = new int[4][3]; //  array는 4행 3열의 "크기가 고정된" 2차원 배열이다. Rectangular Array
		//int [] [] array = new int[4][]; 한쪽 배열의 크기가 "고정되지 않아"도 된다. Jagged(Ragged) Array 
		// -> 뒷 배열의 크기가 어떻게 들어와도 상관 없다. 
		//
		
//		int [] [] array= {
//				{1,		2,		3},
//				{4,		5,		6},
//				{7,		8,		9,},
//				{10,	11,		12}
//		}; // 한 번에 다 초기화 할 수 있다. 
		
		int [] [] array;
		array = new int[4][3]; // 자바에게 array는 int 형 배열 [4][3] 만큼 사용할 것이라고 알려줌
		array[0] = new int []{1,2,3}; // 자바는 초기화를 할 때, 크기를 적지 않음. 배열 안 요소의 갯수가 곧 크기
		array[1] = new int []{4,5,6}; 
		array[2] = new int []{7,8,9};
		array[3] = new int []{10,11,12};
		// 배열에 또 다른 배열을 참조하도록 구성해 array를 쪼개 할당할 수 있다.
		
//		array[0] = new int []{1,2,3,4}; 
//		array[1] = new int []{5,6};
//		array[2] = new int []{7};
//		array[3] = new int []{8,9,10,11,12};
		System.out.print(array[3].length);
		
		for (int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				System.out.printf("array[%d][%d] = %d\t",i,j,array[i][j]);
			}
			System.out.print("\n");
		}
		
		
	}
}
