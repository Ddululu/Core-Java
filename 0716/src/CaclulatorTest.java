import static org.junit.Assert.assertEquals; //assertEquals(a,b)는 a와 b의 값이 일치하는지 확인
import static org.junit.Assert.assertNotNull; // assertNotNull은 테스트 결과가 Null이 아님을 검사한다.
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach; // 각각의 테스트 메소드가 실행된 후에 실행
import org.junit.jupiter.api.AfterAll;  // 모든 테스트 메소드가 실행된 후 한 번만 실행
import org.junit.jupiter.api.BeforeEach; // 각각의 테스트 메소드가 실행되기 전에 실행
import org.junit.jupiter.api.BeforeAll; // 모든 테스트 메소드가 실행되기 전에 한 번만 실행됩니다.
import org.junit.jupiter.api.Disabled; // 테스트 블록을 임시로 제외한다.
import org.junit.jupiter.api.Test; // 테스트 블록

class CaclulatorTest {
	private Calculator cal;
	
	@BeforeEach 
	void init() {
		this.cal = new Calculator();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Disabled @Test // @Test는 아래 코드 블록을 실행해 테스트를 진행한다.
// @Disabled는 아래 코드 블록을 테스트에서 임시로 제외한다는 뜻
	void test() {
		assertNotNull(this.cal); 
	}

	@Test 
	void testAdd() {
		assertEquals(8,this.cal.add(3, 5));
	}

	@Test
	void testSub() {
		assertEquals(5,this.cal.sub(8, 3));
	}

	@Test
	void testMul() {
		assertEquals(24,this.cal.mul(6, 4));
	}

	@Test
	void testDiv() {
		assertEquals(4.0,this.cal.div(24, 6));
	}

}
