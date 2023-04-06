package pkgSelenium;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SauceLabAutomationTest {
  @Test(dataProvider = "dp")
  public void login(String uname, String pwd) {
	  System.out.println("username is: "+uname);
	  System.out.println("password is: "+pwd);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method");
  }


  @DataProvider
  public Object[][] Data_Login() {
    return new Object[][] {
      new Object[] {"tamim", "123@" },
      new Object[] {"bill", "567_b" },
      new Object[] { "tommi", "c" },
      new Object[] { "SauceLabs", "pwd" },
      new Object[] { "SauceLabs1", "pwd1" },
      new Object[] { "SauceLabs2", "pwd2" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("this is before test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suite");
  }

}
