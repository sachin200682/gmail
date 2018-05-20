package Pages;

import org.apache.commons.logging.impl.Log4JLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Home extends Common.Common

{
	static WebElement ClickOnHomebutton, ClickOnTestingTab; 
	
  public static void ClickOnHomePage()
  
  {
	  driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[2]/ul/li[2]/a"));
  }

  public static void ClickOnTesting() 
  		{
	  		driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[2]/ul/li[3]/a/span")).click();
  		}
  public static void ClickOnSAP()
  {
	  driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[2]/ul/li[4]/a")).click();
  } 
  
    {
	  System.out.println("Completed Home Page");  
  }
  
  
}
