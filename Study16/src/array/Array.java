package array;

public class Array {
	public static void main(String[] args) {
		//다차원 배열
		//배열 내부의 한 요소가 배열로 이루어져 있는 경우
		
		int[] arr1 = {1,2,3}; //length =3 [0~2]index를 가진 배열
		for(int i = 0 ; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}//for1
		
		int[][] arr2 = {{1,2,3},{4,5,6}};
		
		for(int i=0; i<arr2[0].length ; i++) {
			System.out.println(arr2[0][i]);
		}
		for(int i=0; i<arr2[1].length ; i++) {
			System.out.println(arr2[1][i]);
		}
		System.out.println("arr2의 length= "+arr2.length);
		System.out.println("arr2[0]의 length= "+arr2[0].length);
		for(int i = 0; i<arr2.length ; i++) {
			for(int j = 0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}//for2
			System.out.println();
		}//for1
		
		//이차원 배열의 내부를 보기위해서는 이중for문이 필요하다
		
		int[][][] rr = {
							{
								{1,2,3},
								{4,5,6}
								
							},
							{
								{1,2,3},
								{4,5,6}
								
							},
							{
								{1,2,3},
								{4,5,6}
								
							}
						};
		System.out.println(rr.length);
		System.out.println(rr[0].length);
		System.out.println(rr[0][0].length);
 	}//main
}//class
