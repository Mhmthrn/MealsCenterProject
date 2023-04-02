package tests;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_005 extends TestBaseRapor {
    HomePage homePage = new HomePage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void homePageVisibleTest() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that Homepage is visible  ", "As a user, view the website. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.signInButton.click();
        Assert.assertTrue(homePage.signInButton.isDisplayed());
        extentTest.pass("Homepage is visible");
        Driver.closeDriver();
    }

    @Test
    public void MobileNumberEmailAddressTextBoxEnabledTest() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that Mobile number or email address TextBox is enabled", "As a user, view the website. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.signInButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.mobileNumberEmailTextBox.isEnabled());
        extentTest.pass("Mobile number or email address TextBox is enabled");
        Driver.closeDriver();
    }

    @Test
    public void PasswordTextBoxEnabledTest() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that Password textBox is enabled", "As a user, view the website. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.signInButton.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.passwordTextBox1.isEnabled());
        extentTest.pass("Password textBox is enabled");
        Driver.closeDriver();
    }

    @Test(groups = {"smoke", "end2End"})
    public void LoginSuccessfullyDoneTest() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that Login is successfully done ", "As a user, view the website. ");
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        ReusableMethods.wait(1);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.signInButton.click();
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        ReusableMethods.wait(1);
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        ReusableMethods.wait(2);
        Assert.assertTrue(homePage.registerDone.isDisplayed());
        extentTest.pass("Login is successfully done");
        Driver.closeDriver();
    }
}
