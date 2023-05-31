package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseClassMethods.AllMethods;

public class NykaaLogin extends AllMethods {
	
	//declare the WebElement as a private
	//generate the getter
	//WebElement refName = FindElement(By.locators("lacatorsValues");
	
	public static WebDriver driver;
	
	@FindBy(xpath ="//button[text()=\"Sign in\"]")
	private WebElement signIn;
	
	@FindBy(xpath ="//button[text()=\"Sign in with Mobile / Email\"]")
	private WebElement signInOption;
	
	@FindBy(xpath ="//input[@class=\"input text-center\"]")
	private WebElement signInEmailId;
	
	@FindBy(id="submitVerification")
	private WebElement submitVerification;
	
	@FindBy(id ="userName")
	private WebElement userName;
	
	@FindBy(xpath ="//input[@name=\"phoneNumber\"]")
	private WebElement phoneNumber;
	
	@FindBy(xpath ="(//button[@type=\"button\"])[2]")
	private WebElement register;
	
	@FindBy(id="otpField")
	private WebElement otpField;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	private WebElement verify;
	
	
	public WebElement getSignIn() {
		return signIn;
	}

	public WebElement getSignInOption() {
		return signInOption;
	}

	public WebElement getSignInEmailId() {
		return signInEmailId;
	}
	
	public WebElement getSubmitVerification() {
		return submitVerification;
	}
	
	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPhoneNumber() {
		return phoneNumber;
	}
	
	public WebElement getRegister() {
		return register;
	}
	public WebElement getOtpField() {
		return otpField;
	}
	
	public WebElement getVerify() {
		return verify;
	}
	
	
	public NykaaLogin(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver,this);
	}

}
