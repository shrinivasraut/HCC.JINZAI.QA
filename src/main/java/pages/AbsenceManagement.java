package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class AbsenceManagement extends TestBase{

	public AbsenceManagement() {
		super();
		PageFactory.initElements(driver, this);	
	}
	HomePage homePage;
	LoginPage loginPage;
	Select oSelect;
	
	//today
	@FindBy(xpath="//div[@role='presentation']/following::span[text()='Today']")
	@CacheLookup
	WebElement today;
	
	//Schedule absence
	@FindBy(xpath="//button[text()='Schedule Absence']")
	@CacheLookup
	WebElement scheduleAbsence;
	
	// Type dropdown list
//	@FindBy(xpath="//input[@role='combobox']")
	@FindBy(xpath="//a[@id='pt1:atkfr1:0:r3:1:pt1:soc1::drop']")
	@CacheLookup
	WebElement typeDropDown;
	
	public void clickAbsence() {
		//scheduleAbsence.click();
		driver.findElement(By.xpath("//a[@title='Quick Actions']")).click();
		driver.findElement(By.xpath("//span[text()='Schedule Absence']")).click();
		System.out.println("on schedule absence page");	
	}
	public void selectDropdown(String absenceType) {
		System.out.println("inside select Dropdown function");
		typeDropDown.click();
		driver.findElement(By.xpath("//li[text()='Compassionate leave']"));
		System.out.println("about to select value");
		
		
	}

}
