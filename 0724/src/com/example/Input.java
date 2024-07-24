package com.example;
import java.io.FileNotFoundException;
import java.util.List;

// Input 클래스에서 수행할 것 = 파일 읽기, 배열에 저장하기
// 필드: 
public class Input {

/*----------------------------------------------------------
 *                        	Field
 *----------------------------------------------------------*/	
	private java.util.Scanner sc;
	private List<StudentVO> list ;
	
	
// 생성자는 값의 초기화만 담당한다.
	public Input(List<StudentVO> list ) throws FileNotFoundException {
		this.list= list; // 매개변수 array의 주소를 private array의 주소로 초기화
		this.sc=new java.util.Scanner(new java.io.File("sungjuk_utf8.txt"));
		// Scanner에는 문자를 파싱하는 useDelimiter(pattern) 메소드가 있다. 
		// = Sets this scanner's delimiting pattern to the specified pattern.
		System.out.println("초기값 생성");
	}


// 코드를 짤 때 실제로 수행하는 것은 메소드가 해야한다.
/*----------------------------------------------------------
 *                         Method
 *----------------------------------------------------------*/
	void input() {
		String line; // 파일의 입력 스트링 중 한 줄 가져오기
		do{
			line = this.sc.nextLine(); 
			java.util.Scanner s = new java.util.Scanner(line).useDelimiter("\\s+");
			String Hakbun = s.next();
			String Name = s.next();
			int Kor = s.nextInt();
			int Eng = s.nextInt();
			int Math = s.nextInt();
			int Edp = s.nextInt();
			StudentVO student   = new StudentVO(Hakbun, Name, Kor, Eng, Math, Edp);
			this.list.add(student);
			System.out.println(line);
			}while(this.sc.hasNextLine()); // 다음 입력 스트링이 있으면 반복
		System.out.println("입력 완료");
	}
}
