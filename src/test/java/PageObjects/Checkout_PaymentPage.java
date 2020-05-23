package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class Checkout_PaymentPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String ContinueShoppingBtn_cs = "div#center_column div > p > a";
	private static String PayByBankWire_cs = "div#HOOK_PAYMENT div:nth-child(1) > div > p > a > span";
	private static String PayByCheck_cs = "div#HOOK_PAYMENT div:nth-child(2) > div > p > a";
    
	public static WebElement PayByBankWire (WebDriver dr) throws InterruptedException{
        ele = Locate(PayByBankWire_cs ,"cs" );
    return ele;
    }
	
	public static WebElement PayByCheck (WebDriver dr) throws InterruptedException{
        ele = Locate(PayByCheck_cs ,"cs" );
    return ele;
    }
	
	public static WebElement ContinueShoppingBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(ContinueShoppingBtn_cs ,"cs" );
    return ele;
    }
    
}
