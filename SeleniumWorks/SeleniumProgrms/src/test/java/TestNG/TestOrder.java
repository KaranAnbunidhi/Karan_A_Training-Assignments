package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestOrder {
	@Test
	public void apple() {
		System.out.println("Test 1");

	}
	@Test
	public void cat() {
		System.out.println("Test 2");

	}
	@Test
	public void bag() {
		System.out.println("Test 3");

	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");

	}

	@AfterClass
	public void afterClass() {
		System.out.println("after class");

	}

}
