package conn;

import java.sql.*;// sql을 이용할 때 필요한 데이터 규격이 들어있음

public class Sample1 {
	public static void main(String[] args) {
		//jdbc가 있어야 데이터베이스와 통신이 가능하다.
		Connection conn; //접속회선
		Statement stmt;	//쿼리문을 전송하기 위한 규격
		ResultSet rs;   //select 문의 결과를 받아오기 위한 규격
		
		String url ="jdbc:mysql://127.0.0.1:3306/sample"; //접속위치
		String db_id="root";						//접속 아이디
		String db_pw="iotiot";						//접속 비번
		String sql="select * from student order by sum desc;";
		try {
			conn=DriverManager.getConnection(url,db_id,db_pw); //회선 가져옴 , getConnection메서드는 스태틱
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			System.out.println("접속 이상 없음");
			boolean result;
			
			/*result = rs.next(); //1 한줄의 데이터를 읽어오는 명령어
			
			System.out.println(name);
			System.out.println(rs.getString(3));
			rs.next(); //2
			System.out.println(rs.getString(5));
			rs.next(); //3
			String name2 = rs.getString(6);
			System.out.println(name2);
			rs.next(); //4
			rs.next(); //5
			String name5 = rs.getString(2);
			System.out.println(name5);
			rs.next(); //6
			String name6 = rs.getString(1);
			System.out.println(name6);
			for(int i = 0 ; i<10 ; i++) {
				rs.next();
				for(int j=1; j<7;j++) {
					rs.getString(j);
					System.out.print(rs.getString(j)+result+"\t");
				}System.out.println("");*/
			System.out.println("num"+"\t"+"이름"+"\t"+"kor"+"\t"+"math"+"\t"+"eng"+"\t"+"sum");
			while(rs.next()) {
				String num=rs.getString(1);
				String name=rs.getString(2);
				String kor = rs.getString(3);
				String math = rs.getString(4);
				String eng = rs.getString(5);
				String sum = rs.getString(6);
				
				System.out.println(num+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+sum);
			} //데이터의 끝을 알 수 없기에 while문이 적합
		}catch(Exception e) {
			System.out.println("접속중 오류발생 :"+e);
		}
		
		
	}//main
}//class
