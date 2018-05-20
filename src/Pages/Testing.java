package Pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testing extends Common.Common

{
	public static void clickontesting() 
	{
		Pages.Home.ClickOnTesting();
		String actual = "Selenium";
		String expected = driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[5]/div[1]/div/div[2]/ul/li[1]/a/span")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
	}
	
	public static void ClickOnManual() 
	{
		driver.findElement(By.xpath("//*[@id=\"maximenuck243\"]/div[5]/div[1]/div/div[1]/ul/li[1]/a/span")).click();
		String actual = "Learn Software Testing in 13 Days";
		String expected = driver.findElement(By.className("philadelphia-element-title-content")).getText();
		Assert.assertEquals(actual, expected);
		System.out.println(expected);
	}
	
	
}
