package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class PDPQuickViewPopup extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String QtyTextBox_id = "quantity_wanted";
	private static String QtyDecrementBtn_cs = "p#quantity_wanted_p a.btn.btn-default.button-minus.product_quantity_down > span > i";
	private static String QtyIncrementBtn_xp = "//i[@class='icon-plus']";
	private static String SizeDropDown_cs="select#group_1";
	private static String Add2CartBtn_xp= "/html[1]/body[1]/div[1]/div[1]/div[3]/form[1]/div[1]/div[3]/div[1]/p[1]/button[1]/span[1]";
	private static String PopupCloseBtn_cs= "body#search div.fancybox-overlay.fancybox-overlay-fixed > div > div > a";
    
	public static WebElement QtyTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(QtyTextBox_id ,"id" );
    return ele;
    }
	public static WebElement QtyDecrementBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(QtyDecrementBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement QtyIncrementBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(QtyIncrementBtn_xp ,"xp" );
    return ele;
    }
	public static WebElement SizeDropDown (WebDriver dr) throws InterruptedException{
        ele = Locate(SizeDropDown_cs ,"cs" );
    return ele;
    }
	public static WebElement Add2CartBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(Add2CartBtn_xp ,"xp" );
    return ele;
    }
	public static WebElement PopupCloseBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(PopupCloseBtn_cs ,"cs" );
    return ele;
    }
    
}
