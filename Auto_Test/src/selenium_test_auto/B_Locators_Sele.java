package selenium_test_auto;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/* locators are
 * id
 * name
 * classname
 * xpath
 * css selector
 * link text 
 * partial linktext
 * 
 */
public class B_Locators_Sele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the firefox driver
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				//maximize window
				driver.manage().window().maximize();
				
				// to delete all cookies
				driver.manage().deleteAllCookies();
				
				// to wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
				
				//Launch the webpage
				driver.navigate().to("http://leafground.com/pages/Link.html");
				
				//partial link text
				driver.findElement(By.partialLinkText("Home Page")).click();
				System.out.println("Homepage is clicked");
				
				//using linktext
				//driver.findElement(By.linkText("Go to Home Page")).click();
				//System.out.println("Homepage is clicked");
				
				//Using id for first name
				//driver.get("https://halfpricebooks.in/account/register");
				
				//using id for fn
				//driver.findElement(By.id("first_name")).sendKeys("Shivashankari");
				
				//Using xpath
				//driver.findElement(By.xpath("//input[@id='first_name']")); or driver.findElement(By.xpath("//*[@id='first_name']"));
				
				//Usingg xpath for last name
				//driver.findElement(By.xpath(".//*[@id='last_name']")).sendKeys("T");
				
				//using id for email
				//driver.findElement(By.id("email")).sendKeys("shivashankari.t38@wipro.com");
				
				//Using css selector for password click on the input tag and right click and select Copy Selector
				//driver.findElement(By.cssSelector("#create_password")).sendKeys("Pass@123");
				

	}

}
