package com.Test;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature",
glue = "com.Stepdef",
plugin = {

		"pretty",
		"html:Report/Cucumber.html",
		"json:Report/Adactinreport.json",
	//"com.cucumber.listener.ExtentCucumberFormatter:Report/Cucmberreport.html",
	//"com.avenstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				

})

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void setUp() {

		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public static void tearDown() {
		driver.close();

	}

}
