package com.qa.task1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import com.qa.task2.ParamatizedExcel;
public class ItemCreationTest {
	WebDriver driver;
	LandingPage landingPage;
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@After
	public void teardown() {
		driver.quit();
	}
	@Test
	public void testAddingATask() {		
		driver.get(Constants.url);
		landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.login();
		landingPage.clickMenuItem(Constants.newItem);
		landingPage.implicit(driver, "name");
		landingPage.addNewItem();
	}
	@Test
	public void testAddingUsersViaExcel() throws Exception {
		driver.get(Constants.url);
		landingPage = PageFactory.initElements(driver, LandingPage.class);
		landingPage.login();
		landingPage.navigateToAddUser(driver);
		ParamatizedExcel.data();
	}

	
}
