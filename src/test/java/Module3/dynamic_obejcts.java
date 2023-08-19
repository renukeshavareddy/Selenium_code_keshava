package Module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamic_obejcts {
	public static WebDriver driver;
	public static void main(String[] args) {
		

		rediff_fullname();

	}
	
	
	public static void rediff_fullname() {
		
		
		driver = new ChromeDriver();   
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.xpath("//td[contains(text(),'Full Name')]//following::input[1]")).sendKeys("fullnametext");  //dynamic value for name locator
		
		//css
		//xpath
		
		
		//name  a37b0d8f       name  74425c77     name  23b6087f
		
	}

}
