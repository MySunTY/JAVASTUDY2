package cla;

import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int num = 55;
		Cal c ;
		c= new Cal();
		c.add(num,10,20);
		int result = c.addNum(10, 3);
		System.out.println("두 수의 곱은 "+result+"입니다");
		
		System.out.println("첫 번째 숫자를 입력해주세요");
		int k1 = sca.nextInt();
		System.out.println("두 번째 숫자를 입력해주세요");
		int k2 = sca.nextInt();
		int kResult = c.addNum(k1, k2);
		System.out.println("두수의 곱은 "+kResult+"입니다");
	}//main
}//class

class Cal{
	//매개변수: 메서드를 실행할때 주고 시켜야하는경우
	//해당 데이터를 메서드 내부의 변수를 통해 전달해주어야 한다
	//메서드 외부에서 데이터를 메서드 내부로 전달 할 경우 매개 변수를 사용한다
	//매개변수의 타입과 일치하지 않는 데이터를 주지 않으면 동작하지 않음
	//매개변수는 메서드 내부에서 변수처럼 이용가능하다
	void add(int a,int b) {
		System.out.println("매개 변수 2개를 받아 동작하는 add");
		System.out.println(a+b);
	}
	int addNum(int c, int d) {
		System.out.println("입력된 두 수는 "+c+"(과)와 "+d+"입니다");
		return c*d;
	}
	//메서드 오버로드 : x 50000000000
	//리턴타입과 이름이 똑같은 메서드를 매개변수의 수와 종류를 다르게해서 다른메서드처럼 사용하는 방법
	void add(int a , int b , int c) {
		System.out.println("매개변수 3개를 받아 동작하는 add");
		System.out.println(a+b+c);
	}
	
}//cal class