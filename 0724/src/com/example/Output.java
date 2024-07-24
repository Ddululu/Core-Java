package com.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Output {
/*----------------------------------------------------------
 *                        	Field
 *----------------------------------------------------------*/	
	private List<StudentVO> list ;
	private Connection conn;
	private Statement stmt = null;
	
	// initialization
	public Output(List<StudentVO> list ) {
		this.list=list;
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
/*----------------------------------------------------------
 *                         Method
 *----------------------------------------------------------*/
	void output() {	
			this.list.forEach(std -> {
				String sql = "INSERT INTO Student   ";
				sql += "VALUES('" + std.getHakbun() +"', '" + std.getName() +"', ";
				sql += std.getKor() +"," +std.getEng() +"," + std.getMath() +"," + std.getEdp() +", ";
				sql += std.getTot() +"," + std.getAvg() +", '";
				sql += std.getGrade() +"')";
				System.out.println(sql);
				try {
					stmt.executeUpdate(sql);
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			});
	}
}
