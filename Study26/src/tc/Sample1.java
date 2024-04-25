package tc;
import java.util.*;
public class Sample1 {
	public static void main(String[] args) {
		//try-catch :오류 발생시 해당 오류를 특수처리하여 다른 기능이 동작하도록 하는 문법
		//try{오류가 발생할 수 있는 문장;}catch(매개변수){특수처리 내용;}
		//Connection 처리에서 반드시 사용하여야 한다. x500000000000;
		//공부용으로는 배열의 index범위 오류, Scanner의 데이터타입오류에 사용된다.
		System.out.println("작업을 시작합니다.");
		int[] arr = new int[3];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		try {
			arr[3] = 3;	
		}//try
		catch(Exception e) {
			e.printStackTrace(); //실제 오류코드를 보여주지만 주석달수가 없음
			System.out.println("###오류 "+e); //검색표식을 만들 수 있음
		}//catch
		System.out.println("모든 작업이 오류없이 진행되었습니다");
		Scanner sc = new Scanner(System.in);
		System.out.println("반드시 숫자를 입력해주세요");
		int i ;
		try {
			i= sc.nextInt();
		}//try
		catch(Exception e) {
			System.out.println("문자 적으면 동작안함 "+e);
		}//catch
		//실제코드에서는 스캐너를 String문자로 받아서 숫자만 따로 parseInt처리
		
		
		
	}//main
}//class
