import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	

	@Test
	public void test1() {
		assertEquals("3+5=8.0",Calculator.evaluate("3+5"));
	}
	
	@Test
	public void test2() {
		assertEquals("8-3=5.0",Calculator.evaluate("8-3"));
	}

	@Test
	public void test3() {
		assertEquals("10*4=40.0",Calculator.evaluate("10*4"));
	}

	@Test
	public void test4() {
		assertEquals("8/4=2.0",Calculator.evaluate("8/4"));
	}
	
	@Test
	public void test5() {
		assertTrue(true);
	}

	@Test
	public void test6() {
		assertNotEquals("2.0", Calculator.evaluate("8/4"));
	}

	@Test
	public void test7() {
		assertNotEquals("4", Calculator.evaluate("5+4"));
	}

	@Test
	public void test8() {
		Assertion
	}
	
	

}


