package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class Checkout_OrderSummaryPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String OtherPaymentMethodsLink_cs = "p#cart_navigation > a";
	private static String IConfirmMyOrderBtn_cs = "p#cart_navigation span";
    
	public static WebElement OtherPaymentMethodsLink (WebDriver dr) throws InterruptedException{
        ele = Locate(OtherPaymentMethodsLink_cs ,"cs" );
    return ele;
    }
	
	public static WebElement IConfirmMyOrderBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(IConfirmMyOrderBtn_cs ,"cs" );
    return ele;
    }
    
}
