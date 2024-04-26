package IF;

import java.util.*;


public class IF1 {
	public static void main(String[] args) {
		//if문 : 조건의 true false 여부에 따라 실행을 결정하는 제어문
		//if(조건){조건이 true일 경우 수행할 문장;}
		//if문에 {}을 지정하지 않으면 ()뒤 첫번째 ;를 범위로 본다
		/*int a = -3;
		System.out.println("if앞 내용은 조건과 무관");
		if(a==3) {
			System.out.println("조건이 참이므로 실행합니다");
			System.out.println("명령이 여러개여도 수행합니다");
			a=25;
		}//if
		System.out.println(a); */
		System.out.println("숫자를 입력하세요 , (문자금지)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		
		if(num<0) {
			System.out.println(num+"은(는) 음수입니다");
		}//if
		else if(num==0){
			System.out.println(num+"은 0입니다");
		}else {
			System.out.println(num+"은(는) 양수입니다");
		}
		sc.close();
		
		
	}//main
}//class
