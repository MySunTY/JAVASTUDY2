package method;

public class Method {
	public static void main(String[] args) {
		Car c= new Car();
		c.run();
		int number = c.data(10,20);
		System.out.println("받아온 데이터 "+number);
	}//main
}//class method

class Car {
	//메서드 : 설계도에 작성 되어 객체가 수행하는 동작 / 객체만이 메서드를 수행할 수 있다
	//리턴타입 동작명(){수행할 동작;}
	//리턴타입이 void가 아닌 모든 동작은 return뒤에 해당 데이터를 적어서 특정해야함
	void run() {
		System.out.println("동작 확인!");
	} //void는 리턴이 없는 리턴타입
	int data(int a , int b) {
		
		return a+b;
		//System.out.println("동작확인");  리턴 다음에는 동작올수없다.
		//리턴전에는 어떤 동작도 상관없음
	}// int
}//class car