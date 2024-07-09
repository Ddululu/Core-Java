public class SungjukMgmt1 {
	public static void main(String[] args) throws java.io.IOException{
		// 파일로부터 데이터 입력받기
		java.util.Scanner sc = new java.util.Scanner(new java.io.File("./src/sungjuk.dat"));
		
		Student2 [] stdArray= new Student2[3]; //앞으로 학생들의 정보가 저장될 공간 확보
		for(int i =0; i<3; i++)
		{
			stdArray[i] = new Student2(); // 학생이라는 인스턴스가 생성. -> 학생을 구분하고 값을 넣을 수 있다.
			String line = sc.nextLine(); // 2024-001	김철수	100	80		70
			// split을 이용해 데이터를 Parsing 해보자
			String [] array = line.split("\\s+");
			stdArray[i].Std_ID = array[0].trim(); //trim은 String의 메소드로 문자열의 선,후행 white_space을 제거
			stdArray[i].name = array[1].trim();
			stdArray[i].kor = Integer.parseInt(array[2].trim());
			stdArray[i].eng = Integer.parseInt(array[3].trim());
			stdArray[i].math = Integer.parseInt(array[4].trim());
		}
		int j =0;
		while(j<3) {
			System.out.printf("%10s\t%10s\t%5d\t%5d\t%5d\n", 
					stdArray[j].Std_ID, stdArray[j].name, stdArray[j].kor, stdArray[j].eng, stdArray[j].math);
			
			
			j++;
		}
		
	}
	

}
