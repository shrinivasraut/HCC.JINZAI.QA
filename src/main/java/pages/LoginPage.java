package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{

	TestBase testBase;
	HomePage homePage;
	public LoginPage() {
		super();
		PageFactory.initElements(driver, this);
		}
	
		//user name
			@FindBy(xpath="//input[@id='userid']")
			@CacheLookup
			WebElement userName;
			
		//password field
			@FindBy(xpath="//input[@id='password']")
			@CacheLookup
			WebElement password;
	
		//submit button
			@FindBy(xpath="	//button[@type='submit']")
			@CacheLookup
			WebElement submit;
	
	
		//Login function
			public HomePage loginJinzai() {
				
				userName.sendKeys(prop.getProperty("username"));
				password.sendKeys(prop.getProperty("password"));
				submit.click();
				return homePage;			
			}

}
