
public class NestedLoopDemo {

	public static void main(String[] args) {
		// 중첩 반복으로 구구단을 출력 
		for(int i=2; i<10; i++) {
			System.out.printf("%d단\t",i);
			for(int j=1; j<10; j++) {
				System.out.printf("%2d x%2d=%2d\t",i,j,i*j);
			}
			System.out.print("\n");
		}
	}

}
