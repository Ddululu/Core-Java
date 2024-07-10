public class MethodDemo4 {
	int calcSum1(int arg1, int arg2) { 
		int sum= 0;	
		for (int i=arg1; i<arg2; i++) {
				sum +=i;
			}
		
		return sum;
	}
	
	public static void main(String[] args) {
		int arg1=5; int arg2=48;
		MethodDemo4 tmp = new MethodDemo4();
		int sum = tmp.calcSum1(arg1,arg2); 
		System.out.printf("%d부터 %d까지의 합은? %d 입니다.", arg1,arg2, sum);
		
	}
	
}
