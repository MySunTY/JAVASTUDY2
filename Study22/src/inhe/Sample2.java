package inhe;

public class Sample2 {
	public static void main(String[] args) {
		//부모의 설계도를 먼저 조립한후 자식 클래스 조립 (부모생성자 실행하지 않더라도, 자식 클래스 생성시)
		Child c = new Child(1);
		Child c1 = new Child("가");
		
		
		//부모가 들어갈 수 있는 변수에 자식들어갈수있지만 자식이 들어가는 변수에 부모가 들어갈 수 없다
		
		
	}//main
}//class

//상속: 부모클래스의 내용을 자식 클래스가 이어받는 문법
//자바는 다중상속 금지되어있음 ex)부모클래스는 딱 하나 , 자식은 여럿가능
//자식은 부모가 가진 필드와 메서드를 이용할 수 있지만 부모는 자식것을 쓸 수 없다
class Parent{
	int money = 5000000;
	void work() {
		System.out.println("일해라");
	}//void
	Parent(){
		System.out.println("부모 생성자");
	}//생성자
	Parent(int a){
		System.out.println("부모의 다른생성자");
	}
	Parent(String b){
		System.out.println("스트링 부모 생성자");
	}
	
}// class pa
//자식클래스이름 extends 부모클래스이름 : 상속성립
//상속이 성립하면 부모클래스가 가진 필드와 메서드를 이어 받는다
class Child extends Parent{
	String hobby="게임";
	//(메서드) 오버라이드 " 부모로부터 물려받은 메서드를 자식이 재정의하여 사용하는 방법
	//부모의 메서드랑 똑같은걸 적은뒤에 내용만 바꾼다
	void work() {
		super.work(); //오버라이드시 부모의 기능 유지하고싶다면 super.메서드();
		System.out.println("일 안해요");
	}
	Child(){
		super(1);
		System.out.println("자식 생성자");
	}
	Child(int a){
		super(2);
		System.out.println("자식의 다른 생성자");
	}
	Child(String b){
		super("가");
		System.out.println("스트링 자식 생성자");
	}
	
}//class ch

class Child2 extends Child{
	void work() {
		super.work();
		System.out.println("일 할까요?");
	}
}//ch2 class