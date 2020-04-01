package parameterization_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_annotation {
	
WebDriver driver;
	
	@BeforeMethod
	@Parameters({"URL"})
	public void launchBrowser(String URL){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
	}
	
	@Test(priority=1)
	@Parameters({"title"})
	public void getTitle(String title){
		//String eTitle="Google";
		String title1= driver.getTitle();
		Assert.assertEquals(title1,title);
		
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}

}
