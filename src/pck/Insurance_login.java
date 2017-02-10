package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insurance_login 
{
	
	WebDriver driver = new FirefoxDriver();
	
	public void openurl()
	{
		driver.get("https://dev.pocketclinik.com/login");
	}
	
	public void login() throws Exception
	{
		driver.findElement(By.name("email")).sendKeys("wsa33047@psoxs.com");
		Thread.sleep(6000);
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div[2]/div/div/div/div/form/div[4]/button")).click();
		Thread.sleep(3000);
	}
	
	public void clickinglinks(String str) throws Exception
	{
		driver.findElement(By.xpath(str));
	}
	
	public void logout() throws Exception
	{
		driver.findElement(By.className(".//*[@id='app-layout']/div[2]/div[1]/div/div/div/div/ul/li/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div[1]/div/div/div/div/ul/li/ul/li[2]/a")).click();
	}
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Demo\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		Insurance_login i = new Insurance_login();
		i.openurl();
		i.login();
		i.logout();
	}

}
