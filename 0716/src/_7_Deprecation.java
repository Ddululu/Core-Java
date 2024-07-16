import java.util.Date;

public class _7_Deprecation {
	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		int year = today.getYear(); // 지금은 안쓴다는 의미의 deprecated, 정상이지만 다른 대안이 있다는 뜻
/* API 문서로 가면 다음과 같은 내용을 볼 수 있다.
 * Deprecated.
As of JDK version 1.1, replaced by Calendar.set(year + 1900, month, date) 
or GregorianCalendar(year + 1900, month, date).
*/
	}

}
