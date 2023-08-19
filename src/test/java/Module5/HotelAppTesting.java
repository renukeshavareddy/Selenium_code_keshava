package Module5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HotelAppTesting {

	public WebDriver driver;

	@Parameters({ "browserType" })
	@BeforeClass // this will be included in reports
	public void openBrowser(String browser_Type) {

		if (browser_Type.equals("chrome")) {
			driver = new ChromeDriver(); // no fail case

		} else if (browser_Type.equals("safari")) {

			driver = new SafariDriver();

		} else if (browser_Type.equals("firefox")) {
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize(); // no fail case
		driver.get("https://adactinhotelapp.com/"); // no fail case
	}

	@Test
	public void loginHotelApp() throws InterruptedException {

		driver.findElement(By.id("username")).sendKeys("venkat72");
		driver.findElement(By.id("password")).sendKeys("password@1");
		driver.findElement(By.id("login")).click();

		Thread.sleep(5000);
	}

	@Test
	public void searchHotelApp() throws InterruptedException {

		// dropdown list box

		Thread.sleep(2000);
		Select location = new Select(driver.findElement(By.id("location")));
		location.selectByIndex(2);

		Select hotels = new Select(driver.findElement(By.id("hotels")));
		hotels.selectByIndex(2);

		Select roomtype = new Select(driver.findElement(By.id("room_type")));
		roomtype.selectByIndex(2);

		Select roomnos = new Select(driver.findElement(By.id("room_nos")));
		roomnos.selectByIndex(2);

		driver.findElement(By.id("Submit")).click();

	}

	@AfterClass
	public void closeBrowser() { // this will be included in reports

		// driver.close(); //closes the current browser opened by selenium webdriver

		System.out.println("browser closed method....");
	}

}
