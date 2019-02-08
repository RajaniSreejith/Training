package com.pages;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
	// fill the code
	WebDriver driver;
	
	@FindBy(xpath="//table/tbody/tr[1]/td[2]")
	WebElement name1;
	@FindBy(xpath="//table/tbody/tr[2]/td[2]")
	WebElement Username;
	@FindBy(xpath="//table/tbody/tr[3]/td[2]")
	WebElement Email;
	@FindBy(xpath="//table/tbody/tr[4]/td[2]")
	WebElement Role;
	@FindBy(xpath="//table/tbody/tr[5]/td[2]")
	WebElement Address;
	@FindBy(xpath="//table/tbody/tr[6]/td[2]")
	WebElement City;
	@FindBy(xpath="//table/tbody/tr[7]/td[2]")
	WebElement State;
	
	public MyProfilePage(WebDriver driver)
	{
		this.driver=driver;
		
		/*name1=driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]"));
		 Username=driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
		 Email=driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
		 Role=driver.findElement(By.xpath("//table/tbody/tr[4]/td[2]"));
		 Address=driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
		City=driver.findElement(By.xpath("//table/tbody/tr[6]/td[2]"));
		State=driver.findElement(By.xpath("//table/tbody/tr[7]/td[2]"));*/
		PageFactory.initElements(driver, this);

	}
		
	
	public String getName() throws InterruptedException
	{
		return name1.getText();
	}
	public String getUsername() throws InterruptedException
	{
		return Username.getText();
	}
	public String getEmail()
	{
		return Email.getText();
	}
	public String getRole() {
		return Role.getText();
	}
	public String getAddress()
	{
		return Address.getText();
	}
	public String getCity()
	{
		return City.getText();
	}
	public String getState()
	{
		return State.getText();
	}

}
