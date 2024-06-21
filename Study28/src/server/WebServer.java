package server;

import java.net.*; //네트워크관련 클래스
import java.io.*;


public class WebServer {
	public static void main(String[] args) {
		
		try {
			ServerSocket srvr= new ServerSocket(1234);
			System.out.println("서버정보 : "+srvr.getInetAddress().getLocalHost());
			System.out.println("클라이언트 접속 대기중...");
			while(true) {
				Socket socket =srvr.accept();
				System.out.println("클라이언트 접속 확인");
				BufferedReader in =new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				String s;
				while((s=in.readLine())!=null) {
					System.out.println(s);
					if(s.isEmpty()) {
						break;
					}
				}//while
				out.write("HTTP/1.0 200 OK\r\n");
				out.write("Content-Type:text/html\r\n"); //request 헤더 정보
				out.write("\r\n"); //엔터
				out.write("<meta charset='utf-8'>");
				out.write("<title>제목</title>");
				out.write("<h1>접속을 환영합니다</h1>");
				out.write("<p>어서오세요</p>");
				out.write("<p style='color:red'>색 바꾸기</p>");
				//자바가 먼저 계산한이후 html css js 실행됨
				
				out.close();
				in.close();
				socket.close();
				
			}//while
		}//try
		catch(Exception e) {
			System.out.println("서버 가동중 오류발생 : "+e);
			
		}//catch
	}//main
}//class
