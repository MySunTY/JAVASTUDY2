package cla;

import java.util.*;

public class Prac{
	public static void main(String[] args) {
		Re re ;
		re = new Re();
		Scanner sca = new Scanner(System.in);
		
		
		System.out.println("성함과 회원번호를 입력해주세요");
		String name = sca.nextLine();
		int num = sca.nextInt();
		String answer = re.pracc(name, num);
		System.out.println(answer);
	}//main	
}//Prac class

class Re{
	String pracc(String a, int b) {
		System.out.println("어서와");
		return a+" 회원님 "+ "환영합니다 "+b;
	}
	
	
}//re class