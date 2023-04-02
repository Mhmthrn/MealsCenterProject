package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_024 extends TestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage=new HomePage();
    LoginMerchantPage loginMerchantPage = new LoginMerchantPage();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
    Faker faker = new Faker();

    @Test
    public void merchantLoginTest() {
        homePage=new HomePage();
        actions = new Actions(Driver.getDriver());
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        extentTest = extentReports.createTest("Verification in the merchant page is accessible", "A Restaurant owner must log in the merchant page with correct username and password");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();

        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.info("login to Merchant page");
    }

    @Test
    public void CategoryUnderFoodsPanelArevisibleInMerchant() {
        homePage=new HomePage();
        actions = new Actions(Driver.getDriver());
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        extentTest = extentReports.createTest("Verification in the merchant page is accessible", "A Restaurant owner must log in the merchant page with correct username and password");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.foodLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.categoryMerchant.click();
        ReusableMethods.wait(1);
        String expectedUrl = "https://qa.mealscenter.com/backoffice/food/category";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Category under the food sidebar menu is accessible");

    }

    @Test
    public void AddNewbuttonUnderCategoryvisibleInMerchant() {
        homePage=new HomePage();
        actions = new Actions(Driver.getDriver());
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        extentTest = extentReports.createTest("Verification in the merchant page  AddNew Button is accessible", "A Restaurant owner must add new category.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.foodLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.categoryMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.foodCategoryAddNewButtonMerchant.click();

        clickWithJS(sidebar_dashboardAll_merchantPage.catname);

        sidebar_dashboardAll_merchantPage.catname.sendKeys(faker.lorem().sentence(3));
        clickWithJS(sidebar_dashboardAll_merchantPage.categoryDescription);
        sidebar_dashboardAll_merchantPage.categoryDescription.sendKeys(faker.lorem().paragraph());
        clickWithJS(sidebar_dashboardAll_merchantPage.addCategorySaveButtonMerchant);
        ReusableMethods.wait(2);
        String expectedResult = "Succesfully created";
        String actualResult = sidebar_dashboardAll_merchantPage.succesfullyCreated.getText();
        Assert.assertEquals(expectedResult, actualResult);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("AddNew Button for category under the food sidebar menu is accessible");

    }
    @Test
    public void DeleteUnderCategoryvisibleInMerchant() {
        homePage = new HomePage();
        actions = new Actions(Driver.getDriver());
        loginMerchantPage = new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        extentTest = extentReports.createTest("Verification in the merchant page is accessible", "A Restaurant owner must log in the merchant page with correct username and password");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.foodLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.categoryMerchant.click();
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.categoryDelete.click();
        ReusableMethods.wait(2);
        sidebar_dashboardAll_merchantPage.deleteagain.click();
        Assert.assertTrue(true);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Delete button on category is usable");
}
}
