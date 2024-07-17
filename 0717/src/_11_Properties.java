import java.util.Properties;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _11_Properties {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties info = new Properties();
		info.load(new FileInputStream(new File("productinfo.properties")));
		// properties 파일은 key=value와 같은 구조로 작성된 구조이다.
		// FileInputStream은 =을 기준으로 왼쪽을 key, 오른쪽을 value로 인식한다.
		System.out.println("나이 = "+ info.getProperty("age"));
		System.out.println("거주지 = "+ info.getProperty("city"));
	}

}
