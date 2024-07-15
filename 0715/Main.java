// javac -classpath .;c:\; Main.java (Main 클래스 생성하기)
import kr.seoul.sesac.util.libs.Finance; // classpath는 로컬 경로(.;) 하위에서 클래스를 찾는데, 없다면 다른 경로(c:\;)하위에서 찾아라. 라는 뜻 
import kr.seoul.sesac.util.libs.HumanResource;
// import kr.seoul.sesac.util.libs.* 은 libs 바로 하위에 있는 모든 클래스를 가져오라는 뜻


public class Main{
	public static void main(String[] args){
		Finance f = new Finance();
		HumanResource hr = new HumanResource();
		System.out.print(f.money);
		System.out.println();
		System.out.print(hr.salary);
	}
}
