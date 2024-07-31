import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatementDemo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection(); // 1,2,3
		
		String sql = "{call sp_select_emp_dept(?)}"; // 불완전한 SQL문장 선언
		
		CallableStatement cstmt = null;
		ResultSet rs = null; // 출력 결과가 다수의 레코드가 나온다면 ResultSet으로 받아야 한다.
		try {
			cstmt = conn.prepareCall(sql); // 4.
			System.out.print("부서 번호: "); int deptno = scan.nextInt();

			cstmt.setInt(1, deptno);
			rs = cstmt.executeQuery(); // 5. ResultSet(여러 레코드)로 출력받을 때는 executeQuery()
			boolean flag = rs.next();
			if(!flag) { // = 쿼리는 정상적으로 실행되었지만 레코드가 한 개도 없는 경우
				System.out.println("조건에 맞는 결과 값이 없습니다.");
			}else {
			// 실행 결과를 출력
				do {
					System.out.printf("%d  %s  %s  %s  \n", 
							rs.getInt("empno"), rs.getString("ename"), 
							rs.getString("dname"), rs.getString("loc")
					);
				}while(rs.next());
				System.out.print("새 레코드 조회 성공");
			}
			DBClose.dbClose(conn,cstmt);
			
		}catch(SQLException ex) {
			System.out.println("조회 실패");
		}
	}
}
/* 부서 번호로 입력받아 부서 구성원의 모든 정보를 출력될 때 */
/*
delimiter //
CREATE PROCEDURE sp_select_emp_dept(
	IN v_deptno TINYINT
)
BEGIN
	SELECT empno, ename, dname, loc, dept.deptno
    FROM emp NATURAL JOIN dept
    where dept.deptno = v_deptno;
END
// delimiter ;
*/