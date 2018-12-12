package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.AbsenceManagement;
import pages.HomePage;
import pages.LoginPage;

public class AbsenceManagementTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TestBase testBase;
	AbsenceManagement absenceManagement;
		
	public AbsenceManagementTest() {
		super();
	}
	
	@BeforeMethod
	public void initiate()  {
	testBase=new TestBase();
	testBase.initialization();
	
	loginPage=new LoginPage();
	loginPage.loginJinzai();
	
	homePage=new HomePage();
	System.out.println("//now about to click Home");
	WebDriverWait wait=new WebDriverWait(driver,20);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='pt1:_UIShome']")));
	System.out.println("Wait complete");
	homePage.clickHome();
	//System.out.println("//about to open Absence management");

//	homePage.openAbsenceManagement();
	}
	
	@SuppressWarnings("null")
	@Test
	public void execute()
	{
		System.out.println("//about to open Absence management");
		WebDriverWait wait1=new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Absence Management']")));
		System.out.println("Wait Complete");
	//	homePage.openAbsenceManagement();
		absenceManagement=new AbsenceManagement();
			
		absenceManagement.clickAbsence();
		
		driver.findElement(By.id("pt1:atkfr1:0:r3:1:pt1:soc1::drop")).click();
		//absenceManagement.selectDropdown("Remote Working");
		
	}
	
	@AfterTest
	public void endTest() {
		
	}
	
}
