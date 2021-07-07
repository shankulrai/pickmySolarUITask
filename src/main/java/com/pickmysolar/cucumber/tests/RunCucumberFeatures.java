package com.pickmysolar.cucumber.tests;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;
import com.github.mkolisnyk.cucumber.runner.ExtendedTestNGRunner;
import com.pickmysolar.testUtlis.Constants;

import cucumber.api.CucumberOptions;

@ExtendedCucumberOptions(jsonReport = "src/main/resources/com/prozo/testoutputs/cucumber-reports/cucumber.json", retryCount = 3, 
detailedReport = true, 
overviewReport = true, detailedAggregatedReport = true, 
outputFolder = "src/com/sayurbox/results/")
@CucumberOptions(plugin = { "pretty", "html:src/main/resources/com/prozo/testoutputs/cucumber-reports/cucumber-html-report",
		"json:src/main/resources/com/prozo/testoutputs/cucumber-reports/cucumber.json",
"junit:src/main/resources/com/prozo/testoutputs/cucumber-reports/cucumber-results.xml" }, features = {
"src/main/resources/featureFiles" }, glue = {
"com.pickmysolar.cucumber.steps" }, tags = {
"@web" })
public class RunCucumberFeatures extends ExtendedTestNGRunner
{
	public static Properties configProperty;
	


	@BeforeSuite
	public void beforeSuite() 
	{
		try {
			FileInputStream config = new FileInputStream(new File(System.getProperty("user.dir")+Constants.configFilePath));
			configProperty = new Properties();
			configProperty.load(config);
			

		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
