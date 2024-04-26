package IF;

public class IF3 {
	public static void main(String[] args) {
		//if else문 
		// if문은 실행할지말지 결정 / if-else문은 둘중아한 실행 - 둘다 실행되는경우도없고 둘다 실행되는경우도없다
		//if(조건){트루일때 실행될때 실행} else{false일때 실행
		int number = 153;
		
		if(number%2!=0) {
			System.out.println("홀수입니다");
			if(number>=100) {
				System.out.println("100보다 크거나 같은 수입니다");
				if(number>=150) {
					System.out.println("150보다 크거나 같은 수입니다");
				}//if(number>=150)
				else {
					System.out.println("150보다 크지않습니다");
				}
			}//if(number>=100)
			else {
				System.out.println("100보다 작습니다");
			}//else
		}//if(number%2!=0)
		else {
			System.out.println("짝수입니다");
			if(number>=100){
				System.out.println("100보다 크거나 같은 수입니다");
			}//if(number>=100)
			else {
				System.out.println("100보다 작습니다");
			}//else
		}//else
	}//main
}//class
