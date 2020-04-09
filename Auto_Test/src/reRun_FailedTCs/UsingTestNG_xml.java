package reRun_FailedTCs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class UsingTestNG_xml {
	WebDriver driver;
	
	@Test()
	public void geckoBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bing.com/");
		System.out.println("Firefox driver");
		driver.quit();
}
	@Test()
	public void ieBrowser() throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("IE driver");
		driver.quit();
}


}
