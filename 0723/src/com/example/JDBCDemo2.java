package com.example;
import java.sql.*; // 1. JDBC API
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCDemo2 {
	private DBConnection dbconn;
	private Connection conn;
	JDBCDemo2(){
		this.dbconn= new DBConnection();
		this.conn= dbconn.getConnection(); // 1,2,3
	}
	public static void main(String[] args) {
		 String sql = "SELECT dept.deptno, dname, AVG(sal), SUM(sal)  ";
		 sql += "FROM emp JOIN dept ON(emp.deptno = dept.deptno)  ";
		 sql += "GROUP BY deptno    ";
		 sql += "ORDER BY AVG(sal) DESC";
		
		
		JDBCDemo2 demo = new JDBCDemo2();
		 
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = demo.conn.createStatement(); // 4
			
			rs = stmt.executeQuery(sql); // 5
			
			// deptno, dname, AVG(sal), SUM(sal)
			while(rs.next()) { // 6
				int deptno = rs.getInt("deptno");
				String dname = rs.getString("dname");
				double avg = rs.getDouble("AVG(sal)");
				int sum = rs.getInt("SUM(sal)");

				System.out.printf(deptno +"\t"+ dname+"\t" + avg+"\t"+ sum+"\n");
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally { // 7
			DBClose.dbClose(demo.conn, stmt, rs);
			}
	}
}
