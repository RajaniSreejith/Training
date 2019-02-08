package com.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;

import com.pages.*;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	String strUserName ="Admin";
    String strPassword="admin123";
    static String errorMessage;
    public static String baseUrl = "http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/" ;
    
    LoginPage lpage=null ;
		@BeforeMethod
		public void setUp(){
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
			 driver.get(baseUrl);
		 lpage=new LoginPage(driver);
			 
		}
    
    @Test
		public void testLoginPage() {
			lpage.EnterUserName(strUserName);
			lpage.Enterpassword(strPassword);
			lpage.clickLogin();
			// fill the code
			 
		
		}
    @AfterMethod
	public void closeBrowser(){
    	driver.quit();
    	
    }

	}


