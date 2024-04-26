package cla;

public class Sample1 {
	public static void main(String[] args) {
		Student student;
		student = new Student();
		//new = 인스턴스 연산자
		student.math= 100;
		int math_score = student.math;
		System.out.println(math_score);
		Student a;
		a= new Student();
		a.name = "고길동";
		System.out.println(a.name);
		String str= a.check();
		System.out.println(str+"님 성공하였습니다.");
		Student b;
		b= new Student();
		b.name = "홍길동";
		String name1 = b.check();
		System.out.println(name1+"님 성공하였습니다");
		a.study();
		b.study();
		student.study();
		
	}//main
}//class

//클래스 : 필드 메서드 생성자를 가질 수 있다
//메서드 : 클래스 내부에 작성되어 객체가 수행하는 동작
//리턴타입 이름(){동작이 실행되면 수행할 문장;}

class Student{
	String name; // 학생의 이름을 저장한 공간
	int number ; //학번
	int kor; //국어성적
	int eng; //영어 성적
	int math; // 수학성적을 저장할공간
	
	String check() {// 출석체크하는 기능
		System.out.println("지문을 체크합니다");
		return name;//리턴이후에 어떤 동작도 수행할 수 없다
	}//string method
	//리턴이 있다는것은 변수에 담을 수 있다는 뜻
	//리턴이 존재하지 않는 메서드 : void
	void study(){
		System.out.println("공부를 열심히 합니다.");
	}
	
	
}//stu class

