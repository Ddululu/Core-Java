package com.example.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDAO {
	private Connection conn;
	
	public PatientDAOImpl() {
		DBConnection dbConn = new DBConnection();
		this.conn = dbConn.getConnection(); //1,2,3
	}
	
	@Override // 부모가 정의하지 않은 Exception은 사용할 수 없다. 자식의 Exception은 부모보다 좁아야 한다.
	public boolean createPatient(PatientVO p) throws SQLException {
		Statement stmt = this.conn.createStatement();
		
		// 풀 쿼리문을 String Buffer에 더하며 저장, 아니라면 그냥 길게 하나 정의
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO patient ");
		sb.append("VALUES ("+p.getNumber()+", '" + p.getCode()+"', ");
		sb.append(p.getDays()+ ", "  +p.getAge() +", '" + p.getDept() + "', ");
		sb.append(p.getOperFee()+ ", " + p.getHospitalFee() + ", "+ p.getMoney() +")");
		System.out.println(sb.toString());
		
		int su = stmt.executeUpdate(sb.toString()); // Update에 성공했다면, 1을 반환, 아니라면 0
		
		
		DBClose.dbClose(this.conn,stmt);
		return (su==1)? true : false;
	}

	@Override
	public PatientVO readPatient(int number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PatientVO> readAllPatient() throws SQLException {
		String sql = "SELECT number, dept, operfee, hospitalfee, money FROM patient ORDER BY number DESC";
		Statement stmt = this.conn.createStatement(); // 4
		ResultSet rs = stmt.executeQuery(sql); // 5
		List<PatientVO> list = new ArrayList<PatientVO>();
		while(rs.next()) { //6
			int number = rs.getInt("number");
			String dept = rs.getString("dept");
			int operfee = rs.getInt("operfee");
			int hospitalfee = rs.getInt("hospitalfee");
			int money = rs.getInt("money");
			PatientVO p = new PatientVO();
			p.setNumber(number); p.setDept(dept);
			p.setOperFee(operfee); p.setHospitalFee(hospitalfee);
			p.setMoney(money);
			list.add(p);
		}
		DBClose.dbClose(conn,stmt,rs);
		return list;
	}
	
	@Override
	public boolean updatePatient(PatientVO p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePatient(int number) throws SQLException {
		//Statement stmt = this.conn.createStatement(); // 기존의 Statement는 쿼리를 다 짜줘야 함?
		String sql = "DELETE FROM patient WHERE number = ?"; // 불완전한 SQL 문
		PreparedStatement pstmt = this.conn.prepareStatement(sql); 
		// 4. 값이 채워지지 않은 SQL 문으로 statement 생성
		pstmt.setInt(1,number); // ?로 지정한 파라미터에 값을 Set
		int row = pstmt.executeUpdate(); // 5
		DBClose.dbClose(conn,pstmt); // 7
		return (row==1)? true: false;
	}

	

}
