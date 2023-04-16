package com.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.resources.Base;

public class ThreeTest extends Base {
	public WebDriver driver;
	@Test
	public void threeTest() throws IOException {
		System.out.println("Inside TestThree");
		driver = initializeDriver();
		driver.get("https://www.tutorialsninja.com/demo/");
		Assert.assertTrue(false);
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
