package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class PLPPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String QuickViewBtn_xp = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]";
    
	public static WebElement QuickViewBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(QuickViewBtn_xp ,"xp" );
    return ele;
    }
    
}
