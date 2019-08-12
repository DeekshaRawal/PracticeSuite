package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;

public class LoginPage extends TestBase {

	//Page Factory -OR
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@class='ui fluid large blue submit button']")
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains[text(),'Sign Up']")
	WebElement SignUp;
	
	@FindBy(xpath="//img[contains[@class,'img-responsive']")
	WebElement crmlogo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
	public String validateloginpagetitle() {
		return driver.getTitle();
	}
	
	public boolean validateCRMImage() {
		return crmlogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();	
		
		return new HomePage();
	}
	
	
	
	
}
