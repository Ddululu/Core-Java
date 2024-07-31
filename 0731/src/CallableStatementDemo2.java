import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableStatementDemo2 {

	public static void main(String[] args) {
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection(); // 1,2,3
		String sql = "{call sp_deleteDept()}";
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall(sql);
			cstmt.execute();
			DBClose.dbClose(conn,cstmt);
			System.out.println("삭제 성공");
		}catch(SQLException ex) {
			System.out.println("삭제 실패");
		}
		

	}

}
