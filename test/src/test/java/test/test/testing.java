package test.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {
		TestClass x =  new TestClass();
		float sum = x.sum(10,  20);
		float subtraction = x.subtraction(10,  20);
		float product = x.product(10,  20);
		float division = x.division(10,  20);
		
		assertEquals(30, sum);
		assertEquals(-10, subtraction);
		assertEquals(200, product);
		assertEquals(0.5, division);
	}

}
