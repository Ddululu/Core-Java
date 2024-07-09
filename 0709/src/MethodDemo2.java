
/* 메소드를 호출하는 방법 3가지
 * 1) 이름으로 호출, Call (Pass) by name
 * 2) 메소드를 값으로 호출, Call (Pass) by value
 * 3) 메소드를 주소로 호출, Call (Pass) by reference
 */

class Product{
	int price;
}

public class MethodDemo2 {
/* 2. call by reference, 주소를 이용해 호출
	주소를 이용해 호출하는 경우 원래 주소를 재 참조하기 때문에 원래 값이 바뀐다.
	ex) change()를 연산하는 동안 arg1가 참조하는 값은 연산이 끝나고도 바뀌어 있다.
*/
	void change(Product arg1) { 
		arg1.price = 50000;
	}
	
	public static void main(String[] args) {
		
		Product pencil = new Product();
		pencil.price = 100;
		System.out.printf("현재 연필의 가격은 %d\n",pencil.price);
		
		MethodDemo2 md = new MethodDemo2();
		md.change(pencil); // 매개변수로 참조변수가 들어가면 call by reference
		
		System.out.printf("바뀐 연필의 가격은 %d",pencil.price);
		
		
	}
	
}
