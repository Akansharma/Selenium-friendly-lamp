package parallelTesting_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
WebDriver driver;

	@Test()
	public void chromeBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=cs_503_link/");
		System.out.println("Chrome driver");
		driver.quit();
	}
	
	@Test()
	public void geckoBrowser(){
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\geckodriver.exe");
		driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=cs_503_link/");
		System.out.println("Firefox driver");
		driver.quit();
}
	@Test()
	public void ieBrowser() throws InterruptedException{
		System.setProperty("webdriver.ie.driver", "C:\\Program Files (x86)\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ref=cs_503_link/");
		System.out.println("IE driver");
		driver.wait(1000);
		driver.quit();
}

}