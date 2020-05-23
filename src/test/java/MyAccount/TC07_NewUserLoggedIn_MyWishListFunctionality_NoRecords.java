package MyAccount;

import java.io.IOException;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.MyAccountPage;
import PageObjects.MyWishListsPage;
import bsh.ParseException;

public class TC07_NewUserLoggedIn_MyWishListFunctionality_NoRecords extends TestBase {
	
	@Test(priority=1)
	public static void MyWishList_SignInUser() throws InterruptedException, IOException, ParseException 
	{
		FuncBase.SignInFunctionality();
		Thread.sleep(1500);
		MyAccountPage.MyWishLists(dr).click();
		Thread.sleep(1500);
		MyWishListsPage.Back2AccountBtn(dr).click();
		Thread.sleep(1500);
		FuncBase.SignOutFunctionality();
		Thread.sleep(1500);
		FuncBase.CloseBrowser();
	}
}
