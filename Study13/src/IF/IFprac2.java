package IF;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IFprac2 {
	public static void main(String[] args)throws IOException {
		BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("이름을 입력해주세요");
		String name = str.readLine();
		System.out.println("입력하신 이름은 "+name+"입니다");
	}//main
}//class
