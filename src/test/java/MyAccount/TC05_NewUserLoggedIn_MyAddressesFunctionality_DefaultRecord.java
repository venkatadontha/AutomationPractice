package MyAccount;

import java.io.IOException;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.MyAccountPage;
import PageObjects.MyAddressesPage;
import bsh.ParseException;

public class TC05_NewUserLoggedIn_MyAddressesFunctionality_DefaultRecord extends TestBase {
	
	@Test
	public static void MYAddresses_SignInUser() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.SignInFunctionality();
		Thread.sleep(1500);
		MyAccountPage.MyAddressBtn(dr).click();
		Thread.sleep(1500);
		MyAddressesPage.Back2AccountBtn(dr).click();
		Thread.sleep(1500);
		FuncBase.SignOutFunctionality();
		Thread.sleep(1500);
		FuncBase.CloseBrowser();
	}
}
