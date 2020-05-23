package MyAccount;

import java.io.IOException;

import org.testng.annotations.Test;

import BaseScripts.FuncBase;
import PageObjects.HomePage;
import bsh.ParseException;

public class TC003_NavigateToSignInRegisterPage_NonRegisteredCustomer extends FuncBase{
	
	@Test
	public static void Nav2SingInRegisterPage() throws InterruptedException, IOException, ParseException 
	{

		FuncBase.LaunchApplication();
		HomePage.CartBtn(dr).click();
		Thread.sleep(5000);
		dr.quit();
		
	}
}
