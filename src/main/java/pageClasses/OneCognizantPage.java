package pageClasses;

import baseClasses.BaseClass;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OneCognizantPage extends BaseClass {


    public ExtentTest logger;

    public OneCognizantPage(WebDriver driver, ExtentTest logger) {
        this.driver = driver;
        this.logger = logger;
    }

    @FindBy(id = "oneC_searchAutoComplete")
    WebElement searchElement;


}
