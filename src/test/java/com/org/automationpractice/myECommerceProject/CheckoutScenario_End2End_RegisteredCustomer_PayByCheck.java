package com.org.automationpractice.myECommerceProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import BaseScripts.FuncBase;
import PageObjects.Added2CartPopupPage;
import PageObjects.Checkout_AddressesPage;
import PageObjects.Checkout_OrderConfirmationPage;
import PageObjects.Checkout_OrderSummaryPage;
import PageObjects.Checkout_PaymentPage;
import PageObjects.Checkout_ShippingPage;
import PageObjects.PDPPage;
import PageObjects.Checkout_ShoppingCartSummaryPage;
import PageObjects.OrderHistoryPage;
import PageObjects.SignInRegisterPage;
import bsh.ParseException;

public class CheckoutScenario_End2End_RegisteredCustomer_PayByCheck extends FuncBase{
	
	@Test
	public static void Nav2ContactUsPage() throws InterruptedException, IOException, ParseException 
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx");
		@SuppressWarnings("resource")
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
		int i = 1;
		
		FuncBase.LaunchApplication();
		dr.get("http://automationpractice.com/index.php?id_product=1&controller=product");
		PDPPage.Add2CartBtn(dr).click();
		Added2CartPopupPage.Proceed2ChkOutBtn(dr).click();
		Checkout_ShoppingCartSummaryPage.Proceed2ChkOutBtn(dr).click();
		SignInRegisterPage.LoginEmailIDTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(0).getStringCellValue());
		SignInRegisterPage.LoginPasswordTextBox(dr).sendKeys(wb.getSheet("CustomerInfo").getRow(i).getCell(1).getStringCellValue());
		SignInRegisterPage.SignInBtn(dr).click();
		
		Checkout_AddressesPage.Proceed2ChkOutBtn(dr).click();
		
		Thread.sleep(3000);
		
		Checkout_ShippingPage.TermsConditionsChkbox(dr).click();
		Checkout_ShippingPage.Proceed2ChkOutBtn(dr).click();
		
		Checkout_PaymentPage.PayByBankWire(dr).click();
		
		Checkout_OrderSummaryPage.IConfirmMyOrderBtn(dr).click();
		
		Checkout_OrderConfirmationPage.Back2OrdersLink(dr).click();
		Thread.sleep(10000);
		
		OrderHistoryPage.SignOutBtn(dr).click();
		
		dr.quit();
				
		fis.close(); 
		FileOutputStream output_file = new FileOutputStream(new File("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\Data\\Data.xlsx")); 
		wb.write(output_file); 
		output_file.close();
		
	}
}
