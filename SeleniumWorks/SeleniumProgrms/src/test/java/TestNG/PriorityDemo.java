package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PriorityDemo {
  @Test(priority=2)
  public void aTest() {
	  System.out.println("a");
	  Assert.assertEquals("java", "selenium");
  }
  @Test(priority=1)
  public void bTest() {
	  System.out.println("b");
	  Assert.assertTrue(true);
  }
  @Test(priority=3)
  public void cTest() {
	  System.out.println("c");
	  Assert.assertFalse(false);
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
