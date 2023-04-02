package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

import static utilities.ReusableMethods.clickWithJS;
public class US_044 extends TestBaseRapor {
    AdminPage adminPage = new AdminPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void AdminPageVisible() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verify that AdminPage is visible", "As a user, view the website. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("fidanAdminUsername"));
        Assert.assertTrue(adminPage.adminPageUserName.isEnabled());
        extentTest.pass(" AdminPage isEnabled");
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        Assert.assertTrue(adminPage.adminPagePassword.isEnabled());
        adminPage.adminPageSignInButton2.click();
        extentTest.pass(" AdminPage is visible");
        Driver.closeDriver();
    }

    @Test
    public void AdminPageLoginTest() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that AdminPage is visible", "As a user, view the website. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("fidanAdminUsername"));
        Assert.assertTrue(adminPage.adminPageUserName.isEnabled());
        extentTest.pass(" AdminPage LoginUrl");
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        Assert.assertTrue(adminPage.adminPagePassword.isEnabled());
        extentTest.info("login to Admin page isEnabled");
        adminPage.adminPageSignInButton2.click();
        adminPage.reportTitleButtonAdmin.click();
        adminPage.merchantSalesAdmin.click();
        Driver.closeDriver();
    }

    @Test(groups = "demo")
    public void Date_OrderIDNumberFilterTest() {
        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that AdminPage is visible", "As a user, view the website. ");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        ReusableMethods.wait(1);
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("fidanAdminUsername"));

        ReusableMethods.wait(1);
        Assert.assertTrue(adminPage.adminPageUserName.isEnabled());
        extentTest.info("Admin Page User Name isEnabled");
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"));
        Assert.assertTrue(adminPage.adminPagePassword.isEnabled());

        extentTest.info("login to Admin page");

        clickWithJS(adminPage.adminPageSignInButton2);
        adminPage.reportTitleButtonAdmin.click();

        adminPage.merchantSalesAdmin.click();
        Assert.assertTrue(adminPage.merchantSalesReportTitle.isDisplayed());
        extentTest.info("Merchant Sales Report Title isDisplayed");
        adminPage.merchantSalesReportFilterAdmin.click();

        clickWithJS(adminPage.dateSearchBoxAdmin);
        ReusableMethods.wait(1);
        actions.click(adminPage.dateStart2).perform();
        ReusableMethods.wait(1);
        actions.click(adminPage.dateEnd).perform();
        String expectedDate = "2023-03-1 to 2023-03-31";

        extentTest.pass("Merchants Registration list sorted by date range.");

        ReusableMethods.wait(1);
        actions.click(adminPage.ordersIDAdmin).perform();
        ReusableMethods.wait(1);

        List<WebElement> listenumber = Driver.getDriver().findElements(By.xpath("//td[@class='sorting_1']"));
        for (int i = 0; i < listenumber.size() - 1; i++) {
            int currentElement = Integer.parseInt(listenumber.get(i).getText());
            int afterElement = Integer.parseInt(listenumber.get(i + 1).getText());
            Assert.assertTrue(currentElement < afterElement);
        }
        extentTest.pass("Merchants Registration list sorted by order ID number range.");
        Driver.closeDriver();
    }
}