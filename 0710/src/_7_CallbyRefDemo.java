
public class _7_CallbyRefDemo {
	public static void main(String[] args) {
		_7_Student younghee = new _7_Student();
		
		// 다른 클래스에 있다면? new 로 생성하고 호출하면 된다.
		new _7_Input().input(younghee);
		new _7_calc().calc(younghee);
		new _7_output().output(younghee);
	}
	
}
