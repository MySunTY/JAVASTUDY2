package var;

public class INT {
	public static void main(String[] args) {
		//byte : 아주 작은단위 -128~ 127
		//short: 숏 작은수가 저장
		//int : 21억 일상적인 수 * 50000000000
		//long: 아주 큰수
		
		byte a;
		a=127;
		System.out.println(a);
		
		short b;
		b=10000;
		System.out.println(b);
		
		int i ;
		i = 25252525;
		System.out.println(i);
		//숫자가 적히면 무조건 int로 컴퓨터가 인식, 그래서 변수이름앞에 숫자를 적으면안됨
		
		long l = 353523523235235235L;
		System.out.println(l);
		
		
	}//main
}//class
