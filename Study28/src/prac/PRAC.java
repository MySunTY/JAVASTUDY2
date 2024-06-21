package prac;

import java.net.*;
import java.io.*;

public class PRAC {
	public static void main(String[] args) {
		
		try {
			ServerSocket srvr = new ServerSocket(1235);
			System.out.println("서버정보 : "+srvr.getInetAddress().getLocalHost());
			System.out.println("접속 대기중");
			while(true) {
				System.out.println("접속되었음");
				Socket socket = srvr.accept();
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				String s;
				while((s=in.readLine())!=null) {
					System.out.println(s);
					if(s.isEmpty()) {
						break;
					}
				}
				
				
				
			}
			
		}catch(Exception e){
			System.out.println("접속 중 오류발생 :"+e);
			
		}//catch
		
		
	}//main
}//class
