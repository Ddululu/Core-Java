
public class SungjukMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student chulsu = new Student();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		String y_n = null;
		
		do{
		System.out.print("학번 : ");   chulsu.Std_ID = sc.next();
		System.out.print("국어 : ");   chulsu.kor = sc.nextInt();
		System.out.print("영어 : ");   chulsu.eng = sc.nextInt();
		System.out.print("수학 : ");   chulsu.math = sc.nextInt();
		
		chulsu.total = chulsu.kor+chulsu.eng+chulsu.math;
		chulsu.avg = chulsu.total/3.0; // 실수로 나눠줘야 실수 결과값을 가짐 (아니면 자동 Int 연산)
		chulsu.grade = '\0';
		switch( (int) chulsu.avg/10 ) {
			case 10: case 9: chulsu.grade = 'A'; break;
			case 8: chulsu.grade = 'B'; break;
			case 7: chulsu.grade = 'C'; break;
			case 6: chulsu.grade = 'D'; break;
			default: chulsu.grade = 'F'; break;
		}
		System.out.printf("%10s\t%5d\t%5d\t%5d\t",chulsu.Std_ID,chulsu.kor,chulsu.eng,chulsu.math);
		System.out.printf("%5d\t%.1f\t%3c\n",chulsu.total,chulsu.avg,chulsu.grade);
		System.out.print("Again(y/n) ? : ");
		y_n=sc.next();
		}while(y_n.equals("Y")||y_n.equals("y"));
		System.out.print("Program is over... ");
	}
}
