package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory - OR(Object Repository)
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div/div[2]/div/div[3]/div[2]/"
			+ "div[1]/div[2]/div/div[1]/div[3]/button[1]")
	WebElement username;
	
	@FindBy(name="")
	WebElement password;
	
	@FindBy(name="")
	WebElement loginBtn;
	
	@FindBy(css="")
	WebElement expressLogo;
	
	//Initializing the Page Objects
	public LoginPage() {
		PageFactory.initElements(driver, this); // LoginPage.class
	}
	
	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateexpressimage() {
		return expressLogo.isDisplayed(); 
	}
	
	public HomePage login(String un, String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}

}
