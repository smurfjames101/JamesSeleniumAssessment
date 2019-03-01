package com.qa.task1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class LandingPage {

	// Login Variables
	@FindBy(name = Constants.usernameInput)
	private WebElement usernameInput;
	@FindBy(name = Constants.passwordInput)
	private WebElement passwordInput;

	// addNewItem Variables
	@FindBy(name = Constants.itemName)
	private WebElement itemNameInput;
	@FindBy(xpath = Constants.freestyleProject)
	private WebElement freestyle;
	@FindBy(id = Constants.newItemOkay)
	private WebElement ok;
	@FindBy(id = Constants.newItemSave)
	private WebElement save;

	// clickMenuItem Variables
	@FindBys(@FindBy(tagName = "a"))
	private List<WebElement> sideMenu;

	// navigateToUser Variables
	@FindBy(xpath = Constants.manageUsers)
	private WebElement manageUsers;
	@FindBy(xpath = Constants.createUser)
	private static WebElement createUser;

	// UserFieldsInput Variables
	@FindBy(name = Constants.userName)
	private static WebElement username;
	@FindBy(name = Constants.password1)
	private static WebElement password1;
	@FindBy(name = Constants.password2)
	private static WebElement password2;
	@FindBy(name = Constants.email)
	private static WebElement email;
	@FindBy(name = Constants.fullName)
	private static WebElement fullname;

	@FindBy(id = Constants.submitUser)
	private static WebElement submit;

	// Task1
	public void login() {
		usernameInput.sendKeys(Constants.login);
		passwordInput.sendKeys(Constants.login);
		passwordInput.submit();

	}

	public void addNewItem() {
		itemNameInput.sendKeys(Constants.newItemName);
		freestyle.click();
		ok.click();
		save.click();

	}

	public void implicit(WebDriver driver, String idOption) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		itemNameInput = driver.findElement(By.id(idOption));
	}

	public void clickMenuItem(String option) {
		for (int i = 0; i < sideMenu.size(); i++) {
			if (sideMenu.get(i).getText().contains(option)) {
				sideMenu.get(i).click();
				return;
			}
		}
	}

	// Task2
	public void navigateToAddUser(WebDriver driver) throws InterruptedException {
		clickMenuItem(Constants.manageJenkins);
		manageUsers.click();
		clickUser();
	}

	public static void submituser() {
		submit.click();
	}

	public static void addUserName(String input) {
		username.sendKeys(input);
	}

	public static void addPassword(String input) {
		password1.sendKeys(input);
		password2.sendKeys(input);
	}

	public static void addFullName(String input) {
		fullname.sendKeys(input);
	}

	public static void addEmail(String input) {
		email.sendKeys(input);
	}

	public static void clickUser() {
		createUser.click();
	}
}
