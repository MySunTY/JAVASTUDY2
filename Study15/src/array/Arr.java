package array;

public class Arr {
	public static void main(String[] args) {
		
		//배열 : array , 하나의 변수에 여러개의 값을 저장할 수 있는 규격
		//타입[] 이름 = new 타입[칸];
		//배열은 몇칸으로 만들지 먼저 지정해주어야한다
		//*500000000000 배열의 번호는 0부터 시작하기때문에 칸수-1까지만 있다
		//배열 칸수는 배열이름.length를 통해 확인할 수 있다
		int[] a = new int[5];
		a[0]=12;
		a[1]=25;
		a[2]=30;
		a[3]=2100000000;
		a[4]=3535;
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		//System.out.println(a[3]);
		System.out.println(a.length);
		for(int i =0; i<a.length ; i++) {
			System.out.println(a[i]);
		}
		//*5000000000 배열 내부의 데이터를 전부 출력하는 반복문
		int[] b = {1,2,3,4,5,6}; // 값이 특정된 상태로 배열을 바로 초기화
		System.out.println(b.length);
		for(int j = 0 ; j<b.length ; j++) {
			System.out.println("b["+j+"]= "+b[j]);
		}
		System.out.println(a);
	}//main
}//class
