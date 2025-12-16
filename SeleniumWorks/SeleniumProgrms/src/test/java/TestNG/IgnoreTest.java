package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class IgnoreTest {
  @Test
  public void flipKartLogin() {
	  System.out.println("Login");
  }
  @Test(enabled=false)
  public void flipKartSearch() {
	  System.out.println("Search");
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
