package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class Checkout_OrderConfirmationPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String Back2OrdersLink_cs = "div#center_column p.cart_navigation.exclusive > a";
    
	public static WebElement Back2OrdersLink (WebDriver dr) throws InterruptedException{
        ele = Locate(Back2OrdersLink_cs ,"cs" );
    return ele;
    }
    
}
