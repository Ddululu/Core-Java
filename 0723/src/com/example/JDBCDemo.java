package com.example;
import java.sql.*; // 1. JDBC API
import java.util.Properties;
import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
	public static void main(String[] args) {
		DBConnection dbconn = new DBConnection();
		Connection conn = dbconn.getConnection(); // 1,2,3
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement(); // 4
			
			StringBuffer sb = new StringBuffer(); // 여러 String 객체를 덧붙이기 위해 사용하는 메소드
			sb.append("SELECT empno, ename, sal, d.deptno, dname, loc ");
			sb.append("FROM emp e JOin dept d ON(e.deptno=d.deptno) ");
			sb.append("WHERE ename = 'SMITH'");
			
			rs = stmt.executeQuery(sb.toString()); // 5
			while(rs.next()) { // 6
				int empno =rs.getInt(1);
				String ename = rs.getString("ename");
				double sal = rs.getDouble("sal");
				int deptno = rs.getInt("deptno");
				String loc = rs.getString("loc");
				System.out.printf("%8d%8s%8.2f%8d%10s\n"
										,empno,ename,sal,deptno,loc);
			}
		}catch(SQLException e) {
			
		}finally { // 7
			DBClose.dbClose(conn);
			}
	}
}
