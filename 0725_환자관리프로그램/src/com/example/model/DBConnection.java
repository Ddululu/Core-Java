package com.example.model;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.File;

public class DBConnection {
	// 1. DBDRIVER, DBURL, DBUSER, DBPASSWD를 Properties로 가져오기
	private Properties info; 
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	public DBConnection() {
		this.info = new Properties();
		File file = new File("dbinfo.properties");
		try {
			this.info.load(new FileInputStream(file));
		} catch (IOException e) {
			System.out.println("File Not Found");
		}
	}
	public Connection getConnection(){
		try {
			// 2. 메모리에 드라이버 탑재
			Class.forName(this.info.getProperty("DBDRIVER"));
			
			// 3. Connection 생성
			conn=DriverManager.getConnection(this.info.getProperty("DBURL"), 
															this.info.getProperty("DBUSER"), 
															this.info.getProperty("DBPASSWD"));
			
			// 4. Statement 객체 생성
			stmt= conn.createStatement();
			} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	
}
