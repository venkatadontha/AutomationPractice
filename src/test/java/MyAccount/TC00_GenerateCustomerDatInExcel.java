package MyAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import bsh.ParseException;

public class TC00_GenerateCustomerDatInExcel {

	@Test(priority=0)
	public static void CustomerDataGenerationInExcel() throws InterruptedException, IOException, ParseException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("CustomerInfo");

		for (int i=1; i<=1; i++)
		{
			Random r = new Random( System.currentTimeMillis() );
			int randomInt = ((1 + r.nextInt(2)) * 1000 + r.nextInt(100));
			String email = "Customer" + randomInt +"@yopmail.com";
			String[] rowData = {email,"Test1234","Venkata","Dontha","Venkata-Dontha","Drum Road", "Moths Grace", "Basingstoke", "Florida", "12345", "Additional Info for Venkata-Dontha", "0123456789", "9876543210"};
			insertRowData(sheet,i,rowData);
			System.out.println("Email Address generated is: " + email);
			System.out.println("Password generated is     : " + "Test1234");
		}

		fis.close(); 
		FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx")); 
		wb.write(output_file); 
		output_file.close(); 
	}

	private static void insertRowData(XSSFSheet sheet, int rowNum, String[] rowData) {
		XSSFRow row = sheet.createRow(rowNum);
		for(int i=0;i<rowData.length;i++) {
			row.createCell(i).setCellValue(rowData[i]);
		}
	}

}