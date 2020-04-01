package testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/*
 * Output be like before *
Set the system property file
Launch the Chrome browser
Enter the URL
login into the Application
Search
Logout from the Application
login into the Application
Google title test
Logout from the Application
Close te browser
Delete the cookies
PASSED: search
PASSED: titleTest

===============================================
    Default test
    Tests run: 1, Failures: 0, Skips: 0
===============================================

Generate testcase report

 */

public class TestNgBasics {
	
	//pre-conditions
	@BeforeSuite
	public void setUp(){
		System.out.println("Set the system property file");
	}
	
	@BeforeTest
	public void launchBrowser(){
		System.out.println("Launch the Chrome browser");
	}
	
	@BeforeClass
	public void enterURL(){
		System.out.println("Enter the URL");
	}
	
	@BeforeMethod
	public void login(){
		System.out.println("Login into the Application");
	}
	
	//Test cases
	@Test
	public void search(){
		System.out.println("Search");
	}
	
	@Test
	public void titleTest(){
		System.out.println("Google title test");
	}
	
	//Post condition
@AfterMethod
public void logout(){
	System.out.println("Logout from the Application");
}
@AfterClass
public void closeBrowser(){
	System.out.println("Close te browser");
	
}
@AfterTest
public void deleteAllCookies(){
	System.out.println("Delete the cookies");
}

@AfterSuite
public void generateReport(){
	System.out.println("Generate testcase report");
}
}
