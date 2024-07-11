
public class Output {
/*----------------------------------------------------------
 *                        	Field
 *----------------------------------------------------------*/	
	private Student [] array; 
	// initialization
	public Output(Student[] array) {
		this.array = array;
	}
	
/*----------------------------------------------------------
 *                         Method
 *----------------------------------------------------------*/
	void output() {	
		for(Student std: this.array) {
			System.out.printf("%-5s\t",std.getHakbun());
			System.out.printf("%5s\t",std.getName());
			System.out.printf("%5d\t",std.getKor());
			System.out.printf("%5d\t",std.getEng());
			System.out.printf("%5d\t",std.getMath());
			System.out.printf("%5d\t",std.getEdp());
			System.out.printf("%5d\t",std.getTot());
			System.out.printf("%5.1f\t",std.getAvg());
			System.out.printf("%5c\n",std.getGrade());
		}
	}
	
	
}
