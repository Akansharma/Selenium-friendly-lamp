package googleTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest{
	
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1)
	public void getTitle(){
		//String eTitle="Google";
		String title= driver.getTitle();
		Assert.assertEquals(title, "Google123");
		
	}
	
	@Test(priority=2)
	public void testLogo(){
		boolean b= driver.findElement(By.xpath(".//img[@alt='Google']")).isDisplayed();
		Assert.assertTrue(b);
		System.out.println("Google logo");
	}
	
	@Test(priority=3)
	public void search(){
	WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement search;
	search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
	//driver.findElement(By.name("q")).sendKeys("Corona");
	//WebElement search;
   // WebDriverWait wait = new WebDriverWait(driver, 20);
   // search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@class='pR49Ae gsfi']")));
	search.sendKeys("Corona");
	search.submit();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	}
