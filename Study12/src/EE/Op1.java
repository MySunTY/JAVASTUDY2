package EE;

public class Op1 {
	public static void main(String[] args) {
		//이항 연산자
		//  산술연산자 : 계산결과가 특정한 값으로 나온다(조건으로 못쓴다)
		//  비교연산자 : 계산의 결과가 true 또는 false
		// == 와 = 혼동 주의 x50000000000000
		// != 둘이 다른지 확인
		int a = 10;
		int b = 5;
		boolean result = a!=b;
		System.out.println(result);
		
		int c = a+b;
		int d = a*b;
		result = c>d;
		System.out.println(result);
		
		//int num = c*d;
		//System.out.println(num);
	}//main
}//class
