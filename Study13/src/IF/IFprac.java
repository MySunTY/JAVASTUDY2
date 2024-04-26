package IF;

import java.util.*;

public class IFprac {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(문자금지)");
		int result = num.nextInt();
		System.out.print("입력하신 숫자는 "+result);
		if(result>0) {
			System.out.println("이고 양수입니다");
		}
		else if(result==0) {
			System.out.println("입니다");
		}
		else {
			System.out.println("이고 음수입니다");
		}
		
	}//main
}//class
