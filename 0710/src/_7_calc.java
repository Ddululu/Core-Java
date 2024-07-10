public class _7_calc {
	void calc(_7_Student std) {
/*		student의 모든 변수가 private로 설정되어 값을 가져올 수 없다.		
		std.total = std.kor + std.eng+ std.math;
		std.avg = std.total/3.0;
		std.grade = (std.avg >= 90.0) ? 
				'A' : (std.avg>=80.0) ? 
				'B' : (std.avg>=70.0) ? 
				'C' :  (std.avg>=60.0) ? 
				'D' : 'F';
*/
		int Total = std.getKor()+ std.getEng()+std.getMath();
		std.setTotal(Total);
		
		double avg = Total /3.0;
		std.setAvg(avg);
		
		char grade = (avg >= 90.0) ? 
				'A' : (avg>=80.0) ? 
				'B' : (avg>=70.0) ? 
				'C' :  (avg>=60.0) ? 
				'D' : 'F';
		std.setGrade(grade);
	}
}
