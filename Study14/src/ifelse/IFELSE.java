package ifelse;

public class IFELSE {
	public static void main(String[] args) {
		//if(조건1){조건이 트루일경우 수행할 문장} 
		//else if(조건2){조건1이 false이고  조건2가참일때 수행}else{모든조건이 false일때 수행할경우}
		//조건 : 계산의 결과가 true or false로 나오는것
		// *50000000000  if else if문의 조건은 위에서부터 순서대로 판단하고 
		// 하나라도 true가 나오면 아래는 무시한다
		//조건은 좁은 범위부터 차차 넓어지도록 작성해야한다
		int score = 70;
		String grade = "";
		if(score>95) {
			grade ="A+";
		}//if
		else if(score>90) {
			grade = "A";
		}
		else {
			grade = "F";
		}
	
	System.out.println(grade+"학점입니다");
	}//main
}//class
