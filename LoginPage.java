package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement passwd;
	@FindBy(name="login")
	WebElement login ;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		// fill the code


public void EnterUserName(String name)
{
	username.sendKeys(name);
}
    
public void Enterpassword(String name)
{
	((WebElement) passwd).sendKeys(name);
}
public void clickLogin()
{
	login.click();
}  
	

}
