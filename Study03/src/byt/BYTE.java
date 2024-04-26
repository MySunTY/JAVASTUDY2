package byt;

public class BYTE {
	public static void main(String[] args) {
		//byte 아주 작은 수를 저장할 수 있는 규격 -128~127까지
		//통상적인 프로그램 제작에는 사용할 수 없다.
		//강제로 큰수를 넣을수 잇지만 데이터 유실발생
		byte a;
		a=-100;
		System.out.println(a);
		
		//short : 작은 수를 저장할 수 있는 규격 -32768~32767
		// 잘 쓰지 않음
		
		short b;
		b=30000;
		System.out.println(b);
		
		
	
	}//main 끝
}//클래스끝
