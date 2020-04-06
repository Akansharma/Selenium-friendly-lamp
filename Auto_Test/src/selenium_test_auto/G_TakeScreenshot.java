package selenium_test_auto;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class G_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files (x86)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		
		//Using id for first name
		driver.get("https://www.google.com/");
		
		//takescreenshot interface used to takescreenshot
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//src/location where the screenshot is generated
		FileUtils.copyFile(src, new File("C:\\workspace\\Auto_Test\\src\\test_auto\\screens.jpg"));

	}

}
