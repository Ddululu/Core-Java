
public class DoDemo {

	public static void main(String[] args) {
		// Do 문을 이용한 Factorial
		
		String y_n = null; // 참조 변수의 null 번지는 아무 값도 참조하지 않는 주소
		do{
		System.out.print("몇 Factorial? : ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int num = sc.nextInt();
		int init =1;
		for (int i= num; i>0; i--) {
			init *=i;
		}
		System.out.printf("%d!= %d\n",num,init);
		System.out.print("Again(y/n) ?");
		y_n = sc.next();
		}while(y_n.equals("Y")||y_n.equals("y"));
		}
	}
