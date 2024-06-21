package close;

import java.sql.*; // connection statement resultset

public class Sample2 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null; // select문
		//null = 틀잡을때 close 처리하기위해서
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String db_id="root";
		String db_pw="iotiot";
		String sql = "insert into student(name,kor,math,eng,sum)";
		sql+=" values ('조원희',60,70,80,100);";
		
		try {
			conn = DriverManager.getConnection(url,db_id,db_pw);
			stmt = conn.createStatement();
			//rs= stmt.executeQuery(sql);
			stmt.execute(sql); //insert문은 resultset이 없어서 rs에 담지 않는다
			//Statement의 Query 전송 메서드들
			//stmt.execute(sql) ; return boolean; resultset의 존재 여부에 따라 true or false; //insert문
			//stmt.executeQuery(sql); return resultset ; 결과화면을 반환 // select 문
			//stmt.executeUpdate(sql); return int ; 변화한 수를 반환 // delete, update 문
			
			/*while(rs.next()) {
				String num = rs.getString("num");
				String name = rs.getString("name");
				String kor = rs.getString("kor");
				String math = rs.getString("math"); // 숫자도 string으로 뽑았다가 계산이 필요할때만 parseInt처리
				String eng = rs.getString("eng");
				String sum = rs.getString("sum");
				System.out.println(num+"\t"+name+"\t"+kor+"\t"+math+"\t"+eng+"\t"+sum);
				
			}*/
			
		}catch(Exception e) {
			System.out.println("접속 중 오류발생 :"+e);
		}finally { //무조건 실행 ,회선 종료처리(try catch처리해줘야함)
			try {
				if(rs!=null) {
					rs.close();
				}
				if(stmt!=null) {
					stmt.close();
				}
				if(conn!=null) {
					conn.close();
				}
			}catch(Exception ex) {
				System.out.println("접속 해제 중 오류발생 :"+ex);
			}
			
		}//finally
		
		
	}//main
}//class
