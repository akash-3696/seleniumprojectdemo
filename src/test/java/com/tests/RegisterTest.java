package com.tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.pageobjects.LandingPage;
import com.pageobjects.RegisterPage;
import com.resources.Base;

public class RegisterTest extends Base{
	public WebDriver driver;
	@Test
	public void register() throws IOException, Exception {
		
		driver = initializeDriver();
		driver.get(props.getProperty("url"));
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropDown().click();
		
		landingPage.registerOption().click();
		Thread.sleep(3000);
		
		RegisterPage registerPage = new RegisterPage(driver);
		registerPage.firstName().sendKeys("Test");
		registerPage.lastName().sendKeys("ID");
		registerPage.emailId().sendKeys("xyz@gmail.com");
		registerPage.phoneNo().sendKeys("123");
		registerPage.password().sendKeys("Mar!2023!!");
		registerPage.confPassword().sendKeys("Mar!2023!!");
		registerPage.checkBox().click();
		registerPage.confirmButton().click();
	}
	@AfterMethod
	public void closure() {
		driver.close();
	}

}
