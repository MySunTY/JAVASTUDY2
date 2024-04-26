package exam;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		Test t = new Test();
		String str = t.make();
		System.out.println(str);
		Test t1 = new Test(3);
		Test t2 = new Test("a");
		Scanner sca = new Scanner(System.in);
		int num = 51;
		int ber = 50;
		String result = t.make(num, ber);
		System.out.println(result);
		System.out.println("2~9까지의 숫자를 입력하세요");
		int soo = sca.nextInt();
		
		System.out.println("["+soo+"단]");
		t.gugu(soo);
	}//main
}//class

class Test{
	
	String make() {
		for(int i=1000; i<=100 ; i++) {
			System.out.println(i);
			
		}//for
		return "1부터 100까지 출력했습니다";
	}//make 메서드
	
	String make(int a, int b) {
		for(int i = a; i<=b ; i++) {
			System.out.println(i);
		}//for
		
		return "num부터 ber까지 출력";
	}//숫자make 메서드
	String make(String a) {
		return "문자를 넣으면 이게 출력";
	}//문자 make 메서드
	
	void gugu(int a) {
		
		
		//System.out.println("입력하신 구구단은 "+a+"단입니다");
		//System.out.println("계산 결과값은 : "+a+"X"+b+" = "+a*b);
		for(int i =1 ; i<=9 ; i++) {
			System.out.println(a+"X"+i+"="+a*i);
		}
	}//gugu void 
	
	
	
	
	
	Test(){
		System.out.println("그냥 Test를 실행합니다");
	}//test생성자
	
	Test(int a){
		System.out.println("숫자 Test를 실행합니다");
	}//숫자test생성자
	Test(String a){
		System.out.println("스트링 Test를 실행합니다");
	}//문자test 생성자
}//test class