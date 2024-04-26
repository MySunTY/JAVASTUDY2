package abs;

public class Sample3 {
	public static void main(String[] args) {
		ABS a = new Parent();
		a.test();
		a.number = 10;
		System.out.println(a.number);
		a.plus();
		
		ABS[] arr = new ABS[4];
		arr[0] = new Parent();
		arr[1] = new Parent();
		arr[2] = new Parent();
		arr[3] = new Sample4();
		for(int i=0 ; i<arr.length;i++) {
			arr[i].plus();
		}
		
		Parent pp = new Parent();
		pp.go();
		
		ABS pa = new Parent();
		pa.go();
	
		
	}//main
}//class

//abstract class 이름{} : 추상클래스
//형태가 너무 추상적이라서 객체로 조립할 수 없는 클래스
//필드 메서드 생성자 가질 수 있다
//상속을 통해 일반클래스에게 넘겨주기 위해 필드와 메서드를 가진다.
//스스로 객체가 되지 못하지만 자식클래스에게 물려줌

abstract class ABS{
	int number ; //추상클래스도 필드 가질 수 있다 , 상속해야만 사용가능
	void test() { // 추상클래스도 메서드 가질 수 있다. 상속해야만 사용가능
		System.out.println("추상클래스가 가진 일반 메서드");
	}//void 메서드 
	ABS(){
		//추상 클래스도 생성자 가질 수 있다. 상속해야만 사용가능
		System.out.println("추상 클래스의 일반 생성자");
	}//생성자
	abstract void plus();
		//추상메서드 : abstract 리턴타입 이름(매개변수);
		//추상클래스가 추상메서드를 가진경우 상속받은 자식클래스는 반드시 추상 메서드를 구체화 해야한다.
	
}//abs class

class Parent extends ABS{
	//추상클래스는 객체로 조립될 수 없기 때문에 상속을 통해 자식클래스가 객체를 만들어서 이용한다.
	void plus(){
		System.out.println("추상 메서드의 몸통을 구현한 일반 메서드");
		
	}
	void go() {
		System.out.println("고");
	}
	
}// pa class

class Sample4 extends ABS{
	void plus(){
		System.out.println("샘플4 상속");
	}
}//child class