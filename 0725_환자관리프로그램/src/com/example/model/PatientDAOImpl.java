package com.example.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
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
	public List<PatientVO> readAllPatient() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public boolean updatePatient(PatientVO p) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deletePatient(int number) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
