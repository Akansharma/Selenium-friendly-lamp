package selenium_test_auto;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class A_LaunchApp_Sele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Launch the firefox driver
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files (x86)\\geckodriver.exe");
	
		WebDriver driver = new FirefoxDriver();
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		//get current url
		String url = driver.getCurrentUrl();
		System.out.println("Current url is :" +url);
		
		//get page source
		/*String pagesrc=driver.getPageSource();
		System.out.println("The page source is : "+pagesrc);*/
		
		// get title
		String title = driver.getTitle();
		System.out.println("The app tile is : " + title);

		// validation check
		if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))

		{
			
System.out.println("Correct browser is launched");

		}
else 
{
	System.out.println("Title Mismatch");
}
		
		driver.quit();
		}

}
