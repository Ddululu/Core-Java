
public class _2_Abstract extends _2_Normal{
	public _2_Abstract(String name) {
		super(name);
	}
	public static void main(String[] args) {
		_2_Normal normal = new _2_Abstract("한지민");
		normal.display();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(super.getName());
		
	}
}


abstract class _2_Normal { // 하나의 abstract 메소드가 있다면 클래스 또한 abstract
	private String name;
	
	public _2_Normal(String name) {
		this.name = name;
	}
	
	public abstract void display(); 
	// abstract로 선언하면 자식이 반드시 상속해야 한다
	// 이때 자식은 동일한 시그니처로 구성해야 하고, 범위 또한 부모보다 넓어야 한다.
	// 부모가 default라면 자식은 default 혹은 public.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
