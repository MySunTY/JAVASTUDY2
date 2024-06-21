package collection;

import java.util.*; //자바 컬렉션가져오기

public class Sample1 {
	public static void main(String[] args) {
		//컬렉션 
		//자료구조를 이용할 수 있도록 구현된 일종의 프레임워크->사용방법이 딱 정해져 있다.
		//자바 컬렉션은 interface로 구성되어잇어 바로 객체로 조립하여 사용할수 없다.
		//자바 컬렉션의 종류
		//List :순서가 엄격히 존재하는 자료형, index가 검색 기준이자 순서,중복가능
		//    	Vector , Stack , LinkedList, *ArrayList*등이 있음
		//Set : 순서가 존재하지 않는 자료형, 자료의 구별의 불가능하기 때문에 중복 x
		//		*HashSet* , SortedSet , TreeSet등이 있음
		//	hash는 자료의 순서를 섞기 때문에 LIST에는 올수없다
		//Map : 검색어와 데이터가 한쌍으로 이루어진 자료형, 데이터 중복 가능, but 검색어 중복 불가능
		//		*HashMap*, SortedMap ,TreeMap
		List L = new ArrayList(); // List는 인터페이스 , ArrayList는 List가 구현된 객체
		//List.add(자료) : 해당 자료를 리스트에 추가함. 가장 마지막 번호에 추가됨
		//List.get(index): index의 해당하는 자료를 확인
		//List.add(index,자료)해당 index에 자료를 추가함, 뒤 자료는 하나씩 밀림
		L.add(1);
		L.add(2);
		L.add(3);
		L.add(3);
		L.add("가"); //매개변수 타입이 객체라서 숫자 문자 객체 다 들어갈 수 있다
		L.add(2,"B");
		System.out.println(L); //ArrayList가 toString 오버라이드 처리해놓음
		System.out.println(L.size());
		//List는 배열과 달리 size()메서드로 크기 확인해야한다. length사용할 수 없다. *5000000000;
		System.out.println(L.get(4));
		
	}//main
}//class
