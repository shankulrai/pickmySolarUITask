package com.pickmysolar.cucumber.steps;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import com.pickmysolar.pageObjects.SearchItemPageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pickmysolar.cucumber.tests.RunCucumberFeatures;
import com.pickmysolar.testUtlis.DriverFactory;
import com.pickmysolar.testUtlis.DriverManager;





public class BaseSteps extends RunCucumberFeatures{


	public static WebDriver driver;
	public static SearchItemPageObject searchItem;



	public void initializeTheDriver() throws MalformedURLException {


		driver = new DriverFactory().createDriverInstance(configProperty.getProperty("browserName"),configProperty.getProperty("baseUrl"),configProperty.getProperty("chromeDriverExeFile"));
		DriverManager.setDriver(driver);
		DriverManager.setImplicitWait();
	}

    public void invisibilityOfElementLocated(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), 30);
		wait.until(ExpectedConditions.invisibilityOf(element));

	}

	public void short_wait()
	{
		try {
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void checkElementIsDisplayedOnPage(WebElement element)
	{
		//checking for element is Displayed on page
		element.isDisplayed();

	}

	public void clickOntheElementFromList(List<WebElement> webElementList,int poistionOfElement)
	{
		webElementList.get(poistionOfElement).click();
	}

	public void implicitWait()
	{
		DriverManager.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	public void clickOnElemnt(WebElement element)
	{
		// method for clicking a web element
		element.click();
	}

	public void enterTextInField(WebElement element,String text)
	{
		// method for entering text in textField
		element.sendKeys(text);

	}

	public void waitForElementToClickable(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), 30);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}



	public void switchToNewTab(String currentTabId)
	{
		Set<String> windowHandles=DriverManager.getDriver().getWindowHandles();
		//this function is for only onetab
		for(String actual: windowHandles) {
			if (!actual.equalsIgnoreCase(currentTabId)) {
				//Switch to the opened tab
				driver.switchTo().window(actual);

			}
		}
	}

	public String getCurrentWindowHandle()
	{
		return DriverManager.getDriver().getWindowHandle();
	}


	public String getTextFromElement(WebElement element)
	{
		// getTextFromTheWebElemnt
		String textofElement=element.getText();
		return textofElement;


	}



	protected void teardownTheDriver() {

		try {
			DriverManager.closeDriver(DriverManager.getDriver());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	



}
