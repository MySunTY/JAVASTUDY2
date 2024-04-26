package test;

public class Test {
	public static void main(String[] args) {
		
		/*for(int i = 2; i<=9; i++) {
			System.out.print(i+"*1= "+i*1+"\t");
		}System.out.println();
		for(int i = 2; i<= 9 ; i++) {
			System.out.print(i+"*2 ="+i*2+"\t");
		}System.out.println();
		for(int i =2; i<=9;i++) {
			System.out.print(i+"*3 ="+i*3+"\t");
		}*/
		for(int i = 0 ; i<=9 ; i++) {
			for(int j = 2 ; j<=9 ; j++) {
				if(i==0) {
					System.out.print("["+j+"단]\t");
				}else {
				System.out.print(j+"*"+i+"="+j*i+"\t");
				}
				
			}System.out.println();
		}
		//알고리즘문제는 모양보다는 한줄씩만들어본다
		
	}//main
}//class
