package inhe;

public class ddfdf {
	public static void main(String[] args) {
		CarChild a = new CarChild();
		
	}//main
}//class

class Car{
	Car(){
		System.out.println("차량 운전을 시작합니다");
	}
	Car(int a){
		System.out.println(a+"번째 차량을 운행합니다");
	}
	
}// car class
class CarChild extends Car{
	CarChild(){
		super(2);
		System.out.println("출발");
	}
		
	
}//carchild class

