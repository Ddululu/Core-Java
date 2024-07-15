import kr.seoul.sesac.util.libs.*; 
// 그냥 등록하면 컴파일러(이클립스)는 패키지의 경로를 알 수 없다.
// 1) 사용하려는 패키지를 .jar 파일(자바 압축파일)로 압축
// 2) Project 우클릭 - Build Path - Configure Build Path - Library - 만들어 둔 .jar 파일을 등록

import com.example.libs.Car;
// 다른 패키지에 있는 클래스를 가져올때도 패키지 경로.클래스로 가져올 수 있음.
 
import java.util.Scanner;
import java.util.*; 
// Scanner을 사용하나 *을 사용하나 인스턴스가 생성된 것만 메모리에 할당되기 때문에 성능 상에 큰 차이가 없음.

public class _8_Import {
	public static void main(String[] args) {
		Car sonata = new Car();
		System.out.println(sonata.name);
		//System.out.println(sonata.color); // color는 default라 접근 불가.
		//System.out.println(sonata.price); // price는 protected라 자식 외 접근 불가.
		
	}

}
