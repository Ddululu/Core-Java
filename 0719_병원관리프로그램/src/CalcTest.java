import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Scanner;

class CalcTest {
	private Patient p;
	private Calc cal;
	Scanner sc = new Scanner(System.in);
	
	
	@BeforeEach
	void make() {
		 this.p = new Patient();
		 cal =new Calc(p);
		 
		 System.out.print("입력: 입원일수: ");
			this.p.setDays(sc.nextInt());
			System.out.print("입력: 나이: ");
			this.p.setAge(sc.nextInt());
			
			
	}
	
	@Test
	void InputTest() {
		assertNotNull(this.cal); //  널 테스트
		
		// 출력 테스트
		System.out.println("입원일수: "+this.p.getDays());
		System.out.println("나이: "+this.p.getAge());
		this.cal.calc();
		
		System.out.println("진찰비: "+p.getCheckFee());
		System.out.println("진료비: "+p.getCliFee());
		System.out.println("입원비: "+p.getHosFee());
	}

}