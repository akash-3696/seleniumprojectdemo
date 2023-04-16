package com.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.resources.Base;

public class TwoTest extends Base{
	public WebDriver driver;
	@Test
	public void testTwo() throws IOException {
		System.out.println("Inside TestTwo");
		
		driver = initializeDriver();
		driver.get("https://www.tutorialsninja.com/demo/");
		Assert.assertTrue(false);
		
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
