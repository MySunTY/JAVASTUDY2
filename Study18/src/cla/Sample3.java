package cla;

import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		Client c = new Client();
		c.id = "test";
		c.pw = "1111";
		c.name = "홍길동";
		String msg ="이게뭐냐";
		int score = 1;
		int number=4567; // 영화 고유 일련번호
		String data =c.datgul(msg,score, number);
		System.out.println("데이터베이스에 "+data+"(을)를 입력했습니다");
		String data1 = c.datgul(3,"맛있어요",3535);
		
	}//main
}//class

class Client{
	String id;
	String pw;
	String name;
	
	String datgul(String dat, int star,int number) {
		System.out.println("다음 영화에 댓글이 달렸습니다 "+number);
		System.out.println("글쓴이: " +id+", 댓글내용 : "+dat+", 평점 : "+star);
		return dat+", "+star;
	}
	//매개 변수의 순서 또는 순서를 다르게 해서 다른 메서드 처럼 쓰는 방법: 메서드 오버로드
	String datgul(int star, String dat,int number) {
		System.out.println("다음 음식점에 댓글이 달렸습니다 "+number);
		System.out.println("글쓴이: " +id+", 댓글내용 : "+dat+", 평점 : "+star);
		return dat+", "+star;
	}
	
}//class client