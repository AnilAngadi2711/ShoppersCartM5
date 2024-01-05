package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import SSUtility.SS_BaseClass;
import SSUtility.SS_Data_Utility;

public class AddingToCart extends SS_BaseClass
{
	@Test
	public void TC_AddToCart_001_Test() throws Throwable
	{
//		System.out.println("Hello");
		
//		Using Properties From Resources
		
//		File file = new File("./src/main/resources/credentials.properties");
//		FileInputStream fis = new FileInputStream(file);
//		Properties pro = new Properties();
//		pro.load(fis);
//		String value = pro.getProperty("url");
//		System.out.println(value);

//		Using ss_Data_Utility
		
		String URL=data.dataFromPropertiesFile("url");
		System.out.println(URL);
		
		
//		Using Excel Uitlity
		
//		File file = new File("./src/main/resources/Details.xlsx");
//		FileInputStream fis = new FileInputStream(file);
//		Workbook workbook = WorkbookFactory.create(fis);
//		
//		Sheet sheet = workbook.getSheet("sheet1");
//		Row row = sheet.getRow(0);
//
//		
//		DataFormatter formatter = new DataFormatter();
//		String value = formatter.formatCellValue(row.getCell(0));

//		String mobiNum = data.dataFromExcelFile("Sheet1", 1, 0);
//		System.out.println(mobiNum);
		
		
		
		
		
		
	}
}
