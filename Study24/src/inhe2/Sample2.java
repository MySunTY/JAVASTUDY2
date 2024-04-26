package inhe2;

public class Sample2 {
	public static void main(String[] args) {
		//GrandParent gp = new GrandParent(); 객체생성불가
		GrandParent gp; //변수는 생성 가능
		//Parent p = new Parent();
		
		GrandParent c = new Child(); //추상클래스 본인은 객체가 될 수없지만 상속된 자식들은 그 크기로 가능
		Child cc = (Child)c;
		//p.run();
		c.run();
		cc.house = "dg";
		
		
	}//main
}//class

//만들어진 객체는 상속관계가 아님
//추상클래스는 객체로 조립할 수 없다
//필드 메서드, 생성자를 가질 수 있지만 직접 객체가 될 순없어서 직접사용불가능
//추상클래스는 추상메서드도 가질 수 있다
//추상 메서드 : {}부분을 가지지 못하는 메서드
//abstract 리턴타입 이름();
//추상클래스가 추상메서드를 가진경우 추상클래스를 상속받은 일반클래스 자식들은 반드시 추상메서드를 구현해야한다({}작성)
//자식이 추상클래스일경우 구현하지않아도 된다





abstract class GrandParent{
	int money ;
	void run() {
		System.out.println("할아버지의 메서드");
	}//run void 
	
	abstract void abs();
	
	
}//grpa class

abstract class Parent extends GrandParent{
	String house;
	void run() {
		System.out.println("아버지의 오버라이드 메서드");
	}//run void
	/*void abs() {
		System.out.println("할아버지의 추상메서드를 아버지가 구현함");
		//추상메서드에서 abstract라는 문자를 제거하고 {} 달아주면 내용 구현가능
	}*/
}//pa class

class Child extends Parent{
	boolean computer;
	void abs() {
		System.out.println("할아버지의 메서드를 아버지가 구현한것을 자식이 오버라이드 함");
	}
	
}//class cha