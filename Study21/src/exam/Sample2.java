package exam;
import java.util.Scanner;
public class Sample2 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String str = sca.nextLine();
		Student s = new Student(str);
		System.out.println("이름, 수학점수, 영어점수, 국어점수를 입력하세요");
		
		String st =sca.nextLine();
		int num1 = sca.nextInt();
		int num2 = sca.nextInt();
		int num3 = sca.nextInt();
		Student mem1 = new Student(st,num1,num2,num3);
		//System.out.println("이름 :"+mem1.name+" , 수학점수 : "+mem1.mathScore+", "
			//	+ "영어점수 : "+mem1.engScore+", 국어점수 : "+mem1.korScore);
		
		System.out.println(mem1);
		int soo = mem1.averScore(num1,num2,num3);
		System.out.println(soo);
		
	}//main
}//sam class
//객체를 만들때는 하나만 선택해서 조립하게 된다.
class Student{
	String name; // 학생이름
	int mathScore; //수학성적
	int engScore; // 영어성적
	int korScore; // 국어성적
	Student(String name){
		this.name = name;
		System.out.println("학생의 이름은 "+name+"입니다");
	}//생성자
	Student(String a, int b, int c , int d){
		name = a;
		mathScore= b;
		engScore = c;
		korScore = d;
	}//변수4개 생성자
	void info() {
		System.out.println("학생이름 : "+name);
		System.out.println("수학성적 : "+mathScore);
		System.out.println("영어성적 : "+engScore);
		System.out.println("국어성적 : "+korScore);
	}//보이드 메서드
	int averScore(int a , int b , int c) {
		
		return (a+b+c)/3;
	}
	//오버라이드 : 기존에 있던 기능을 재정의해서 사용하는 기법
	//클래스 내부에 toString()을 재정의하면 객체를 출력시 주소가 아니라 해당 내용을 출력한다.
	public String toString() {
		return "학생이름 :"+ name+ "수학성적 : "+mathScore+", 영어성적 : "+engScore;
	}
	
}//stu class
