
public class _5_GrandSon implements _5_Son {
	public static void main(String[] args) {
		// 할아버지는 아들이나 손자의 메소드는 사용 불가.
		_5_GrandFather jimin = new _5_GrandSon(); jimin._5_GrandFather(); 
		
		// 아빠는 할아버지 메소드는 사용하지만 손자의 메소드를 사용 불가.
		_5_Father chulsu = new _5_GrandSon(); chulsu._5_GrandFather();
		
		// 엄마는 할아버지 메소드와 손자의 메소드 모두 사용 불가.
		_5_Mother younghee = new _5_GrandSon(); younghee._5_Mother();
		
		// 아들은 할아버지, 엄마, 아빠, 자신의 메소드를 사용할 수 있지만, 손자의 메소드는 사용 불가
		_5_Son youngsu = new _5_GrandSon(); youngsu._5_Son();
		System.out.println(_5_Father.NAME + " , " +_5_Mother.NAME); // 각 인터페이스의 Name은 상속되지 않는 상수
	}
	@Override
	public void _5_Father() {
		// TODO Auto-generated method stub
		System.out.println("Called by father()");
	}

	@Override
	public void _5_GrandFather() {
		// TODO Auto-generated method stub
		System.out.println("Called by grandfather()");
	}

	@Override
	public void _5_Mother() {
		// TODO Auto-generated method stub
		System.out.println("Called by mother()");
	}

	@Override
	public void _5_Son() {
		// TODO Auto-generated method stub
		System.out.println("Called by son()");
	}

}
