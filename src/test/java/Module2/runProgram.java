package Module2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class runProgram {

	public static WebDriver driver; // polymorphism
	
	public static void main(String[] args) {
		
		openBrowser();
		navigateURL();
		
		//---------
		
		//page1
		
		newuserregPage.clickNewUserRegFormLink();
		newuserregPage.enterUserNameTxt();
		newuserregPage.clickRegButton();
		
		//page2
		closebrowserPage.closeBrowser();
		
	}

	
	public static void openBrowser() {

		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();

			System.out.println("chrome browser opened successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void navigateURL() {
		try {
			driver.get("https://adactinhotelapp.com/");
			System.out.println("navigate to hotel application is successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	
}
