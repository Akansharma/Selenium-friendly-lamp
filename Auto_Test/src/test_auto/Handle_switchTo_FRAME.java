package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class Handle_switchTo_FRAME {

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
		driver.get("https://chercher.tech/practice/frames");
		//to get the webpage title
		String webPage_title=driver.getTitle();
		System.out.println("Webpage main title :" +webPage_title);
		//To print the text Frames Examples
		String title= driver.findElement(By.xpath("//h1[contains(text(),'Frames Examples')]")).getText();
		System.out.println("The title of the page is : "+title);
		//Another xpath for below is xpath = //label/span
String printText= driver.findElement(By.xpath("//span[contains(text(),'Not a Friendly Topic')]")).getText();
System.out.println("Text appers as : "+printText);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//to switch to frame
//using id
driver.switchTo().frame("frame1");

//using name
//driver.switchTo().frame("iamframe");

//using index
//driver.switchTo().frame(0);

//using element
//WebElement iFrame1= driver.findElement(By.xpath("//iframe[@id='frame1']"));
//driver.switchTo().frame(iFrame1);

//send text in textbox
driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Animals");
//using id
driver.switchTo().frame("frame3");
Thread.sleep(1000);
//click checkbox xpath=.//input[@type='checkbox']
WebElement checkbox= driver.findElement(By.id("a"));
checkbox.click();
//Sitch to page
driver.switchTo().defaultContent();
//next frame
driver.switchTo().frame("frame2");
Select dropdown = new Select(driver.findElement(By.id("animals")));
dropdown.selectByIndex(2);
//swwitch to page
driver.switchTo().defaultContent();

driver.findElement(By.xpath("//input[@type='text']")).clear();


	}

	}


