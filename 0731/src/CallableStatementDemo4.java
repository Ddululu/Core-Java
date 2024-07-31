import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection(); // 1,2,3
		
		String sql = "{call sp_selectDname(?)}"; // 불완전한 SQL문장 선언
		
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall(sql); // 4. prepareCall로 sql 형식으로 저장
			System.out.print("부서 이름: "); String dname = scan.next();
			
			// INOUT은 set으로 값을 입력하며 registerOutParameter로 가져온다
			cstmt.setString(1, dname); 
			cstmt.registerOutParameter(1, java.sql.Types.VARCHAR); 
			
			cstmt.execute(); // 5. 완전한 SQL 문장으로 실행(쿼ㄴ리)
			
			// 실행 결과를 출력
			System.out.print("부서 위치: "); System.out.println(cstmt.getString("v_name"));
			
			DBClose.dbClose(conn,cstmt);
			System.out.print("새 레코드 조회 성공");
		}catch(SQLException ex) {
			System.out.println("조회 실패");
		}
	}
}
/* 부서이름이 일력되면 부서의 위치로 바꿔 출력하는 프로시저*/
/*
DELIMITER //
create procedure sp_selectDname(
    INOUT v_name  VARCHAR(14)
)
BEGIN
	DECLARE v_str VARCHAR(14);
    SELECT loc INTO v_str
    FROM dept
    where dname = v_name;
    SET v_name:=v_str;
END
// delimiter ;
*/