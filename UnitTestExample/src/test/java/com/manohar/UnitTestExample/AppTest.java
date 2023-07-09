package com.manohar.UnitTestExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void shouldAnswerWithTrue() {
		assertTrue(true);
	}

	@Test
	public void methodTest() {
		Calci c = new Calci();
		int res = c.add(10, 20);
		assertEquals(30, res);
	}

	@Test
	public void subTest() {
		Calci c = new Calci();
		int res = c.sub(10, 20);
		assertEquals(-10, res);
	}
	@Test
	public void mulTest() {
		Calci c=new Calci();
		int res=c.mul(10, 20);
		assertEquals(200, res);
		
	}

}
