
public class LoopDemo2 {

	public static void main(String[] args) {
		// A ~ Z까지 출력하기 //
		for(int i=65; i<=90; i++) {
			if(i%10<5) {
					if((i%5)==4) System.out.printf("%c\n",i+32);
					else System.out.printf("%c\t", i+32);
			}
			else {
				if((i%5)==4) System.out.printf("%c\n",i);
				else System.out.printf("%c\t", i);
		}
	}
		System.out.println();
	}

}