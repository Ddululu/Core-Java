
public class Patient {
	private int no; // 번호
	private String dept; // 진찰부서
	private String code; // 진료코드
	private int age; // 나이
	private int days; // 입원 일수
	private int checkFee; //진찰비
	private int hosFee; //입원비
	private int cliFee; //진료비
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getDept() {
		return dept;
	}
	public void setDept() {
		switch(code) {
		case "MI": this.dept = "외과"; break;
		case "NI": this.dept = "내과"; break;
		case "SI": this.dept = "피부과"; break;
		case "TI": this.dept = "소아과"; break;
		case "WI": this.dept = "비뇨기과"; break;
		}
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public int getCheckFee() {
		return checkFee;
	}
	public void setCheckFee(int checkFee) {
		this.checkFee = checkFee;
	}
	public int getHosFee() {
		return hosFee;
	}
	public void setHosFee(int hosFee) {
		this.hosFee = hosFee;
	}
	public int getCliFee() {
		return cliFee;
	}
	public void setCliFee(int cliFee) {
		this.cliFee = cliFee;
	}
	
}
