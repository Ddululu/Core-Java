import java.util.Date;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class _9_Map {
	public static void main(String[] args) {
		Date now = new Date();
		String nowStr = now.toString(); // Wed Jul 17 15:38:36 KST 2024
		
		/*
		 * 문자열 파싱(Parsing) 방법 3가지
		 * 1. String Class's split() , split() 메소드를 이용해 배열을 파싱 S
		 * 		tring [] array = split(string regex)
		 * 2. Scanner class's useDelemeter(), Scanner의 메소드를 이용해 배열을 파싱
		 *	 	new Scanner(문자열).useDlemeter(String regex)
		 * 3. String Tokenizer를 이용한 문자열 파싱
		 * 		StringTokenizer st = new StringTokenizer(String);
     			while (st.hasMoreTokens()) {
         				System.out.println(st.nextToken());
     			}
		 */
		
		 StringTokenizer st = new StringTokenizer(nowStr);
		 String[] array = new String[st.countTokens()];
		 for (int i = 0 ; i<array.length; i++) {
			array[i] = st.nextToken();
		 }
		 // 그냥 출력하면 "오늘은 2024년 Jul월 17일입니다." 라고 출력. Hashtable을 이용해 문자열 파싱 
		 System.out.printf("오늘은 %s년 %s월 %s일입니다.", array[5], getMonthbyName(array[1]), array[2] );
	}
	static int getMonthbyName(String month) {
		// HashTable은 일종의 DB(Dictionary) 역할. Key에 Value를 저장하고, Key로 Value를 가져온다. 
		Hashtable<String,Integer> ht = new Hashtable<String, Integer>();
		ht.put("Jan", 1); ht.put("Feb", 2); ht.put("Mar",3); ht.put("Apr", 4);
		ht.put("May", 5); ht.put("Jun", 6); ht.put("Jul",7); ht.put("Aug", 8);
		ht.put("Sep", 9); ht.put("Oct", 10); ht.put("Nov",11); ht.put("Dec", 12);
		return ht.get(month);
		
	}

}
