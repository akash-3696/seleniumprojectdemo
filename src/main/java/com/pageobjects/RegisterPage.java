package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstName;
	
	public WebElement firstName() {
		return firstName;
	}
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastName;
	
	public WebElement lastName() {
		return lastName;
	}
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement emailId;
	
	public WebElement emailId() {
		return emailId;
	}
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement phoneNo;
	
	public WebElement phoneNo() {
		return phoneNo;
	}
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	public WebElement password() {
		return password;
	}
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement confPassword;
	
	public WebElement confPassword() {
		return confPassword;
	}
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	public WebElement checkBox() {
		return checkBox;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement confirmButton;
	
	public WebElement confirmButton() {
		return confirmButton;
	}
	
	
	

}
