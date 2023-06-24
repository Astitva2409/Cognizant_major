package testCases;

import org.testng.annotations.Test;

import baseClasses.BaseClass;
import pageClasses.HomePage;
import pageClasses.LoginPage;
import pageClasses.MyProfilePage;
import pageClasses.OneCognizantPage;

public class AllTestCases extends BaseClass {

	LoginPage loginPage;
	HomePage homePage;
	MyProfilePage myProfilePage;

	OneCognizantPage oneCognizantPage;


	@Test(priority = 0)
	public void verifyLogin() {
		invokeBrowser(prop.getProperty("browserName"));
		logger = report.createTest("Verify user login details");
		loginPage = openApplication(prop.getProperty("URL"));
		homePage= loginPage.login("2276766@cognizant.com", "@Devil@Abk@121");

		getCurrentWindow();
		myProfilePage=homePage.openProfile();
		switchToChildWindow();
		myProfilePage.captureUserDetails();
		switchParentToWindow();

		getCurrentWindow();
		oneCognizantPage = homePage.openOneCognizant();
		switchParentToWindow();







	}

}
