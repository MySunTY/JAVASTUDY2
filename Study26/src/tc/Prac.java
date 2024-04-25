package tc;

import java.util.Scanner;

public class Prac {
	public static void main(String[] args) {
		System.out.println("데이터를 입력하세요");
		Scanner sc = new Scanner(System.in);
		String str ="";
		try {
			 str= sc.next();
			 System.out.println(str);
		}catch(Exception e){
			System.out.println(e);
			
		}
		
		
		
		
	}//main
}//class


