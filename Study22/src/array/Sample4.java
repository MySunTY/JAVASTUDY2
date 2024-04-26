package array;

public class Sample4 {
	public static void main(String[] args) {
		
		Object a = new Student("dd",1);
		Object b = new Jungsu("33",2);
		//여러개의 데이터를 index로 구분하여 하나의 변수에 저장하는 기법
		//배열이 생성되면 내부 데이터의 수를 length라는 변수에 저장한다.
		int[] arr;
		arr= new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);
		for(int i =0 ; i<arr.length; i++) {
			System.out.println(arr[i]);
		}//for문
		
		
		
		Student[] arrStudent = new Student[4];
		//객체 배열은 위의 코드는 단순히 칸만 분리
		arrStudent[0] = new Student("홍길동",106);
		
		arrStudent[1] = new Student("고길동",107);
		
		arrStudent[2] = new Student("둘리",108);
		arrStudent[3] = new Jungsu("이순신",109);
		for(int i =0 ; i<arrStudent.length;i++) {
			System.out.println(arrStudent[i]);
		}
		//CRUD ; create read update delete 게시판 
		
	}//main
}//class

class Student{
	String name;
	int number;
	Student(String a, int b){
		name = a;
		number = b;
	}
	
	public String toString() {
		return "이름: "+name +", 번호: " +number;
	}
	
}//Stu calss

class Jungsu extends Student{
	Jungsu(String a, int b){
		super(a, b);
		
	}
	
}//class jungsu
