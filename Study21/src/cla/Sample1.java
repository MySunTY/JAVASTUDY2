package cla;

public class Sample1 {
	public static void main(String[] args) {
		Car c = new Car();
		c.run();
		new Car(333);
		new Car(2455);
		}//main
}//class

//클래스는 필드 메서드 생성자를 가질 수 있다
//필드: 객체가 데이터를 저장하는 공간 , 통상적으로 변수로 만들어지고 속성 저장
//메서드 : 클래스에 작성되어 객체가 호출이 있을때 수행하는 동작
	//리턴타입 : 동작수행시 반환하는 타입
	//매개변수 동작을 시킬때 입력해야하는 변수/ 매개변수 타입과 일치하는 값을 줘야 동작
//생성자 : 반드시 단한번 객체를 조립할때 수행하는 동작
	//리턴타입이 적혀있지 않고 이름이 클래스의 이름이다
	//실제로 객체를 리턴함
	//생성자는 기본 탑재되어있음, 다른동작을 수행하고자한다면 생성자(){수행할동작};
	//생성자 오버로드가 중요함
	//생성자는 이름바꿀 수 없기에 오버로드해야함
class Car{
	int number; //필드
	void run() {
		System.out.println(number+ "번 주행합니다");
	}
	Car(){
		System.out.println("생성자를 실행합니다");
		number=1234;
	}
	Car(int a){
		System.out.println(a+ "번 주행합니다");
		number = a;
	}
	
}//car class