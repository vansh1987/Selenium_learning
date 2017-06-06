/**
 * 
 */
package com.insurance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Demo
 * POM model
 *This call will store all the locators and methods of login page
 */
public class LoginPage extends Data_Entry
{
	WebDriver driver;
	
	By email = By.name("email");
	By password = By.name("password");
	//By Login_button = By.xpath(".//*[normalize-space(@id)='app-layout']/div[1]/div/div[2]/div/div/div/div/form/div[5]/button");
	By Login_button = By.xpath("//button[contains(text(),'Login')]");
		
	public LoginPage(WebDriver driver) 
	{
		//super();
		this.driver = driver;
	}
	
	public void typeUserName()
	{
		//driver.findElement(email).sendKeys("fsd72133@jajxz.com");
		driver.findElement(email).sendKeys(Insurance_User_Email);
	}
	
	public void typePassword()
	{
		//driver.findElement(password).sendKeys("123456");
		driver.findElement(password).sendKeys(String.valueOf(Insurance_Password));
		
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(Login_button).click();
	}
	
}
