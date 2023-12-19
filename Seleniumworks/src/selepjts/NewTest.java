package selepjts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	String driverPath = "C:\\Users\\HP\\OneDrive\\Desktop\\selenium\\chromedriver.exe";
	public WebDriver driver ;
			
  @Test
  public void f() {
	  String expectedTitle = "Welcome:Mercury Tours";
	  String actualTitle = driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
	  
  } 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver=new FirefoxDriver();
	  driver.get(baseUrl);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
