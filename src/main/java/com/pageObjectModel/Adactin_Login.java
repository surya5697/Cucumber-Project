 package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login {
	
	//declare the WebElement as a private
    // generate getters
	
	// WebElement refName = driver.findElement(By.xpath("values"));
	
	public static WebDriver driver;
	
	@FindBy(linkText = "New User Register Here")
	private WebElement newRegister;
	
	@FindBy(id = "username")
	private WebElement userName;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "re_password")
	private WebElement ConfirmPassword;
	
	@FindBy(id = "full_name")
	private WebElement fullName;
	
	@FindBy(id = "email_add")
	private WebElement emailAddress;
	
	@FindBy(id="captcha-form")
	private WebElement captcha;
	
	@FindBy(id="tnc_box")
	private WebElement termCondition;
	
	@FindBy(id="Submit")
	private WebElement register;

	public WebElement getNewRegister() {
		return newRegister;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getCaptcha() {
		return captcha;
	}

	public WebElement getTermCondition() {
		return termCondition;
	}

	public WebElement getRegister() {
		return register;
	}
	
	public Adactin_Login(WebDriver dri) {
		driver = dri;
		
		PageFactory.initElements(driver,this);
	}

}

