package op;

public class EE {
	public static void main(String[] args) {
		//이항 연산자
		//  산술연산자 : + * - / % 
		//  계산의 결과가 특정됨 -> 조건으로 사용 불가(조건은 true or false)
		int a=10;
		int b=4;
		int result = a+b;
		System.out.println("a+b는 "+result+"입니다.");
		System.out.println("a와 b를 나누면 몫은 "+(a/b)+"이고 나머지는 "+(a%b)+"입니다");
		System.out.println(a+"+"+b+"는 "+result+"입니다.");
		System.out.println("a의 값은 "+a+"이고 "+"b의 값은 "+b+"입니다");
		System.out.println("a*b");
		result= a-b;
		System.out.println(a+"-"+b+"는 "+result+"입니다.");
		//*는 연산자 곱하기 / 그리고 전체라는 의미도 있음
		result = a*b;
		System.out.println(a+"*"+b+"는 "+result+"입니다.");
		result = a/b; //int기반의 나누기는 소수점 버리고 몫만 구함
		System.out.println(a+"/"+b+"는 "+result+"입니다.");
		result = a%b;
		System.out.println(a+"%"+b+"는 "+result+"입니다.");
		
		}//main
}//class
