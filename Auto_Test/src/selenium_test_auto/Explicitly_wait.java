package selenium_test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitly_wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		
		//Using id for first name
		driver.get("https://www.facebook.com/");
		
		 //to perform Scroll down on application using  Selenium
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,250)", "");
		 
		 //scroll up on application using  Selenium
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,-250)", "");
//		
		//scroll ottom using javascript executor
//		 JavascriptExecutor js = (JavascriptExecutor) driver;
//		 js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		 
		 //webelements
		ClickOn(driver,driver.findElement(By.xpath("//a[@class='_8esh']")),10);
		ClickOn(driver,driver.findElement(By.linkText("Sign Up")),10);
	}
		
		//Explicit wait
//		WebDriverWait wait=(WebDriverWait) new WebDriverWait(driver,20);
//		wait.ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='u_0_b']")));
//		driver.findElement(By.xpath("//input[@id='u_0_b']")).click();
		
		//ANother way
		
	public static void ClickOn(WebDriver driver, WebElement findElement,int timeout)
	{
		new WebDriverWait(driver,timeout).ignoring(NoSuchElementException.class).until(ExpectedConditions.elementToBeClickable(findElement));
		findElement.click();
	}

}

