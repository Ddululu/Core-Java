// 보내는 쪽은 argument, 받는 쪽은 parameter
// argument를 보내고 parameter로 받는다.
// variable argument 란 보내는 쪽의 크기(갯수)가 고정이지 않을때 이를 배열 형식의 parameter로 받기 위해 사용.

public class _4_VariableArgumentDemo {
	void change(int ... target ) { // target이 parameter이다. (Type ... 매개변수) 와 같은 구조로 만드는 것이 Variable Argument 
		for(int su : target) {
			System.out.println(su);
		}
	}
	
	// 갯수는 Variable Argument로 수용하고,
	// 타입은 Object(Class ,Method 등)으로 수용하면 어떻게 보내든 모두 수용한다. 
	void Obj_change(Object ... target) {
		for(Object c : target) {
			System.out.printf("%x\t",c);
		}
	}
	
	public static void main(String[] args) {
		_4_VariableArgumentDemo vad = new _4_VariableArgumentDemo();
		int original = 5;
		vad.change(original); // original이 argument이다. 인자(인수)
		vad.change(5,6,7,8,9,10); // change는 1개의 인수를 받는 것으로 보이지만, variable argument를 통해 배열로 받음.
		
		vad.Obj_change();
	}
	
}

