package method;

import java.util.Scanner;

public class Sample3 {
	public static void main(String[] args) {
		
		Exam ex ;
		ex = new Exam();
		Scanner sca = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요");
		int num1=sca.nextInt();
		System.out.println("두번째 숫자를 입력해주세요");
		int num2=sca.nextInt();
		System.out.println("세번째 숫자를 입력해주세요");
		int num3=sca.nextInt();
		int result = ex.sum(num1, num2,num3);
		System.out.println(result+"이 결과입니다");
		ex.check();
		
		
		
		
		
		ex.hiyo("이재민",5);
		int kk = ex.bye(5, "하이");
		System.out.println(kk);
	}//main
}//Sam3 class

class Exam{
	//매개변수명과 필드명을 같은이름으로 쓰면 좋지않음
	//같은 이름을 써야한다면 필드명 앞에 this.필드명 를 쓰면 구분됨
	int a ;
	int sum(int a , int b, int c){
		System.out.println("세 수를 더하면 다음과 같습니다.");
		System.out.print(a+"+"+b+"+"+c+" = ");
		//매개변수로 전달된 데이터는 안써도 상관없다
		
		this.a=a;
		return a+b+c;
		// 리턴이후에는 다른 명령 불가 리턴뒤에 다른리턴도 불가
		}// sum
	void check() {
		System.out.println("a내부의 값 : "+a);
		//보이드에는 리턴을 적을 수 없다 void타입은 변수에 넣을수도 없다
	}
	
	
	
	
	void hiyo(String a , int b) {
		System.out.println(a+"님 환영합니다 "+b+"번째 방문");
	}
	int bye(int a, String b) {
		System.out.println("바이를 실행합니다");
		return 777;
	}
}
