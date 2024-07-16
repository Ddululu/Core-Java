
public class _4_Static {

	public static void main(String[] args) {
		Tiger [] array= new Tiger[4];
		for(int i=0; i<array.length; i++) {
			array[i] = new Tiger(); // array마다 a++, b++
			System.out.println("a="+array[i].a +", b="+ array[i].b); 
		}
		for(Tiger t : array) System.out.println("a="+t.a +", b="+t.b);
		/* 출력
		 * a=1, b=4 >> array[0]의 a와 array[0]의 b를 가져오라는 뜻 
		 * a=1, b=4 >> a는 array마다 생성해서 자신만 사용.
		 * a=1, b=4 >> b는 static이므로 Tiger 클래스에서 하나만 생성해서 공유
		 * a=1, b=4 >> 결과적으로 array [0] ~ [3]의 a는 각각 1, b는 4로 같은 값을 가짐
		  */
	}

}
class Tiger{
	int a; // 값을 지정하지 않았으니 0으로 초기화
	static int b; // 값을 지정하지 않았으니 0으로 초기화
	public Tiger() {
		a++;
		b++;
	}
}