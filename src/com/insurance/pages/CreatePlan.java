package com.insurance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CreatePlan 
{	
	WebDriver driver;
	String baseUrl;
	public CreatePlan(WebDriver driver,String baseUrl) 
	{
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.baseUrl = baseUrl;
	}

	public void clickOnPlan() throws Exception
	{
		
		driver.get(baseUrl + "/plan");
		Thread.sleep(3000);
		
	}
	
	public void createPlan() 
	{
		try
		{
		
		driver.get(baseUrl + "/plan/create");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[class='form-control']")).sendKeys("Silver Plan Three");
		Thread.sleep(2000);
				
		driver.findElement(By.name("copay[]")).sendKeys(String.valueOf(40));
		Thread.sleep(2000);
		
		driver.findElement(By.name("free_appointment[]")).sendKeys(String.valueOf(5));
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[3]/div[2]/div/div[1]/div/div/div[2]/div[3]/div/div/form/div/div[5]/button")).click();
		Thread.sleep(8000);
		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
