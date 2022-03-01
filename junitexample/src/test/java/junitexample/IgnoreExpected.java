package junitexample;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class IgnoreExpected {

	@Test
	@Ignore
	public void test4() {
	System.out.println("Inside the test4");
	}
	@Test(expected= ArithmeticException.class)
	public void test5() {
	System.out.println("Inside the test5");
	int a=10/0;
	}
}
