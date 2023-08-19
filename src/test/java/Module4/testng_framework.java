package Module4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testng_framework {

	public WebDriver driver;

	@BeforeClass // this will be included in reports
	public void openBrowser() {

		driver = new ChromeDriver(); // no fail case
		driver.manage().window().maximize(); // no fail case
		driver.get("https://adactinhotelapp.com/"); // no fail case

	}

	@Test
	public void searchHotelApp() {

		// dropdown list box

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

	@Test
	public void loginHotelApp() {

		driver.findElement(By.id("username")).sendKeys("venkat72");
		driver.findElement(By.id("password")).sendKeys("password@1");
		driver.findElement(By.id("login")).click();
	}
}
