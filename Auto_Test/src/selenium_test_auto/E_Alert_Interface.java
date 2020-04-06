package selenium_test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_Alert_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		// maximize window
		driver.manage().window().maximize();
		// launch to the webpage
		driver.navigate().to("http://leafground.com/pages/Alert.html");
		
		// alert box element xpath
		WebElement alertbox = driver.findElement(By.xpath("//button[@onclick='normalAlert()']"));
		// click alert
		alertbox.click();
		// Handle Alert using alert interface
		Alert alert = driver.switchTo().alert();
		alert.accept();
		

		//alert to dismiss
		WebElement alertBox2=driver.findElement(By.xpath("//button[@onclick='confirmAlert()']"));
		alertBox2.click();
		Alert alert2=driver.switchTo().alert();
		alert2.dismiss();
		System.out.println(alert2.getText());
		
		//prompt textbox
		WebElement promptAlertbox=driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']"));
		promptAlertbox.click();
		Alert promptAlert=driver.switchTo().alert();
		promptAlert.sendKeys("Practice");
		promptAlert.accept();
		promptAlert.getText();
	}

}
