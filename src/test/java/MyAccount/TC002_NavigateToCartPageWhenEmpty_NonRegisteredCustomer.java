package MyAccount;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseScripts.FuncBase;
import PageObjects.HomePage;
import bsh.ParseException;

public class TC002_NavigateToCartPageWhenEmpty_NonRegisteredCustomer extends FuncBase{
	
	@Test
	public static void Nav2CartPageWhenEmpty() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.LaunchApplication();
		HomePage.SigninLink(dr).click();
		Thread.sleep(5000);
		dr.quit();
	}
}
