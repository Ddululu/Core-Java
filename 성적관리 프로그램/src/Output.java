
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
//			System.out.printf("%-5s\t",std.getHakbun());
//			System.out.printf("%5s\t",std.getName());
//			System.out.printf("%5d\t",std.getKor());
//			System.out.printf("%5d\t",std.getEng());
//			System.out.printf("%5d\t",std.getMath());
//			System.out.printf("%5d\t",std.getEdp());
//			System.out.printf("%5d\t",std.getTot());
//			System.out.printf("%5.1f\t",std.getAvg());
//			System.out.printf("%5c\n",std.getGrade());
			
			System.out.println(std); // std.toString()을 의미, 모든 클래스는 object 클래스를 상속하고 public이기 때문에 어디서나 사용 가능.
		}
	}
	
	
}
