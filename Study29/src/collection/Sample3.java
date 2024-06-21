package collection;

public class Sample3 {
	public static void main(String[] args) {
		//제네릭: 클래스의 특정 문자를 원하는 타입으로 변환하는 기법
		//자료형을 마음대로 조절할 수 있어서 편리
		Normal n = new Normal("스트링");
		System.out.println(n.a);
		String result = n.show();
		System.out.println(result);
		
		// n.a=15; 객체를 사용하는 입장에서는 class 의 수정없이 타입을 변경할 수 없다.
		Gene<Normal> g = new Gene<Normal>(n);
		Normal result2 = g.show();
		System.out.println(result2);
		System.out.println(g.a);
		
		
		
	}//main
}//sam3 class

class Normal{
	String a;
	Normal(String b){
		a=b;
	}//생성자
	String show() {
		return a;
	}
	
	
}//nor class

class Gene<T>{
	T a;
	Gene(T b){
		a =b;
	}
	T show() {
		return a;
	}
	
}// GEneclass

