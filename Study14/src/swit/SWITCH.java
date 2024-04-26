package swit;

public class SWITCH {
	public static void main(String[] args) {
		//switch 분기문 : 프로그램의 시작점을 지정하는 문법
		//특정 부분을 선별해서 사용하기 위해서는 break와 함께 사용
		/*
		 switch(변수명){
		 case 값 : 변수의 값이 case와 일치할경우 수행할 문장
		  */
		//case 값은 중복되면 안된다 , 값은 순서대로일필요는 없음
		//default : case값이 일치하는것이 없는경우
		String data = "마";
		switch(data) {
			case "가" : System.out.println("가가 선택되었습니다"); break;
			case "나" : System.out.println("나가 선택되었습니다"); break;
			case "다" : System.out.println("다가 선택되었습니다"); break;
			case "라" : System.out.println("라가 선택되었습니다"); break;
			case "마" : 
			case "바" :
			case "사" : System.out.println("마바사가 선택되었습니다"); break;
			default : System.out.println("선택된 데이터가 없습니다"); break;
		}// switch
		System.out.println("브레이크가 영향을 미치지 못함");
		//switch 문을 잉ㅇ한 조건의 표현
		int score=55;
		String grade = "";
		switch(score) {
			case 100 : case 99 : case 98 : case 97 :
			case 96 : System.out.println("A+학점입니다"); grade="A+"; break;
			case 95 : case 94 : case 93 : case 92:  
			case 91 : System.out.println("A학점입니다"); grade="A"; break;
			case 90 : case 89 : case 88 : case 87 :
			case 86 : System.out.println("B+학점입니다"); grade="B+"; break;
			case 85 : case 84 : case 83 : case 82 :
			case 81 : System.out.println("B학점입니다"); grade="B"; break;
			case 80 : case 79 : case 78 : case 77 :
			case 76 : System.out.println("C+학점입니다"); grade="C+"; break;
			default : System.out.println("재시험"); grade="F"; break;
		}
		System.out.println(grade+"학점입니다");
		
		
	}//main
}//class
