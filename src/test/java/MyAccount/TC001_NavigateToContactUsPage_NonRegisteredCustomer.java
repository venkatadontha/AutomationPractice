package MyAccount;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseScripts.FuncBase;
import PageObjects.HomePage;
import bsh.ParseException;

public class TC001_NavigateToContactUsPage_NonRegisteredCustomer extends FuncBase{
	
	@Test
	public static void Nav2ContactUsPage() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.LaunchApplication();
		HomePage.ContactUsLink(dr).click();
		Thread.sleep(5000);
		dr.quit();
	}
}
