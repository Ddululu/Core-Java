
public class ArrayDemo4 {

	public static void main(String[] args) {
		double [] array= {3.14, 89.5, 182.5, 69.2};
		
		// 기존 for 문 -> length를 알아야 몇 번 돌지 알 수 있다.
		for (int i=0; i<array.length;i++) {
			System.out.printf("%.2f\n", array[i]);
		}
		// 향상된 For 문 for(타입 변수 : 배열) -> 반복 대상의 처음부터 가져올 항목이 없을때 까지
		// array[0]부터 array[n]까지 d에 저장하며 루프 실행
		System.out.println();
		for(double d : array) {
			d+=d;
			System.out.println(d);
		}
	}

}
