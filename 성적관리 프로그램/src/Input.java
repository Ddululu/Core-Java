import java.io.FileNotFoundException;

// Input 클래스에서 수행할 것 = 파일 읽기, 배열에 저장하기
// 필드: 
public class Input {

/*----------------------------------------------------------
 *                        	Field
 *----------------------------------------------------------*/	
	private java.util.Scanner sc;
	private Student [] array;
	
	
// 생성자는 값의 초기화만 담당한다.
	public Input(Student[] array) throws FileNotFoundException {
		this.array= array; // 매개변수 array의 주소를 private array의 주소로 초기화
		this.sc=new java.util.Scanner(new java.io.File("sungjuk_utf8.txt"));
		// Scanner에는 문자를 파싱하는 useDelimiter(pattern) 메소드가 있다. 
		// = Sets this scanner's delimiting pattern to the specified pattern.
		
	}


// 코드를 짤 때 실제로 수행하는 것은 메소드가 해야한다.
/*----------------------------------------------------------
 *                         Method
 *----------------------------------------------------------*/
	void input() {
		for(int i=0; i<this.array.length;i++) {
			String line = this.sc.nextLine();
			java.util.Scanner s = new java.util.Scanner(line).useDelimiter("\\s+");
			String Hakbun = s.next();
			String Name = s.next();
			int Kor = s.nextInt();
			int Eng = s.nextInt();
			int Math = s.nextInt();
			int Edp = s.nextInt();
			this.array[i] = new Student(Hakbun, Name, Kor, Eng, Math, Edp);
			}
	}
}
