// Primitive 타입 8개에 대해서는 Auto-Boxing을 제공한다.

// 예를들어 int 형은 Integer 객체로 Auto-Boxing된다. -> 주소값을 찾아가 값을 저장한다.
// Integer 객체는 int 형으로 Auto-Unboxing이 된다. -> 주소값을 찾아가 값을 가져와 리턴한다.

public class _14_Wrapper {

	public static void main(String[] args) {
		// jdk 1.5 (5버전) 전에는 Auto Boxing을 제공하지 않아 수동으로 했었음.
		int su = 5;  // Stack에 있는 5
		//Integer in = new Integer(su); // Wrapping, Boxing // Heap에 있는 5
		//int another = Integer.valueOf(in); // Unwrapping, Unboxing.
		
		
		// Auto-Boxing, Auto-UnBoxing은 대입될 경우 발생한다.
		Integer in = su*100; // Auto-Boxing
		int another = in; // Auto-Unboxing
		
		
	}

}
