package cla;

public class Prac {
	public static void main(String[] args) {
		TT t = new TT();
		t.go(3, 5);
		TT t1 = new TT(1);
		System.out.println(t);
	}//main
}//class

class TT{
	void go(int a , int b) {
		System.out.println(a+b);
	}
	TT(){
		System.out.println("생성자 실행");
	}
	TT(int a){
		System.out.println("두번째 생성자 실행");
	}
	public String toString(int a,int b) {
		int sum = a+b;
		return sum+"가보자";
	}
	
}// class TT
