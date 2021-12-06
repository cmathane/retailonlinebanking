
package com.retail_Online_banking_1.test_case;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.helpers.Loader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.retail_Online_banking_1.pageObject.Login_Page;

public class TC_loginTest_001 extends BasicClass


// testcase content only test method
{

	
	@Test
	public void Atest() {
		driver.get(Youtube);
	}
	
	
	
	@Test
	public void  loginTest() throws IOException
	{
	
	 	driver.get(baseURL);
	 	
	    // Logger.info("url OPEN");
	    
	     Login_Page lp=new Login_Page(driver);
	    //driver.manage().timeouts().implicitlyWait(50, TimeUnit.MILLISECONDS);
	    WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until( ExpectedConditions.visibilityOfElementLocated(By.name("uid")));
        
	    lp.setUserName(username);
	   // Logger.info("USER NAME Added");

//screen shot
	    captureScreen(driver, "loginTest");
	    
	    
	    
	    lp.setpassword(password);
	   // Logger.info("Password added");
	    
	    lp.clickSubmit();
	    //Logger.info(" button Clicked");
	/*    
	    public static void sendKeys( WebDriver driver; WebElement element; int timeout; String value )
	    {
	    	new WebDriverWait(driver,timeout).until(ExpectedConditions.visibilityOf(element));
	    	element.sendKeys(value);
	    	
	    }
	    
	    */
	    
	    
	    if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) 
	    	{
	    		Assert.assertTrue(true);
	    	}
	    	
	    	else
	        {
	    
	    		Assert.assertFalse(false);
	        }
	
	
	
	
	}	
}
