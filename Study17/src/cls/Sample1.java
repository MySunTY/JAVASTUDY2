package cls;

public class Sample1 {
	public static void main(String[] args) {
		// 클래스= 객체를 조립하는 설계도
		//*x5000000000
		//클래스는 필드 메서드 생성자를 가질 수 있다
		//1. 필드: 객체간 구별을 위한 데이터(속성)를 저장할 수 있는 공간
		//2. 메서드 : 객체가 수행할 수 있는 동작
		//3. 생성자 : 객체를 조립하는 방법
		//클래스는 객체로 조립해서 사용해야 한다
		// 인스턴스화 = new
		// new 클래스명();
		//조립된 객체는 변수에 담아야 사용하기 편하다
		Test t1= new Test();
		Test t2= new Test();
		Test t3= new Test();
		//class하나로 객체 여러개 제작할 수 있고 서로 독립적
		
		t1.name="김철수";
		t2.name="홍길동";
		t3.name="이재민";
		System.out.println(t1.name);
		System.out.println(t2.name);
		System.out.println(t3.name);
	
	
	}//main
}// sample1 class

//class 제작법 : 
// class 이름{} 
//클래스를 다른 내부에 만들면 처음에 공부하기 어려워진다.(만들어도 되긴함)
class Test{
	String name;
	int number;
	//필드는 통상적으로 변수로 제작한다
}//test class
//같은 pkg 내에서는 class명 중복 주의(패키지가 다를경우는 class명 같아도 가능)