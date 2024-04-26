package op;

public class Dan {
	public static void main(String[] args) { // 시작점이 오타났을경우 직전 시작점을 잡아줌
		System.out.println("안녕하세요!");
		//단항연산자
		// 부정연산자 : 값을 반전시키는 용도로 사용
		// 증감연산자 : ++ , --
		boolean b = !true;
		System.out.println(b);
		int i = 3;
		int k = i++;
		System.out.println("k값 : "+k); 
		System.out.println("i값 : "+i);
		// ++a 계산우선순위가 높아서 출력전에 계산 a++은 계산우선순위가 낮아서 출력에는 반영안됨
		//System.out.println("계산 종료된 후 i 값: "+ i);
		// 상수는 연산이 불가
		// 상수는 변수앞에 final
		final int num = 15;
		System.out.println(num+1);
		//num++;
		//System.out.println(num);
	}//main
}//class
