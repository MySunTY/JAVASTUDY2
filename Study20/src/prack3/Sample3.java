package prack3;

public class Sample3 {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("핸드폰");
		p1.setPrice(-100000);
		System.out.println(p1.getName());
		
		/*Product p2 = new Product();
		p2.name = "세탁기";
		p2.price = 350000;
		p2.show();
		
		Product p3 = new Product();
		p3.name = "컴퓨터";
		p3.price = 2000000;
		p3.show();*/
		
	}//main
}//sam class

class Product{
	
	private String name;
	
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int price;
	public void setPrice(int price) {
		if(price <0) {
			System.out.println("잘못된 물건값을 입력하셨습니다. 0으로 초기화합니다");
		}else {
		this.price = price;
		}
		
	}
		
	void show() {
		System.out.println("상품명: "+name+", 가격: " + price);
	}
	
}//product class