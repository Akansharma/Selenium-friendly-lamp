package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class C_Dropdown_using_Select {

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
		driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=632489011649da9d6c26f92811ae14b1");
		
		//select value from dropdown using Select class
		Select country= new Select(driver.findElement(By.xpath(".//select[@name='country']")));
		
		//select using selectByVisibletext
		//country.selectByVisibleText("ANDORRA");
		
		//select using selectBIndex
		//country.selectByIndex(5);
		
		//select using selectByValue
		country.selectByValue("234");
				
		

	}

}
