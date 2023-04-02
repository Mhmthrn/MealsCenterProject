package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;
public class US_021 extends TestBaseRapor {
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
    LoginMerchantPage loginMerchantPage = new LoginMerchantPage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void sidebar_dashboardAll_merchantPageVisibleTest() {
        sidebar_dashboardAll_merchantPage = new Sidebar_DashboardAll_MerchantPage();
        loginMerchantPage = new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());

        extentTest = extentReports.createTest("Verify that sidebar_dashboardAll_merchantPage is visible  ", "As a user, view the website. ");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        loginMerchantPage.loginmerchantUsername.sendKeys(ConfigReader.getProperty("starbucksMerchantUsername"));
        loginMerchantPage.loginmerchantPassword.sendKeys(ConfigReader.getProperty("merchantGeneralPassword"));
        loginMerchantPage.signInButtonMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.dashboardTextMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.dashboardTextMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.merchantLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.merchantLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.ordersLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.attributesLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.attributesLinkMerchant.isDisplayed());
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.foodLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.foodLinkMerchant.isDisplayed());

        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();

        Assert.assertTrue(sidebar_dashboardAll_merchantPage.ordersLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.paymentGatewayLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.paymentGatewayLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.promoLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.promoLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.imagesLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.imagesLinkMerchant.isDisplayed());
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.accountLinkMerchant.isDisplayed());

        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.buyersLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.buyersLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.usersLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.usersLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.reportsLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.reportsLinkMerchant.isDisplayed());
        sidebar_dashboardAll_merchantPage.inventoryManagementLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.inventoryManagementLinkMerchant.isDisplayed());

        extentTest.pass("Dashboard have been successfully listed in the list.");
        Driver.closeDriver();
    }
}