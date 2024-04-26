package fo;

public class FOR2 {
	public static void main(String[] args) {
		//중첩 for문
		int a=0;
		int b=0;
		
		for(a = 0; a<2; a++){
			System.out.println("a 반복문이 시작");
			for(b = 0; b<3; b++) {
				System.out.println("    b반복 시작");
				System.out.println("    반복중 a ="+a+", b = "+b);
				System.out.println("    b반복 종료");
				break;
			}// if b
			
			System.out.println("a 반복문이 종료");
		}//if a
		System.out.println(a+"와"+b);
	}//main
}//class
