package com.retail_Online_banking_1.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import com.retail_Online_banking_1.test_case.BasicClass;

public class Login_Page extends BasicClass {
	
	
	//WebDriver driver = new ChromeDriver();
	// add page factory
	// log   
	
	
	
	
	WebDriver ldriver;
	

	public Login_Page(WebDriver rdriver)
	{ 
	ldriver=rdriver;
	PageFactory.initElements(rdriver, this);
	}
	
	


	// find element
	@CacheLookup
	WebElement txtusername =driver.findElement(By.name("uid"));
	@CacheLookup
	WebElement password = driver.findElement(By.name("password")) ;
	@CacheLookup
	WebElement btnLogin = driver.findElement(By.name("btnLogin")) ;

	
	
	//Action
	public void setUserName(String uname) {
		txtusername.sendKeys(uname);
	}
	public void setpassword(String pwd) {
		txtusername.sendKeys(pwd);
	}
	public void clickSubmit() {
		btnLogin.click();
	}
	

		
	}
	
	

