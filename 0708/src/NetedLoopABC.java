
public class NetedLoopABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char A='A';
		int i =0;
		int j = 0;
		while(i++ < 26) {
			j=0;
			while(j < i) {
			System.out.printf("%c", A+j++);
			}	
			System.out.print("\n");
		}
	}

}
