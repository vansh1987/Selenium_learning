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
public class LoginPage 
{
	WebDriver driver;
	
	By email = By.name("email");
	By password = By.name("password");
	By Login_button = By.xpath(".//*[@id='app-layout']/div[1]/div/div[2]/div/div/div/div/form/div[5]/button");
	
	public LoginPage(WebDriver driver) 
	{
		//super();
		this.driver = driver;
	}
	
	public void typeUserName()
	{
		driver.findElement(email).sendKeys("bum28245@rcasd.com");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("123456");
	}
	
	public void clickOnSubmitButton()
	{
		driver.findElement(Login_button).click();
	}
	
}
