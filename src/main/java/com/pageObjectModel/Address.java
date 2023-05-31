package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	
	public static WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"css-1pan5g8 e1gecm6x0\"]")
	private WebElement addNewAddress;
	
	@FindBy(xpath="//input[@placeholder=\"House/ Flat/ Office No.\"]")
	private WebElement houseNo;
	
	@FindBy(xpath="//textarea[@placeholder=\"Road Name/ Area /Colony\"]")
	private WebElement area;
	
	@FindBy(xpath="//input[@placeholder=\"Pincode\"]")
	private WebElement pincode;
	
	@FindBy(xpath="//span[@class=\"slider round css-0 e1rxn2v03\"]")
	private WebElement useDefault;
	
	@FindBy(xpath="//input[@placeholder=\"Name\"]")
	private WebElement name;
	
	@FindBy(xpath="//input[@placeholder=\"Phone\"]")
	private WebElement phone;
	
	@FindBy(xpath="//input[@placeholder=\"Email ID (Optional)\"]")
	private WebElement email;
	
	@FindBy(xpath="//button[text()=\"Ship to this address\"]")
	private WebElement shipAddress;
	
	
	public WebElement getAddNewAddress() {
		return addNewAddress;
	}
	public WebElement getHouseNo() {
		return houseNo;
	}
	public WebElement getArea() {
		return area;
	}
	
	public WebElement getPincode() {
		return pincode;
	}
	public WebElement getUseDefault() {
		return useDefault;
	}
	public WebElement getName() {
		return name;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getShipAddress() {
		return shipAddress;
	}
	
	public Address(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

}
