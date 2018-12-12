package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{
	TestBase testBase;
	LoginPage loginPage;
	
	public HomePage() {
		super();
		PageFactory.initElements(driver, this);
	}
		
	//user name
		@FindBy(xpath="//span[text()='Welcome to the Jinzai and HiQ Portal!']")
		@CacheLookup
		public
		WebElement HomePageTitle;
		//Home Click
		@FindBy(xpath="//a[@id='pt1:_UIShome']")
		@CacheLookup
		public WebElement Homeclick;
		
	//absence Management
		//@FindBy(xpath="//a[text()='Absence Management']")
		@FindBy(xpath="//div[@title='Absence Management']")
		@CacheLookup
		WebElement absenceManagement;
		
		public void clickHome() {
			System.out.println("FUnction executed");
		//driver.findElement(By.xpath("//a[@id='pt1:_UIShome']")).click();
		Homeclick.click();
			
		}
		
		public void verifypagetitle() {
			assertEquals(HomePageTitle.getText(),"Welcome to the Jinzai and HiQ Portal!");
		}
		
		public void openAbsenceManagement() {
			System.out.println("in function openAbsence Management");
			driver.findElement(By.xpath("//div[@title='Absence Management']")).click();
	//		absenceManagement.click();	
		}
}
