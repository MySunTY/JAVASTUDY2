package IF;

import java.util.*;

public class IFprac1 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int result = num.nextInt();
		if(result>0) {
			System.out.println("입력하신 숫자는 "+result+"이고 양수 입니다");
			if(result>100) {
				System.out.println("100이상입니다");
			}
		}else if(result==0) {
			System.out.println("입력하신 숫자는 "+result+"이고 양수 음수 모두 아닙니다");
			
		}else {
			System.out.println("입력하신 숫자는 "+result+"이고 음수입니다");
			if(result<-100) {
				System.out.println("-100이하입니다");
			}
		}
		
	}//main
}//class
