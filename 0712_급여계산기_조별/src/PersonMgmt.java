
public class PersonMgmt {
	public static void main(String[] args) {
		
		Person [] p = new Person[5];
		Input in = new Input(p);
		in.input();
		//Calc cal = new Calc(p);
		//Output out = new Output(p);
		
		for(Person array : p) {
			System.out.printf("%5d\t%5d\t%5d\t%5d\n", array.getId(), array.getGrade(), array.getHo(), array.getMoney() );
		}
		
	}
}
