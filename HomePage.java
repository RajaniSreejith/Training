package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
WebDriver driver;
@FindBy(xpath="//h2")
WebElement Msg;
@FindBy(xpath="//a[text()='My Profile']")
WebElement profile1 ;
 public HomePage(WebDriver driver)
 {
	this.driver=driver; 
	PageFactory.initElements(driver, this);
 }
 
 
 public String getWelcomeMessage()
 {
	 return Msg.getText();
 }


public void clickprofile() {
	// TODO Auto-generated method stub
	profile1.click();
	
}

}
