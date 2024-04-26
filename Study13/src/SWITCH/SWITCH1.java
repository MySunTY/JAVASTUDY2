package SWITCH;

public class SWITCH1 {
	public static void main(String[] args) {
		//switch문 : 변수의 값에 따라 실행위치를 결정하는 제어문
		/*switch(변수이름) {
		case 값 : 실행할 문장 ;
		break;
		}*/
		//스위치는 선별기능이 없으므로 break를 활용해 하나만 고를 수 있다
		//break를 이용하여 유사 선별기능을 구현할 수 있다
		//case의 순서는 상관없다 default도 마찬가지
		int score = 80;
		switch(score) {
			default : System.out.println("애매하세요");
			break;
			case 50 : System.out.println("50점이세요");
				if(score%2==0) {
					System.out.println("짝수");
				}
			break;	
			case 100 : System.out.println("100점이세요");
			break;
			case 150 : System.out.println("150점이세요");
			break;
			case 80 :
			
		}//switch
		System.out.println("스위치 밖에서는 break 영향 받지 않는다");
		
	}//main
}//class
