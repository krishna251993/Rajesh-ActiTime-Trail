package com.ActitimeTrial.TestrCases;


import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.ActitimeTrial.Utilities.ReadConfig;
import com.beust.jcommander.Parameter;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;


public class BaseClass {
	
	
	ReadConfig readconfig= new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
	

    public String username=readconfig.getUsername();

	
	public String password=readconfig.getPassword();
	public static WebDriver driver;
	
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br) {
		
		logger=logger.getLogger("ActitimeTrial");
		PropertyConfigurator.configure("Log4j.properties");
		
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		
		else if(br.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
			
		
		else{
			System.out.println("unknown browser capablitie");
		}
		
	
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
	

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
	public String setRandomString() {
		return RandomStringUtils.randomAlphabetic(8);
		
		
	}
	
}
