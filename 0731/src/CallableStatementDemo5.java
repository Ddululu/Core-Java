import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection(); // 1,2,3
		
		String sql = "{call sp_selectEmp(?,?,?)}"; // 불완전한 SQL문장 선언
		
		CallableStatement cstmt = null;
		try {
			cstmt = conn.prepareCall(sql); // 4. prepareCall로 sql 형식으로 저장
			System.out.print("사원 번호: "); int empno = scan.nextInt();
			cstmt.setInt(1, empno); // 들어가는 IN Parameter
			// 쿼리 결과를 자바에 맞는 VARCHAR 형식으로 가져와라.
			cstmt.registerOutParameter(2, java.sql.Types.VARCHAR);
			cstmt.registerOutParameter(3, java.sql.Types.VARCHAR); 
			cstmt.execute(); // 5. 완전한 SQL 문장으로 실행(쿼리)
			
			// 실행 결과를 출력
			System.out.print("부서 이름: "); System.out.println(cstmt.getString(2));
			System.out.print("부서 위치: "); System.out.println(cstmt.getString(3));
			
			DBClose.dbClose(conn,cstmt);
			System.out.print("새 레코드 조회 성공");
		}catch(SQLException ex) {
			System.out.println("조회 실패");
		}
	}
}
/* 사원 번호를 입력받아 부서이름과 부서 위치를 출력하는 프로시저 */
/*
DELIMITER //
create procedure sp_selectEmp(
    IN v_empno INT,
    OUT v_dname  VARCHAR(14),
    OUT v_loc    VARCHAR(13)
)
BEGIN
    SELECT dname, loc INTO v_dname, v_loc
    FROM emp JOIN dept on (emp.deptno = dept.deptno)
    where empno = v_empno;
END
// delimiter ;
*/