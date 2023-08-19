package Module2;

public class closebrowserPage extends runProgram{
	
	
	public static void closeBrowser() {
		try {
			driver.close(); // quite getting some exception soket
			System.out.println("chrome browser closed successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
