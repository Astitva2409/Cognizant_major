package pageClasses;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

import baseClasses.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

	public ExtentTest logger;

	public HomePage(WebDriver driver, ExtentTest logger) {
		this.driver = driver;
		this.logger = logger;
	}

	@FindBy(className = "nvEhuDKzSmREBsqaIaOhu")
	WebElement profileElement;

	@FindBy(id = "mectrl_viewAccount")
	WebElement viewProfileBtn;

	@FindBy(xpath = "//div[@title='OneCognizant']")
	WebElement oneCognizantLink;

	public MyProfilePage openProfile(){

		waitForElementToBeVisible(profileElement,5);
		elementClick(profileElement);
		waitForElementToBeVisible(viewProfileBtn,5);
		elementClick(viewProfileBtn);

		MyProfilePage myProfilePage = new MyProfilePage(driver, logger);
		PageFactory.initElements(driver, myProfilePage);
		return myProfilePage;
	}
	public OneCognizantPage openOneCognizant(){
		waitForElementToBeVisible(oneCognizantLink,10);
		elementClick(oneCognizantLink);


		OneCognizantPage oneCognizantPage = new OneCognizantPage(driver, logger);
		PageFactory.initElements(driver, oneCognizantPage);
		return oneCognizantPage;
	}



}
