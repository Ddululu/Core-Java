import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

// 날짜 시간을 출력하는 4가지 방법
public class _2_DateTime {

	public static void main(String[] args) {
		
		// 1. Date를 이용한 날짜 출력, 임의로 가공해야 한다.
		Date now = new Date(); 
		System.out.println(now.getYear());
		System.out.println(now); // now.toString() 출력 -> year는 1900년 이후 얼마나 지났나를 저장. toString은 이 값들을 파싱해서 출력
	
		
		// 2. Calendar를 이용한 날짜 출력
		//Calendar cal = new Calendar(); // Calendar는 추상 클래스로 생성 불가.
		Calendar cal = Calendar.getInstance(); // Calendar는 추상 클래스 + 싱글톤 객체라 호출 시 Static으로 생성되어 값만 가져올 수 있다.
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n", cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DATE));
		
		Calendar cal2 = new GregorianCalendar(2024,11,25); // gregorian은 날짜를 직접 설정 가능.
		// Calendar는 추상클래스라 객체를 만들 수 없지만, Calendar의 자식인 GregorainCalender는 생성 가능.
		System.out.printf("오늘은 %d년 %d월 %d일 입니다.\n",cal2.get(Calendar.YEAR),cal2.get(Calendar.MONTH),cal2.get(Calendar.DATE));
		
		
		// 3. DateFormat을 이용한 날짜 출력
		DateFormat df = DateFormat.getDateTimeInstance( // 날짜와 시간을 모두 가져오는 메소드.
				DateFormat.FULL, DateFormat.MEDIUM, Locale.KOREA); 
		System.out.println(df.format(new Date()));
		// DateFormat 또한 싱글톤 패턴으로 getInstance()를 이용해 값을 가져온다.
		
		String pattern= "오늘은 yyyy년 MM월 dd일입니다."; //SimpleDate는 내가 원하는 양식으로 날짜 출력이 가능.
		DateFormat df2 = new SimpleDateFormat(pattern);
		System.out.println(df2.format(new Date()));
	
		
		
		//4. printf를 이용한 날짜 출력
		String pattern2 = String.format("오늘은 %1$tY년 %1$tm월 %1$td일입니다.", new Date()); 
		// 1$를 입력하면 첫번째 요소를 다시 쓸 수 있음
		// %t는 입력을 날짜 형식으로 받는다는 뜻이고 뒤에 Y,m,d를 붙임으로 시간 형식 중 연, 월, 일을 구분한다.
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html#syntax
		System.out.println(pattern2);
	}

}
