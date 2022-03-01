package junitexample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Test1.class, TestMethod.class })
public class TestAllCases {
	
	@Test(timeout=3000)
	public void test90() {
	System.out.println("Inside the test90");
	try {
	Thread.sleep(2000);
	}
	catch(Exception e) {
	System.out.println(e);
	}

	}
}
