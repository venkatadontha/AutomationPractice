package com.org.automationpractice.myECommerceProject;

import java.io.IOException;
import java.util.Random;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import PageObjects.Added2CartPopupPage;
import PageObjects.Checkout_AddressesPage;
import PageObjects.Checkout_OrderConfirmationPage;
import PageObjects.Checkout_OrderSummaryPage;
import PageObjects.Checkout_PaymentPage;
import PageObjects.Checkout_ShippingPage;
import PageObjects.Checkout_ShoppingCartSummaryPage;
import PageObjects.CreateAnAccountPage;
import PageObjects.OrderHistoryPage;
import PageObjects.PDPPage;
import PageObjects.SignInRegisterPage;
import bsh.ParseException;

public class CheckoutScenario_End2End_GuestCustomer_PayByBank extends FuncBase{
	
	@Test
	public static void Nav2ContactUsPage() throws InterruptedException, IOException, ParseException 
	{
		
		FuncBase.LaunchApplication();
		dr.get("http://automationpractice.com/index.php?id_product=1&controller=product");
		PDPPage.Add2CartBtn(dr).click();
		Added2CartPopupPage.Proceed2ChkOutBtn(dr).click();
		
		Checkout_ShoppingCartSummaryPage.Proceed2ChkOutBtn(dr).click();
		
		
		Random r = new Random( System.currentTimeMillis() );
		int randomInt = ((1 + r.nextInt(2)) * 1000 + r.nextInt(100));
		String email = "GuestCustomer" + randomInt +"@yopmail.com";
		
		SignInRegisterPage.EmailIDTextBoxCreate(dr).sendKeys(email);
		SignInRegisterPage.CreateAccountBtn(dr).click();
		CreateAnAccountPage.TitleRadioBtn(dr).click();
		CreateAnAccountPage.FirstNameTextBox(dr).sendKeys("Guest");
		CreateAnAccountPage.LastNameTextBox(dr).sendKeys("Customer");
		CreateAnAccountPage.PasswordTextBox(dr).sendKeys("Test12345");
		Thread.sleep(1500);
		CreateAnAccountPage.DOBDateDropDown(dr).sendKeys("1");
		Thread.sleep(1500);
		CreateAnAccountPage.DOBMonthDropDown(dr).sendKeys("January");
		Thread.sleep(1500);
		CreateAnAccountPage.DOBYearDropDown(dr).sendKeys("1991");
		CreateAnAccountPage.NewsLetterChkBox(dr).click();
		CreateAnAccountPage.SpecialOffersChkBox(dr).click();
		CreateAnAccountPage.AddrCompanyTextBox(dr).sendKeys("Guest Company");
		CreateAnAccountPage.AddrAddressLine1TextBox(dr).sendKeys("101 Winterthur Way");
		CreateAnAccountPage.AddrAddressLine2TextBox(dr).sendKeys("Alencon Link");
		CreateAnAccountPage.AddrCityTextBox(dr).sendKeys("Columbus");
		CreateAnAccountPage.AddrStateDropDown(dr).sendKeys("Ohio");
		CreateAnAccountPage.AddrZipCodeTextBox(dr).sendKeys("12345");
		CreateAnAccountPage.AddrAdditionalInfoTextBox(dr).sendKeys("This is the additional Info for the Guest Customer");
		CreateAnAccountPage.AddrHomePhoneTextBox(dr).sendKeys("1234567890");
		CreateAnAccountPage.AddrMobilePhoneTextBox(dr).sendKeys("9876543210");
		CreateAnAccountPage.AddrReferenceTextBox(dr).clear();
		CreateAnAccountPage.AddrReferenceTextBox(dr).sendKeys("My Home Address");
		Thread.sleep(2500);
		CreateAnAccountPage.RegisterBtn(dr).click();
		
		Checkout_AddressesPage.Proceed2ChkOutBtn(dr).click();
		
		Checkout_ShippingPage.TermsConditionsChkbox(dr).click();
		Checkout_ShippingPage.Proceed2ChkOutBtn(dr).click();
		
		Checkout_PaymentPage.PayByBankWire(dr).click();
		
		Checkout_OrderSummaryPage.IConfirmMyOrderBtn(dr).click();
		
		Checkout_OrderConfirmationPage.Back2OrdersLink(dr).click();
		Thread.sleep(10000);
		
		String orderNumber = OrderHistoryPage.OrderNumber(dr).getText();
		System.out.println(orderNumber);
		
		OrderHistoryPage.SignOutBtn(dr).click();
		
		dr.quit();
				
		
	}
}
