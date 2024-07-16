import java.io.FileNotFoundException;
import java.util.Scanner;
/*
 * 프로그램 상에서 처리가 가능한 수준의 오류를 Exception -> 코드를 수정해서 해결되는 에러
 * 처리가 불가능한 심각한 수준의 오류를 Error
 * RuntimeException은 UnChecked Exception, 체크하지 않음. 선언하지 않아도 무시함.
 * 이 외 Exception은 Checked Exception, 체크함. 선언을 안하면 에러라고 알려줌.
 */
public class _9_Exception {
	public static void main(String[] args) throws FileNotFoundException {
		
		// int [] array = new int[-3];
		/* 런타임 출력: Exception in thread "main" java.lang.NegativeArraySizeException:
		 * 배열의 크기를 음수로 지정하면 배열이 생성될 때 런타임 에러 발생.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Money: (숫자로 입력)");
		
		int money = sc.nextInt();
		/* 런타임 출력: Exception in thread "main" java.util.InputMismatchException
		 * 입력을 int 형으로 받았는데, int가 아닌 다른 형을 입력할때 발생하는 런타임 에러
		 */
		System.out.println(money);
		
		Car carnival = new Car();
		carnival.name = "기아 카니발";
		System.out.println(carnival.name);
		carnival=null;
		// System.out.println(carnival.name); 
		/* 런타임 출력: Exception in thread "main" javaㅇ.lang.NullPointerException: 
		 * Cannot read field "name" because "carnival" is null
		 * 실행하면 오류가 나오는 RuntimeException
		*/
		if(carnival!=null) System.out.println(carnival.name);
		else System.out.println("없음.");
		
		sc = new Scanner(new java.io.File("Exception.java"));
		// 그냥 사용하려하면 파일이 없었을 때의 예외 처리를 해달라고 오류 리턴(Checked Exception)
		// 메서드에 throws FileNotFoundException를 추가해야 한다.
	}
	
}
class Car{
	public String name;
}
