import java.io.IOException;
import java.io.InputStream;

public class _13_IOStream {
	public static void main(String[] args) throws IOException {
		System.out.println("글자 한 개를 입력하세요 : ");
		InputStream is = System.in; //
		int code =0;
		try {
			code =is.read();
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		System.out.println("code = " +(char)code); 
		// read() 메소드는 1바이트의 아스키 코드를 입력받는 메소드, 즉 2바이트는 한글은 읽기 불가.
		// Scanner 메소드를 사용하는 이유 
		

	}

}
