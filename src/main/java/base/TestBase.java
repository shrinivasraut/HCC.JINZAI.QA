package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import junit.extensions.TestSetup;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	
				public TestBase() {
				//constructor
				prop=new Properties();
				String filePath=System.getProperty("user.dir")+"//src//main//java//config//config.properties";
						try {
							FileInputStream fifo=new FileInputStream(filePath);
							prop.load(fifo);
						} catch (FileNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
			
	
			public void initialization() {
							String browser=prop.getProperty("browser");
							System.out.println("initilization started");
							if(browser.equals("IE")) {
								System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//Driver//IEDriverServer.exe");
								driver= new InternetExplorerDriver();				
							}else if (browser.equals("mozila")) {
								System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
								driver=new FirefoxDriver();
							}else if (browser.equals("chrome")) {
								System.out.println("chrome selected");
								//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
								//driver=new ChromeDriver();
								System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
								driver = new ChromeDriver();
							}
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get(prop.getProperty("url"));
		
				}
			
}
