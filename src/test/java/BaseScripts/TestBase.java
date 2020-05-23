package BaseScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class TestBase extends ReportBase{
	
	public static WebDriver dr = null;
	public static Properties CG = null;
	
	@BeforeClass(alwaysRun = false)
	public static void Initialise() throws IOException 
		{
			System.out.println("==========================INITIALISATION STARTED==================================================");
			CG = new Properties();
			FileInputStream is = new FileInputStream ("C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\src\\test\\java\\config\\Config.Properties");
			CG.load(is);
			System.out.println(CG.getProperty("browser"));
			if (CG.getProperty("browser").equals("ff")) 
			{			
				System.out.println("Firefox Browser");
				dr = new FirefoxDriver();
				dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				dr.manage().window().maximize();
			}
			
			
			else if (CG.getProperty("browser").equals("ch")) 
			{
				System.out.println("Chrome Browser");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Windows\\Venkata-Workspace1\\myECommerceProject\\Drivers\\chromedriver.exe");
				dr = new ChromeDriver();
				System.out.println("CHROME Browser");
				dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
				dr.manage().window().maximize();
				 
			}
			System.out.println("==========================INITIALISATION DONE   ==================================================");
		}
	
	//THIS BELOW CODE IS TO HIGHLIGHT THE ELEMENT
		public static WebElement elementHighlight(WebElement element) throws InterruptedException 
		{
			for (int i=0; i<2; i++) 
			{
				JavascriptExecutor js = (JavascriptExecutor) dr;
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "border: 3px solid red;");
				Thread.sleep(50);
				js.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "");
			}
			return element;
		}
		
	//THIS BELOW CODE IS TO FIND THE VISIBLE OBJECT
		@SuppressWarnings("unused")
		public static WebElement Locate(String ky, String type) throws InterruptedException 
		{
			try
			{
				WebElement s = null;
				System.out.println(ky);
				System.out.println(type);
				switch (type) 
				{
					case "id": // FIND OBJECT BY ID
					List<WebElement> ele1 = getObjectListById(ky);
					int n1 = 0;
					for(int i=0; i<ele1.size(); i++) 
					{
						if (ele1.get(i).isDisplayed()) 
						{
							n1 = i;
						}
					}
					s = ele1.get(n1);
					break;
			
					case "xp": // FIND OBJECT BY XPATH
					List<WebElement> ele2= getObjectListByXpath(ky);
					int n2 = 0;
					for(int i=0; i<ele2.size(); i++) 
					{
						if (ele2.get(i).isDisplayed()) 
						{
							n2 = i;
						}
					}
					s = ele2.get(n2);
					break;
			
					case "cn": // FIND ELEMENT BY CLASS NAME
					List<WebElement> ele3= getObjectListByClassName(ky);
					int n3 = 0;
					for(int i=0; i<ele3.size(); i++) 
					{
						if (ele3.get(i).isDisplayed()) 
						{
							n3 = i;
						}
					}
					s = ele3.get(n3);
					break;
			
					case "lt": // FIND ELEMENT BY LINK TEXT
					List<WebElement> ele4= getObjectListByLinkText(ky);
					int n4 = 0;
					for(int i=0; i<ele4.size(); i++)
					{
						if (ele4.get(i).isDisplayed()) 
						{
						n4 = i;
						}
					}
					s = ele4.get(n4);
					break;
		
					case "pl": // FIND ELEMENT BY PARTIAL LINK TEXT
					List<WebElement> ele5 = dr.findElements(By.tagName("a"));
					int n5 = 0;
					for(int i=0 ; i<ele5.size() ; i++)
					{
						if(ele5.get(i).getAttribute("href").contains(ky))
						{
							n5=i;
			    	    }
						break;
					}
					s = ele5.get(n5);
					break;
			
					case "cs": //FIND ELEMENT BY CSS SELECTOR
					List<WebElement> ele6= dr.findElements(By.cssSelector(ky));
					int n6 = 0;
					for(int i=0; i<ele6.size(); i++) 
					{
						if (ele6.get(i).isDisplayed()) 
						{
							n6 = i;
						}
					}
					s = ele6.get(n6);
					break;
			
					case "on": //FIND ELEMENT BY OBJECT NAME
					List<WebElement> ele7= dr.findElements(By.name(ky));
					int n7 = 0;
					for(int i=0; i<ele7.size(); i++) 
					{
						if (ele7.get(i).isDisplayed()) 
						{
							n7 = i;
						}
					}
					s = ele7.get(n7);
					break;
				}
				System.out.println("Element found---"+ky);
				return elementHighlight(s);
			} 
			catch(Exception e)
			{
				System.out.println("Element not found---"+ky);
				System.out.println(e.getMessage());
				throw e;
			}
		}

	//THIS BELOW METHODS ARE TO FIND OBJECTS USING LIST
	public static List<WebElement> getObjectListById (String ky) 
	{
		return (List<WebElement>) dr.findElements(By.id(ky));
	}
	public static List<WebElement> getObjectListByClassName (String ky) 
	{
		return (List<WebElement>) dr.findElements(By.className(ky));
	}
    public static List<WebElement> getObjectListByLinkText (String ky) 
    {
		return (List<WebElement>) dr.findElements(By.linkText(ky));
	}
    public static List<WebElement> getObjectListByPartialLinkText (String ky) 
    {
		return (List<WebElement>) dr.findElements(By.partialLinkText(ky));
	}
    public static List<WebElement> getObjectListByXpath (String ky) 
    {
		return (List<WebElement>) dr.findElements(By.xpath(ky));
	}

}
