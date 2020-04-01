package googleTest;

import org.testng.annotations.Test;

public class DependsOnMethod {
	
	@Test
	public void loginTest(){
		int i=9/0;
		System.out.println("Login test check :" +i);
	}

	@Test(dependsOnMethods="loginTest")
	public void HomepageTest(){
		System.out.println("Home page screen launch check");
	}
	
	@Test(invocationCount=10)
	public void Invocationcount(){
		int a=10;
		int b=10;
		int c=a+b;
		System.out.println(c);
	}
}
