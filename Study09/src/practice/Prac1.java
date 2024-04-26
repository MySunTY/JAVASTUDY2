package practice;

public class Prac1 {
	public static void main(String[] args) {
		Prac2 go = new Prac2();
		int result = go.plus(50 , 70);
		System.out.println(result);
		go.hi();
		go.bye();
		
	}//main
}//class

class Prac2{
	int plus(int a , int b) {
		return a + b ;
	}
	void hi() {
		System.out.println("실행합시다");
	}
	void bye(){
		System.out.println("실행");
	}
	
}//2 class
