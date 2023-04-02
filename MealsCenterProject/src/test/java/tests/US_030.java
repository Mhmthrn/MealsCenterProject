package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
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

public class US_030 extends TestBaseRapor {

    Actions actions = new Actions(Driver.getDriver());
    HomePage homePage = new HomePage();
    LoginMerchantPage loginMerchantPage= new LoginMerchantPage();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage= new Sidebar_DashboardAll_MerchantPage();

    @Test
    public void scheduledOrderPageOrderVerify() {

        actions = new Actions(Driver.getDriver());
        homePage = new HomePage();

        extentTest = extentReports.createTest("Verify Home Order page ", "As a user, view the orders of my account.");

        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("went to Home Page");


        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        extentTest.info("login to main page");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        extentTest.info("address information was entered in the search box and selected");

        actions.moveToElement(homePage.starbucksLocate);
        clickWithJS(homePage.starbucksLocate);
        clickWithJS(homePage.caffeMistoHome);
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        clickWithJS(homePage.deliveryHome);
        ReusableMethods.wait(3);
        clickWithJS(homePage.deliverScheduleForLaterHome);
        ReusableMethods.wait(1);
        clickWithJS(homePage.scheduleForLaterDateButtonHome);
        ReusableMethods.wait(3);
        Select select = new Select(homePage.scheduleForLaterDateButtonHome);
        select.selectByIndex(3);
        ReusableMethods.wait(3);
        clickWithJS(homePage.scheduleForLaterTimeButtonHome);
        ReusableMethods.wait(1);
        Select select1 = new Select(homePage.scheduleForLaterTimeButtonHome);
        select1.selectByIndex(3);
        ReusableMethods.wait(1);
        homePage.scheduleForLaterSaveHome.click();
        ReusableMethods.wait(1);
        clickWithJS(homePage.cashOnDeliveryPaymetOption);
        ReusableMethods.wait(1);
        clickWithJS(homePage.addCashButtonHome);
        ReusableMethods.wait(2);

        clickWithJS(homePage.placeOrder);
        ReusableMethods.wait(1);
        clickWithJS(homePage.profilNameItem);
        ReusableMethods.wait(1);
        clickWithJS(homePage.logoutButton);

        extentTest.pass("After choosing a future date coffee from Starbucks, the addition process was completed and the check-out was made.");

    }

        @Test
        public void customerOrderAppearsInMerchantOrder () {

            actions = new Actions(Driver.getDriver());
            sidebar_dashboardAll_merchantPage= new Sidebar_DashboardAll_MerchantPage();
            loginMerchantPage= new LoginMerchantPage();

            extentTest = extentReports.createTest("Verification in the merchant order section of the customer order ", "The order placed must go through the necessary approval processes.");

            Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
            extentTest.info("went to Starbucks Merchant Page");

            clickWithJS(loginMerchantPage.userNameMerchant);
            actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
            clickWithJS(loginMerchantPage.passwordMerchant);
            actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
            extentTest.info("login to Merchant page");

            clickWithJS(sidebar_dashboardAll_merchantPage.ordersLinkMerchant);
            ReusableMethods.wait(1);
            sidebar_dashboardAll_merchantPage.scheduledMerchantPage.click();
            ReusableMethods.wait(1);
            Assert.assertTrue(sidebar_dashboardAll_merchantPage.scheduledMerchantPage.isDisplayed());
            ReusableMethods.wait(1);

            sidebar_dashboardAll_merchantPage.dashboardTextMerchant.click();
            ReusableMethods.wait(1);
            sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
            ReusableMethods.wait(1);
            clickWithJS(sidebar_dashboardAll_merchantPage.logoutMerchant);
            extentTest.pass("The Scheduled Page is visible.");


    }


    @Test
    public void    sceheduled ()  {

        actions = new Actions(Driver.getDriver());
        sidebar_dashboardAll_merchantPage= new Sidebar_DashboardAll_MerchantPage();
        loginMerchantPage= new LoginMerchantPage();

        extentTest=extentReports.createTest("Verification in the merchant order section of the customer order ","The order placed must go through the necessary approval processes.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        ReusableMethods.wait(1);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();
        extentTest.info("login to Merchant page");


        clickWithJS(sidebar_dashboardAll_merchantPage.OrderProcessing);
        sidebar_dashboardAll_merchantPage.scheduledMerchantPage.click();
        extentTest.info("Confirmation of the order has been done in the Scheduled.");

        String expectedResult="Scheduled";
        String actualResult= sidebar_dashboardAll_merchantPage.scheduledMerchantPage.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        sidebar_dashboardAll_merchantPage.dashboardTextMerchant.click();
        clickWithJS(sidebar_dashboardAll_merchantPage.accountLinkMerchant);
        ReusableMethods.wait(1);
        clickWithJS(sidebar_dashboardAll_merchantPage.logoutMerchant);

        extentTest.pass("the order placed appears on the Scheduled screen.");




    }
}

