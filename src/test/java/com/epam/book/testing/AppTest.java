package com.epam.book.testing;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.epam.book.BrowserReader;

import pages.StaysPage;

public class AppTest {

	static StaysPage staysPage;	
	@Test
	public void test() throws IOException {
		System.setProperty("webdriver.gecko.driver",BrowserReader.getDriverPath());

		WebDriver driver = new FirefoxDriver();
		
		driver.get(BrowserReader.getUrl());
		WebElement element = driver.findElement(By.id("//*[@id=\"logo_no_globe_new_logo\"]"));
		
		staysPage = new StaysPage(driver);
	}
	
}
