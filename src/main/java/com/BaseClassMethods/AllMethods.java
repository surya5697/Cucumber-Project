package com.BaseClassMethods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllMethods {
	
	public static WebDriver driver;
	public static Actions builder;
	public static Select s;
	
	//BrowserLaunch Method
	public static WebDriver BrowserLaunch(String Browsers) {

		if(Browsers.equalsIgnoreCase("chrome")) {
			 //System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();

		}else if(Browsers.equalsIgnoreCase("fireFox")){
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(Browsers.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");
			driver = new EdgeDriver();

		}else {
			System.out.println("Invalid browser enter the valid browsers");
		}

		return driver;

	}
	
	// browsers basic operation methods
	public static void maximize() {
		driver.manage().window().maximize();

	}
	
	// Wait concept methods
	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	
	public static void explicitlyWait(int sec,String opt,WebElement refName) {
		WebDriverWait wait = new WebDriverWait(driver,sec);
		if(opt.equalsIgnoreCase("visible")) {
			wait.until(ExpectedConditions.visibilityOf(refName));
		}else if(opt.equalsIgnoreCase("clickable")) {
			wait.until(ExpectedConditions.elementToBeClickable(refName));
		}else if(opt.equalsIgnoreCase("selected")){
			wait.until(ExpectedConditions.elementToBeSelected(refName));
		}
	}
	
	public static void ThreadSleep(int seconds) throws InterruptedException {
		Thread.sleep(seconds);
	}
	

	//getting URL Method
	public static void get(String url) {
		driver.get(url);
	}
	
    // String getTitle method 
	public static void getTitle() {
		String title = driver.getTitle();
		System.out.println("getTitle is => "+title);
	}
	
	// String getCurrentUrl method
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("currentUrl is => "+currentUrl);
	}
	
	// String getText method
	public static void getText(WebElement textRefName) {
		String text = textRefName.getText();
		System.out.println("getText is => "+text);
	}
	
    // String getAttribute value method
	public static void getAttribute(WebElement attributeRefName,String value) {
		String attribute = attributeRefName.getAttribute(value);
		System.out.println("attribute => "+attribute);
		
	}

	// WebElement Input feeding method 
	public static void sendKeys(WebElement refName,String Value) {
		refName.sendKeys(Value);
	}
	
	// WebElement click 
	public static void click(WebElement refName) {
		refName.click();
	}
	
	// WebElement clear
	public static void clear(WebElement refName) {
		refName.clear();
	}
	
	// WebElement radioButton
	public static void radioButton(WebElement refName) {
		refName.click();
	}

	// Navigation methods
   
	public static void navigateTo(String url) {
		driver.navigate().to(url);

	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();

	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	
    // isEnabled Boolean type return verification method 
	public static void isEnabled(WebElement refName) {
		boolean enabled = refName.isEnabled();
		System.out.println("isEnabled => "+enabled);
	}
    
	// isDisplayed Boolean type return verification method
	public static void isDisplayed(WebElement refName) {
		boolean displayed = refName.isDisplayed();
		System.out.println("isDisplayed  =>"+displayed);
	}
    
	// isSelected Boolean type return verification method
	public static void isSelected(WebElement refName) {
		boolean selected = refName.isSelected();
		System.out.println("isSelected => "+selected);
		
	}
    
	// isMultiple Boolean type return verification method
	public static void isMultiple(WebElement refName) {
		s = new Select(refName);
		boolean multiple = s.isMultiple();
		System.out.println("isMultipleValues => "+multiple);
		
		
	}
	
	//getOptions in isMultiple methods
	public static void getOptions(WebElement refName) {
		Select s = new Select(refName);
		if(s.isMultiple()==true) {
			
			List<WebElement> options = s.getOptions();
			System.out.println("getOptions ");
			System.out.println("----------");
			for(WebElement opt : options) {
				String text = opt.getText();
				System.out.println("getOptionsAllText =>"+text);
				
			}
		}else {
			System.out.println("there is not an multiple dropdown");
		}
		
	}
	
	// Using Select dropDown methods

	public static void selectDropDownMethods(WebElement refName, String opt,String value) {
	 Select	s = new Select(refName);
		if(opt.equalsIgnoreCase("value")) {

			s.selectByValue(value);
		}
		else if(opt.equalsIgnoreCase("text")) {

			s.selectByVisibleText(value);
		}
		else if(opt.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.selectByIndex(parseInt);
		}

	}
	
	// getAllSelectedOptions method
	public static void getAllSelectedOptions(WebElement refName) {
		Select s = new Select(refName);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(WebElement allopt : allSelectedOptions) {
			System.out.println("allSelectedOptions There are's");
			System.out.println("-------------------------------");
			String text = allopt.getText();
			System.out.println(text);
		}
		
	}
	
	// getFirstSelectedOption method
	public static void getFirstSeletedOption(WebElement refName) {
		Select s = new Select(refName);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println("getFirstSelectedOption is => "+text);
	}
	
	// Using deSelectDropDown methods
	public static void deselectDropDownMethods(WebElement refName, String opt, String value) {
		Select s = new Select(refName);
		if(opt.equalsIgnoreCase("value")) {
			s.deselectByValue(value);
		}else if(opt.equalsIgnoreCase("text")) {
			s.deselectByVisibleText(value);
		}else if(opt.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			s.deselectByIndex(parseInt);
		}else {
			System.out.println("this not a multipe dropDown so we can't "
					+ "deselect the options");
		}
	}
	
	//Simple and confirm Alert options method
	public static void alert(String opt) {
		if(opt.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		}else if(opt.equalsIgnoreCase("dismiss")){
			driver.switchTo().alert().dismiss();
		}
	}
	
	// prompt Alert option method
	public static void promptAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
		
	}
	
	// i frame  Using by webElement 
	public static void frameByElement(WebElement refName) {
		driver.switchTo().frame(refName);
	}
	// i frame USing by index
	public static void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}
	// i frame by using String value or using id
	public static void frameByValue(String value) {
		driver.switchTo().frame(value);
	}
	
	// Backward to parent frame
	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}
	
	// frame to return Backward in defaultContent
	public static void defaultContent() {
		driver.switchTo().defaultContent();
	}
	
	// Using WindowHandles Methods
	public static void getWindowHandles(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> titles = new ArrayList<String>(windowHandles);
		System.out.println("currentUrl => "+driver.getCurrentUrl());
		driver.switchTo().window(titles.get(index));
		
//		for(String s :windowHandles) {
//			String titles = driver.switchTo().window(s).getTitle();
//			System.out.println("titles => "+titles);
//		}
//		System.out.println("********** ENTER THE REQUIRED WINDOW FOR USING "
//				+ "DRIVER TO POINT THAT WINDOW");
//		Scanner scanner = new Scanner(System.in);
//		Thread.sleep(10000);
//        String requiredTitle = scanner.next();
//        scanner.close();
//		for(String s1 :windowHandles) {
//			System.out.println(s1);
//			if(driver.switchTo().window(s1).getTitle().equals(requiredTitle)) {
//				break;	
//			}
//			System.out.println("driver switched to current window");
//					
//	   } 
			
    }
	
	// USING JavascriptExecutor METHOD FOR SCROLL INTO VIEW
	public static void scrollIntoView(WebElement refName) {
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", refName);
	}
	
	// Using JavaScriptExecutor method for click
	public static void jsExecuteClick(WebElement refName) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", refName);
	}
	// Using JavaScriptExecutor method for scrollByUp
	public static void scrollUp(String rangeValue) {	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+rangeValue+");");
	}
	
	// Using JavaScriptExecutor method for scrollByDown
	public static void scrollDown(String rangeValue) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,"+rangeValue+");");
	}
	
//	// Using boolean type return verification method
//	
//	public static Object webElementMethod(WebElement refName, String opts) {
//		
//		if(opts.equalsIgnoreCase("isDisplayed")) {
//			boolean displayed = refName.isDisplayed();
//			return displayed;
//		}else if(opts.equalsIgnoreCase("isSelected")) {
//			boolean selected = refName.isSelected();
//			return selected;
//		}else if(opts.equalsIgnoreCase("isEnabled")) {
//			boolean enabled = refName.isEnabled();
//			return enabled;		
//		}else if(opts.equalsIgnoreCase("isMultiple")) {
//			Select s = new Select(refName);
//			boolean multiple = s.isMultiple();
//			return multiple;
//		
//		}
//		
//		return false;	
//		
//	}	



	// Using Actions methods

	public static void moveToElement(WebElement refName) {
		builder = new Actions(driver);
		builder.moveToElement(refName).build().perform();

	}
	public static void clickAction(WebElement refName) {
		builder = new Actions(driver);
		builder.moveToElement(refName).click().build().perform();
	}
	public static void clickAndHold(WebElement refName) {
		builder = new Actions(driver);
		builder.clickAndHold(refName).perform();
	}
	public static void release(WebElement refName) {
		builder = new Actions(driver);
		builder.release(refName).build().perform();
	}
	public static void dragAndDrop(WebElement source,WebElement target) {
		builder = new Actions(driver);
		builder.dragAndDrop(source, target).perform();
	}
	public static void contextClick(WebElement refName) {
		builder = new Actions(driver);
		builder.contextClick(refName).perform();;
	}
	public static void doubleClick(WebElement refName) {
		builder = new Actions(driver);
		builder.doubleClick(refName).perform();
	}

	// Using ScreenShot Methods
	public static void screenshot(String name) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\krrds\\eclipse-workspace\\Cucumber_Demo\\screenshotFolder\\"+name+".png");
		FileHandler.copy(src, dest);	

	}
	// Using Robot class methods
	public static void robot(String opt) throws AWTException {
		Robot r = new Robot();
		if(opt.equalsIgnoreCase("down")) {	
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}else if(opt.equalsIgnoreCase("enter")) {	
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		}
	}
	
	// otp receiving method
	public static void otp(WebElement refName) {
		System.out.println("ENTER THE OTP VALUE");
		Scanner scanner = new Scanner(System.in);
		String otp = scanner.next();
		refName.sendKeys(otp);
		System.out.println("successfully login the account");
		scanner.close();
	}
	
	// Using scanner to receiving the value
	public static void scanner(WebElement refName) {
		System.out.println("ENTER THE VALUE");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.next();
		refName.sendKeys(value);
		scanner.close();
	}
	


	
	// Browser closing methods
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}






}
