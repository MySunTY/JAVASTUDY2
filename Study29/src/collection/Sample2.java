package collection;

import java.util.*;

public class Sample2 {
	public static void main(String[] args) {
		List<String> L = new ArrayList<String>(); //<String> add의 매개변수 타입이 object에서 String으로 바뀜
		L.add("가");
		L.add("나");
		L.add("다");
		L.add("라");
		System.out.println(L);
		for(int i =0; i<L.size();i++) {// List를 반복문에 넣을경우 length가 아닌 size()
			System.out.println(L.get(i));
		}
		
		List<String> M = new ArrayList<String>();
		M.add("A");
		M.add("B");
		M.add("C");
		M.add("D");
		System.out.println(M);
		//ArrayList.addAll(ArrayList); : add처럼 값을 넣는데 리스트가 통째로 들어가
		//ArrayList.addAll(index,ArrayList);  해당 위치에 리스트를 통째로 삽입
		L.addAll(2,M);
		System.out.println(L);
		
		
	}//main
}//class
