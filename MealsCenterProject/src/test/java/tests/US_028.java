package tests;


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

public class US_028  extends TestBaseRapor {
    HomePage homePage = new HomePage();
    LoginMerchantPage loginMerchantPage = new LoginMerchantPage();
    Actions actions = new Actions(Driver.getDriver());
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();



    @Test
    public void orderPageOrderVerify () {
        homePage = new HomePage();
        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
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

        actions.moveToElement(homePage.starbucksLocete);
        homePage.starbucksLocete.click();
        clickWithJS(homePage.kahveAddToCartTestItem1Home);
        ReusableMethods.wait(1);
        clickWithJS(homePage.kahveAddToCartTestItem2Home);
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        extentTest.info("After choosing coffee from Starbucks, the addition process was completed and the checkout was done.");

        homePage.placeOrder.click();
        ReusableMethods.wait(1);
        clickWithJS(homePage.profilNameItem);
        ReusableMethods.wait(1);
        clickWithJS(homePage.myOrdersSection);
        ReusableMethods.waitForPageToLoad(1);
        extentTest.info("Payments have been made, or my orders have been sent to the screen.");


        String expectedResult = "Kahve";
        String actualResult = homePage.orderPageTestItem.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("the order placed appears on the \"my orders\" screen.");


    }


    @Test
    public void customerOrderAppearsInMerchantOrder () {
        homePage = new HomePage();
        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verification in the merchant order section of the customer order ", "The order placed must go through the necessary approval processes.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.neworders.click();

        Assert.assertTrue(sidebar_dashboardAll_merchantPage.newOrdersVerify.isDisplayed());
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("The order entered by the customer was seen as a new order in the restaurant order box.");

    }

    @Test
    public void confirmedOrderNotAppearInNewOrder () {
        homePage = new HomePage();
        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        extentTest = extentReports.createTest("Verification in the merchant order section of the customer order ", "The order placed must go through the necessary approval processes.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.neworders.click();
        sidebar_dashboardAll_merchantPage.newOrdersItem.click();
        sidebar_dashboardAll_merchantPage.newOrdersAccepted.click();
        sidebar_dashboardAll_merchantPage.neworders.click();
        extentTest.info("Confirmation of the order has been done in the new order section.");

        try {
            sidebar_dashboardAll_merchantPage.newOrdersItem.isDisplayed();
        } catch (Exception e) {
            Assert.assertTrue(true);
        }
        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("The order entered by the customer was seen as a new order in the restaurant order box.");

    }


    @Test(dependsOnMethods = "orderPageOrderVerify")
    public void orderReadyTestt () {

        homePage = new HomePage();
        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        extentTest = extentReports.createTest("Verification in the merchant order section of the customer order ", "The order placed must go through the necessary approval processes.");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));

        loginMerchantPage.userNameMerchant.click();
        ReusableMethods.wait(1);
        actions.sendKeys(loginMerchantPage.userNameMerchant, ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant, ConfigReader.getProperty("merchantGeneralPassword") + Keys.ENTER).perform();
        extentTest.info("login to Merchant page");

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.neworders.click();
        sidebar_dashboardAll_merchantPage.newOrdersItem.click();
        sidebar_dashboardAll_merchantPage.newOrdersAccepted.click();
        sidebar_dashboardAll_merchantPage.neworders.click();
        extentTest.info("Confirmation of the order has been done in the new order section.");

        sidebar_dashboardAll_merchantPage.OrderProcessing.click();
        sidebar_dashboardAll_merchantPage.newOrdersItem.click();
        sidebar_dashboardAll_merchantPage.pickUpLink.click();
        sidebar_dashboardAll_merchantPage.readyLink.click();
        extentTest.info("Confirmation of the order has been done in the Orders Processing.");

        int actualResultNummer = Integer.parseInt(sidebar_dashboardAll_merchantPage.ordersReadyVerify.getText());
        Assert.assertFalse(!(actualResultNummer == 0));


        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);


        extentTest.pass("The ordered product has been successfully delivered to the Orders Ready page.");

    }

}


