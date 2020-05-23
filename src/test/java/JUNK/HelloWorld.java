package JUNK;

import org.testng.annotations.*;

public class HelloWorld {
	
		
	@Test(priority=1)
	public void LaunchBrowser()
	{
		
		System.out.println("Step - 1 : Launching the Browser");
		
	}
	
	@Test(priority=2)
	public void LaunchApplication()
	{
		System.out.println("Step - 2 : Launching the Application");
	}

	@Test(priority=3)
	public void login()
	{
		System.out.println("Step - 3 : Logging into the Application");
	}
	
	@Test(priority=4)
	public void Logout()
	{
		System.out.println("Step - 4 : Logging out from Application");
	}
}
