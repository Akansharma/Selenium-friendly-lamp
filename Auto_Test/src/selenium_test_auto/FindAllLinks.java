package selenium_test_auto;

 import org.openqa.selenium.By;
 
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
 
public class FindAllLinks {
 
 public static void main(String[] args) {
 
	 System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setCapability("marionette", true);
		@SuppressWarnings("deprecation")
		WebDriver driver = new ChromeDriver(capabilities);
		
 
 driver.get("https://toolsqa.com/");
 
 java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
 
 System.out.println(links.size());
 
 for (int i = 1; i<=links.size(); i=i+1)
 
 {
 
 System.out.println(links.get(i).getText());
 
 }
 
 }
 
}
