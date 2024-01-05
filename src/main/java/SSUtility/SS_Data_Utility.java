package SSUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SS_Data_Utility 
{

	public String dataFromPropertiesFile(String key) throws Throwable
	{
		File file = new File("./src/main/resources/credentials.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
	public String dataFromExcelFile(String SheetName, int RowNum, int ColNum) throws Throwable
	{
		File file = new File("SS_IPathConstant_Utility.ExcelPath");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(RowNum);

		
		DataFormatter formatter = new DataFormatter();
		String value = formatter.formatCellValue(row.getCell(ColNum));
		return value;
	}
	
	
	
	public Object[][] accessAllAddress() throws Throwable
	{
		Object[][] ref = new Object[3][9];
		
		System.out.println("Second Test Case");
		File file = new File("./src/main/resources/AddressDetails.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workbook=WorkbookFactory.create(fis);
		Sheet sheet=workbook.getSheet ("Sheet1");
		
		DataFormatter formatter = new DataFormatter();
		
		int count=0;
		
		for(int i=1; i<=sheet.getLastRowNum(); i++) 
		{
			for (int j=0; j<sheet.getRow(i).getLastCellNum(); j++ )
			{
				ref[count][j]=formatter.formatCellValue(sheet.getRow(i).getCell(j)).toString();
			}
			count++;
		}
		
		return ref;
		
	}
	
	public String IDHCBankProperties(String key) throws Throwable
	{
		File file = new File("./src/main/resources/IDHCBank.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
	public String ICDBankProperties(String key) throws Throwable
	{
		File file = new File("./src/main/resources/ICDBank.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
	public String TBIBankProperties(String key) throws Throwable
	{
		File file = new File("./src/main/resources/TBIBank.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		String value = pro.getProperty(key);
		return value;
	}
	
}
