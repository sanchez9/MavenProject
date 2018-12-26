package com.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class BaseClass {
	
	@Test
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "/Users/stephaniesanchez/Desktop/POM/chromedriver");
		WebDriver driver = new ChromeDriver();
		//drover.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
	//this is a working code this will open browser in chrome driver
		
	}

}
