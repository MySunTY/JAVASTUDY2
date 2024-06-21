package collection;

import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		//Set : 순서가 없는 데이터 집합, 데이터의 중복을 허락하지 않는다.
		//set역시 interface이므로 implements가 된 class로 이용해야 한다.
		HashSet<String> s = new HashSet<String>();
		boolean bool ;
	
		s.add("apple");
		s.add("mango");
		s.add("orange");
		s.add("grape");
		bool = s.add("apple");
		s.add(null);
		s.add("null"); //데이터에 string null은 입력하지 않는게 좋다. 구별이 안됨
		System.out.println(s);
		System.out.println(bool);
		//add의 리턴타입은 boolean , 기존데이터는 true 중복이라서 못들어가는 데이터는 false
		//set은 일반 for문은 불가능 
		//배열로 변경해서 for문으로 출력
		String[] array = new String[s.size()]; //Set과 동일한 크기의 배열 준비
		s.toArray(array);   					//set의 내용문을 배열로 옮겨적기(index가 부여됨)
		System.out.println(array[3]);
		for(int i =0 ; i<array.length;i++) {
			System.out.println(array[i]);
		}
		
		//List로 변환해서 for문으로 출력하는 방법
		List<String> L = new ArrayList<String>(s); //생성자에 set데이터를 전달해서 list 제작
		System.out.println(L);
		
		
		for(int i = 0 ; i<L.size(); i++) {
			System.out.println(L.get(i));
		}
		//향상된 for문은 사용가능 /set도 iterator가 존재하기때문
		//**
		for(String str:s) {
			System.out.println(str);
		}
		//iterator 를 이용해서 출력하는 방법
		Iterator itr =s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}//main
}//class
