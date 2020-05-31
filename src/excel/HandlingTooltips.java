package excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HandlingTooltips 
{
	@Test
	public void tooltip() 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		WebElement genderTooltip = driver.findElement(By.id("gender-help"));
		String tooltipText = genderTooltip.getAttribute("title");
		
		if(tooltipText.equalsIgnoreCase("click for more information"))
		{
			System.out.println(" tooltip matching expected value");
			genderTooltip.click();
		}
		
		else
		{
			System.out.println(" tooltip not matching expected value");
		}
	}
}
