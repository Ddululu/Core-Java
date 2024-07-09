
public class ArrayDemo3 {

	public static void main(String[] args) {
		// 배열의 주소 복사
		int [ ] original;
		original = new int [3];
		original[0] = 3;
		original[1] = 4;
		original[2] = 5;
		
		int [ ] target = original;  // original의 기존 주소를 target에 연결
		original = new int [4]; // original에 새로운 주소 연결
		original[3] = 6;
		System.out.printf("%d %d",target[2],original[2]); // target에는 기존 배열이 있고, original은 바뀐 배열이 있다.
		System.arraycopy(original, 1, target, 0, 2); // target[0]에 Original[1]부터 2개의 값 복사.
		
		
	}

}
