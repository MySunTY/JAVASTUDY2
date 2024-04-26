package sta;

public class Sample1 {
	public static void main(String[] args) {
		Sample2.test();
		Sample2.s_field = 10;
		System.out.println(Sample2.s_field);
		Sample2 A = new Sample2();
		Sample2 B = new Sample2();
		Sample2 C = new Sample2();
		
		A.n_field =10;
		B.n_field = 20;
		C.n_field = 30;
		System.out.println(A.n_field);
		System.out.println(B.n_field);
		System.out.println(C.n_field);
		A.test(); //동작은 하지만 원래는 클래스명.메서드로 해야함
		
	
	}//main	
}//class

//static 은 함수와 비슷, 객체가 없어도 동작할 수 있음
//static 변수는 객체와 아무 관련없다
//static 변수는 데이터를 공유하는게 아니라 클래스에 적힌 메모영역이기에 착각 x

//static 메서드는 객체없이 클래스만으로 동작가능하다. ,객체가 동작하는건 아님
//클래스명.메서드이름();


class Sample2{
	int n_field;
	static int s_field;
	static void test() {
		System.out.println("다른 클래스 안의 test 실행");
	}
	
	
}//class sam2