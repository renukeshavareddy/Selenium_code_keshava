package Module4;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class junitTesting {

	
	public WebDriver driver;
	
	
	@Test   //junit framework annotation
	public void testing() {
		
		driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		driver.findElement(By.id("username")).sendKeys("venkat72");
		driver.findElement(By.id("123password")).sendKeys("password@1");
		driver.findElement(By.id("login")).click();
		
		
		
	}
	

}
