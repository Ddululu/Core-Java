class Car{
	String name; // 아무것도 없으면 default로 설정
	private int price;
	
	public void setPrice(int p) {price = p;}
	public int getPrice() {return price;}
	
	public String getName() {
		return name;
	}
	public void setName(String _name) {
		this.name = _name; // 지역변수(this) name에 입력받은 매개변수 _name의 데이터를 넣는다.
	}
	
}
public class _6_EncapDemo {

	public static void main(String[] args) {
		Car sonata = new Car();
		
		sonata.name = "현대 소나타"; //default로 설정된 name은 다른 클래스에 속한 main에서 사용 가능.
		
		// sonata.price = 30000000; 에러 -> priave로 설정된 price는 다른 클래스에서 사용 불가능.
		
		sonata.setPrice(3000000); // Car 클래스 내에 Price를 수정할 수 있는 메서드를 만들면 된다.
		
		// System.out.println("이름="+sonata.name+"가격="+sonata.price); 
		// 에러 -> name은 public이라 바로 가져올 수 있지만, price는 private라 가져올 수 없다. -> price만 가져올 메소드가 필요
		System.out.println("이름="+sonata.name+"가격="+sonata.getPrice()); 
		// 이러한 get, set 메서드들은 클래스 위치에서 우클릭 -> source -> generate getter and setter로 생성하면 따로 정의할 필요 없음.
		
		
		// 자판기라는 객체를 정의할때,
		// 퍼블릭 : [ 동전 투입구, 카드 단말기, 커피선택 버튼, 퇴출구 등등 ] 사람이 자판기와 상호작용하는 곳
		// 프라이빗 : [프림 투입구, 커피 투입구, 동전 투입 검사 등등] 사람에게 안보여도 되는 곳
		
		

	}

}
