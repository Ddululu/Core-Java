// 멤버 변수의 값을 초기화 하는 방법 
public class _4_InitBlock {
	private double weight = 70; // 1) weight가 70으로 직접 초기화된다.
	private char grade = 'B';
	
	{
		this.weight=100; this.grade='F';
	} // 2) weight와  grade가 초기화 블록(Initialization Block)에 의해 다시 초기화 
	// -> 2. 객체가 생성되기 전 생성 단계에서 단, 1회 초기화 블록에 의해 초기화.
	
	public _4_InitBlock() {
		this.weight = 62.4;
		this.grade='C';
	} // 3) 생성자를 통해 초기화한다.
	
	public static void main(String[] args) {
		_4_InitBlock jimin = new _4_InitBlock();
		System.out.println(jimin.weight);
		System.out.println(jimin.grade);
		/*
		 * 출력: 
		 * 62.4
		 * C
		 */
		// 초기화 우선순위 : 1. 생성자() 2. 초기화 블록{ } 3. 직접 초기화 (선언+값 할당)

	}

}
