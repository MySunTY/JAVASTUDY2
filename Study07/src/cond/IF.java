package cond;

public class IF {
	public static void main(String[] args) {
		//조건문 if : 조건의 true false에 따라 실행여부 *500000000000
		//if(조건){조건이 true일경우 수행할 명령;} / false이면 무시 /삼항연산자 대체
		//if문에 {}가 없는 경우 뒤에 처음으로 나오는 ;까지를 {}로 본다
		int a =104;
		int b =5;
		System.out.println("if문 밖이므로 조건와 무관하게 무조건 실행");
		if(a==10) {
			b=20;
			System.out.println("조건이 참이므로 실행 합니다.");
			
			
		}//if끝
		System.out.println("if문의 {}밖이므로 조건과 무관하게 실행");
		System.out.println(b);
		//if=else구문 : 조건에 따라 어느부분을 실행할지 결정하는 문법
		//if(조건){조건이 true일 경우수행;}else{조건이 false일경우수행;}
		//절대로 둘이 동시에 일어날일도없고 아예발생하지않을일도 없는경우 (ex)로그인)
		if(a<100) {
			System.out.println("if-else의 조건이 true입니다.");
			if(a>5) {
				System.out.println("a는 5보다 크고 100보다 작다.");
			}//if끝
		}//if끝
		else {
			System.out.println("if-else의 조건이 false입니다.");
			
		}//else끝
		a=6;
				
		//if-else if: 조건이 여러개인 경우 그중 하나를 선택하여 수행하는 문장
		//조건은 위에서부터 순서대로 확인하고 하나라도 true가 나오면 아래는 보지 않는다.
		//if(조건1){}else if(조건2){}else if(조건2){} .....
		if(a>10) {
			System.out.println("조건1 만족");
		}//if끝 
		else if(a>5) {
			System.out.println("조건2 만족");
		}
		else if(a>1) {
			System.out.println("조건3 만족");
		}
		else {
			System.out.println("조건이 모두 불만족이므로 else 실행");
		}
		
	}//main

}// class
