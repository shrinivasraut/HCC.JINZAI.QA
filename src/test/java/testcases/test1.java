package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test1 {
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\Driver\\chromedriver.exe");
		System.out.println("launch chrome");
		driver = new ChromeDriver();
		driver.get("Google.com");
	}

}
