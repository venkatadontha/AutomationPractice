package MyAccount;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import BaseScripts.FuncBase;
import PageObjects.HomePage;
import PageObjects.SignInRegisterPage;
import bsh.ParseException;

public class TC01_RegistrationFunctionalityWithExistingCustomer extends FuncBase{
	
	@Test(priority=5)
	public static void CustomerRegistration_ExistingCustomer() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.LaunchApplication();
		HomePage.SigninLink(dr).click();
		Thread.sleep(1500);
		SignInRegisterPage.EmailIDTextBoxCreate(dr).sendKeys("raja01@yopmail.com");
		SignInRegisterPage.CreateAccountBtn(dr).click();
		Thread.sleep(1500);
		String actual_msg=SignInRegisterPage.CreateAccountErrorMsg(dr)	.getText();
		String expect_msg="An account using this email address has already been registered. Please enter a valid password or request a new one.";
		Assert.assertEquals(actual_msg, expect_msg);
	}
}
