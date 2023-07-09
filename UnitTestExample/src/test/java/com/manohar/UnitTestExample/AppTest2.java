package com.manohar.UnitTestExample;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest2 {
	Calci c;
	@Before
	void initialise() {

		c = new Calci();
	}
	@Test
	public void test1() {
		int result = c.add(10, 20);
		assertEquals(30, result);
	}
	@Test
	public void test2() {
		int result = c.sub(10, 20);
		assertEquals(-10, result);
	}
	@
	@After
	public void resetting() {
		c.reset();
		System.out.println();
	}
}
