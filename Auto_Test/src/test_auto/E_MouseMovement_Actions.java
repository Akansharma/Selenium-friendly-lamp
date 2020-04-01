package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class E_MouseMovement_Actions {

	public static void main(String[] args) throws InterruptedException {
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
		driver.get("https://www.spicejet.com/?utm_source=google&utm_medium=cpc&utm_campaign=spicejetbrandexact&gclid=CjwKCAiApOvwBRBUEiwAcZGdGCkQEXgY0-Z_m1QNgyd9_yEDc18POdHcQsHrRbVcN4azUKKlVu7sbxoC1HUQAvD_BwE");
		
		//using Actions class
		Actions addons=new Actions(driver);
		Thread.sleep(1000);
		addons.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();
		driver.findElement(By.linkText("Hot Meals")).click();
		

	}

}
