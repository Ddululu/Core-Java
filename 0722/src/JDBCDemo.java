// 코드를 축약해보자.
import java.sql.*; // 1. JDBC API
import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
	private static final String url = "jdbc:mysql://localhost:3306/mycompany"; 
	private static final String id = "root";
	private static final String passwd = "mymysql";
	
	public static void main(String[] args) {
		Connection conn = null; // 드라이버의 커넥션 정보를 담기위한 Connection 클래스
		Statement stmt = null; // 커넥션 결과를 담기 위한 클래스 Statement 클래스
		ResultSet rs = null; // 쿼리에 대한 결과를 담아오는 ResultSet 클래스
		
		
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
		
		try {
			// 3. 메모리에 로딩된 MySQL Driver를 이용하여 Connection 하자.
			conn=DriverManager.getConnection(url, id, passwd);
			// 4. Statement 객체 생성
			stmt= conn.createStatement();
			// 5. Statement 객체를 이용하여 SQL Query 실행
			// rs = stmt.executeQuery("SELECT empno, ename, job, sal FROM emp WHERE sal >=1500");
			String sql = "SELECT empno, ename, job, sal\n";
			sql +="FROM emp \n";
			sql +="WHERE sal >=1500";
			rs = stmt.executeQuery(sql);
			
			// 6. Result 객체를 이용하여 결과를 Parsing 하기
			while(rs.next()) {
				int empno =rs.getInt(1); // empno
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				double sal = rs.getDouble("sal");
				System.out.printf("%d	%s		%s		%.2f\n",empno,ename,job,sal);
			}
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}finally {
			try {
				// 7. 커넥션을 열었으면 반드시 Close 해야 한다.
				if(rs != null) rs.close();
				if(stmt !=null) stmt.close();
				if(conn != null) conn.close();
				}catch(SQLException ex){
					System.out.println(ex.getMessage());
				}
		}
	}
}
