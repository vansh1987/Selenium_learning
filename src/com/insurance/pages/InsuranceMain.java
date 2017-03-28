package com.insurance.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InsuranceMain {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Demo\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		try
		{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://dev.pocketclinik.com/login");
		
		LoginPage l = new LoginPage(driver);
		l.typeUserName();
		l.typePassword();
		l.clickOnSubmitButton();
		Thread.sleep(3000);
		
		VerifyOTP v = new VerifyOTP(driver);
		v.verify_Account();
		v.verify_OTP();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
