package prack3;

public class Prac {
	public static void main(String[] args) {
		Prac2 p = new Prac2();
		p.setNum(5);
		System.out.println(p.getNum());
		p.setId("홍길동");
		System.out.println(p.getId());
		p.setScore(44);
		System.out.println(p.getScore());
	}//main
}//class

class Prac2{
	private int num ;
	public void setNum(int num) {
		this.num = num;
	}
	public int getNum() {
		return num;
	}//int num
	
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}//String id
	
	private int score;
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}//int score
	
	
}//prac2 class
