package com.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.resources.Base;

public class FourTest extends Base{
	public WebDriver driver;
	@Test
	public void fourTest() throws IOException, InterruptedException {
		System.out.println("Karan has updated this code with this statement ");
		System.out.println("Karan second updated code with this statement ");
		System.out.println("Inside FourTest");
		
		driver = initializeDriver();
		driver.get("https://www.tutorialsninja.com/demo/");
		
		Thread.sleep(3000);
		Assert.assertTrue(false);
//		driver.close();
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}
}
