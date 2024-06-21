package collection;


import java.util.*;

public class Sample1 {
	public static void main(String[] args) {
		//리스트 : 순서가 엄격하게 부여된 집합 데이터, 순번 (index)가 검색의 기준점이다.
		//			기준점이 존재하기 때문에 중복 데이터를 허용한다.
		//java collection은 interface이기 때문에 직접 객체로 제작할 수 없고
		//implements 되어있는 준비된 class를 객체로 조립하여 사용한다.
		List<String> L = new ArrayList<String>();
		L.add("홍길동");
		L.add("고길동");
		L.add("김철수");
		L.add(1,"김북부");
		
		List<String> L2 = new ArrayList<String>();
		L2.add("A");
		L2.add("B");
		L2.add("C");
		
		L.addAll(2,L2); //리스트에 다른 리스트를 합치는 메서드
		System.out.println(L2);
		System.out.println(L);
		System.out.println(L.get(5)); //데이터를 꺼내올때는 get() / length대신 size();
		System.out.println(L.size());
		for(int i = 0 ; i<L.size(); i++) {
			System.out.print(L.get(i)+"\t");
		}
		System.out.println("");
		for(String str:L) { //향상된 for문 : for(변수:집합){집합운행시 1단위마다 수행할 문장;}
							// 무조건 처음부터 마지막까지 운행을 해야함, 중간 출력 불가
			System.out.print(str+"\t");
		}
	}//main
}//class
