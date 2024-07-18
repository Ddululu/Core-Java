package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Calc;
import com.example.Input;
import com.example.Product;

class CalcTest {

	@BeforeEach
	void setUp() throws Exception {
	}


	@Test
	void test() {
		List<Product> list = new ArrayList<Product>();
		Input input = new Input(list);
		input.fileInput();
		Calc calc = new Calc(list);
		calc.calc();
		assertEquals(7597000,list.get(1).getBenefit());
	}

}
