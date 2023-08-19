package Module6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelreadwrte {
  @Test
  public void readexcel() throws IOException {
	  
	  FileInputStream fis = new FileInputStream("C:\\Automation\\Selenium_code_keshava\\Book1.xlsx");
			  
			  XSSFWorkbook workbook = new XSSFWorkbook(fis);
	  XSSFSheet sheet = workbook.getSheet("Login");
	 // XSSFROW row = sheet.getrow
	  
  }
}
