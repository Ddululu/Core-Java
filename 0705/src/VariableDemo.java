public class VariableDemo {
	/* Instanace 변수 선언
    변수가 main이라는 메소드 안에 없고, Static 속성으로 선언되지 않았기 때문에
    이는 Instance 변수라고 판단한다. */
    private int eng = 100;
    
    /* Class 변수 선언
    변수가 main이라는 메소드 안에 없고, Static 속성으로 선언되었기 때문에
    이는 Class 변수라고 판단한다. Static으로 선언된 변수들은 main보다 먼저 할당된다.*/
    static int math = 80; // Class Variable,
    
	public static void main(String[] args) {
		int kor; // local variable
		VariableDemo vd = new VariableDemo();
		
        System.out.printf("수학 점수 = %d\n",math);
        System.out.printf("수학 점수 = %d\n",vd.math);
        
        kor = 10;
        System.out.printf("국어 점수 = %d\n",kor);
        //System.out.printf("국어 점수 = %d\n",vd.kor);
        
        System.out.printf("영어 점수 = %d\n",vd.eng);
      
        
	}

}