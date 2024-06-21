package pkgpkg;

import java.net.*;
import java.io.*;

public class SERVER {
	public static void main(String[] args) {
		try {
			ServerSocket srvr = new ServerSocket(2345);	//서버소켓 객체 가져옴
			System.out.println("서버정보 : "+srvr.getInetAddress().getLocalHost());
			System.out.println("접속 대기중");
			while(true) {
				Socket socket = srvr.accept();
				
				System.out.println("접속 되었습니다");
				
				
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter out= new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				String s;
				while((s=in.readLine())!=null) {
					System.out.println(s);
					if(s.isEmpty()) {
						break;
					}
				}
				
				
				
				out.write("HTTP/1.0 200 OK\r\n");
				out.write("Content-type:text/html\r\n");
				out.write("\r\n");
				out.write("<meta charset='utf-8'>");
				out.write("<h1>접속하셨습니다</h1>");
				out.write("<p style='color:blue'>첫번째 접속</p>");
				
				
				out.close();
				in.close();
				socket.close();
			}
		}catch(Exception e) {
			
			
		}//catch
		
		
	}//main
}//class
