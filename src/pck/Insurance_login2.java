package pck;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@SuppressWarnings("unused")
public class Insurance_login2 
{
	
	WebDriver driver = new FirefoxDriver();
	
	public void openurl() throws Exception
	{
		driver.get("https://dev.pocketclinik.com/logind/28");
		Thread.sleep(4000);
	}
	/*
	public void login() throws Exception
	{
		driver.findElement(By.name("email")).sendKeys("wsa33047@psoxs.com");
		Thread.sleep(6000);
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[1]/div/div[2]/div/div/div/div/form/div[4]/button")).click();
		Thread.sleep(3000);
	}
	*/
	public void clickinglinks(String str) throws Exception
	{
		driver.findElement(By.xpath(str));
	}
	
	public void clickOnPlan() throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div/ul/li[2]/a")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div[2]/div/div[1]/div/div/h2/span/a")).click();
		//Thread.sleep(3000);
	}
	
	public void createPlan() throws Exception
	{
	
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div/ul/li[2]/a")).click();
		//driver.findElement(By.className("active")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.className("pull-right")).click(); //Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[4]/div[2]/div/div[1]/div/div/h2/span/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[4]/div[2]/div/div[1]/div/div/div[2]/div[3]/div/div/form/div/div[2]/div[1]/div/input")).sendKeys("Deal");

		//driver.findElement(By.className("form-control")).sendKeys("New Plan");
		
		driver.findElement(By.name("copay[]")).sendKeys(String.valueOf(50));
		Thread.sleep(2000);
		driver.findElement(By.name("free_appointment[]")).sendKeys(String.valueOf(5));
		Thread.sleep(2000);
		//driver.findElement(By.className("btn btn-primary btn-filter")).click();
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[3]/div[2]/div/div[1]/div/div/div[2]/div[3]/div/div/form/div/div[5]/button")).click();
		Thread.sleep(8000);
	}
	
	public void logout() throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div[1]/div/div/div/div/ul/li/a/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//*[@id='app-layout']/div[2]/div[1]/div/div/div/div/ul/li/ul/li[2]/a")).click();
	}
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Demo\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		Insurance_login2 i = new Insurance_login2();
		i.openurl();
		//i.login();
		//i.clickOnPlan();
		i.createPlan();
		i.logout();
	}

}
