package inter;

public class Sample01 {
	public static void main(String[] args) {
		ITF itf = new ITF() {
			public void run() {
				
			}
		};
		Test t = new Test();
		t.method(new ITF() {
			public void run() {
				
			}
		});
				//익명 클래스 : 일시적으로 클래스와 동일 기능을 수행할 수 있는 이름없는 일회용 클래스
				//통상적으로 인터페이스가 구현된 클래스를 대용하거나, 추상클래스가 상속된 클래스를 대용할 때 사용
				//존재할리없는 인터페이스의 생성자를 적어둔뒤 {}에 추상메서드의 몸통까지 구현
	}//main
}//class

//인터페이스 : 사용설명서
// interface 이름{}
//인터페이스로 객체를 생성할 수 없다. = 필드 메서드 생성자 없음
//필드는 가질 수없지만 상수는 가질 수 있다(public static final)
//메서드는 못가지지만 추상메서드는 가질 수 있다
//클래스에 해당 용도를 구현해서 사용

interface ITF{
	public static final int a = 10;
	void run(); // abstract void run();추상메서드 가질 수 있다
	
}//itf
interface INTER{
	void run();
	
}//inter

/*class Parent{
	
}//parent

class Child extends Parent implements ITF , INTER{ //다중상속은 안되지만 다중구현(inplements)는 가능
	public void run() { //(인터페이스의 추상메서드를 구현할때는 public을 붙여야함
		                // 추상클래스가 인터페이스를 구현할때는 구현해도되고 안해도됨
		
	}
	public void data() {
		
	}
}//child

abstract class CCC implements ITF{
	
}*/

class Test{
	void method(ITF i){
		System.out.println("실행 성공");
	}
}//class Test