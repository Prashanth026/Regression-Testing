package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
public static WebDriver driver;
	public static WebDriver LaunchBrowser() {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\ELCOT-Lenovo\\Prashanth\\CucumberNew\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	return driver;
	
	}
	public static void loadUrl(String Url) {
	driver.get(Url);
	}
	public static void fill(WebElement element,String name){
		element.sendKeys(name);
	}
	public static void btnClick(WebElement element){
			element.click();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	public static void getTextByAttributeName (WebElement element) {
		String name = element.getAttribute("value");
		System.out.println(name);
		
	}
	public static String getUrl() {
		String Url = driver.getCurrentUrl();
		return Url;
			
	}
	
	
	}
