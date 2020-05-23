package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class OrderHistoryPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String Back2AccountBtn_cs = "div#center_column li:nth-child(1) > a > span";
	private static String SignOutBtn_cs = "header#header div:nth-child(2) > a";
	private static String OrderNumber_cs ="table#order-list td.history_link.bold.footable-first-column > a";
    
	public static WebElement Back2AccountBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Back2AccountBtn_cs ,"cs" );
    return ele;
    }
	
	public static WebElement SignOutBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(SignOutBtn_cs ,"cs" );
    return ele;
    }
	
	public static WebElement OrderNumber (WebDriver dr) throws InterruptedException{
        ele = Locate(OrderNumber_cs ,"cs" );
    return ele;
    }
	
    
}
