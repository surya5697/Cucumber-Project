package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage {
	public static WebDriver driver;
	
	@FindBy(xpath="//p[text()=\"Cash on delivery\"]")
	private WebElement cashOnDelivery;
	
	@FindBy(xpath="//button[text()=\"Place order\"]")
	private WebElement placeOrder;

	public WebElement getCashOnDelivery() {
		return cashOnDelivery;
	}
	public WebElement getPlaceOrder() {
		return placeOrder;
		
	}
	
	public PaymentPage(WebDriver driver1) {
		driver=driver1;
		PageFactory.initElements(driver,this);
	}


}
