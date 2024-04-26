package IF;

public class METH {
	public static void main(String[] args) {
		Name a = new Name();
		a.go();
		int k = a.addNumber(5,9);
		System.out.println(k);
		String kk = a.str();
		System.out.println(kk);
	}//main
}//METH class

class Name{
	void go() {
		System.out.println("보이드를 실행하세요");
	}
	
	int addNumber(int num1, int num2){
		return num1*num2;
	}
	String str() {
		return "하이요 반갑습니다. str메서드가 실행되면 이 화면을 보여주세요";
	}
}//name class