package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class DependsOnMethods {
	@Test
	public void flipkartLogin() {
		System.out.println("Login");
		Assert.assertEquals("login", "login1");
	}

	@Test(dependsOnMethods = ("flipkartLogin"))
	public void flipkartSearch() {
		System.out.println("Search");
	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
