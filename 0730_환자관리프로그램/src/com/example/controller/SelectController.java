package com.example.controller;

import java.sql.SQLException;
import java.util.List;

import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

public class SelectController {
	private PatientDAO pdao;
	
	public SelectController() {
		this.pdao = new PatientDAOImpl();
	}
	
	public List<PatientVO> selectAllPatient(){
		List<PatientVO> list = null;
		try {
			list = this.pdao.readAllPatient();
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return list;
	}
}
