
public class _2_AnonymousClass {
	public static void main(String[] args) {
//		Canine ca = new Dog(); // 추상 클래스는 원래라면 자식을 만들고 자식의 주소를 통해 호출
//		ca.roam();
//		ca.bark();
		
		// Anonymous 객체는 자식 클래스를 생성하지 않고 메소드를 재정의하기 위해 사용
		// 특정 위치에서 사용될 경우 기존 객체를 재정의하는 것이 더 간결함.
		Canine ca = new Canine() {
			@Override
			void bark() {
				System.out.println("으르렁 으르렁");
			}
			void display() {
				System.out.println("메소드");
			}
		};
		// 임시로 만든 Canine 객체는 메소드를 새로 정의할 수 없고 main이 끝날때 사라짐.
		
		ca.bark();
		ca.roam();
		//ca.display(); // 메소드를 새로 만들어도 찾아갈 수 없음.
		
	}

}
abstract class Canine{
	abstract void bark();
	void roam() {
		System.out.println("여기저기 배회하다");
	}
	void test() {System.out.println("Test");}
}

//class Dog extends Canine{
//	void bark() {
//		System.out.println("으르렁 짖다.");
//	}
//}