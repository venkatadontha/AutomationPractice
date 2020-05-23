package JUNK;

import java.io.IOException;
import org.testng.annotations.Test;
import BaseScripts.FuncBase;
import BaseScripts.TestBase;
import PageObjects.HomePage;
import bsh.ParseException;

public class TC06_HomePageFunctioanlities extends TestBase {
	
	@Test
	public static void LaunchApplication() throws InterruptedException, IOException, ParseException 
	{
		//LAUNCHING THE APPLICATION
		FuncBase.LaunchApplication();
		
		//NAVIGATING TO CONTACT US PAGE AND NAVIGATING BACK TO HOME PAGE
		HomePage.ContactUsLink(dr).click();
		Thread.sleep(2500);
		dr.navigate().back();
		Thread.sleep(2500);
		
		//NAVIGATING TO CART PAGE WHEN THE CART IS EMPTY
		HomePage.CartBtn(dr).click();
		Thread.sleep(2500);
		dr.navigate().back();
		Thread.sleep(2500);
		
		//NAVIGATING TO SIGNIN - REGISTER PAGE
		HomePage.SigninLink(dr).click();
		Thread.sleep(2500);
		dr.navigate().back();
		Thread.sleep(2500);
		
		dr.quit();
	}
		 
}
