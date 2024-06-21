
import java.sql.*;

public class JDBC {
	public static void main(String[] args) {
		Connection conn =null;
		Statement stmt = null;
		ResultSet rs = null;
		
		String url = "jdbc:mysql://127.0.0.1:3306/sample";
		String db_id= "root";
		String db_pw = "iotiot";
		String sql ="select shop.product, shop.sell-pro.buy from shop inner join pro ";
				sql+= "on shop.product=pro.product";
		
		try {//연결
			conn = DriverManager.getConnection(url,db_id,db_pw);
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String sangpoom = rs.getString("product");
				String price = rs.getString(2);
				
				
				System.out.println(sangpoom+"\t"+price);
				
			}
			
			
			
		}catch(Exception e) {
			System.out.println("접속 중 문제 발생 :"+e);
		}//catch
		finally {
			try {
				if(rs!=null)rs.close();
				if(stmt!=null)stmt.close();
				if(conn!=null)conn.close(); //닫기완료
				
			}catch(Exception ex){
				System.out.println("연결 해제중 문제 발생 "+ex);
				
			}
			
		
		
		}//finally
		
		
	}//main
}//class
