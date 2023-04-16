package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogiPage {
	
	WebDriver driver;
	public LogiPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailInput;
	
	public WebElement emailInput() {
		return emailInput;
	}
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement passlInput;
	
	public WebElement passlInput() {
		return passlInput;
	}
	@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButton;
	
	public WebElement loginButton() {
		return loginButton;
	}

}
