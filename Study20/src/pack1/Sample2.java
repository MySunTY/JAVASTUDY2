package pack1;

public class Sample2 {
	public static void main(String[] args) {
		Data d = new Data();
		//d.pri = 10; 같은 클래스내부에서 사용
		d.pro = 20; // 같은 패키지안에 있어서 사용가능
		d.def = 30; // 같은 패키지안에 있어서 사용가능
		d.pub = 40;
	}//main
}//class
