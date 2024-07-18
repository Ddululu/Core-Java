package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.example.*;

// Input을 통해 만들어진 결과물을 확인
class InputTest {

	@Test
	void Input_test() {
		List<Product> list= new ArrayList<Product>();
		Input input = new Input(list);
		input.fileInput();
		
		// List에 데이터가 들어 있는가? null이 아닌가???
		assertNotNull(list);
		
		// 5번째 요소의 이름이 일치하는가?
		assertEquals("DISKETTE", list.get(5).getName());
	}

}
