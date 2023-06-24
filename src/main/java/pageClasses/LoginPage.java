package pageClasses;

import org.checkerframework.checker.i18nformatter.qual.I18nChecksFormat;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	public ExtentTest logger;

	public LoginPage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}
	
	@FindBy(name="loginfmt")
	WebElement emailInput;
	
	@FindBy( id="idSIButton9")
	WebElement submitBtn;
	
	@FindBy(name="passwd")
	WebElement passwordInput;
	
	@FindBy(xpath = "//a[text()='Not now']")
	WebElement notNowBtn;
	
	public HomePage login(String email, String password) {
		waitForElementToBeVisible(emailInput, 5);
		enterText(emailInput, email);
		elementClick(submitBtn);
		try {
			waitForElementToBeVisible(passwordInput, 5);
			enterText(passwordInput, password);
			elementClick(submitBtn);
		}catch (NoSuchElementException e) {
			// TODO: handle exception
		}
		try {
			waitForElementToBeVisible(notNowBtn, 5);
			elementClick(notNowBtn);
		} catch (Exception e) {
			
		}
		waitForElementToBeVisible(submitBtn, 5);
		elementClick(submitBtn);
		HomePage homePage = new HomePage(driver, logger);
		PageFactory.initElements(driver, homePage);
		return homePage;
	}
}
