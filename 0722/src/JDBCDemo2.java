import java.sql.*; // 1. JDBC API
import com.mysql.cj.jdbc.Driver;

public class JDBCDemo2 {
	private static final String url = "jdbc:mysql://localhost:3306/mycompany"; 
	private static final String id = "root";
	private static final String passwd = "mymysql";
	
	public static void main(String[] args) {
		/* 2. Driver (Java Language -> SQL) Loading, 
		 * 1) 각 DBMS 벤더사에서 다운로드,
		 * 윈도우는 따로 없어 Platform Independent로 설치 https://downloads.mysql.com/archives/c-j/
		 * Build Path - Classpath에서 다운로드한 파일의 jar 파일을 등록 */
		
		// 설치한 파일을 Class 클래스의 forName 메소드를 이용해 메모리에 로딩한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e) {
			System.out.println("Class Not Found");
		}
		
		// url - a database url of the form jdbc:subprotocol:subname
		Connection conn = null;
		
		// 3. 메모리에 로딩된 MySQL Driver를 이용하여 Connection 하자.
		try {
			conn=DriverManager.getConnection(url, id, passwd);
			System.out.println("커넥션 성공");
		} catch (SQLException e) {
			System.out.println("커넥션 실패");
		}
		
		// 4. Statement 객체 생성
		Statement stmt = null; // 커넥션 정보를 담기 위한 클래스 Statement 클래스
		try {
			stmt= conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 5. Statement 객체를 이용하여 SQL Query 실행
		ResultSet rs = null; // 쿼리에 대한 결과를 담아오는 ResultSet 클래스
		try {
			rs = stmt.executeQuery("SELECT now(), version()");
		} catch (SQLException e) {
			System.out.println("Query Syntax Error");
		}
		
		// 6. Result 객체를 이용하여 결과를 Parsing 하기
		try {
			rs.next(); // Result Set은 시작과 끝 주소에 Result set이 시작했고, 끝났다는 문자열이 포함.
			// 따라서 실제 데이터는 2번째 줄부터 시작한다.
			
			int index = 0; // DB의 index는 1부터 시작, "Column Index out of range, 0 < 1" 출력
			String now= rs.getString(index);
			String version= rs.getString(index+1);
			System.out.println(now);
			System.out.println(version);
		} catch (SQLException e) {
				System.out.println(e.getMessage());
		}
		// 7. 커넥션을 열었으면 반드시 Close 해야 한다.
		try {
		if(rs != null) rs.close();
		if(stmt !=null) stmt.close();
		if(conn != null) conn.close();
		}catch(SQLException ex){
			System.out.println(ex.getMessage());}
	}
}
