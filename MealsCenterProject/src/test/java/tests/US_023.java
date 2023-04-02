package tests;


import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.B_merchantPage.HomePageMerchant;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;


public class US_023 extends TestBaseRapor {


    LoginMerchantPage loginMerchantPage = new LoginMerchantPage();
    Actions actions = new Actions(Driver.getDriver());
    HomePageMerchant homePageMerchant = new HomePageMerchant();

    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();


    @Test
    public void merchantLoginTest(){

        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        homePageMerchant = new HomePageMerchant();

        extentTest = extentReports.createTest("Verification in the merchant page is accessible", "A Restaurant owner must log in the merchant page with correct username and password");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");
        ReusableMethods.wait(2);
        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        ReusableMethods.wait(1);
        loginMerchantPage.dropDownMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.steveBucksDropDownLogoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("login to Merchant page");



    }


    @Test
    public void dashboardPageTest(){

        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        homePageMerchant = new HomePageMerchant();

        extentTest = extentReports.createTest("Dashboard page Test", "The summary information and graphics on the dashboard should be verified");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");
        ReusableMethods.wait(1);

        homePageMerchant.totalOrdersHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.totalCancelHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.totalRefundHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.totalSalesHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.salesThisWeekHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.earningThisWeekHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.yourBalanceHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.orderReceivedHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.todayDeliveredHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.todaySalesHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.todayRefundHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.lastOrdersHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.popularItemsHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.salesOverviewHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.topCustomersHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        homePageMerchant.overviewOfReviewHomePageMerchant.isDisplayed();
        ReusableMethods.wait(1);
        loginMerchantPage.dropDownMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.steveBucksDropDownLogoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("All graphics visible");




    }

}
