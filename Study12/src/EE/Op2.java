package EE;

public class Op2 {
	public static void main(String[] args) {
		//논리 연산자 :true false을 이용해서 true false를 계산
		// 한개만 적으면 비트연산자이기때문에 꼭 2개를 적어야함 x50000000000
		// && 두조건 모두 true일때 true
		// || 두조건중 하나만 true 여도 true
		boolean result ;
		result = true || false;
		System.out.println(result);
		
		String id = "admin";
		String pw = "1111";
		result = (id=="admin") &&(pw=="1111");
		System.out.println(result);
		
		int number = 6;
		result = (number>3) && (number<=6);
		System.out.println(result);
		
		int num = 7;
		boolean result1 ;
		result1= (num>5) && (num <10);
		System.out.println(result1);
		
	}//main
}//class
