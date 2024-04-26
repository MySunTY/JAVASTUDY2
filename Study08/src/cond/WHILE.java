package cond;

public class WHILE {
	public static void main(String[] args) {
		//반복문 while 
		// while(조건){반복 수행할 문장;}
		//반복횟수 지정안되기 때문에 무한반복 가능성 높음
		//do-while 조건이 거짓이라도 한번은 무조건 반복하는 문법
		int i= 5;
		do {
			
			System.out.println("반복중..."+i);
		}while(i>10);
		System.out.println(i);
	}//main
}//class
