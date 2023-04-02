package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_037 extends TestBaseRapor {

    AdminPage adminPage = new AdminPage();
    Actions actions=new Actions(Driver.getDriver());


    @Test
    public void adminLoginTest() {

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("admin Page Login","");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("tahirAdminUsername"));
        ReusableMethods.wait(1);
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(1);
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Login to Starbucks Admin Page");
    }

    @Test
    public void allMerchantPageVisibleTest(){

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("All Merchant list Visible Test","");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("tahirAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(1);
        adminPage.merchantElementi.click();
        ReusableMethods.wait(1);
        adminPage.listElementi.click();
        ReusableMethods.wait(1);

        String expectedResult = "backoffice/vendor/list";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
        ReusableMethods.wait(1);
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("All Merchant page visible");

    }

    @Test
    public void merchantEditTest(){

        adminPage = new AdminPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Merchant edit Test","");

        Driver.getDriver().get(ConfigReader.getProperty("adminPageLoginUrl"));
        extentTest.info("went to Starbucks Admin Page");

        clickWithJS(adminPage.adminPageUserName);
        ReusableMethods.wait(1);
        adminPage.adminPageUserName.sendKeys(ConfigReader.getProperty("tahirAdminUsername"));
        adminPage.adminPagePassword.sendKeys(ConfigReader.getProperty("adminGeneralPassword"), Keys.ENTER);
        ReusableMethods.wait(1);
        adminPage.merchantElementi.click();
        ReusableMethods.wait(1);
        adminPage.listElementi.click();
        ReusableMethods.wait(1);
        adminPage.allMerchantSearchBox.click();
        actions.sendKeys("Starbucks" + Keys.ENTER).perform();
        ReusableMethods.wait(1);
        adminPage.starbucksEditButton.click();

        String expectedResult = "backoffice/vendor/edit";
        String actualResult = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
        ReusableMethods.wait(1);
        adminPage.profileNameInHeaderAdmin.click();
        ReusableMethods.wait(1);
        adminPage.logOutButtonAdmin.click();
        extentTest.pass("Merchant edit page visible");



    }


}
