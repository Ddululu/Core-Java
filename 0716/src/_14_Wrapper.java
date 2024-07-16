
public class _14_Wrapper {

	public static void main(String[] args) {
		int su = 5;  // Stack에 있는 5
		//Integer in = new Integer(su); // Wrapping, Boxing // Heap에 있는 5
		//int another = Integer.valueOf(in); // Unwrapping, Unboxing. // 
		
		Integer in = su*100; // Auto-Boxing
		int another = in; // Auto-Unboxing
	}

}
