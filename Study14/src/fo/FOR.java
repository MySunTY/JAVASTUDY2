package fo;

public class FOR {
	public static void main(String[] args) {
		//for문 {}내부의 내용을 반복해서 수행
		//for(시작점; 조건; 증감식){반복해서 수행할 문장}
		//*500000000 for문은 반시계방향
		//전역에 변수가 선언되었을때 for문 내부에 똑같은 변수를 선언하면 안된다
		int i = 35235325;
		for(i = 0 ; i <3; i++) {
			System.out.println("반복수행중");
		}//for
		System.out.println(i);
		//for문에서 만들어진 변수는 }끝나면 사라짐
	}//main
}//class
