package var;

public class CHAR {
	public static void main(String[] args) {
		//char : 문자 하나를 저정할 수 있는 변수
		//저장하는 문자가 명령어가 아닌 문자 하나임을 알려주기 위해 단따움표' ' 를 사용
		//컴퓨터는 문자 자체의 의미를 해석할 수 없기에 문자마다 숫자를 부여해서 기여
		// char에 숫자를 입력하면 숫자에 맞는 문자출력
		char a;
		a= 'A';
		System.out.println(a);
		
		char b;
		b=45544;
		System.out.println(b);
		
		char k ;
		k = '옹';
		int i = k;
		System.out.println(i);
		//utf-8 255번이 넘어가는 문자표가 넘어가는 문자코드표
		//문자 하나는 '' 문자 길게는 ""
	}//main
}//class
