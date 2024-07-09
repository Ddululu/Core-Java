public class MethodDemo3 {

	void print() { 
		System.out.println("Hello World!!!");
	}
	
	int print_num() {
		System.out.println("12345678!!!");
		return 0;
		// System.out.println("12345678!!!"); 
		// 도달할 수 없는 구문(모든 상황에서 실행이 불가능한 구문)이 확인되면 Unreachable Error 발생
	}
	public static void main(String[] args) {
		MethodDemo3 md = new MethodDemo3();
		md.print();
		/* md.print(); 가 호출 
		 * -> void print() 메소드 실행 
		 * -> Hello World!!! 출력 
		 * -> 메소드 종료 -> md.print();로 복귀 
		 * 여기서 void 형은 복귀할 때, 아무것도 가져오지 않는다는 뜻  
		 */
		md.print_num();
		/* md.print_num(); 가 호출 
		 * -> int print_num() 메소드 실행 
		 * -> 12345678!!! 출력 
		 * -> 메소드 종료 -> md.print_num();로 복귀하며 0을 가져옴.  
		 * 0을 가져온다는 것은 이 값을 정수형 변수에 다시 저장할 수 있음.  
		 */
	}
	
}
