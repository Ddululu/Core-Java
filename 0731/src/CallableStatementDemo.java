import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;

public class CallableStatementDemo {
	public static void main(String[] args) throws SQLException{	
		DBConnection dbConn = new DBConnection();
		Connection conn = dbConn.getConnection(); // 1,2,3
		
		// prepareCall은 아래와 같이 입력받는다.
		// {call <프로시저 이름>[(<arg1>,<arg2>, ...)]}
		String sql = "{call sp_test(?, ?)}"; // 미리 정의해놓은 프로시저인 sp_test()을 호출하는 방법
		
		/*CallableStatement는 쿼리를 전달하는 PreparedStatement를 확장하는 인터페이스로 
		프로시저는 Prepared Statement가 아닌 Callable Statement를 사용해야 한다.
		*/
		CallableStatement cstmt = conn.prepareCall(sql); // 4
		// IN Parameter는 setString(), setInt()와 같은 메소드를 사용하여 쿼리를 완성해야 하고,
		// OUT Parameter는 registerOutParameter()를 사용해 자바에 맞게 가져온다.
		// IN OUT은 둘다 사용해야 한다.
		cstmt.registerOutParameter(1, java.sql.Types.DATE); // 1번째 파라미터를 DATE 형식으로 가져온다.
		cstmt.registerOutParameter(2, java.sql.Types.VARCHAR); // 2번째 파라미터를 VARCHAR 형식으로 가져온다.
		cstmt.execute(); // 5
		System.out.println(cstmt.getDate(1));
		System.out.println(cstmt.getString(2));
		DBClose.dbClose(conn,null); // 7
	}
}
/* 
DELIMITER //
CREATE PROCEDURE sp_test(
    OUT v_now DATETIME,
    OUT v_version VARCHAR(30)
)
BEGIN
    SELECT NOW(), VERSION() 
    INTO v_now, v_version;
END
//
DELIMITER;

사용할때 IN 파라미터는 SET 메소드를 
CALL sp_test(@t_now1, @t_version1);
select @t_now1, @t_version1;
 */