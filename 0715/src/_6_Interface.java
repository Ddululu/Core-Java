
public class _6_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_6_Car sonata = new _6_Car("EF소나타", 30_000_000);
		_6_Car matiz = new _6_Car("RedMatiz", 10_000_000);
		// sonata.price - matiz.price
		int result = sonata.compareTo(matiz);
		System.out.println(result);
	}

}

/* Comparable 인터페이스는 java.lang의 인터페이스로 값의 비교를 제공
 * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Comparable.html
 * Comparable을 사용하면 값을 비교하는 메소드를 구현하지 않아도 된다.
 */
class _6_Car implements Comparable{
	private String name;
	private int price;

	public _6_Car(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("_6_Car [name=%s, price=%s]", name, price);
	}

	public int compareTo(_6_Car other) {
		return this.price - other.price;
	} 
}