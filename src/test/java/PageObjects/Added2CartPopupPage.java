package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class Added2CartPopupPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String ClosePopupIcon_cs = "div#layer_cart div.layer_cart_product.col-xs-12.col-md-6 > span";
	private static String ContinueShoppingBtn_cs = "div#layer_cart div.button-container > span > span";
	private static String Proceed2ChkOutBtn_cs = "div#layer_cart a > span";
    
	public static WebElement ClosePopupIcon (WebDriver dr) throws InterruptedException{
        ele = Locate(ClosePopupIcon_cs ,"cs" );
    return ele;
    }
	
	public static WebElement ContinueShoppingBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(ContinueShoppingBtn_cs ,"cs" );
    return ele;
    }
	
	
	public static WebElement Proceed2ChkOutBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Proceed2ChkOutBtn_cs ,"cs" );
    return ele;
    }
    
}
