package teaStore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Index 
{
	WebDriver driver = new FirefoxDriver();
	
	public void openUrl()
	{
		String baseurl = "http://www.practiceselenium.com/";
		driver.get(baseurl);
	}
	
	public void clickLink() throws Exception
	{
		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[1]/a")).click();;
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[4]/a")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[5]/a")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath(".//*[@id='wsb-nav-00000000-0000-0000-0000-000450914915']/ul/li[3]/a")).click();
		Thread.sleep(2000);
		
		
	}
	
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Demo\\Downloads\\geckodriver-v0.13.0-win64\\geckodriver.exe");
		Index i = new Index();
		i.openUrl(); 	
		i.clickLink();
	}

}
