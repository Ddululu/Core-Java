package com.example.controller;

import java.sql.SQLException;

// 데이터를 전달할 모델 Import
import com.example.model.PatientDAO;
import com.example.model.PatientDAOImpl;
import com.example.model.PatientVO;

// Controller는 사용자의 입력을 처리하고, 모델과 뷰 사이의 흐름을 제어.
// 뷰에서 입력받은 값을 모델에게 전달하는 역할.

public class InsertController {
	private PatientDAO pDao;
	
	public InsertController() {
		pDao = new PatientDAOImpl();
	}
	
	public boolean insert(PatientVO p) throws Exception {
		boolean result =false;
		try {
			CalcController cc =new CalcController(p);
			result = pDao.createPatient(p); // 실제 처리는 모델에서 처리, 컨트롤러는 결과만 확인
		}catch(SQLException ex) {
			System.out.println(ex.getMessage());
		}
		return result;
	}
}
