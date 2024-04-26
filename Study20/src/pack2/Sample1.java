package pack2;

import pack1.Data;

public class Sample1 {
	public static void main(String[] args) {
		Data d ;
		d= new Data();
		//d.pri = 10; //private은 클래스를 벗어나면 사용할 수 없다
		//d.pro = 20; //protected패키지를 벗어나서 사용불가
		//d.def = 30; default(아무것도 안적은거 )패키지를 벗어나서 사용불가
		d.pub = 40;
		System.out.println(d.pub);
		
		
		
	}//main
}//class
