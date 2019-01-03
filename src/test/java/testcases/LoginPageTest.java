package testcases;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

@SuppressWarnings("unused")
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
	
	@Test(groups = { "UAT"})
	public void loginJinzai()
	{
		loginPage=new LoginPage();		
		homePage=new HomePage();
		loginPage.loginJinzai();
		System.out.println("now click Home page");
		WebDriverWait wait1=new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='pt1:_UIShome']")));
		System.out.println("Wait Complete");
		homePage.clickHome();
		homePage.verifypagetitle();	
		
	}
	@AfterMethod
	public void endtest() {
	
		driver.close();
	}
}
