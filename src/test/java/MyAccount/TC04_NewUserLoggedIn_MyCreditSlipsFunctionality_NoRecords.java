package MyAccount;

import java.io.IOException;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.MyAccountPage;
import PageObjects.MyCreditSlipsPage;
import bsh.ParseException;

public class TC04_NewUserLoggedIn_MyCreditSlipsFunctionality_NoRecords extends TestBase {
	
	@Test
	public static void MyCreditSlips_SignInUser() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.SignInFunctionality();
		Thread.sleep(1500);
		MyAccountPage.MyCreditSlipsBtn(dr).click();
		Thread.sleep(1500);
		MyCreditSlipsPage.Back2AccountBtn(dr).click();
		Thread.sleep(1500);
		FuncBase.SignOutFunctionality();
		Thread.sleep(1500);
		FuncBase.CloseBrowser();
	}
}
