package com.example;
import java.sql.*; // 1. JDBC API
import java.util.Properties;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;

public class JDBCDemo1 {
	private DBConnection dbconn;
	private Connection conn;
	JDBCDemo1(){
		this.dbconn= new DBConnection();
		this.conn= dbconn.getConnection(); // 1,2,3
	}
	public static void main(String[] args) {
		 JDBCDemo1 demo = new JDBCDemo1();
		 Scanner sc = new Scanner(System.in);
		 System.out.print("What's name?");
		 String name = sc.next().toUpperCase();
		 
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = demo.conn.createStatement(); // 4
	
			StringBuffer sb = new StringBuffer();
			sb.append("SELECT e.ename, e.sal, s.grade   ");
			sb.append("FROM emp e, salgrade s    ");
			sb.append("WHERE (e.sal BETWEEN s.losal AND s.hisal) AND e.ename = '"+name+"'");
			// 자바에서 name을 입력받아 이름, 연봉, 등급을 출력하는 쿼리문 
			
			rs = stmt.executeQuery(sb.toString()); // 5
			
			while(rs.next()) { // 6
				String ename = rs.getString("ename");
				double sal = rs.getDouble("sal");
				int grade = rs.getInt("grade");
				System.out.printf("%8s%8.2f%8d\n"
										,ename,sal,grade);
			}
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}finally { // 7
			DBClose.dbClose(demo.conn, stmt, rs);
			}
	}
}
