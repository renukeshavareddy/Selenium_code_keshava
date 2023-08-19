package Module2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newuserregPage extends runProgram{

	
	public static void clickNewUserRegFormLink() {
		
		try {
			
			driver.findElement(By.linkText("New User Register Here")).click();	
			
			System.out.println("clicked on new user registration link successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	

	public static void enterUserNameTxt() {
		try {
			driver.findElement(By.id("username")).sendKeys("AutomationLearning");
			System.out.println("entered username text successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void clickRegButton() {
		try {
			driver.findElement(By.id("Submit")).click();
			System.out.println("clicked on registration button successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

}
