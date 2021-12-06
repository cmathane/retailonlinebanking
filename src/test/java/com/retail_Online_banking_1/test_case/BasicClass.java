package com.retail_Online_banking_1.test_case;






import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.retail_Onlilne_banking_1.utilities.ReadConfig;

public class BasicClass {
	
	


	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL=readconfig.getApplicationUrl();
	
	public String username=readconfig.getUsername();
	
	public String password= readconfig.getPassword();
	public String Youtube= readconfig.getYoutube();
	
	
    public static WebDriver driver;
	public static Logger Logger;
			
			@Parameters("browser")
			@BeforeClass
			
			public void setup(String br)
			{
				// plz check why read config is not working for chrome path 
				
				System.setProperty("webdriver.chrome.driver","F:\\autamation test engineer\\javaworkspace\\retail_Online_banking_1\\Driver\\chromedriver1.exe");
				
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				
//	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			
// add logger object
				Logger logger= Logger.getLogger("retail_Online_banking_1");
				PropertyConfigurator.configure("Log4j.Properties");
			
			if (br.equals("Chrome"))
			
			{	System.setProperty("webdriver.chrome.driver","F:\\autamation test engineer\\javaworkspace\\retail_Online_banking_1\\Driver\\chromedriver1.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
				
			}
			else if (br.equals("firefox"))
				
			{	System.setProperty("webdriver.gecko.driver","F:\\autamation test engineer\\javaworkspace\\retail_Online_banking_1\\Driver\\geckodriver.exe");
			
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
				
			}
           else if (br.equals("ie"))
				
			{	System.setProperty("webdriver.ie.driver","F:\\autamation test engineer\\javaworkspace\\retail_Online_banking_1\\Driver\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
				
			}
			
			
			}
			
           @AfterClass
           public void tearDown()
           {
        	   driver.quit();
           }
           
       	public void captureScreen(WebDriver driver, String tname) throws IOException {
    		TakesScreenshot ts = (TakesScreenshot) driver;
    		File source = ts.getScreenshotAs(OutputType.FILE);
    		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
    		FileUtils.copyFile(source, target);
    		System.out.println("Screenshot taken");
    	}
       	public String randomestring()
    	{
    		String generatedstring=RandomStringUtils.randomAlphabetic(8);
    		return(generatedstring);
    	}
    	
    	public static String randomeNum() {
    		String generatedString2 = RandomStringUtils.randomNumeric(4);
    		return (generatedString2);
    	}
    	
    	
}
