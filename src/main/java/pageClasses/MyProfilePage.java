package pageClasses;

import baseClasses.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyProfilePage extends BaseClass {
    public ExtentTest logger;

    public MyProfilePage(WebDriver driver, ExtentTest logger) {
        this.driver = driver;
        this.logger = logger;
    }

    @FindBy(xpath = "//div[contains(@class,'ms-tileTitle')]/div")
    WebElement nameElement;

    @FindBy(xpath = "//div[contains(@class,'ms-section')]/div[1]//span")
    WebElement emailElement;

    @FindBy(xpath = "//div[contains(@class,'ms-section')]/div[3]//span")
    WebElement locationElement;

    @FindBy(xpath = "//div[contains(@class,'ms-tile')]/div/div[3]/div[1]")
    WebElement roleElement;

    @FindBy(xpath = "//div[contains(@class,'ms-tile')]/div/div[3]/div[2]")
    WebElement officeDetailElement;


    public void captureUserDetails(){
        takeScreenShot();
        printTitle("User details");
        System.out.println("Name - "+nameElement.getText());
        System.out.println("Role - "+ roleElement.getText());
        System.out.println("Email - "+emailElement.getText());
        System.out.println("Location - "+locationElement.getText());
        System.out.println("Office Details - "+officeDetailElement.getText());
    }



}
