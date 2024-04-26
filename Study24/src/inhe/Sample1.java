package inhe;

public class Sample1 {
	public static void main(String[] args) {
		Parent[] pArr = new Parent[3];
		
		pArr[0] = new Parent();
		pArr[1] = new Child();
		pArr[2] = new Student();
		
		
		for(int i =0 ; i<pArr.length; i++) {
			pArr[i].method();
		}
		
		
		
	}//main
}//sam class
//상속 : 클래스간 필드와 메서드 상속
//부모클래스에 작성된 내용은 자식클래스가 그대로 사용가능
//자식클래스에 추가로 작성된 내용은 부모클래스가 사용할 수 없다
//부모 크기 변수에 자식 클래스가 들어갈 수 있고 그 위 조상도 가능
//extends를 적지 않은 모든 클래스는 object 클래스의 상속을 받는다
//모든 클래스의 조상은 Object이며 대부분의 데이터를 저장할수 있는 규격
//자식 클래스를 객체로 조립하면 부모의 생성자가 먼저 실행된다
//오버라이드 : 부모에게 '상속받은 메서드'를 자식이 재정의하여 사용하는 기법
//부모의 메서드를 똑같이 작성한 이후 {} 내부 내용만 변경
//조부모 메서드를 부모가 오버라이드 한경우 자식은 부모의 오버라이드를 상속받는다

class Parent{
	int field ;
	void method() {
		System.out.println("Parent의 원본 메서드");
	}//void
	/*Parent(){
		System.out.println("Parent의 생성자 실행");
	}//parent 생성자*/
	
	
}// parent class

class Child extends Parent{
	int number;
	/*Child(){
		System.out.println("Child의 생성자 실행");
		
	}//child 생성자*/
	void method() {
		System.out.println("Child가 재정의한 메서드");
	}
}//child class

class Student extends Child{
	String study;
	/*Student(){
		System.out.println("Student의 생성자 실행");
	}//Student 생성자*/
	void method() {
		System.out.println("Student가 재정의한 메서드");
	}
	
} //stu class