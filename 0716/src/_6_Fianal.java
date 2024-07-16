public class _6_Fianal{
	public static void main(String[] args) {
		Parent bumo = new jasik(); bumo.display();
		

	}
	class Parent{
		public final void display() {
			System.out.println("나는 부모의 메소드");
		}
	}
	class jasik extends Parent{

		@Override
		public void display() { // 오류 출력: final 메소드는 override 할 수 없다.
			System.out.println("나는 자식의 메소드");
		}
		
	}
}

