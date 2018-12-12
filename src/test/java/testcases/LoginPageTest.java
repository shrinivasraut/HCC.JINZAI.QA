package testcases;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
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
			
		loginPage.loginJinzai();
			
		homePage=new HomePage();
		homePage.clickHome();
		homePage.verifypagetitle();	
		
	}
	@AfterMethod
	public void endtest() {
	
		//driver.close();
	}
}
