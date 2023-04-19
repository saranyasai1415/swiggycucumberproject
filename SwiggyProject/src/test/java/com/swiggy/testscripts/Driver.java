package com.swiggy.testscripts;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.swiggy.pages.CheckOut;
import com.swiggy.pages.Items;
import com.swiggy.pages.Landinpage;
import com.swiggy.pages.PlaceOrder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver extends Tools {
	protected static DesiredCapabilities cap;
	protected static Landinpage landingPage;
	protected static Items items;
	protected static PlaceOrder placeOrder;
	protected static CheckOut checkOut;

	

	public static void init() throws MalformedURLException {
		
		cap =  new DesiredCapabilities();
		
		cap.setBrowserName("firefox");
		cap.setPlatform(Platform.WIN10);
		//cap.chrome();
		System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
		driver = new FirefoxDriver();
	//	WebDriverManager.firefoxdriver().setup();
		// driver.
		  
		landingPage = new Landinpage(driver);
		items = new Items(driver);
		placeOrder = new PlaceOrder(driver);
		checkOut = new CheckOut(driver);
	}
}