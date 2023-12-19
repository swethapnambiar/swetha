package selepjts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class testng2 {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	  String driverPath="C:\\Users\\HP\\OneDrive\\Desktop\\selenium\\chromedriver.exe";
	  public WebDriver driver;
	  public String expected=null;
	  public String actual=null;
  @Test(priority=0)
  public void f() {
	  driver.findElement(By.linkText("REGISTER")).click();
	  expected="Register:Mercury Tours";
	  actual=driver.getTitle();
	  	Assert.assertEquals(actual, expected);
	  	  
  }
  @Test(priority=1)
  public void support(){
  driver.findElement(By.linkText("SUPPORT")).click();
  expected="Under Construction:Mercury Tours";
  actual=driver.getTitle();
  Assert.assertEquals(actual, expected);
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  String expectedTitle="Welcome:Mercury Tours";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle,expectedTitle);
	 
  }

  @AfterMethod
  public void afterMethod() {
	  driver.findElement(By.linkText("Home")).click();
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("launching firefox browser");
	  System.setProperty("webdriver.chrome.driver",driverPath);
	  driver=new FirefoxDriver();
	  driver.get(baseUrl);  
  }

  @AfterTest
  public void terminateBrowser() {
	  driver.close();
	  
	  }

}
