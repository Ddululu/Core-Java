package com.example.model;
/*
 * DAO에는 C R U D 메소드를 포함하는 모델의 역할.
 * 모델은 DB와 상호작용하고, 데이터를 처리하는 역할 
 * Create, Read, Update, Delete
 */

import java.sql.SQLException;
import java.util.List;

public interface PatientDAO {
	/**
	 * 새로운 환자를 등록 -> 
	 * @param Patient
	 * @return 등록됐나 ? false : 등록과 true
	 * @throws SQLException 
	 */
	boolean 				createPatient(PatientVO p) throws Exception;
	
	/**
	 * 환자 정보를 입력받아 해당 번호의 환자 한명을 리턴
	 * @param 환자 등록번호
	 * @return 환자 1명 정보
	 * @throws SQLException 
	 */
	PatientVO  			readPatient(int number) throws SQLException;
	
	/**
	 * 지금까지 등록된 모든 환자 리스트를 반환한다.
	 * @return 환자형 리스트
	 */
	List<PatientVO> 	readAllPatient() throws SQLException;
	
	/**
	 * 수정할 환자 번호를 입력받아 수정 성공하면 true, 실패하면 false 리턴
	 * @param 환자 등록 번호
	 * @return 성공여부
	 */
	boolean 				updatePatient(PatientVO p) throws SQLException;
	
	/**
	 * 제거할 환자 정보를 입력받아 DB에서 제거
	 * @param 삭제할 등록 번호
	 * @return 성공 여부
	 */
	boolean 				deletePatient(int number ) throws SQLException;
}
