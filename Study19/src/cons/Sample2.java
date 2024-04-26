package cons;

public class Sample2 {
	public static void main(String[] args) {
		Test test ;
		test = new Test("가가",5);
		System.out.println(test.name);
		
	}//main
}//class

//클래스는 필드 메서드 생성자(constructor)를 가질 수 있다 *500000000000
//생성자: 객체를 생성하는 동작 Test();  / Array();
//생성자는 따로 제작하지 않아도 클래스 내부에 자동으로 만들어져 있다(눈에 보이지 않음)
//생성자를 통해 다른 동작을 수행하고자 한다면 별도로 생성자를 만들어줘야한다.
//클래스이름(){객체 생성시 수행할 동작;}
//생성자는 객체 생성시 무조건 단 한번 실행된다 *5000000000 초기값을 넣을 수 있다
//생성자 오버로드는 매우중요 *5000000000000
//생성자는 오버로드외에는 여러개 만들 수 없다
class Test{
	
	String name;
	int num;
	Test(String str){
		System.out.println("나무 책상 조립");
		name = "나무 데스크";
	}
	Test(int a){
		System.out.println("철 책상 조립");
		name="하이퍼 데스크";
		
	}
	Test(String str, int a){
		System.out.println("모션데스크 조립");
		name = "모션 데스크";
	}
}//test class