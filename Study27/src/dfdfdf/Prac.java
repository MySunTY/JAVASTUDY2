package dfdfdf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Prac {
	public static void main(String[] args) {
		Connection conn= null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url="jdbc:mysql://127.0.0.1:3306/sample";
		String db_id="root";
		String db_pw="iotiot";
		String sql ="select * from shop;";
		
		try {
			conn=DriverManager.getConnection(url,db_id,db_pw);
			stmt=conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String num =rs.getString("num");
				String product = rs.getString("product");
				String qty = rs.getString("qty");
				String sell = rs.getString("sell");
				System.out.println(num+"\t"+product+"\t"+qty+"\t"+sell);
				
			}
			
		}catch(Exception e){
			System.out.println("연결 중 에러 :" +e);
			
		}finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close();
				
			}catch(Exception ex) {
				System.out.println("연결 해재중 에러 :"+ex);
				
			}//catch
			
		}//finally
		
	}//main
}//class
