/*
 * Method Reference
 * 람다 표현식의 구현부가 클래스의 단 하나의 메소드만 사용한다고 보장한다면 구현부를 생략 가능.
 * 클래스 :: 메소드명
 */
public class _9_MethodReference {

	public static void main(String[] args) {
		interface MyPolygon{ // 인터페이스가 오직 1개의 메소드만 사용할 경우 참조 가능.
			double radianToDegree(double value);
		}
		MyPolygon mp = (radian) -> Math.toDegrees(radian);
		double result = mp.radianToDegree(1);
		System.out.println(result);
		
		// 람다 expression의 구현부 "(radian)->" 가 
		// 클래스의 단 하나의 메소드 "toDegrees(radian)"만 사용한다고 보장한다면 구현부를 생략 가능.
		
		MyPolygon mp1 = Math::toDegrees; // ClassName :: MethodName
		double result2 = mp.radianToDegree(1);
		System.out.println(result2);

	}

}
