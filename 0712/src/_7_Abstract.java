// Abstract(추상) 클래스는 허상 클래스이다. 어떤 것을 해야하느냐가 들어가는 Body가 없다.
// 실제로 만들 수 있는 객체는 아니고 공통된 성질만 가지고 있는 클래스
// 강아지, 고양이는 만들 수 있지만 포유류는 만들 수 없다.
public class _7_Abstract {
	public static void main(String[] args) {
		
	}
}
// 하나라도 추상 메소드로 선언했다면, 클래스는 반드시 추상 클래스로 선언해야한다
abstract class Unit{
	public abstract void move();
	public abstract void stop();
	public abstract void attack();
	public abstract void hold();
	public abstract void pattrol();
	}

class SCV extends Unit // abstract 클래스를 상속하면 모든 abstract 메소드를 상속해야 한다. (상속의 강제화)
{
	public void move() {System.out.println("이동.");}
	public void stop() {System.out.println("정지.");}
	public void attack() {System.out.println("공격.");}
	public void hold() {System.out.println("위치사수.");}
	public void pattrol() {System.out.println("정찰.");}

	//override 다시 정의 가능
	public void repairable() {System.out.println("기계와 건물을 수리 가능");}
	public void Build() {System.out.println("건축");}
}