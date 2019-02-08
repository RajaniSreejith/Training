package com.test;
import com.pages.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest {
	
	WebDriver driver;
    public static String welcomeMessage;
    static String baseUrl = "http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/" ; 
    com.test.LoginTest LoginTest=new LoginTest();
    HomePage hpage;
    LoginPage lpage=null ;
    String strUserName ="Admin";
    String strPassword="admin123";
    
    @BeforeMethod
	public void setUp(){
    	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
    	driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.get(baseUrl);
		hpage=new HomePage(driver);
		 lpage=new LoginPage(driver);
	}
    
    
    @Test
	public void testHomePage() throws InterruptedException	{   
    	lpage.EnterUserName(strUserName);
		lpage.Enterpassword(strPassword);
		lpage.clickLogin();
		Thread.sleep(5000);
    	Assert.assertEquals(hpage.getWelcomeMessage(),"Welcome Robert!!!");
	}
    
    @AfterMethod
	public void closeBrowser(){
    	driver.quit();
    	
    }

}
