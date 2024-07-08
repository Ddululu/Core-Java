
// public static double random()
// Math.random() 메소드는 0.0 이상 1.0 미만의 양수 부호를 가진 double 값을 반환합니다. 
// 이 값은 (대략적으로) 해당 범위에서 균등한 분포로 의사난수로 선택됩니다.
//
// new java.util.Random()
// This new pseudorandom-number generator is used thereafter for all calls to this method and is used nowhere else.


public class RandomDemo {

	public static void main(String[] args) {
		// 1~10의 난수를 생성하기
		int rand = (int)(Math.random()*10+1);
		switch(rand) {
		case 1: System.out.println("Banana"); break;
		case 2: System.out.println("Orange"); break;
		case 3: System.out.println("Peach"); break;
		case 4: System.out.println("Apples"); break;
		case 5: System.out.println("Plums"); break;
		case 6: System.out.println("Pineapples"); break;
		case 7: break;
		case 8:
		case 9:
		case 10:
		default: System.out.println("Nuts"); break; // Default는 Case에 해당하지 않을 때를 의미. (예외처리 느낌)
		}
		
	}

}
