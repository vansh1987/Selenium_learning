/**
 * 
 */
package com.insurance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Demo
 *
 */
public class VerifyOTP 
{

	/**
	 * @param args
	 */
	 WebDriver driver;
	
	public VerifyOTP(WebDriver driver) 
	{
		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public void verify_OTP() 
	{
		try
		{
		Thread.sleep(2000);
		driver.findElement(By.id("otp")).sendKeys("ab@9090");
		Thread.sleep(2000);
		driver.findElement(By.id("submit_otp")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void verify_Account()
	{
		try
		{
		driver.findElement(By.id("by_sms")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("verify_step_one")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
