// 생성자(Constructor)란?
// 클래스로 인스턴스를 생성할 때, 컴파일하며 오류가 나지 않도록 값을 초기화 해주는 메소드
// 
public class _2_Car {
	private String name;
	private int price;

	public void setName(String name) {this.name = name;}	
	public void setPrice(int price) {this.price = price;}
	
	public String getName() {return name;}
	public int getPrice() {return price;}
	
/*	클래스의 생성자를 선언하지 않았다면 기본 생성자가 생성된다.
 	즉, 생성자가 없다면 이런 기능을 하는 코드들이 자동으로 생성된다.
 	public _2_Car() { };  
 	-> 클래스가 public 이라면 public 생성자가, private 라면 private 생성자가 만들어짐*/ 
	
	public _2_Car(String name, int price) {
		this.name=name;
		this.price=price;
	} // 클래스를 생성할 때, 이름과 price를 입력할 수 있는 생성자
}
