
public class _12_Exception {

	public static void main(String[] args) throws Exception{
		Student chulsu = new Student();
		
		try{ // try 구문은 각 구문을 수행 중 오류가 발생한 순간 Exception을 Throw한다.
			chulsu.setKor(120); // 그냥은 120점이 오류인지 모른다. (사용 상의 오류기 때문)  -> 예외처리 필요
			System.out.println(chulsu);
		}catch(RuntimeException e){
			System.out.println(e.getMessage());
		}
		try{ // try 구문은 각 구문을 수행 중 오류가 발생한 순간 Exception을 Throw한다.
			chulsu.setEng(120); // 그냥은 120점이 오류인지 모른다. (사용 상의 오류기 때문)  -> 예외처리 필요
			System.out.println(chulsu);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
class Student{
	private int kor;
	private int eng;
	
	public void setKor(int kor) {
		if (kor>=0&&kor<=100) this.kor =kor;
		else throw new RuntimeException("국어점수는 0부터 100점까지의 범위만 인정"); 
		// 새로운 예외처리를 정의. 입력이 0에서 100 사이가 아니라면 RuntimeException 객체를 만들고 에러 메시지 throw
		// 개발자가 이 상황에서는 어떤 에러를 던지겠다고 정의. 
	}
	
	// 메소드에 Exception을 사용할때는 선언부에 throws를 사용한다.
	// throws 키워드는 메소드에서 처리하지 못한 예외를 호출한 곳으로 떠넘기는 역할
	// Runtime때 하지 않기 때문에 컴파일 전에 Exception 인지 체크 해야 함을 미리 알려줘야 한다.
	public void setEng(int eng) throws Exception{ 
		if (eng>=0&&eng<=100) this.eng =eng;
		else throw new Exception("영어 점수는 0부터 100점까지의 범위만 인정"); 
		// Exception 클래스는 Checked Exception, 컴파일 전에 확인해야 하는 예외처리
	}
	@Override
	public String toString() {
		return "kor = " + this.kor;
	}
}
