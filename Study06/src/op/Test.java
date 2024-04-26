package op;

public class Test {
	public static void main(String[] args) { //args , arg argument의 약자, 이름짓기 애매할때 사용
		//연산자 :계산할 때 사용하는 부호
		//산술 연산자: 계산의 결과가 특정한 값이 됨
		
		// + :더하기 , 숫자와 문자를 더하면 접착되면서 문자가됨
		// int를 int로 나누면 정수로 나오기때문에 몫만 나옴
		// 나누기는 몫만나옴
		int a=10;
		int b=20;
		int result = a+b;
		System.out.println(result);
		a= 10;
		b= 4;
		double nanu =a/b;
		double kk = a%b;
		System.out.println(nanu);
		System.out.println(kk);
		System.out.println(result+"입니다.");
		//비교연산자 : 계산의 결과가 참 또는 거짓 true or false (조건)
		//산술연산자는 조건만들 수 없다.
		// !는 반전 부정의 표현
		boolean result1 = a==b;
		System.out.println(result1);
		a=5;
		b=3;
		result =5^3; // 비트연산자(이진수로 변환한뒤 자릿수별 계산 거의 쓰이지 않음 
		//&(and) :자릿수별로 둘다 1이면 1 하나로도 0이면 0
		//|(or) : 자릿수별로 둘중하나라도 1이면 1 둘다0이면 0
		//^(xor)익스클루시브 or: 둘이 같으면 0 다르면 1
		//but *50000000 논리연산자와 혼동하지 않도록 주의
		System.out.println(result);
		
		//논리 연산자 * 5000000000 
		//true 또는 false를 이용하여 논리적인 결과를 계산하는 연산자
		// && and 둘다 참이어야 참 (ex 로그인)
		// || 둘중하나만 참이어도 참
		// 논리 연산자 앞뒤로 true or false값이 나올수 있는것만 나와야함
		result1 = a==b || a>=b;
		System.out.println(result1);
		//시프트 연산자(산술연산) : 이진수로 바꿔서 자릿수에 변화를 주어 값을 계산하는 연산
		// << A<<B => A * 2의 B제곱
		// >> A>>B : A를 이진수로 변환한 뒤 오른쪽으로 자릿수 이동
		// 3<<3 => 3*2의 3제곱 => 24
		int k=7;
		
		System.out.println(15<<2);
		//삼항 연산자: 항이 3개 있어야 계산할 수 있는 연산자
		// 조건 ? 참일경우 : 거짓일경우; (if문으로 대체가능)
		int d=-9;
		String msg;
		msg=(d>0)?"양수":(d==0)?"영":"음수"; //참을 출력
		//result=false?1:2; // 거짓을 출력
		System.out.println(d+"은(는) "+msg+"입니다.");
		
	
		
	}//main
}//class
