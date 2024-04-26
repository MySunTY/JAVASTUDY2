package cond;

public class FOR {
	public static void main(String[] args) {
		//반복문 for : 특정 동작을 반복해서 수행하도록 하는 문법
		//for(시작점; 조건; 증감식){반복수행할 문장;}
		//*중요 50000000000000000 반시계방향
		//반복 기준점을 잡고 기준점에 변화를 줘서 특정값이 될때까지 반복해라
		//조건이 참이면 일단 실행 그리고 증감으로 감
		//for문은 반복의 횟수를 특정할 수 있을때 사용
		System.out.println("반복 시작 전");
		int i;
		for(i=2147000000; i>=3; i++) {
			System.out.println(i+"반복중...");
			
		}//for
		System.out.println("반복 종료"); // for문이 종료된후 실행
		System.out.println(i);// for문에서 i를 선언했기에 괄호 벗어난후 사용 안됨
	}//main
}//class
