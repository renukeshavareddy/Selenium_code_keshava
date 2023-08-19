package Module6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.google.common.collect.Table.Cell;

public class NewTest {

	@Test
	public void reading_excelfile() throws IOException {

		// read file = FileInputStream
		// write file = FileOutStream

		// jar files download form mvnrepository

		// path of the excel sheet file

		// filenotfoundexception
		// ioexception
		FileInputStream fis = new FileInputStream(
				"C:\\Automation\\Selenium_code_keshava\\Book1.xlsx");
		// read the excel file

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Login");

		// get rows
		XSSFRow row = sheet.getRow(0);
		System.out.println("my row test:=" +row);

		int getrowcount = sheet.getLastRowNum();// it will take only completed in the cell

		System.out.println("row count  in excel sheet :=" + getrowcount);

		int getcolumncount = row.getLastCellNum();

		System.out.println("columns count  in excel sheet :=" + getcolumncount);

		for (int i = 2; i <= getrowcount + 1; i++) {

			for (int j = 0; j < getcolumncount; j++) {

				System.out.println(sheet.getRow(i).getCell(j));

			}

		}

	}

	/*//@Test
	//public void writing_excelfile() throws IOException {

		// read file = FileInputStream
		// write file = FileOutStream

		// jar files download form mvnrepository

		// path of the excel sheet file

		// filenotfoundexception
		// ioexception
		FileInputStream fis = new FileInputStream(
				"/Users/venkatneppalli/Documents/Workspace_Venkat/Selenium_Code_Hyd/src/test/java/Module6/selenium_data.xlsx");

		// read the excel file

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet("Sheet1");

		// get rows
		// XSSFRow row = sheet.getRow(0); //we are already written data inside the excel

		XSSFRow row = sheet.createRow(1); // new creating my own rows through script

		XSSFCell cell = row.createCell(0); // creating my own columns through script

		cell.setCellValue("testing123");

		XSSFCell cell1 = row.createCell(1);

		cell1.setCellValue("testing234");

		FileOutputStream fos = new FileOutputStream(
				"/Users/venkatneppalli/Documents/Workspace_Venkat/Selenium_Code_Hyd/src/test/java/Module6/selenium_data.xlsx");

		workbook.write(fos);

		fos.flush();
		fos.close();

		
		
	}*/

}
