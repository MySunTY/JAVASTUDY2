package EE;

public class Op4 {
	public static void main(String[] args){
		// 삼항 연산자
		// a?b:c;
		//a 가 참이면 b 수행/ a가 거짓이면 c 수행
		//조건에 따라 실행할 부분을 결정하는 연산자
		//기능은 좋지만 가독성이 떨어짐
		int number = 10;
		String result;
		result=(number>=10)?"참":"거짓";
		System.out.println(result);
	}//mainn
}//class
