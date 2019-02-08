package com.test;
import org.testng.annotations.Test;
import org.testng.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import com.pages.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyProfileTest {
	
	
    WebDriver driver;
    public static String name;
    static String baseUrl = "http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/" ;
    com.test.LoginTest LoginTest=new LoginTest();
  
    String strUserName ="Admin";
    String strPassword="admin123";
    LoginPage lpage=null ;
    HomePage hpage=null;
   MyProfilePage ppage=null;
	@BeforeMethod
	public void setUp(){
	//	 driver = new FirefoxDriver();
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
	    	driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		 driver.get(baseUrl);
		 lpage=new LoginPage(driver);
		 ppage=new MyProfilePage(driver);
		 hpage=new HomePage(driver);
    }

	@Test
	public void testMyProfile() throws InterruptedException	{
		lpage.EnterUserName(strUserName);
		lpage.Enterpassword(strPassword);
		lpage.clickLogin();
		Thread.sleep(2000);
		hpage.clickprofile();
		Thread.sleep(6000);
    	Assert.assertEquals(ppage.getName(),"Robert");
    	Assert.assertEquals(ppage.getUsername(),"Admin");
    	Assert.assertEquals(ppage.getEmail(),"admin14@gmail.com");
    	Assert.assertEquals(ppage.getRole(),"Admin");
    	Assert.assertEquals(ppage.getAddress(),"981 Dundas St W");
    	Assert.assertEquals(ppage.getCity(),"Steelville");
    	Assert.assertEquals(ppage.getState(),"USA");
	}

	@AfterMethod
	public void closeBrowser(){
    	driver.quit();
    	
    }
	
}
