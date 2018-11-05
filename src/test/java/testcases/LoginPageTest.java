package testcases;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase{
	TestBase testBase;
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		// TODO Auto-generated constructor stub
		super();
		
	}
	@BeforeMethod
	public void setup()
	{   System.out.println("inside setup");
		testBase =new TestBase();	
		
		testBase.initialization();
		System.out.println("inside setup+1");
		loginPage= new LoginPage();
				
	}
	
	@Test
	public void loginJinzai()
	{
			
		homePage= loginPage.loginJinzai();
				
	}
	@AfterMethod
	public void endtest() {
		driver.close();
	}
}
