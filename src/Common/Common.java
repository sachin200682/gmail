package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Test.*;

public class Common 
{
	public static WebDriver driver;
	
  public static void LaunchBrowserAndURL() 
  {
		String driverpath = "F:\\Eclipse_Workspaces\\GmailTestNG\\Drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
  }
	public static void closebrowser() 
	{
		driver.close();
	}
  
}
	

