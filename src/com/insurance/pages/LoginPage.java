/**
 * 
 */
package com.insurance.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Demo
 *
 *This call will store all the locators and methods of login page
 */
public class LoginPage 
{
	WebDriver driver;
	
	By Email = By.name("User_login");
	By Password = By.name("Password");
	By Login_button = By.className("btn btn-danger btn-block");
	
	public LoginPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(Email).sendKeys("bum28245@rcasd.com");
	}
	
	public void typePassword()
	{
		driver.findElement(Password).sendKeys("123456");
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(Login_button).click();
	}
	
}
