//Property ; 속성, 재산, SystemPropertiesAdvanded 등 OS의 속성을 System Properties

import java.util.Enumeration;
import java.util.Properties;

public class _10_Properties {
	public static void main(String[] args) {
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Properties.html#getProperty(java.lang.String)
		// .getProperties()는 시스템의 속성을 가져오는 메소드로 key=value와 같은 구조의 리스트를 리턴
		Properties info = System.getProperties();
		
		Enumeration<Object> enums = info.keys(); 
		while(enums.hasMoreElements()) {
			String key=(String)enums.nextElement();
			System.out.println(key+"=>" + System.getProperty(key));
		}
	}

}
