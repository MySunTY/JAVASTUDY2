package exam;

public class prac11 {
	public static void main(String[] args) {
		Mom m = new Mom();
		
		Son s = new Son("A");
	}//main
}//class

class Mom{
	int year;
	int number;
	
	Mom(){
		System.out.println("부모 일반생성자");
	}
	Mom(String a){
		System.out.println("부모 스트링 생성자");
	}
	
}// class mom


class Son extends Mom{
	Son(){
		System.out.println("자식 일반생성자");
	}
	Son(String a){
		super(a);
		System.out.println(a+"자식 스트링 생성자");
	}
}
