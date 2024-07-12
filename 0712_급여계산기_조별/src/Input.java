import java.util.Scanner;

public class Input {
	private Person [] p;
	public Input(Person [] p) {this.p = p;}
	
	void input() {
		int count =0;
		int temp = 0;
		String io= null;
		
		ID:
		do {
			Scanner sc = new Scanner(System.in);
			p[count]=new Person();
			
//			System.out.print("사원번호:");
//			temp = sc.nextInt();
			p[count].setId(temp);
			
			System.out.print("급: ");
			p[count].setGrade(sc.nextInt());
			
			System.out.print("호:");
			p[count].setHo(sc.nextInt());
			
			System.out.print("수당: \n");
			p[count].setMoney(sc.nextInt());
			
			System.out.print("입력/출력(I/O):");
			io = sc.next();
			
			count++;
			}while(io.equals("I"));
		
		for(Person array : this.p) {
			System.out.printf("%5d\t%5d\t%5d\t%5d\n", array.getId(), array.getGrade(), array.getHo(), array.getMoney() );
		}
	}
}
	


