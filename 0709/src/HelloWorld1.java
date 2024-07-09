//변수는 local | stack | temporary | auto variable

public class HelloWorld1 {
	static String str = "Hello, Java"; // class | static 변수
	public static void main(String[] args) {
		String str = "Hello, World"; 
		// 인스턴스 변수를 사용하기 위해서는 인스턴스를 생성한 후 그 인스턴스의 값을 가져와야한다.
		
		System.out.println(str); // 지역변수 str은 블럭 내에서 바로 사용 가능하다.
		
		System.out.println(HelloWorld1.str);  // 같은 클래스에서 static으로 선언한 변수는 바로 사용 가능. 
		//지역변수로 str이 있다면 HelloWorld1 클래스 변수임을 알려줘야 한다.
		
		System.out.println(Demo.str); // 다른 클래스에서 static으로 선언한 변수도 바로 사용 가능하다.
		// 단, Demo 클래스의 변수임을 알려줘야 한다.
	}
class Demo{
	static String str="Hello Python";
}
}
