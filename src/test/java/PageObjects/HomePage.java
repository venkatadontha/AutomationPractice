package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class HomePage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String Logo_cs = "div#header_logo img";
	private static String SigninLink_cs = "header#header div.header_user_info > a";
	private static String SearchTextBox_cs = "input#search_query_top";
	private static String SearchBtn_cs="form#searchbox > button[type=\"submit\"]";
	private static String ContactUsLink_cs="div#contact-link > a";
	private static String CartBtn_cs="header#header div:nth-child(3) > div > a";
    
	public static WebElement Logo (WebDriver dr) throws InterruptedException{
        ele = Locate(Logo_cs ,"cs" );
    return ele;
    }
	public static WebElement SigninLink (WebDriver dr) throws InterruptedException{
        ele = Locate(SigninLink_cs ,"cs" );
    return ele;
    }
	public static WebElement SearchTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(SearchTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement SearchBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(SearchBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement ContactUsLink (WebDriver dr) throws InterruptedException{
        ele = Locate(ContactUsLink_cs ,"cs" );
    return ele;
    }
	public static WebElement CartBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(CartBtn_cs ,"cs" );
    return ele;
    }
    
}
