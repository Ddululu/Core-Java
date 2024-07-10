public class _1_CallbyRefDemo {
	void change(int su, String str) {
		su *=5;
		str = "김지민";
		System.out.printf("In Method : money =%d, name =%s\n", su,str);
	}
	
	public static void main(String[] args) {
		
		_1_CallbyRefDemo d = new _1_CallbyRefDemo();
		int money = 1000;
		String name = "한지민";
		System.out.printf("Before money %d, name =%s\n", money,name);
		d.change(money, name);
		System.out.printf("After money %d, name =%s\n", money,name);
		
		/*	출력
		 * 	Before money 1000, name =한지민
			In Method : money =5000, name =김지민
			After money 1000, name =한지민
		 */
		
	}
}
