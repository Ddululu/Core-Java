
public class _10_Exception {
	public static void main(String[] args) {
		Car carnival = new Car();
		carnival.name = "기아 카니발";
		System.out.println(carnival.name);
		//carnival=null;
		try {
			int [] array = new int[-4]; // NullPointerException이 아닌 다른 예외가 있었다면
		System.out.println(carnival.name);
			} catch(NullPointerException e) {
				
				System.out.println(e.getMessage()); 
				// 출력: Cannot read field "name" because "carnival" is null
				// 예외처리된 간단한 이유(메시지)
				// 처리된 예외가 아니라면 통과
				
				System.out.println(e);
				// 출력: java.lang.NullPointerException: Cannot read field "name" because "carnival" is null
				// 예외처리 항목과 이유
				// 처리된 예외가 아니라면 통과
				
				e.printStackTrace();
				// 출력: java.lang.NullPointerException: Cannot read field "name" because "carnival" is null 
				//													at _10_Exception.main(_10_Exception.java:9)
			} catch(RuntimeException e) { 
				System.out.println(e.getMessage());
				// NullPointerException이 아닌 모든 RumtimeException은 여기서 잡힌다.
			} 
		/* 이런 다중 try - catch 구조를 멀티플 캐치 블록이라 하는데, 좁은 범위에서 넓은 범위로 예외처리 해야한다.
		 * 위에서 제일 큰 상위 객체를 하면 다형성에 의해 상위 객체가 다 잡아버림. (부모 객체는 자식 객체로 자동 형변환)
		 */
	}
}
