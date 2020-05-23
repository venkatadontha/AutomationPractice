package BaseScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import PageObjects.HomePage;
import PageObjects.MyAccountPage;
import PageObjects.SignInRegisterPage;
import bsh.ParseException;

public class FuncBase extends TestBase {
	
	public static void LaunchApplication() throws IOException, InterruptedException, ParseException
	{
		if (CG.getProperty("environment").equals("automationpractice"))
		{
			dr.get("http://automationpractice.com/index.php");
		}
		else 
			dr.get("https://www.thetoyshop.com/");
	}	
	
	public static void SignInFunctionality() throws InterruptedException, IOException, ParseException 
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx");
		@SuppressWarnings("resource")
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
		int i = 1;
		
		FuncBase.LaunchApplication();
		HomePage.SigninLink(dr).click();
		SignInRegisterPage.LoginEmailIDTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(0).getStringCellValue());
		SignInRegisterPage.LoginPasswordTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(1).getStringCellValue());
		SignInRegisterPage.SignInBtn(dr).click();
		Thread.sleep(1500);
		
		fis.close(); 
		FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx")); 
		wb.write(output_file); 
		output_file.close(); 
	}
	
	public static void SignOutFunctionality() throws InterruptedException, IOException, ParseException 
	{
		MyAccountPage.SignoutLink(dr).click();
		Thread.sleep(1500);
	}
	
	public static void CloseBrowser() throws InterruptedException, IOException, ParseException 
	{
		Thread.sleep(1500);
		dr.quit();
	}
}