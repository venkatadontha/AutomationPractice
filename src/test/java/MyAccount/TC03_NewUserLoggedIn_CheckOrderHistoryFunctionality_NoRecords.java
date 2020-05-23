package MyAccount;

import java.io.IOException;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.MyAccountPage;
import PageObjects.OrderHistoryPage;
import bsh.ParseException;

public class TC03_NewUserLoggedIn_CheckOrderHistoryFunctionality_NoRecords extends TestBase {
	
	@Test
	public static void OrderHistory_SignInUser() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.SignInFunctionality();
		Thread.sleep(1500);
		MyAccountPage.OrderHistoryBtn(dr).click();
		Thread.sleep(1500);
		OrderHistoryPage.Back2AccountBtn(dr).click();
		Thread.sleep(1500);
		FuncBase.SignOutFunctionality();
		Thread.sleep(1500);
		FuncBase.CloseBrowser();
	}
}
