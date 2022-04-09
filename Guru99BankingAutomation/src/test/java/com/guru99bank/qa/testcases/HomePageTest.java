package com.guru99bank.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.guru99bank.qa.base.TestBase;
import com.guru99bank.qa.pages.DeleteCustomerPage;
import com.guru99bank.qa.pages.HomePage;
import com.guru99bank.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	DeleteCustomerPage deleteCustomerPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test(priority=0)
	public void validateHomePageLogo() {
		Assert.assertTrue(homePage.validateHomePageLogo());		
	}
	
	@Test(priority=1)
	public void navigateToDeleteCustomerPage() {
		deleteCustomerPage=homePage.clickDeleteCustomerButton();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
