package cond;

public class SWITCH {
	public static void main(String[] args) {
		//분기문 switch : if문으로 대체가능
		//변수의 값에 따라 코드를 수행할 지점을 결정하는 문법
		//switch(변수){case 값 : 수행할 문장;break;}
		//시작 위치만 정해주는것, 그 이후에는 쭉 실행
		//선별 작업에 사용하고자 한다면 break; 명령을 통해 해당 성질을 막아야 한다.
		// break;는 스위치 중괄호에서 작동
		//case 값이 중복되면 오류
		int i=200;
		switch(i) {
			
			case 50: System.out.println("50일때 수행 확인!");break;
			case 100 : System.out.println("100일 때 수행 확인!");break;
			case 200 : System.out.println("200일 때 수행 확인!");break;
			case 30: System.out.println("30일때 수행 확인!");break;
			default : System.out.println("해당하는 값이 없습니다!");
		}//switch
		System.out.println("스위치문 종료 후 실행");
	}//main
}//class
