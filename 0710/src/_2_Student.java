// 학생이라는 객체를 나타내는 방법은 다음과 같다. 

// 학번 | 국어 | 영어 | 수학 | 총점 | 평균 | 평점  

// 이러한 속성들을 자바에서는 필드(Field)라고 하고
// 객체지향의 관점에서 속성(Attribute, Property, State) 라고 한다.
//
public class _2_Student {
		// 학생이라는 객체는 모두 동일한 구성을 갖는다.
		// 동일한 구성은 클래스로 만들어 재사용이 가능하다
		String Std_ID, name;
		int kor;
		int eng;
		int math;
		int total;
		double avg;
		char grade;
	}