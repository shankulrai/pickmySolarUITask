package com.pickmysolar.testUtlis;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverFactory {
	
	public WebDriver createDriverInstance(String browserName,String url,String exeFilePath) throws MalformedURLException
	{
	   
		WebDriver driver = null;
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			
		}else if(browserName.equalsIgnoreCase("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			//disbaling the notification alert popup
			 options.addArguments("--disable-notifications");
			System. setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+exeFilePath);
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get(url);
			
			
			
			
		}else if(browserName.equalsIgnoreCase("ie"))
		{
			
		}else{
			
		}
		
		return driver;
		
	}

}
