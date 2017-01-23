package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Insurance_login 
{
	
	WebDriver driver = new FirefoxDriver();
	
	public void openurl()
	{
		driver.get("https://www.pocketclinik.com/login");
	}
	
	public void login() throws Exception
	{
		driver.findElement(By.name("email")).sendKeys("uhj68380@dsiay.com");
		Thread.sleep(6000);
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div[2]/div/div/div/div/form/div[4]/button")).click();
		Thread.sleep(3000);
	}
	
	public void clickinglinks(String str) throws Exception
	{
		driver.findElement(By.xpath(str)).click();
	}
	
	public void logout() throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div[1]/div/div/div/div/ul/li/a/div")).click();
		//driver.findElement(By.ByClassName.className("caret")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div[1]/div/div/div/div/ul/li/ul/li[2]/a")).click();
		Thread.sleep(3000);
		driver.quit();
	}
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\asd\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		Insurance_login i = new Insurance_login();
		i.openurl();
		i.login();
		i.clickinglinks(".//*[@id='app-layout']/div[1]/div/ul/li[1]/a");
		Thread.sleep(3000);
		i.clickinglinks(".//*[@id='app-layout']/div[1]/div/ul/li[2]/a");
		Thread.sleep(3000);
		i.clickinglinks(".//*[@id='app-layout']/div[1]/div/ul/li[3]/a");
		Thread.sleep(3000);
		i.clickinglinks(".//*[@id='app-layout']/div[1]/div/ul/li[4]/a");
		Thread.sleep(3000);
		i.clickinglinks(".//*[@id='app-layout']/div[1]/div/ul/li[5]/a");
		Thread.sleep(3000);
		i.logout();
		
	}

}
