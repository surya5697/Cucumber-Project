package com.pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch  {
	
	public static WebDriver driver;
	
	@FindBy(xpath="(//li[@class=\"MegaDropdownHeadingbox\"])[6]")
	private WebElement natural;
	
	@FindBy(linkText = "Hair Masks")
	private WebElement hairMasks;
	
	@FindBy(xpath="(//div[@class=\"css-d5z3ro\"])[14]")
	private WebElement mCaffeine;
	
	@FindBy(xpath="//span[@class=\"btn-text\"]")
	private WebElement addToCart;
	
	public WebElement getNatural() {
		return natural;
	}
	public  WebElement getHairMasks() {
		return hairMasks;
	}
	public WebElement getMCaffeine() {
		return mCaffeine;
	}
	public WebElement getAddToCart() {
		return addToCart;
	}
	
	public ProductSearch(WebDriver driver1) {
		driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

}
