import java.util.List;

/***
 * @author ShinWook
 * @version 1.0
 */
/*
 * 총입원비 = 1일 입원비 x 입원일수
 * 입원비 = 총입원비 X 입원일수 X 할인 비율
 * 진료비 = 진찰비 + 입원비
 */
public class Calc {
	private List<Patient> list;
	
	// Patient 인스턴스의 주소값을 로컬 Patient 인스턴스에 저장
	public Calc(List<Patient> list) {
		this.list=list;
	}
	
	public void calc() {
		// 1) 총입원비 = 1일 입원비(hosFee) x 입원일수(days)
		int days= p.getDays(); // 입력받은 입원 일수 가져오기
		int pay = (days>3) ? 25000: 30000; // 입원일수가 3일보다 크다면 25000, 이하면 30000
		
		int total = pay * days;
		
		// 2) 입원비 = 총입원비 X 입원일수 X 할인 비율
		double sale = 
			(days<10)? 1.0 :
				(days<15)?  0.85 :
					(days<20)? 0.80 :
						(days<30)? 0.77 :
							(days<100)? 0.72 : 0.68;
				
		int hosFee = (int)(total * days * sale);
		
		
		// 3) 진료비 = 진찰비 + 입원비
		int age = p.getAge();
		
		// 나이 별 진찰비
		int checkFee = 
		(age<10)? 7000:
			(age<20)? 5000:
				(age<30)? 8000:
					(age<40)? 7000:
						(age<50)? 4500:2300;
		
		// 진료비
		int cliFee=checkFee+hosFee;
		
		// Patient 인스턴스에 값 저장
		p.setHosFee(hosFee);
		p.setCheckFee(checkFee);
		p.setCliFee(cliFee);
		
	}
	
}
