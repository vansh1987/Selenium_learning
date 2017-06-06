package com.insurance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage 
{
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void Logout() throws Exception
	{
		//driver.findElement(arg0)
		driver.findElement(By.cssSelector("input[class = userName pl-5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[class = logout']")).click();
		Thread.sleep(2000);
	}
}
