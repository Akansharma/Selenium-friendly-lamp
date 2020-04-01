package test_auto;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F_FileDownload {

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
		driver.navigate().to("http://leafground.com/pages/download.html");
		
		WebElement excel=driver.findElement(By.linkText("Download Excel"));
		excel.click();
		
		File fileLocation = new File("C:\\Users\\NISHA\\Downloads");
		File[] totalFiles=fileLocation.listFiles();
		for (File file : totalFiles) {
			if(file.getName().equalsIgnoreCase("testleaf.xlsx"));
			System.out.println("File successfully downloaded");
			break;
		}
	}

}
