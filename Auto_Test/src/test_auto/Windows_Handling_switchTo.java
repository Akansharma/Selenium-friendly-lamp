package test_auto;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Handling_switchTo {

	public static void main(String[] args) {
		
		// Launch the firefox driver
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				// to delete all cookies
				driver.manage().deleteAllCookies();
				// to wait
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				//maximize window
				driver.manage().window().maximize();
				//launch the application
				driver.navigate().to("http://leafground.com/pages/Window.html");
				//Handle parent window
				String Parent=driver.getWindowHandle();
				//Parent indow
				WebElement parentWindow=driver.findElement(By.id("home"));
				parentWindow.click();
				//to handle child windows
			Set<String>	child= driver.getWindowHandles();
			
			//to iterate/switch to child window
			for (String childWindow : child) {
				driver.switchTo().window(childWindow);
				System.out.println("The child window title is : " +driver.switchTo().window(childWindow).getTitle());
			}

			WebElement buttonsBox= driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[2]/a"));
			buttonsBox.click();
			driver.close();
			//switchTo Parent/main window
			driver.switchTo().window(Parent);
			System.out.println("Switched to default content");
			
			//click on OpenMultiple Windows button
			WebElement openMultiWinutton= driver.findElement(By.xpath("//*[contains(text(),'Open Multiple Windows')]"));
			openMultiWinutton.click();
			int windowsSize= driver.getWindowHandles().size();
			System.out.println("Total number of windows opened are : "+windowsSize);
			
			//click color button Do not close me
			WebElement doNotCloseME= driver.findElement(By.id("color"));
			doNotCloseME.click();
			
			//child windows opened
			Set <String> child2=driver.getWindowHandles();
			
			//Iterate thru all windows using iterator
			Iterator<String> itr= child2.iterator();
			while(itr.hasNext()){
				String childNxt= itr.next();
				//check the parent and the child windows are not same
				if(!Parent.equalsIgnoreCase(childNxt)){
					System.out.println("The title of the pages are :" +driver.switchTo().window(childNxt).getTitle());
					driver.close();
					
				}
				
			}
	}
	}


