package selepjts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class linksinwebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\OneDrive\\Desktop\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String homepage="https://www.facebook.com/login/";
		driver.get(homepage);
		System.out.println("total link count"+driver.findElements(By.tagName("a")).size());
		WebElement foot=driver.findElement(By.id("pageFooterChildren"));
		System.out.println("total link in footer"+driver.findElements(By.tagName("a")).size());
		
		
		
		
		
		
		

	}

}
