
public class Inspect {
	private Person p;
	void Inspect(Person p) {
		this.p=p;
	}
	boolean Inspect(int count) {
		for (int i=0; i<=count; i++) {
			System.out.println("사원번호:");
			temp = sc.nextInt();
			if(p[i].getId()==temp) {
				System.out.println("사원번호 중복!!");
				return true;
			}
	}
	
	}
}
