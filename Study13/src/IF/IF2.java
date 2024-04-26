package IF;

public class IF2 {
	public static void main(String[] args) {
		int number = 150;
		number-=101;
		if(number>0) {
			System.out.println("양수입니다");
			if(number>100){
				System.out.println("100보다 큰 수 입니다");
				if(number%2==0) {
					System.out.println("짝수입니다");
				}//if %2
			}//if 100
			System.out.println("외부조건만 만족하면 내부조건과 무관하게 실행");
		}//if 0
		System.out.println("if문과 완전 무관하게 실행");
	}//main
}//class
