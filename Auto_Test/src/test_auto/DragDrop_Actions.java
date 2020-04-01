package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop_Actions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		
		//Using id for first name
		driver.get("https://jqueryui.com/droppable/");
		//switch to frame
		driver.switchTo().frame(0);
		
		//xpath drag
		WebElement from= driver.findElement(By.id("draggable"));
		//drop 
		WebElement to= driver.findElement(By.id("droppable"));
		
		//Mouse Actions
		Actions dnd=new Actions(driver);

		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		dnd.dragAndDrop(from, to).release().build().perform();
		
		String textTo=to.getText();
		
		if(textTo.equalsIgnoreCase("Dropped!")){
			System.out.println("PASS");
			}
		else{
			System.out.println("FAIL");
		}
		
		
	}

}
