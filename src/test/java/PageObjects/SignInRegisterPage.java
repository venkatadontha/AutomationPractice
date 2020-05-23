package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class SignInRegisterPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String AuthHeader_cs = "div#center_column > h1";
	private static String EmailIDTextBoxCreate_cs = "input#email_create";
	private static String CreateAccountBtn_cs = "button#SubmitCreate > span";
	private static String CreateAccountErrorMsg_cs = "div#create_account_error li";
	
	private static String LoginEmailIDTextBox_cs="input#email";
	private static String LoginPasswordTextBox_cs="input#passwd";
	private static String ForgotPasswordLink_cs="form#login_form a";
	private static String SignInBtn_cs="button#SubmitLogin > span";
	
    
	public static WebElement AuthHeader (WebDriver dr) throws InterruptedException{
        ele = Locate(AuthHeader_cs ,"cs" );
    return ele;
    }
	public static WebElement EmailIDTextBoxCreate (WebDriver dr) throws InterruptedException{
        ele = Locate(EmailIDTextBoxCreate_cs ,"cs" );
    return ele;
    }
	public static WebElement CreateAccountBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(CreateAccountBtn_cs ,"cs" );
    return ele;
    }
	public static WebElement CreateAccountErrorMsg (WebDriver dr) throws InterruptedException{
        ele = Locate(CreateAccountErrorMsg_cs ,"cs" );
    return ele;
    }
	
	
	public static WebElement LoginEmailIDTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(LoginEmailIDTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement LoginPasswordTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(LoginPasswordTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement ForgotPasswordLink (WebDriver dr) throws InterruptedException{
        ele = Locate(ForgotPasswordLink_cs ,"cs" );
    return ele;
    }
	public static WebElement SignInBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(SignInBtn_cs ,"cs" );
    return ele;
    }
    
}
