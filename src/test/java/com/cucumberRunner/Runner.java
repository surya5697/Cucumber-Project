package com.cucumberRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.BaseClassMethods.AllMethods;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src\\test\\java\\com\\FeatureFile\\NykaaProject.feature",
glue ="com\\stepDefiniton",
monochrome = true,
dryRun = !true,
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:ReportFolder/extent_report.html"}

) 

public class Runner extends AllMethods{

	public static WebDriver driver;

	@BeforeClass
	public static void open1() {

		driver = BrowserLaunch("chrome");
		maximize();
		implicitlyWait(10);


	}

	@AfterClass
	public static void close1() {
		quit();
	}





}