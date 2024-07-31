import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection(); // 1,2,3
		
		String sql = "{call sp_insertDept(?,?,?)}"; // 불완전한 SQL문장 선언
		
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall(sql); // 4. prepareCall로 sql 형식으로 저장
			System.out.print("부서 번호: "); int deptno = scan.nextInt();
			cstmt.setInt(1, deptno);
			
			System.out.print("부서 이름: "); String dname = scan.next();
			cstmt.setString(2, dname);
			
			System.out.print("부서 위치: "); String loc = scan.next();
			cstmt.setString(3, loc);
			
			cstmt.execute(); // 5. 완전한 SQL 문장으로 실행(쿼리)
			DBClose.dbClose(conn,cstmt);
			System.out.print("새 레코드 삽입 성공");
		}catch(SQLException ex) {
			System.out.println("삽입 실패");
		}
	}
}
