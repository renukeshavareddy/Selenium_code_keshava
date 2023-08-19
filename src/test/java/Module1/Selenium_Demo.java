package Module1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Demo {

	public static void main(String[] args) {
	
		//we are getting below apis from selenium java from mvnrepository
		//WebDriverManager.chromedriver.setup 4.6.0 below selenium jars
		
		WebDriver driver = new ChromeDriver();   
		driver.get("https://adactinhotelapp.com/");
		
		//Adding comment
		//Adding comments from server
		
	}

}
