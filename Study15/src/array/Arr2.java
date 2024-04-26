package array;

public class Arr2 {
	public static void main(String[] args) {
		//배열은 사실 데이터가 저장되어 있는 다른위치의 주소를 저장하고 있다
		//배열을 복사한경우 하나의 데이터를 수정하면 다른배열도 변화시킨다면 주소값을 출력해서 확인해볼것
		int[] A;
		A= new int[3];
		A[0]= 10;
		A[1]= 20;
		A[2]= 30;
		int[] B;
		
		B=new int[3];
		for(int i=0 ; i<A.length; i++) {
			B[i]=A[i];
		}
		
		A[1] = 999;
		for(int i = 0 ; i<A.length; i++) {
			System.out.print("A["+i+"] ="+A[i]+"\t");
			
		}
		System.out.print("\n");
		for(int j = 0; j<B.length; j++) {
			System.out.print("B["+j+"]= "+B[j]+"\t");
		}
		System.out.print("\n");
		System.out.println("A의 주소 = "+A);
		System.out.println("B의 주소 = "+B);
		//이차원배열
		int[][] c;
		c= new int[2][5];
		c[0][0] =100;
		c[0][1] =200;
		
		System.out.println(c[0].length);
		
	}//main
}//class
