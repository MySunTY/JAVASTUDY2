package block;

public class Block {
	public static void main(String[] args) {
		//작명 권장사항(이름에 띄어쓰기 못쓰기 때문)
		// 1. 파스칼표기 : 첫 글자를 대문자로 : class명에 사용
		// 2. 카멜표기 : 두번째단어의 첫글자 대문자 , method에 사용 (동작실행)
		// 3. 팟홀표기 : 띄어쓰기대신 _를 사용, 변수명에 사용
		//지키지 않아도 오류가 발생하지는 않는다.
		
		// {} 블락 : 영역을 나누는 기호 , 원하는대로 만들 수 있음
		// 블락내부에서 생성된 변수는 블락이 종료되면 소멸한다.
		{
			int a = 20;
		}
			int a = 40;
			System.out.println(a);
	}//main
}//class
