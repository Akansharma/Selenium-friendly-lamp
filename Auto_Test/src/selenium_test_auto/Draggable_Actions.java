package selenium_test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable_Actions {

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
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(0);
		
		WebElement draggable = driver.findElement(By.id("draggable"));
		
		Actions drag = new Actions(driver);
		drag.dragAndDropBy(draggable, 100, 100).build().perform();
		

		
	}

}
