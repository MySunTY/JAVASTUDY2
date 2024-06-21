package collection;

import java.util.*;

public class Sample4 {
	public static void main(String[] args) {
		List<String> L = new ArrayList<String>();
		L.add("IOT");
		L.add("JAVA");
		L.add("HTML");
		L.add("SQL");
		L.add("JSP");
		L.add(3,"CSS");
		L.add(4,"JavaScript");
		System.out.println(L);
		//List.subList(start, end) 해당 index 범위의 내용물을 별도의 리스트로 추출
		//마지막 숫자는 포함되지 않는다.
		List<String> sub= new ArrayList<String>();
		sub=L.subList(0, 4);
		System.out.println(sub);
		
		//List.remove(index); 해당 위치의 자료를 제거
		//List.remove(value); 해당 값을 가진 자료를 제거
		L.remove(1);
		L.remove("CSS");
		L.add("JSP");
		L.remove("JSP");
		System.out.println(L);
		
		Collections.sort(L);
		System.out.println(L); // 오름차순 정렬
		
		Collections.sort(L, Collections.reverseOrder());// 내림차순 정렬
		System.out.println(L);
		
	}//main
}//class
