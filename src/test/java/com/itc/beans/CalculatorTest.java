package com.itc.beans;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator calc = null;
	
	@Before
	public void init() {
		calc = new Calculator();
	}
	@After
	public void cleanup() {
		calc = null;
	}

	@Test
	public void testAdd() {
		int expected = 13;
		int actual = calc.add(8, 5);
		assertEquals(expected, actual);
	}
	
	@Test
	public void anotherTest() {
		int expected = 13;
		int actual = calc.add(8, 5);
		assertEquals(expected, actual);
	}

}
