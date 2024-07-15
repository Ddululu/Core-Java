
public class _1_Abstract extends _1_Normal{
	public _1_Abstract(String name) {
		super(name); // 부모의 _1_Normal(String name) 생성자를 가리키도록 선언
	}
	
	public static void main(String[] args) {
		// _1_Normal normal = new _1_Normal("한지민"); 
		/* 오류 출력: Cannot instantiate the type (인스턴스를 만들 수 없다)
		 클래스를 abstract으로 선언하면 new를 이용해 인스턴스를 바로 생성할 수 없다.*/
		
		_1_Normal normal = new _1_Abstract("한지민");
		/* 생성자를 명시하지 않으면 자식은 부모의 기본 생성자를 호출한다
		자식 생성자를 만들고, 부모의 특정 생성자를 가리키도록 구성해야 한다. */
		
		System.out.println(normal);
	}
}


abstract class _1_Normal{ 
	private String name;
	
	public _1_Normal(String name) {
		this.name =name;
	}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}
}