package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class MyAccountPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String SignoutLink_cs = "header#header div:nth-child(2) > a";
	private static String OrderHistoryBtn_cs = "div#center_column div:nth-child(1) > ul > li:nth-child(1) > a > span";
	private static String MyCreditSlipsBtn_cs = "div#center_column li:nth-child(2) > a > span";
	private static String MyAddressBtn_cs = "div#center_column li:nth-child(3) > a > span";
	private static String MyPersonalInfoBtn_cs = "div#center_column li:nth-child(4) > a > span";
	private static String MyWishLists_cs = "div#center_column div:nth-child(2) > ul > li > a > span";
	private static String HomeBtn_cs = "div#center_column ul > li > a > span";
    
	public static WebElement SignoutLink (WebDriver dr) throws InterruptedException{
        ele = Locate(SignoutLink_cs ,"cs" );
    return ele;
    }
	public static WebElement OrderHistoryBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(OrderHistoryBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement MyCreditSlipsBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(MyCreditSlipsBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement MyAddressBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(MyAddressBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement MyPersonalInfoBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(MyPersonalInfoBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement MyWishLists (WebDriver dr) throws InterruptedException{
        ele = Locate(MyWishLists_cs ,"cs" );
    return ele;
    }
	public static WebElement HomeBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(HomeBtn_cs ,"cs" );
    return ele;
    }
    
}
