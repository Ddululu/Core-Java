
public class _3_CallbyRefDemo {
	public static void main(String[] args) {
		_2_Student younghee = new _2_Student();
		
		// 다른 클래스에 있다면? new 로 생성하고 호출하면 된다.
		new _3_Input().input(younghee);
		//new _3_calc().calc(younghee);
		_3_calc.calc(younghee); // 메소드가 static인 경우 클래스 명으로 접근한다.
		new _3_output().output(younghee);
	}
	
}
