package test;

public class test333 {
	public static void main(String[] args) {
		for(int i = 0; i<= 9; i++) {
			for(int j = 2 ; j<=9; j++) {
				if(i==0) {
					System.out.print("["+j+"]단"+"\t");
				}else {
				System.out.print(j+"*"+i+"="+j*i+"\t");
				}
			}System.out.println();
		}
	}//main
}//class
