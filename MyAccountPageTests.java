package com.test1.tests;

import org.testng.annotations.Test;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyAccountPageTests {
	  
	public WebDriver myWebDriver;
	JavascriptExecutor js;
	
	@BeforeSuite
	public void initializeBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\dev\\Libs\\chromedriver_win32\\chromedriver.exe");
		myWebDriver =new ChromeDriver();
		js = (JavascriptExecutor)myWebDriver;
	}
	
	@BeforeClass
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
	 }

	@BeforeTest
	public void fnLaunchApp(){
		myWebDriver.get("http://newtours.demoaut.com");
		String DomainName = js.executeScript("return document.domain;").toString();			
	     System.out.println("Domain name of the site = "+DomainName);
		  
		//Creating the JavascriptExecutor interface object by Type casting		
        		
        		
	}
  @Test
  public void fnLogin() {
	 
	  WebElement button=myWebDriver.findElement(By.name("login"));
	  myWebDriver.findElement(By.name("userName")).sendKeys("tutorial");
	  myWebDriver.findElement(By.name("password")).sendKeys("tutorial");
	 //myWebDriver.findElement(By.name("login")).click();
	  js.executeScript("arguments[0].click();", button);
	  js.executeScript("alert('Welcome to New Tours');"); 
	  
  }
}
