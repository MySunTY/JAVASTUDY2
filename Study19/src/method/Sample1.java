package method;

import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		Test test; 
		test=new Test(); //객체 조립방법 : new class이름(); 조립하는 동작이기때문에 ()가 동작
		Scanner sca = new Scanner(System.in);
		int a = sca.nextInt();
		int b = sca.nextInt();
		String c = sca.next();
		test.run(true);
		
	}//main
}//class

//메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작 *500000000000
//같은 이름을 가진 동작이 여러개이면 오류의 원인
//but 매개변수의 차이를 두어 같은 이름을 가진 동작 실행가능 : 메서드 오버로드
//매개변수 명칭으로는 오버로드가 성립하지 않음, 타입과 수에 영향을 받는다

class Test{
	//리턴타입 이름(){호출시 수행할 동작;}
	void run() {
		System.out.println("run()동작 실행");
	}//run void
	void run(int a) {
		System.out.println("두번째 메서드 실행");
	}//int run
	void run(String b) {
		System.out.println("스트링 메서드 실행");
	}//string run
	void run(int a, String b) {
		System.out.println("int String");
	}//int string
	void run(String b ,int a) {
		System.out.println("String int");
	}//string int
	
	void run(int a , int b) {
		System.out.println("숫자 2개 동작 실행");
	}//int int
	void run(String a , String b , int c) {
		System.out.println("이 메서드가 실행될수 있도록 매개변수를 적으시오");
	}//str str int
	void run(int a , int c, String b) {
		System.out.println("int int str 메서드가 실행될수 있도록 매개변수를 적으시오");
	}//int int str
	void run(boolean a) {
		System.out.println("참 거짓");
	}//불리언
}//test class

