package Cla;

public class Start {
	public static void main(String[] args) {
		Student.jjajjang=3;
		System.out.println(Student.jjajjang);
		
		
		// static 설계도와 상관없는 메모부분
	}//main
	
}//class

class Student{
	int number; // 학번을 저장할 공간
	String name; // 이름을 저장한공간
	String phone; // 연락처 저장공간
	boolean bool;
	static int jjajjang;
}