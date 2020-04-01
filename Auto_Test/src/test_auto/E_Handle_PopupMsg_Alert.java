package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class E_Handle_PopupMsg_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		
		//Using id for first name
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		//xpath for clicking btn
		driver.findElement(By.xpath(".//button[@class='btn btn-default btn-lg' and @onclick='myConfirmFunction()']")).click();
		
		//Handling pop up using alert method
		Alert clickMe = driver.switchTo().alert();
		
		//to get Alert text
		System.out.println(clickMe.getText());
		
		//Accept alert
		//clickMe.accept();
		
		//Dismiss/cancel alert
		clickMe.dismiss();
	}

}
