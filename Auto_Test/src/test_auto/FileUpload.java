package test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FileUpload {

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
		driver.get("http://the-internet.herokuapp.com/upload");
		driver.findElement(By.cssSelector("#file-upload")).sendKeys("C:\\Users\\NISHA\\Desktop\\Test.docx");
			

	}

}
