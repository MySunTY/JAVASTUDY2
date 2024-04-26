package exam;

public class Sample3 {
	public static void main(String[] args) {
		Parent p ;
		p = new Parent();
		p.setNumber(4);
		System.out.println("p.number ="+p.number);
		Parent p1 ; 
		p1= new Parent(5);
		System.out.println("p1.number ="+p1.number);
		Child c = new Child();
		Child c1 = new Child(300);
		System.out.println(c1.number);
	}//main	
}//class

//매개변수(지역변수)가 전역변수보다 더 우선권을 가짐( 변수명이 같을때)

class Parent{
	int number; 
	Parent(){
		System.out.println("부모의 일반생성자");
		
	}//매개변수x 생성자
	void setNumber(int a) {
		number = a;
	}//void
	Parent(int a){
		number = a;
		System.out.println("number를 초기화하는 부모의 생성자");
	}//int 생성자
	
}//class parent

class Child extends Parent{
	Child(){
		System.out.println("자식의 일반생성자");
	}//child 일반생성자
	
	Child(int a){
		super(a);
		System.out.println("자식의 매개변수생성자");
		
	}//매개변수 생성자
	
}//child class
