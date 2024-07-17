
public class _1_Equals {
	public static void main(String[] args) {
		Point origin = new Point(30, 100);
		Point target = new Point(30, 100);
		origin.equals(target); 
		/*
		 *  equals는 objcet의 메소드로 비교하려는 값이 Reference type이라면 
		 *  기본적으로 두 변수의 주소를 비교. (동일한 주소를 가리키는지 Boolean 리턴)
		 *  단, String은 클래스 내에 문자열을 비교하도록 재정의 되어 있다.
		 *  즉, 원하는 메소드가 두 변수의 값을 비교하는 것이라면 "재정의" 해야 한다.
		 */
		System.out.println(origin.equals(target));
	}
}

class Point{
	private int x,y;
	public Point(int x, int y) {
		this.x=x; this.y= y;
	}
	@Override
	public String toString() {
		return String.format("(x,y) = (%d, %d)\n", this.x, this.y);
	}
	
	// equals  메소드의 재정의
	@Override
	public boolean equals(Object obj) {
		Point p = (Point)obj; 
		// x는 equals를 호출한 객체, y는 파라미터로 받은 객체
		if(this.x == p.x&&this.y==p.y) return true;
		else return false;
	}
	
}