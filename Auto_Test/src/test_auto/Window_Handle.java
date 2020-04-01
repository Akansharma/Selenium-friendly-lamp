package test_auto;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://www.naukri.com/
		// Launch the firefox driver
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// to delete all cookies
		driver.manage().deleteAllCookies();
		// to wait
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//maximize window
		driver.manage().window().maximize();
		
		//Using id for first name
		driver.get("https://www.naukri.com/");
		
		//handle Windows using Window handles
		String parent= driver.getWindowHandle();
		
		//Store all windows using Set
		Set<String> windows= driver.getWindowHandles();
		
		//Iterate thru all windows using iterator
		Iterator <String> itr=windows.iterator();
		while(itr.hasNext())
		{
			String child=itr.next();
			
			//Here we compare parent window not equal to child window
			if(!parent.equalsIgnoreCase(child)){
				
				driver.switchTo().window(child);
				System.out.println("The child window title is :" + driver.switchTo().window(child).getTitle());
				driver.close();
				
			}
		}
//once all the child windows are closed now switch to Parent window
String title= driver.switchTo().window(parent).getTitle();
System.out.println(title);

		
	}

}
