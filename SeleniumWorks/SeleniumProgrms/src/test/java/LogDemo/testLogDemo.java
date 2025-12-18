package LogDemo;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class testLogDemo {
	 static Logger logger = Logger.getLogger(testLogDemo.class);
  @Test
  public void captureLogs() {
	  int empNo = 100321;
	  logger.debug("The value of empNo: " + empNo);
	  logger.info("Menu is clicked");
	  logger.warn("First name field is showing warning");
	  logger.error("Login failure for invalid crendentials");
	  logger.fatal("Internal Server Error, Website is not Displayed");
	 
  }
}
