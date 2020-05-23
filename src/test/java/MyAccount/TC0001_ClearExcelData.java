package MyAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import BaseScripts.TestBase;
import bsh.ParseException;

public class TC0001_ClearExcelData extends TestBase {
	
	@Test
	public static void ClearExcelData() throws InterruptedException, IOException, ParseException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx");
		@SuppressWarnings("resource")
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
		int i = 1;
		
		wb.getSheet("CustomerInfo").getRow(i).createCell(0).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(1).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(2).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(3).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(4).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(5).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(6).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(7).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(8).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(9).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(10).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(11).setCellValue("");
		wb.getSheet("CustomerInfo").getRow(i).createCell(12).setCellValue("");

		dr.quit();
		
		fis.close(); 
		FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx")); 
		wb.write(output_file); 
		output_file.close(); 
	}
	
}
