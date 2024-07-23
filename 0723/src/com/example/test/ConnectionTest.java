package com.example.test; // 테스트는 별도의 공간에서 진행

import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.DBClose;
import com.example.DBConnection;

class ConnectionTest {
	private Connection conn;
	
	@BeforeEach
	void setUp() throws Exception {
		DBConnection dbconn = new DBConnection();
		this.conn = dbconn.getConnection();
	}

	@Test
	void test() {
		assertNotNull(this.conn); // dbconn이 생성되지 않아 conn이 널인지 테스트
	}
	
	@Test
	void queryTest() {
		
	}
	
	@AfterEach
	void close() {
		DBClose.dbClose(this.conn); // 닫는 과정에서 예외가 발생하지 않았는지 테스트
	}

}
