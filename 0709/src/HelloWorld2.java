//변수는 local | stack | temporary | auto variable

public class HelloWorld2 {
	String str = "Hello, Java"; // member | instance 변수
	public static void main(String[] args) {
		// String str = "Hello, World"; 
		// System.out.println(str); // str은 main의 바깥에 있기 때문에 사용 불가.
		
		HelloWorld2 tmp = new HelloWorld2();
		
		// 인스턴스 변수를 사용하기 위해서는 인스턴스를 생성한 후 그 인스턴스의 값을 가져와야한다.
		System.out.println(tmp.str);
		
		System.out.println(Test.str2); // 다른 클래스에 있는 static 변수는 속해 있는 클래스 명을 이용해 찾아간다.
		System.out.println(new Test().str); // 다른 클래스에 있는 인스턴스 변수는 클래스를 생성하고 주소값으로 찾아간다.
	}

}
class Test{
	String str="Hello Python"; // 다른 클래스에 있는 변수는 속해 있는 클래스 명을 이용해 찾아간다.
	static String str2 = "Hello C언어";
}