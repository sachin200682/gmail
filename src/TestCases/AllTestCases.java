package TestCases;

import org.testng.annotations.BeforeTest;

import Common.Common;
import Pages.Home;

import org.testng.annotations.*;

public class AllTestCases 
{
	@BeforeMethod
	
	public void openBrowserAndurl() 
		{
			Common.LaunchBrowserAndURL();
			System.out.println("Before Method run");
		}
	
	@Test
		public void ClickOnHomePages() throws InterruptedException
		{
		try{
			
		
			Pages.Home.ClickOnHomePage();
			Thread.sleep(2000);
			
			Pages.Testing.clickontesting();
			Thread.sleep(2000);
			
			Pages.Testing.ClickOnManual();
			Thread.sleep(2000);
			
			Pages.Home.ClickOnSAP();
			Thread.sleep(2000);
			
			
			System.out.println("@Test run");
		}	
		
		catch (Exception e)
		{
			System.out.println("Failed some steps here");
		}
		}
	
	@AfterMethod
		public void closebrowser() 
	{
			Common.closebrowser();
			System.out.println("After Method run");
	}
}
