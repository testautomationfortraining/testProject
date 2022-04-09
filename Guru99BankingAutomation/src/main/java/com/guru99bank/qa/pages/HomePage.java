package com.guru99bank.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.guru99bank.qa.base.TestBase;

public class HomePage extends TestBase {
	
	//Page Factory
	@FindBy(xpath="//h2[text()='Guru99 Bank']")
	WebElement homePageLogo;

	@FindBy(xpath="//a[text()='Delete Customer']")
	WebElement deleteCustomerButton;
	
	//Initialize the Page Factory
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//actions
	public boolean validateHomePageLogo() {
		return homePageLogo.isDisplayed();
	}
	
	public DeleteCustomerPage clickDeleteCustomerButton() {
		deleteCustomerButton.click();
		return new DeleteCustomerPage();
	}
}
