package fo;

public class FOR3 {
	public static void main(String[] args) {
		
		//break: 제어문이 가지고 있는 동작을 정지시키는 효과
		//continue 제어문 처음으로 돌아가는효과
		//continue가 실행되면 그 아래는 동작 x 아래 코드 동작막기위해
		int i = 0;
		for(i = 0; i<10; i++) {
			
			if(i%2==0) {
				continue;	
			}	
			System.out.println(i);
		}
		System.out.println("반복문의 외부에서는 break의 영향을 받지 않음");
		System.out.println(i);
		//while : 반복문
		//while(조건){수행할 문장}
		//do{반복해서 수행할 문장;}while(조건);
		//do-while은 조건이 거짓이더라도 무조건 한번은 실행하기 위한 기법
		int a=3;
		do{
			System.out.println("반복중..."+a);
			a--;
		}while(a>1) ;
	}//main
}//class
