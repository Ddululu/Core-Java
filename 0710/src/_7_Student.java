/* 학생이라는 객체를 나타내는 방법은 다음과 같다. 

 학번 | 국어 | 영어 | 수학 | 총점 | 평균 | 평점  

 이러한 속성들을 자바에서는 필드(Field)라고 하고
 객체지향의 관점에서 속성(Attribute, Property, State) 라고 한다.
*/
public class _7_Student {
		// 모든 변수는 Private로 선언해야 한다.
		private String Std_ID, name;
		private int kor;
		private int eng;
		private int math;
		private int total;
		private double avg;
		private char grade;
		
		// 우클릭 - Source - generate getter and setter
		public String getStd_ID() 				{return Std_ID;		}
		public void setStd_ID(String std_ID)	{Std_ID = std_ID;}
		public String getName() 				{return name;}
		public void setName(String name) 	{this.name = name;}
		public int getKor()						{return kor;}
		public void setKor(int kor) 				{this.kor = kor;	}
		public int getEng() 						{return eng;}
		public void setEng(int eng) 			{this.eng = eng;}
		public int getMath() 						{return math;}
		public void setMath(int math) 		{this.math = math;}
		public int getTotal() 						{return total;}
		public void setTotal(int total) 			{this.total = total;}
		public double getAvg() 					{return avg;}
		public void setAvg(double avg) 		{this.avg = avg;}
		public char getGrade() 					{return grade;}
		public void setGrade(char grade)		{this.grade = grade;}
		
		// 학생의 성적을 보여주는 메소드를 학생 클래스에 넣으면 private 변수를 바로 사용할 수 있다.
		public void print() {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\n", 
					Std_ID, kor, eng, math, total, avg, grade);
		}
	}