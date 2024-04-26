package prac;

public class Abbb {
	public static void main(String[] args) {
		ABBBB a = new Ab();
		a.number = 10;
		a.size = 50;
		System.out.println(a.number);
		System.out.println(a.size);
		a.go();
		System.out.println(a.str());
	}//main
}//class

abstract class ABBBB{
	int number;
	int size ;
	
	
	ABBBB(){
		System.out.println("추상클래스 실행");
	}
	void go() {
		System.out.println("보이드 고 실행");
	}
	String str() {
		return "스트링 실행";
	}
	
	
}//class ABBBB

class Ab extends ABBBB{
	Ab(){
		System.out.println("ab클래스 실행");
	}
	
}


