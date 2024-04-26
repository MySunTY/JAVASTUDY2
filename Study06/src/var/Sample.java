package var;

public class Sample { //public class는 한개 다음 클래스는 그냥 class
	public static void main(String[] args) { //조립 시작점
		// 변수 제작법=> 타입 이름; (ex int a;) 
		// 변수이름 중복 금지, 숫자로 시작하면안됨, $ _ 특수기호만 가능
		// 예약어 사용안됨
		// 영어 대소문자 엄격하게 구별
		// 한글써도 동작하지만 영어를 쓰는게 좋음
		
		// 변수의 초기화(변수 초기값을 설정)init (이니셜의 약자)
		int a= 10;
		System.out.println(a);
		
		//상수의 사용 : 한번 값이 정해지면 변경할 수 없는
		//final 변수 이름=초기값;
		// 상수는 한번 값이 입력 되면 변경할 수 없다., 상수는 값을 변경하면 오류남
		final int c=10;
		System.out.println(c);
		//c=20;
		//System.out.println(c);
		
	
		
	}//main 프로그램 종료지점
}//class