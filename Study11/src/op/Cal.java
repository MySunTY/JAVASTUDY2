package op;

import java.util.*; // *은 전체란 의미


public class Cal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 느낌표 노란전구 : 동작하는데 문제는없는데 확인해봐
		System.out.println("첫 번째 숫자를 입력해 주세요");
		int a = sc.nextInt();
		System.out.println("두 번째 숫자를 입력해 주세요");
		int b = sc.nextInt();
		System.out.println("입력된 수는 "+a+","+b+"입니다");
		int result = a+b;
		System.out.println("두 수를 더하면 "+result+"입니다.");
		
		sc.close(); // 외부로 부터 데이터를 받아오는 경우 회선을 닫아주는게 중요하다.
		//영구적으로 데이터를 저장하고 검색이 빠른 DB(데이터베이스)
		
		
	}//main
}//class
