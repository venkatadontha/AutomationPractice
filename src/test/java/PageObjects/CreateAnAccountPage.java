package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import BaseScripts.FuncBase;

public class CreateAnAccountPage extends FuncBase{
	
	private static WebElement ele = null;
	
	
	private static String TitleRadioBtn_id = "id_gender1";
	private static String FirstNameTextBox_cs = "input#customer_firstname";
	private static String LastNameTextBox_cs = "input#customer_lastname";
	private static String EmailTextBox_cs = "input#email";
	private static String PasswordTextBox_cs = "input#passwd";
	private static String DOBDateDropDown_cs = "select#days";
	private static String DOBMonthDropDown_cs = "select#months";
	private static String DOBYearDropDown_cs = "select#years";
	private static String NewsLetterChkBox_cs = "input#newsletter";
	private static String SpecialOffersChkBox_cs = "input#optin";
	
	private static String AddrFirstNameTextBox_cs = "input#firstname";
	private static String AddrLastNameTextBox_cs = "input#lastname";
	private static String AddrCompanyTextBox_cs = "input#company";
	private static String AddrAddressLine1TextBox_cs = "input#address1";
	private static String AddrAddressLine2TextBox_cs = "input#address2";
	private static String AddrCityTextBox_cs = "input#city";
	private static String AddrStateDropDown_cs = "select#id_state";
	private static String AddrZipCodeTextBox_cs = "input#postcode";
	private static String AddrCountryDropDown_cs = "select#id_country";
	private static String AddrAdditionalInfoTextBox_cs = "textarea#other";
	private static String AddrHomePhoneTextBox_cs = "input#phone";
	private static String AddrMobilePhoneTextBox_cs = "input#phone_mobile";
	private static String AddrReferenceTextBox_cs = "input#alias";
	private static String RegisterBtn_cs = "button#submitAccount > span";
	
	
	public static WebElement TitleRadioBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(TitleRadioBtn_id ,"id" );
    return ele;
    }
	public static WebElement FirstNameTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(FirstNameTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement LastNameTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(LastNameTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement EmailTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(EmailTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement PasswordTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(PasswordTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement DOBDateDropDown (WebDriver dr) throws InterruptedException{
        ele = Locate(DOBDateDropDown_cs ,"cs" );
    return ele;
    }
	public static WebElement DOBMonthDropDown (WebDriver dr) throws InterruptedException{
        ele = Locate(DOBMonthDropDown_cs ,"cs" );
    return ele;
    }
	public static WebElement DOBYearDropDown (WebDriver dr) throws InterruptedException{
        ele = Locate(DOBYearDropDown_cs ,"cs" );
    return ele;
    }
	public static WebElement NewsLetterChkBox (WebDriver dr) throws InterruptedException{
        ele = Locate(NewsLetterChkBox_cs ,"cs" );
    return ele;
    }
	public static WebElement SpecialOffersChkBox (WebDriver dr) throws InterruptedException{
        ele = Locate(SpecialOffersChkBox_cs ,"cs" );
    return ele;
    }
	
		
	public static WebElement AddrFirstNameTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrFirstNameTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrLastNameTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrLastNameTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrCompanyTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrCompanyTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrAddressLine1TextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrAddressLine1TextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrAddressLine2TextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrAddressLine2TextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrCityTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrCityTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrStateDropDown (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrStateDropDown_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrZipCodeTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrZipCodeTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrCountryDropDown (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrCountryDropDown_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrAdditionalInfoTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrAdditionalInfoTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrHomePhoneTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrHomePhoneTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrMobilePhoneTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrMobilePhoneTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement AddrReferenceTextBox (WebDriver dr) throws InterruptedException{
        ele = Locate(AddrReferenceTextBox_cs ,"cs" );
    return ele;
    }
	public static WebElement RegisterBtn (WebDriver dr) throws InterruptedException{
        ele = Locate(RegisterBtn_cs ,"cs" );
    return ele;
    }
}
