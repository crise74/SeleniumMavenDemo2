package pkgSelenium;

import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class SeleniumTestCase {
	public static WebDriver driver;
	public static String url_app="https://www.saucedemo.com/";
	
	@BeforeClass
	public void setUp()throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\selennuim\\ChromeDriver\\chromedriver.exe");
		
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		 
		 driver.get(url_app);
		 driver.manage().window().maximize();
			Thread.sleep(2000);
	}
	@AfterClass
	public void tearDown()throws Exception{
		driver.quit();
	}
	
  @Test
  public void logintest() {
	  driver.get(url_app);
	  String title_app=driver.getTitle();
	  System.out.println("The title of the page app is: "+title_app);
	  if(title_app.equals("Swag Labs")) {
		  System.out.println("Application Lunch Successfully");
		  Assert.assertTrue(true);
	  }
	  else {
		  System.out.println("Application Not Lunch ");
		  Assert.assertTrue(false);
		  
	  }
	  WebElement WebElement_login_button;
	  WebElement_login_button=driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	  
	  
	  boolean checkloginbutton=WebElement_login_button.isDisplayed();
	  if(checkloginbutton) {
		  System.out.println("Login Page is Open successfully");
		  
		 List<WebElement> List_input=driver.findElements(By.tagName("input"));
		  
		  System.out.println("the no of input field in this page is: "+List_input.size());
		  
		  driver.findElement(By.id("user-name")).clear();
		  driver.findElement(By.id("user-name")).sendKeys("standard_user");
		  driver.findElement(By.id("password")).sendKeys("secret_sauce");
		  WebElement_login_button.click();
	  }
	  else {
		  System.out.println("Login page is not opened successfully");
	  }
	  
  }
  


@Test
	public void demotest() {
	assertTrue(false);
}
}