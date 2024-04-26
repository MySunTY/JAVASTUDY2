package block;

public class Block {
	public static void main(String[] args) {
		//블락 : 설계도의 영역을 나타내는 기호
		//블락 내부에서 만들어진 변수는 외부에서 사용할 수 없다
		//변수는 자신이 만들어진 블락을 벗어난 순간 사라진다
		
		int a=3535;
		{
		System.out.println(a);	
		}//블락 끝
		
		
	}//main 끝
}//class 끝
