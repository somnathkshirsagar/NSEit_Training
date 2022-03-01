package junitexample;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class TestMethod {

	@Test
	public void test10() {
	Calculator c = new Calculator();
	assertEquals(3, c.sum(1, 2));
	}
	@Test
	public void test20() {
	Calculator c = new Calculator();
	assertNotEquals(5,c.sum(1,2));
	}
	@Test
	public void test30() {
	String str="Hello";
	assertNotNull(str);
	}
	@Test
	public void test40() {
	String str=null;
	assertNull(str);
	}

	 @Test
	public void test50() {
	
	int a=10, b=20;
	assertTrue(a<b);
	}
	 
	@Test
	public void test60() {
	
	int a=100, b=20;
	assertFalse(a<b);
	}

}
