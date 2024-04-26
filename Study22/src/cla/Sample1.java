package cla;
import java.util.*;
public class Sample1 {
	public static void main(String[] args) {
		Test t = new Test();
		int num1 = 5;
		int num2 = 7;
		int value = t.method(num1,num2);
		System.out.println("결과값: "+value);
		System.out.println("t 객체 필드값 :"+t.field);
		System.out.println(t.str);
		Test t1 = new Test(100);
		System.out.println("t1 객체 필드값 :"+t1.field);
		Test t2 = new Test(200);
		System.out.println("t2 객체 필드값 : "+t2.field);
		Test mem1 = new Test(1,"홍길동",30,"노원구");
		Test mem2 = new Test(2,"둘리",50,"도봉구");
		Test mem3 = new Test(3,"고길동",60,"강북구");
		Test mem4 = new Test(4,"북부",70,"노원구");
		mem1.show();
		mem2.show();
		mem3.show();
		mem4.show();
		System.out.println(mem1);
		System.out.println(mem2);
		System.out.println(mem3);
		System.out.println(mem4);
		
		
	}//main
}//class

//클래스(설계도)
//필드 매서드 생성자를 가질 수 있다.
// 필드 : 통상적으로 변수,생성된 객체가 다른 객체와 구별되기 위한 데이터를 저장하는 장소
class Test{
	int field; //필드
	String str;
	int memNum;
	String name;
	int number;
	String address;
	
// 메서드 : 생성된 객체가 수행할 수 있는 동작
// 리턴타입 이름(매개변수){수행할동작 ; return} *50000000000
	//매개변수는 메서드 내부에서 변수처럼 사용이 가능하다
	//매개변수가 있는 매서드는 반드시 해당 변수에 맞는 데이터를 순서대로 줘야 실행가능하다
	//반복문 제어문은 메서드 내부에 작성해야 한다
	
	//생성자 : 객체를 조립하는 방법
	//별도로 생성자 제작하지 않아도 기본적으로 들어가 있는 기능
	//개발자가 의도를 담아 제작법을 만들려 하는 경우 별도로 제작해 주어야한다.
	//생성자의 용도 : 필드에 초기 데이터를 입력하거나 객체를 다른 형태로 조립할 때 사용
	//생성자는 무조건 단 한번 객체가 조립될때(new~ ) 실행된다 * 5000000000
	int method(int a,int b) {
		int result = a+b;
		System.out.println("메서드 동작");
		if(a<b) {
			System.out.println("if문 실행");
		}
		return result;
	}//메서드
	Test(){
		System.out.println("생성자 실행");
		field = 1000;
		str = "고고";
		
	}//test생성자
	Test(int a){
		System.out.println("매개 변수를 통해 생성자 초기화");
		field = a;
	}//int 생성자
	Test(int num , String a , int b , String c){
		memNum = num;
		name = a;
		number =b;
		address = c;
		System.out.println(num+".학생이름 :"+a+"\t"+" , 번호 :"+b+" , 주소 :"+c);
	}//변수4개 생성자
	void show() {
		System.out.println(name + ", "+number+" , "+address);
	}
	public String toString() {
		return name + ", "+number+" , "+address;
	}
	//데이터 출력을 편하게 해주는 toString 오버라이드
	//오버라이드는 상속에서 굉장히 중요한 역할을 한다.
	
}//test class