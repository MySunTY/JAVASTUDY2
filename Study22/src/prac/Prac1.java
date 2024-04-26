package prac;

public class Prac1 {
	public static void main(String[] args) {
		/*Member mem1 = new Member("이태양","아기",6,101);
		System.out.println(mem1);
		Member mem2 = new Member("쪼끄","아기",5,102);
		System.out.println(mem2);*/
		Member[] mem = new Member[2];
		
		
		mem[0]= new Member("이태양","아기",3,4);
		mem[1]= new Member("쪼끄","아기",3,4);
		
		
		
		
		
	}//main
}//class

class Member{
	String name;
	int age;
	int memNum;
	String nickName;
	
	Member(String a, String b , int c , int d){
		name = a;
		nickName = b;
		age = c;
		memNum =d ;
		
		이거되냐?
		
	}
	
	
	
}//mem class
