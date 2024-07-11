// this. 를 사용한 것과 아닌 것의 차이
public class _1_Car {
	private String name;
	private int price;
	
	/* 1) public void setName(String name) {name = name;}
	컴파일러는 name이 지역 변수(private name)인지, 
	매개변수(String name)인지 구분을 못한다.
	*/
	
	/* 2) public void setName(String n) {name = n;}
	컴파일러가 구분할 수 있도록 매개변수 name을 다른 이름으로 바꾼다면
	더 이상 오류가 발생하지 않는다 -> 하지만 이제 요소로 받는 내용이 무슨 의미인지 모른다.
	 */
	
	// 3) this. 클래스 내에 있는 지역변수를 가리키는 식별자
	public void setName(String name) {this.name = name;}
	// 이제 컴파일러는 같은 name을 보더라도 this.가 붙은 경우와 안 붙은 경우를 구분한다.
	
	
	public void setPrice(int price) {this.price = price;}
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	
	public _1_Car clone(){
		return this;
	}
}
