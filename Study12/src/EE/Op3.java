package EE;

public class Op3 {
	public static void main(String[] args) {
		//비트연산자: 산술연산자
		// 수를 이진수로 변환하여 자릿수 별로 0 or 1로 계산
		// & 둘다 1이면 1 , 하나라도 0이면 0
		// | 둘중 하나라도 1이면 1 둘다 0이면 0
		// ^ 익스클루시브 or  : 다르면 1 같으면 0
		int a = 2;
		int b = 4;
		int result = a|b;
		System.out.println(result);
		
		//2진수로 변환한 값을 확인하는 방법
		int number;
		number= 9;
		String data= Integer.toBinaryString(number); //static 메서드라서 실행가능
		//Integer 클래스가가지고 있는 toBinaryString메서드 실행
		System.out.println(data);
		//2진수가 string 형태의 문자로 출력됨
		
		//시프트 연산자
		int k = 5;
		k = 5>>5;
		System.out.println(k);
		
	}//main
}//class
