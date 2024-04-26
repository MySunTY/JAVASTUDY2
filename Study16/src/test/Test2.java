package test;

public class Test2 {
	public static void main(String[] args) {
		for(int i = 2; i<=9 ; i++) {
			System.out.print("["+i+"]단"+"\t");
		}System.out.println();
		
		/*for(int i =2; i<=9 ; i++) {
			System.out.println("["+i+"단]");
			for(int j =1; j<=9; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		/*for(int i= 2; i<=9; i++) {
			System.out.print("["+i+"]단"+"\t");
		}System.out.println();
		for(int i= 2; i<=9; i++) {
			
				System.out.print(i+"*"+1+"="+i*1+"\t");		
				
		}System.out.println();
		for(int i= 2; i<=9; i++) {
			System.out.print(i+"*"+2+"="+i*2+"\t");
		}System.out.println();
		for(int i= 2; i<=9; i++) {
			System.out.print(i+"*"+3+"="+i*3+"\t");
		}*/
		
		for(int i = 1 ; i<=9; i++) {
			for (int j = 2; j<=9 ; j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}System.out.println(); //내부for
		}//외부for*/
		
	}//main
}//class
