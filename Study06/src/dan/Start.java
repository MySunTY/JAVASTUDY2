package dan;

public class Start {
	public static void main(String[] args) {
		//단항연산자 항이 단독으로 사용 가능한 연산자
		//!항 : true->false / false->true
		boolean B=false;
		boolean C=!B;
		System.out.println(C);
		
		//증감연산자: 단항의 데이터를 한단위 변화
		//전위 증감과 후위증감이 =과 쓰일때 약간 다르게 증감 *50000000000
		int a = 5;
		int b = a++;
		
		System.out.println(b);
		System.out.println(a);
		
		// A=A+B A+=B
		// A*=B A=A*B
		int i = 5;
		//i+=2; // i = i+2
		i*=2;
		System.out.println(i);
		char c='가';
		System.out.println((int)c);
		//컴퓨터는 문자를 해석할 수 없으니 문자표 번호로 기억을 한다.
		
		//강제 형변환 (캐스팅): 다른 타입의 자료를 가공 / 데이터 유실 가능성이 있음
		float f= 1.233f;
		double ee =f;
		int g = (int)f;
		System.out.println(g);
		System.out.println(f);
		System.out.println(ee);
		
		//정의(변수) 조건(제어문) 동작(메서드)
	}//main
}//class
