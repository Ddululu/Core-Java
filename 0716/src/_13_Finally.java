
// 예외 처리 후 예외 타입과 상관없이 항상 실행하는 구문을 Finally라고 한다.
public class _13_Finally {
	 public static void main(String[] args) throws EnglishException{
		 Student2 chulsu = new Student2(); 
		 
		 chulsu.setKor(90);
		 
		 try {	
			 chulsu.setEng(120);	
		 }catch(EnglishException e) {
			 System.out.println(e.getMessage());		
			 }
		 
		try {			}
		finally{			}
		
		try {			}
		catch(Exception e){			}
		finally {			}
	}
}

class KoreanException extends RuntimeException{ // 국어는 Runtime Exception으로 사용할거다. throws 선언을 안해도 컴파일 시 예외처리
	private int kor;
	public KoreanException(String msg) {
		super(msg);
	}
}

class EnglishException extends Exception{ // 영어는 반드시 throws로 예외처리를 선언해야한다.
	public EnglishException(String msg) {
		super(msg);
	}
}

class Student2{
	private int kor;
	private int eng;
	
	// KoreanException은 RuntimeException을 상속했기 때문에 throws를 사용하지 않아도 된다.
	public void setKor(int kor) {
		if (kor>=0&&kor<=100) this.kor =kor;
		else throw new KoreanException("국어점수는 0부터 100점까지의 범위만 인정"); 
	}
	
	// EnglishException은 Exception을 상속했기 때문에 throws로 어떤 예외처리인지 정의해야한다.
	public void setEng(int eng) throws EnglishException{ 
		if (eng>=0&&eng<=100) this.eng =eng;
		else throw new EnglishException("영어 점수는 0부터 100점까지의 범위만 인정"); 
		// Exception 클래스는 Checked Exception, 컴파일 전에 확인해야 하는 예외처리
	}
}	
	