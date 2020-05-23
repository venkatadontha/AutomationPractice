package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class Checkout_AddressesPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String DeleteIcon_cs = "table#cart_summary a > i";
	private static String Proceed2ChkOutBtn_cs = "div#center_column button[type=\"submit\"] > span";
    
	public static WebElement DeleteIcon (WebDriver dr) throws InterruptedException{
        ele = Locate(DeleteIcon_cs ,"cs" );
    return ele;
    }
	
	public static WebElement Proceed2ChkOutBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Proceed2ChkOutBtn_cs ,"cs" );
    return ele;
    }
    
}
