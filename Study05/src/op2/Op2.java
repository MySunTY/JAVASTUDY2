package op2;

public class Op2 {
	public static void main(String[] args) {
		//산술 연산자 : 계산의 결과가 특정한 값으로 나오는 연산 / 5칙연산
		// +
		// -
		// *
		// /
		// % 나머지
		
		//문자열과 숫자를 더하면 둘이 이어붙인 문자열이 된다.
		int a;
		int b;
		int result;
		int c;
		int d;
		
		
		a=5;
		b=9;
		result=a+b;
		c=b/a;
		d=b%a;
		
		System.out.println("계산 결과는 "+result+"입니다.");
		
		result=a-b;
		System.out.println(a+"-"+b+"="+result+"입니다.");
		result=a*b;
		System.out.println(a+"*"+b+"="+result+" 입니다.");
		System.out.println(a+"*"+b+"*"+b+"="+result*b+" 입니다.");
		System.out.println(b+"*"+a+"="+result+" 입니다.");
		result=2*a+2*b;
		System.out.println(result);
		result=b/a;
		System.out.println(result);
		result=b%a;
		System.out.println(result);
		//int로 나누기를 수행하면 몫만 구할 수 있다.
		// %는 나누기 계산에서 발생한 나머지를 구할 때 발생한다
		// 9와 5를 나누면 몫은 1이고 나머지는 4가된다
		System.out.println(b+"와 "+a+"를 나누면 몫은 "+c+"이고 나머지는 "+d+"가 된다.");
		
		
		
	
	}//main
}//class
