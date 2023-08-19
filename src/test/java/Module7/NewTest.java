package Module7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {

	public WebDriver driver;

	@Test(priority = 1, dataProvider = "loginTest")
	public void verifyLogin(String userid, String passwordid) {

		// selenium code

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		driver.findElement(By.id("username")).sendKeys(userid);
		driver.findElement(By.id("password")).sendKeys(passwordid);
		driver.findElement(By.id("login")).click();

	}

	@Test(priority = 2, dataProvider = "searchTest")
	public void verifySearch(String hotel_loc, String hotel_name, String roomtype) {

		// selenium code

		Select location = new Select(driver.findElement(By.id("location")));
		location.selectByValue(hotel_loc);

		Select hotel = new Select(driver.findElement(By.id("hotels")));
		hotel.selectByValue(hotel_name);

		Select room_types = new Select(driver.findElement(By.id("room_type")));
		room_types.selectByValue(roomtype);

		driver.findElement(By.id("Submit")).click();

	}

	@DataProvider(name = "loginTest")
	public Object[][] createData2() {

		Object[][] data = new Object[1][2]; // we need to declare the size

		data[0][0] = "venkat72"; // hardcoded values of username for hotel application
		data[0][1] = "password@1";

		return data;

	}

	@DataProvider(name = "searchTest")
	public Object[][] createData3() {

		Object[][] data = new Object[1][3]; // we need to declare the size

		data[0][0] = "Melbourne"; // location
		data[0][1] = "Hotel Sunshine"; // hotel name
		data[0][2] = "Double"; // roomtype

		return data;

	}
	
	
	

}
