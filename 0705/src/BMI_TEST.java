
import java.util.Scanner;
public class BMI_TEST {
	
	private float BMI(int height, int weight) {
		float BMI=weight / height^2;
		return BMI;
	}
	public static void main(String[] args) {
		/*
		 =============================================
		 ============= BMI 지수 계산하기 ===================
		 =============================================
		 공식: 신체질량지수(BMI) = 체중(Kg) / 신장(m)^2
		 조건: 
		 	1. 성별 (남 or 여)
		 	2. 허리 둘레 (남자: 90cm 미만 / 여자: 85cm 미만) 혹은 (남자: 90cm 이상 / 여자: 85cm 이상)
		 분류:
		 	State				BMI							기준 미만		기준 이상			
		 	저 체 중			18.5미만						낮  음				보  통
			정 상				18.5이상 ~ 22.9이하		보  통				약간높음
			비만전단계		23이상 ~ 24.9이하			약간높음			높  음
			1단계 비만		25이상 ~ 29.9이하			높  음				매우높음
			2단계 비만		30이상 ~ 34.9이하			매우높음			가장높음
			3단계 비만		35이상						가장높음			가장높음
		 */
		System.out.println("성별(남/여) 신장(cm) 몸무게(Kg) 허리둘레(cm) 순으로 입력해 주세요 ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] info = str.split("/");
		
		if(info !=) {
		int height = Integer.getInteger(info[1]);
		int weight = Integer.getInteger(info[2]);
		double BMI = (height / weight^2);
		String state="오류";
		
		if(BMI<18.5) state= "저체중";
		if(BMI>=18.5 || BMI<23) state= "정상";
		if(BMI>=23 || BMI<25) state= "1단계 비만";
		if(BMI>=25 || BMI<30) state= "2단계 비만";
		if(BMI>=30) state= "3단계 비만";
		
		System.out.printf("BMI 지수는 %lf",BMI);
		System.out.print("현재 분류는 ");
		System.out.print(state);
		
//		switch(info[0]) {
//		case "남": {
//			
//				
//					}
//			else{
//				
//	
//				System.out.printf("BMI 지수는 %lf로 %s 입니다.",BMI, state);
//					}
//			}
//			break;
//		case "여": {
//			if(length>=90){
//				
//				
//				System.out.printf("BMI 지수는 %lf로 %s 입니다.",BMI, state);
//					}
//			else{
//				
//	
//				System.out.printf("BMI 지수는 %lf로 %s 입니다.",BMI, state);
//					}
//			}
//			break;
//		default: System.out.println("성별은 (남/여)로만 입력해 주세요.");

	}
	}
}
