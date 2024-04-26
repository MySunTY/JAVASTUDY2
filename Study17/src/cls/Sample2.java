package cls;

public class Sample2 {
	public static void main(String[] args) {
		Phone i ;
		i = new Phone();
		i.battery = 100;
		i.name = "아이폰";
		System.out.println(i.battery);
		System.out.println(i.name);
		Phone g=new Phone();
		g.name= "갤럭시";
		System.out.println(g.name);
		//인스턴스변수는 인스턴스를 거친 오브젝트를 통하지 않으면 접근할 수 없다.
		//클래스는 설계도이므로 조립하지 않으면 사용할수없고
		//클래스 내부에 만들어진 변수도 아직 조립하지 않아서 사용할 수 없다
		//만들어진 객체는 다른 객체에 영향을 미치지 않는다
		Sangpoom p1 = new Sangpoom();
		Sangpoom p2 = new Sangpoom();
		System.out.println(p1.name);
		p2.name = "에어컨";
		System.out.println(p2.name);
		System.out.println(p2.price);
		System.out.println(p2.sale);
		//클래스는 설계도다
		//클래스는 필드 메서드 생성자를 가질 수 있다
		//필드는 클래스 내부에 작성되어 조립된 객체가 가지는 속성을 저장할 수 있는 공간
	}//main
}//class

class Phone{
	String os;
	String name;
	String number;
	int battery;
}

class Sangpoom{
	int price; //가격
	String name; // 상품명
	int size; // 상품크기
	String madeFrom; //원산지
	int codeNumber; // 코드넘버
	int remainNumber; // 재고량
	String brand; // 브랜드
	boolean sale; // 판매여부
	String image; //상품사진
}

class Shop{
	Sangpoom[] products;	
}