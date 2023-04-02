package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_019 extends TestBaseRapor {


    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void TC01901Test() {
        extentTest = extentReports.createTest("Merchant should be able to access the Merchant login page.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        Driver.closeDriver();


    }

    @Test(groups = "smoke")
    public void TC01902Test() {
        extentTest = extentReports.createTest("Merchant should be able to access the Merchant login page.");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        actions.sendKeys(adminPage.adminPageUserName, ConfigReader.getProperty("tugbaAdminUsername")).perform();
        clickWithJS(adminPage.adminPagePassword);
        actions.sendKeys(adminPage.adminPagePassword, ConfigReader.getProperty("adminGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Admin page");


        //1901
        //- Open browser go to url "adminPageLoginUrl"
        //- Click on "Log out" section.
        //- User closes the page.


        //1902
   /* - Open browser go to url "adminPageLoginUrl"
            - Click "Username" box and send data.
            - Click "Password" box and send password.
            - Click and click the "Sign In" button.
- Redirect to admin page.
            - Click on "Log out" section.
- User closes the page.*/


    }
}
