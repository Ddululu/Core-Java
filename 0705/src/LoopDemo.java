
public class LoopDemo {

	public static void main(String[] args) {
		// A ~ Z까지 출력하기
		for(int i=65; i<=90; i++) {
			if((i%5)==4) 
				System.out.printf("%c\n",i);
			else 
				System.out.printf("%c\t", i);
		}
		System.out.println();
		int count=0;
		for(int i=1; i<=100; i++) {
			if(i%4==0) count++;
		}
		System.out.printf("1부터 100까지 4의 배수는 %d개",count);
	}
	
}
