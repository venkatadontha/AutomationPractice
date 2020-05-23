package MyAccount;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.CreateAnAccountPage;
import PageObjects.HomePage;
import PageObjects.SignInRegisterPage;
import bsh.ParseException;

public class TC02_CustomerRegistration extends TestBase {
	
	@Test
	public static void CustomerRegistration() throws InterruptedException, IOException, ParseException 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx");
		@SuppressWarnings("resource")
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
		int i = 1;
		
		FuncBase.LaunchApplication();
		
		//NAVIGATING TO SIGNIN - REGISTER PAGE
		HomePage.SigninLink(dr).click();
		Thread.sleep(1500);
		SignInRegisterPage.EmailIDTextBoxCreate(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(0).getStringCellValue());
		SignInRegisterPage.CreateAccountBtn(dr).click();
		Thread.sleep(1500);
		CreateAnAccountPage.TitleRadioBtn(dr).click();
		CreateAnAccountPage.FirstNameTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(2).getStringCellValue());
		CreateAnAccountPage.LastNameTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(3).getStringCellValue());
		CreateAnAccountPage.PasswordTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(1).getStringCellValue());
		CreateAnAccountPage.DOBDateDropDown(dr).sendKeys("25");
		Thread.sleep(1000);
		CreateAnAccountPage.DOBMonthDropDown(dr).sendKeys("December");
		Thread.sleep(1000);
		CreateAnAccountPage.DOBYearDropDown(dr).sendKeys("1991");
		Thread.sleep(1000);
		CreateAnAccountPage.NewsLetterChkBox(dr).click();
		CreateAnAccountPage.SpecialOffersChkBox(dr).click();
		CreateAnAccountPage.AddrCompanyTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(4).getStringCellValue());
		CreateAnAccountPage.AddrAddressLine1TextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(5).getStringCellValue());
		CreateAnAccountPage.AddrAddressLine2TextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(6).getStringCellValue());
		CreateAnAccountPage.AddrCityTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(7).getStringCellValue());
		CreateAnAccountPage.AddrStateDropDown(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(8).getStringCellValue());
		CreateAnAccountPage.AddrZipCodeTextBox(dr).sendKeys("12345");
		CreateAnAccountPage.AddrAdditionalInfoTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(10).getStringCellValue());
		CreateAnAccountPage.AddrHomePhoneTextBox(dr).sendKeys("1234567890");
		CreateAnAccountPage.AddrMobilePhoneTextBox(dr).sendKeys("9876543210");
		CreateAnAccountPage.AddrReferenceTextBox(dr).clear();
		CreateAnAccountPage.AddrReferenceTextBox(dr).sendKeys("My Home Address");
		Thread.sleep(1500);
		CreateAnAccountPage.RegisterBtn(dr).click();
		Thread.sleep(2500);
		
		FuncBase.SignOutFunctionality();
		Thread.sleep(1500);
		FuncBase.CloseBrowser();
		
		fis.close(); 
		FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx")); 
		wb.write(output_file); 
		output_file.close(); 
	}
	
}
