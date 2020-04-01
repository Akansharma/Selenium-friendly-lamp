package dataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelAuto {

	WebDriver driver;
	
@BeforeMethod()
public void SetUp(){
	
	driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/mercuryregister.php?osCsid=632489011649da9d6c26f92811ae14b1");
}

@DataProvider()
public void getTestData(){
	
	
}

@Test
public void MercuryTours(){
	driver.findElement(By.name("firstName")).clear();
	driver.findElement(By.name("firstName")).sendKeys("John");
	
	driver.findElement(By.name("lastName")).clear();
	driver.findElement(By.name("firstName")).sendKeys("Joe");
	
	driver.findElement(By.name("phone")).clear();
	driver.findElement(By.name("phone")).sendKeys("9994567831");
	
	driver.findElement(By.name("userName")).clear();
	driver.findElement(By.name("userName")).sendKeys("sh@gmail.com");
	
	driver.findElement(By.name("address1")).clear();
	driver.findElement(By.name("address1")).sendKeys("123, cross street");
	
	driver.findElement(By.name("city")).clear();
	driver.findElement(By.name("city")).sendKeys("Coimbatore");
	
	driver.findElement(By.name("state")).clear();
	driver.findElement(By.name("state")).sendKeys("Tamil Nadu");
	
	driver.findElement(By.name("postalCode")).clear();
	driver.findElement(By.name("postalCode")).sendKeys("641214");
	
	Select select = new Select(driver.findElement(By.name("country")));
	select.selectByVisibleText("TOGO");
    System.out.println(select);
    
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("sh@gmail.com");
    
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("sh123!");
	
    driver.findElement(By.name("confirmPassword")).clear();
    driver.findElement(By.name("confirmPassword")).sendKeys("sh123!");
	
}


@AfterMethod()
public void tearDown(){
	driver.quit();
}

}
