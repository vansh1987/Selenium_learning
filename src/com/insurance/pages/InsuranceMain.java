package com.insurance.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InsuranceMain extends Data_Entry 
{

	public static void main(String[] args) 
	{
		//String baseUrl = "https://dev.pocketclinik.com";
		int id_number = 4;
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Demo\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		//or
		System.setProperty("webdriver.firefox.driver", "geckodriver.exe");
		try
		{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl + "/login?t=" + id_number);
		
		LoginPage l = new LoginPage(driver);
		l.typeUserName();
		l.typePassword();
		l.clickOnSubmitButton();
		Thread.sleep(3000);
		
		VerifyOTP v = new VerifyOTP(driver);
		v.verify_Account();
		v.verify_OTP();
		Thread.sleep(2000);
		
		CreatePlan c = new CreatePlan(driver, baseUrl);
		c.clickOnPlan();
		c.createPlan();
		
		LogoutPage lp = new LogoutPage(driver);
		lp.Logout();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
