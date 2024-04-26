package exam;

public class Exam01 {
	public static void main(String[] args) {
		People[] school = new People[4];
		school[0] = new Student("둘리", 15);
		school[1] = new Teacher("홍길동", 45);
		school[2] = new Student("고길동" ,15);
		school[3] = new Teacher("선생님" , 55);
		for(int i = 0 ;i<school.length;i++) {
			school[i].work();
		}
		
	}//main
}//class

//추상클래스가 추상메서드를 가진경우 상속받은 class는 반드시 몸통{}을 구현해야 한다

abstract class People{
	int age;
	String name;
	People(){
		System.out.println("부모의 일반 생성자");
	}
	People(String a , int b){
		name = a;
		age = b;
	}//생성자
	void show() {
		System.out.println("이름 :"+name +", 나이 : "+age);
	}//show 메서드
	abstract void work();
	
}//people class

class Student extends People{
	Student(String a , int b){
		super(a,b);
		
	}//student 생성자
	int korScore;
	int engScore;
	int mathScore;
	/*int[] score = new int[]{korScore,engScore, mathScore};
	void input(int[]  a, int b , int c ,int d) {
		score = a;
		korScore = b;
		engScore = c;
		mathScore = d;*/
	
	void input(int[] a) {
		
		korScore = a[0];
		engScore = a[1];
		mathScore = a[2];
	}//input
	void show() {
		super.show();
		System.out.println("국어 점수 : "+korScore + ", 영어 점수 "+engScore+", 수학 점수 : "+mathScore );
	}//show오버라이드
	void work() {
		System.out.println("공부");
	}//work 메서드, implement
	
	
	
	
}//class student

class Teacher extends People{
	String subject;
	void work() {
		System.out.println("수업");
	}//void work
	Teacher(String a , int b){
		super(a,b);
	}
	
}//teacher class