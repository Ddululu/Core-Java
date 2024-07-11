
public class Calc {
/*----------------------------------------------------------
 *                        	Field
 *----------------------------------------------------------*/		
	private Student [] array;
	
	public Calc(Student[] array) {
		this.array = array;
	}
	
/*----------------------------------------------------------
 *                         Method
 *----------------------------------------------------------*/
	void calc() {
		for(Student std : this.array) {
			int tot = std.getKor()+std.getMath()+std.getEng()+std.getEdp();
			double avg = tot/4.0;
			char grade = (avg>=90) ? 'A' :
									(avg>=80) ? 'B' :
										(avg>=70) ? 'C' :
											(avg>=60) ? 'D' : 'F';
			
			std.setTot(tot);		std.setAvg(avg); std.setGrade(grade);
		}
	}
}
