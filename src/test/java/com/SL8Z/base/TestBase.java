package com.SL8Z.base;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.events.*;
import org.testng.annotations.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.SL8Z.utility.Xls_Reader;


public class TestBase {
	
	
	public static Properties config = null;
	public static Properties OR = null;
	public static WebDriver wbDv = null;
	public static EventFiringWebDriver driver = null;
	public static Xls_Reader datatable = null;
	public static boolean loggedIn = false;
	
	
	@BeforeSuite
	public void initialize(){
		
		// loading all the configuration values
		try{
			config = new Properties();
			FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\SL8Z\\config\\config.properties");
			config.load(fp);
			
			// loading Objects Repositories
			OR = new Properties();
			fp = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\com\\SL8Z\\config\\OR.properties");
			OR.load(fp);
			
			datatable = new Xls_Reader(System.getProperty("user.dir")+"\\src\\test\\java\\com\\SL8Z\\xls\\Controller.xlsx");
			
			 // checking the type of browser
			if(config.getProperty("browserType").equalsIgnoreCase("Firefox")){
				
				wbDv = new FirefoxDriver();
				
			}else if(config.getProperty("browserType").equalsIgnoreCase("IE")){
				
				//wbDv = new InternetExplorerDriver();
				System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\IE\\IEDriverServer.exe");
				DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();
				ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				wbDv = new InternetExplorerDriver(ieCapabilities);
			}
			else if(config.getProperty("browserType").equalsIgnoreCase("Chrome")){
				/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
				DesiredCapabilities Ch = DesiredCapabilities.chrome();
				//Ch.setCapability("chrome.binary", "\"C:\\Users\\i\\workspace\\SL8Z-Project-Testng\\chrome\"");
				wbDv = new RemoteWebDriver(new URL("http://107.22.190.41:4444/wd/hub"),Ch);*/

				/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chrome\\chromedriver.exe");
				wbDv = new ChromeDriver();*/
				
				wbDv=new HtmlUnitDriver(BrowserVersion.CHROME);

				}
			
             driver = new EventFiringWebDriver(wbDv);
			
			// putting an implicit wait after every Action or Event
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// opening the browser
			driver.manage().window().maximize();
			
		}catch(Exception e){
			
			e.printStackTrace();
		}
	}
	
	@BeforeTest
	public void clearCookies(){
		
					driver.manage().deleteAllCookies();            
	}
	
	
	public static WebElement getObject(String xpathKey){
		
		// Initialize the xpath and Checking the type of the locator
		String strXpath = OR.getProperty(xpathKey);
		
		if(strXpath.startsWith("//")){
			
			return driver.findElement(By.xpath(OR.getProperty(xpathKey).trim()));
		
			
		}else{
			
			return driver.findElement(By.cssSelector(OR.getProperty(xpathKey).trim()));
		}
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{		
		driver.quit();	
	}

}
