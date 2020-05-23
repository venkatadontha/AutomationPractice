package MyAccount;

import java.io.IOException;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.MyAccountPage;
import PageObjects.MyPersonalInfoPage;
import bsh.ParseException;

public class TC06_NewUserLoggedIn_ViewPersonalInfoFunctionality_DefaultRecordInfo extends TestBase {
	
	@Test
	public static void ViewPersonalInfo_SignInUser() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.SignInFunctionality();
		Thread.sleep(1500);
		MyAccountPage.MyPersonalInfoBtn(dr).click();
		Thread.sleep(1500);
		MyPersonalInfoPage.Back2AccountBtn(dr).click();
		Thread.sleep(1500);
		FuncBase.SignOutFunctionality();
		Thread.sleep(1500);
		FuncBase.CloseBrowser();
	}
}
