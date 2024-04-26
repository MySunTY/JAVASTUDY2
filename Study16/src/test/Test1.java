package test;

public class Test1 {
	public static void main(String[] args) {
		for(int i=1; i<=10 ; i++) {
			System.out.print(i+"\t");;
		}//for
		System.out.println();
		for(int i=0 ; i<5; i++) {
			for(int j =0 ; j<=i ; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(int i =1 ; i<=5; i++) {
			for(int j = 0 ; j<=5-i ; j++) {
				System.out.print("%");
				
			}System.out.println();
		}
		String star ="*";
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(star);
			star=star+"*";
		}
		
		for(int i =2 ; i<=9 ; i++) {
			System.out.println("<< 구구단"+i+"단 >>");
			for(int j=1; j<=9 ; j++) {
				System.out.println(i+" X "+j+" = " +i*j);
				
			}//for2
		}//for1
	}//main
}//class
