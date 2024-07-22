import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _11_lambda {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		map.put("Language", "Java");
		map.put("DB", "MySQL");
		map.put("Framework", "Spring Boot");
		map.put("Frontend", "React");
		map.put("Cloud", "AWS");
		
		// Map에 저장된 key를 이용하여 각 value를 출력하기
		//==================================
		// 1. while을 이용해 key 요소를 돌아가며 모두출력
		Iterator<String> keys =map.keySet().iterator();
		while(keys.hasNext()){
			String key=keys.next();
			System.out.println(key+" => "+ map.get(key));
		}
		//==================================
		
		// 2. forEach에 key와 value를 입력해 모든 요소를 출력.
		map.forEach((key,value) -> System.out.println(key+" => " + value));
		/*	ArrayList에는 forEach 메소드가 있는데, 
			forEach는 Iterable을 포함하고 있고, 
			Iterable에는 for( T t : this) action.accept(t); 구문이 내장되어 있어 입력 요소를 반복해서 사용한다. */
		

	}

}
