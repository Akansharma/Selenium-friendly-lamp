package selenium_test_auto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_DataTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//get the list  of columns
		List<WebElement> columns= driver.findElements(By.tagName("th"));
		
		//get the number of columns available 
		int columnCount = columns.size();
		System.out.println("Number of COLUMNS in the table is : "+columnCount);
		
		//get the number of row counts
		List <WebElement> rows=driver.findElements(By.tagName("tr"));
		int rowCount= rows.size();
		System.out.println("Number of ROWS in the table is : "+rowCount);
		
		//to get the percent value for Learn to interact with Elements
		//xpath of 80 % .//td[contains(text(),'Learn to interact with Elements')]//following::td[1] -----> this will also work
		WebElement getPercent= driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percentText= getPercent.getText();
		System.out.println("The % value of 'Learn to interact with Elements' is : "+percentText);
		
		//store all the second column rows in a list
		List<WebElement> allProgress= driver.findElements(By.xpath("//td[2]"));
		
		//storing all the Progress values in list
		List<Integer> percentlist= new ArrayList<Integer>();
		
		for(WebElement individualPercents : allProgress){
			//getting texts of all Progress values
			String ProgressPercent = individualPercents.getText().replace("%", "");
			
			//adding the Progress values to the ArrayList
			  percentlist.add(Integer.parseInt(ProgressPercent));
		}
		
		  System.out.println("The number of Progress percentage value is "+percentlist);
		  //to get the min value from the list
		 int lowestProgresspercent= Collections.min(percentlist);
		 System.out.println("The vital task for the least completed progress :" +lowestProgresspercent);
		 
		 //to check the box
		 String smallPercent = Integer.toString(lowestProgresspercent)+"%";
		 System.out.println(smallPercent);
		 String finalXpath = "//td[normalize-space()="+"\""+smallPercent+"\"]//following::td[1]";
		 System.out.println(finalXpath);
	
		 WebElement check = driver.findElement(By.xpath(finalXpath));
		 check.click();
	}
}
