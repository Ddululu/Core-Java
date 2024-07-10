public class _3_calc {
	static void calc(_2_Student std) {
		std.total = std.kor + std.eng+ std.math;
		std.avg = std.total/3.0;
		std.grade = (std.avg >= 90.0) ? 
				'A' : (std.avg>=80.0) ? 
				'B' : (std.avg>=70.0) ? 
				'C' :  (std.avg>=60.0) ? 
				'D' : 'F';
	}
}
