package com.tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.pageobjects.AccountPage;
import com.pageobjects.LandingPage;
import com.pageobjects.LogiPage;
import com.resources.Base;

public class LoginTest extends Base{
	public WebDriver driver;
	Logger log;
	
	//convert this to TestNg
	@Test(dataProvider = "getLoginData")
	public void login(String email,String password, String expectedStatus) throws IOException, Exception {
		
		
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.myAccountDropDown().click();
		log.debug("Clicked on My Account dropdown");
		
		landingPage.loginOption().click();
		log.debug("Clicked on login option");
		Thread.sleep(3000);
		
		LogiPage loginPage = new LogiPage(driver);
		
//		loginPage.emailInput().sendKeys(props.getProperty("email"));
//		loginPage.passlInput().sendKeys(props.getProperty("password"));
		
		loginPage.emailInput().sendKeys(email);
		log.debug("Email addressed got entered");
		loginPage.passlInput().sendKeys(password);
		log.debug("Password got entered");
		loginPage.loginButton().click();
		log.debug("Clicked on Login Button");
		
		AccountPage accPage = new AccountPage(driver);
		
		String actualResult = null;
		try {
			if(accPage.editAccountText().isDisplayed()) {
				log.debug("User got logged in");
				actualResult = "Successfull";
			}
			
			
		}catch(Exception e) {
			log.debug("User didn't log in");
			actualResult = "Failure";
		}
		if(actualResult.equals(expectedStatus)) {
			
			log.info("Login Test got passed");
			
		}else {
			
			log.error("Login Test got failed");
		}
		
		
		
	}
	
	@BeforeMethod
	public void openApplication() throws IOException  {
		log = LogManager.getLogger(LoginTest.class.getName());
		driver = initializeDriver();
//		log.debug("Browser got Launched");
		driver.get(props.getProperty("url"));
		log.debug("Navigated to application URL");
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.close();
		log.debug("Browser got closed");
	}
	
	@DataProvider
	public Object[][] getLoginData() {
//		Object[][] data = {{"akashkadari3696@gmail.com","Mar!2023!!","Successfull"},{"asishkadari134@gmail.com","Mar!2023!!","Failure"}};
		Object[][] data = {{"akashkadari3696@gmail.com","Mar!2023!!","Successfull"}};
		return data;
	}
	

}
