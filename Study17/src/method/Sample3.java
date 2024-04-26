package method;

public class Sample3 {
	public static void main(String[] args) {
		Car c = new Car();
		c.number= 1234;
		c.run();
	
		Car d = new Car();
		d.number=5678;
		d.run();
		//c.check();
		Data c_num = c.check();
		System.out.println("c의 차량번호는 "+c_num.a);
		
		Data d_num=d.check();
		System.out.println("d의 차량번호는 "+d_num.b);
		
		
		//리턴타입과 리턴을 받아주는 변수의 타입이 일치해야한다
		//리턴되는 값을 반드시 사용해야 하는건 아니다
		
		//new Car().run(); //객체를 변수에 담지 않고 바로 메서드를 실행
		//코드는 짧아지지만 중간 저장과정이 없기 때문에수정하기 힘들다
		
		
	}//main
}//class

//메서드: 클래스 내부에 작성되어 객체가 수행하는 동작
//리턴타입 동작이름(){동작호출시 수행할 문장;}
//반드시 클래스 내부에 작성되어있어야 동작이 가능하다
//리턴타입 : 동작을 수행한 이후에 돌려주는 데이터의 형태
//리턴타입이 void인 경우 동작이후 아무것도 반환하지 않음
//리턴타입이 void가 아닌경우 동작의 실행결과 리턴타입에 해당하는 데이터를 반환하는 경우
// return데이터를 특정해서 알려줘야함
//제어문들은 메서드 내부에 작성되어 있어야 동작 가능함
class Car{
	int number; //차량번호
	void run() {
		System.out.println(number+"번 자동차가 움직입니다.");
		for(int i = 1; i<4; i++) {
			System.out.println("반복중");
		}
	}
	Data check(){
		System.out.println("차량번호를 검색합니다...");
		Data x = new Data();
		x.a = 1234;
		x.b = 5678;
		return x; //리턴이후에는 명령할 수 없음
	}
	
}// car class

class Data{
	int a;
	int b;
	
}//Data class
