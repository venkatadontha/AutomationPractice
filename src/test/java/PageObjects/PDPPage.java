package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class PDPPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String Add2CartBtn_cs = "p#add_to_cart span";
	private static String Proceed2ChkOutBtn_cs = "div#layer_cart a > span";
    
	public static WebElement Add2CartBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Add2CartBtn_cs ,"cs" );
    return ele;
    }
	
	public static WebElement Proceed2ChkOutBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Proceed2ChkOutBtn_cs ,"cs" );
    return ele;
    }
    
}
