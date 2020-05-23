package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class MyAddressesPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String Back2AccountBtn_cs = "div#center_column li:nth-child(1) > a > span";
	
    
	public static WebElement Back2AccountBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Back2AccountBtn_cs ,"cs" );
    return ele;
    }
    
}
