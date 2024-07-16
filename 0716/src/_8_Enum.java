/*
 public class C_Season {
 	private String spring, summer, fall, winter;
	} 클래스로 만들면 접근 지정과 타입을 포함해야 한다.
	
public interface I_Season{
	String spring, summer, fall,winter;
	} 인터페이스로 만들면 타입을 포함해야 한다.

public enum E_Season {
	spring, summer, fall, winter; 
}  열거타입으로 만들면 그냥 나열하면 된다. 즉, 열거 타입은 인터페이스나 클래스로 바꾸기 쉽다.

Enum 타입은 Enum 클래스로 만들어진 자식 객체
 */

public class _8_Enum {

	public static void main(String[] args) {
		Season season = Season.fall;
		// 열거형은 리스트 형처럼 보이지만, 인덱스로 접근할 수 없다.
		System.out.println(season.ordinal());
		// 대신 Enum 클래스의 ordinal() 메소드를 이용하면 위치를 알 수 있다.
		System.out.println(season.getValue());
		// 열거상수와 함께 값을 넣어뒀다면, getValue()로 값도 가져올 수 있다.
		

	}

}
