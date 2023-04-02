package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import pages.C_adminPage.AdminPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_031 extends TestBaseRapor {

    AdminPage adminPage= new AdminPage();
    LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
    HomePage homePage=new HomePage();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void AllOrdersLinkItemActive(){

        AdminPage adminPage= new AdminPage();
        LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
        HomePage homePage=new HomePage();
        Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        Actions actions=new Actions(Driver.getDriver());

        extentTest=extentReports.createTest("Verify that All Orders link item is enabled ","As a restaurant manager, i want to see all orders in one page.");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));

        loginMerchantPage.loginmerchantUsername.sendKeys(ConfigReader.getProperty("starbucksMerchantUsername"));
        loginMerchantPage.loginmerchantPassword.sendKeys(ConfigReader.getProperty("merchantGeneralPassword"));
        loginMerchantPage.signInButtonMerchant.click();

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.allOrdersMerchantPage.isEnabled());
        extentTest.pass("All orders item link is enabled");

        loginMerchantPage.steveBucksDropDownMerchant.click();
        loginMerchantPage.steveBucksDropDownLogoutMerchant.click();

        Driver.closeDriver();

    }
    @Test
    public void AllOrdersPageisDone(){

        AdminPage adminPage= new AdminPage();
        LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
        HomePage homePage=new HomePage();
        Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        Actions actions=new Actions(Driver.getDriver());

        extentTest=extentReports.createTest("Verify that All Orders page is enabled ","As a restaurant manager, i want to see all orders in one page.");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        String wh=Driver.getDriver().getWindowHandle();

        loginMerchantPage.loginmerchantUsername.sendKeys(ConfigReader.getProperty("starbucksMerchantUsername"));
        loginMerchantPage.loginmerchantPassword.sendKeys(ConfigReader.getProperty("merchantGeneralPassword"));
        loginMerchantPage.signInButtonMerchant.click();

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.allOrdersMerchantPage.click();

        ReusableMethods.wait(2);
        String allorders=loginMerchantPage.orders.getText();
        extentTest.info("as a Restaurant manager i have "+allorders +" orders before buying process");


        //buying a cup of coffee
        Driver.getDriver().switchTo().newWindow(WindowType.TAB);
        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("user went to Home Page");

        //homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

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
        ReusableMethods.wait(2);

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        homePage.starbucksLocate.click();
        extentTest.info("user can enter restaurant page successfully.");

        ReusableMethods.wait(1);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
        homePage.kahveAddToCartTestItem1Home1.click();
        ReusableMethods.wait(1);
        homePage.kahveAddToCartTestItem2Home.click();
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        ReusableMethods.wait(2);
        extentTest.info("user can give order successfully.");

        //actions.scrollToElement(homePage.cashOnDelivery).perform();
        ReusableMethods.wait(3);
        extentTest.info("address information was not entered because it was entered on the homepage.");

        clickWithJS(homePage.cashOnDelivery);
        ReusableMethods.wait(1);
        clickWithJS(homePage.cashOnDeliveryPaymetOption);
        extentTest.info("user's payment decision has been accepted");

        clickWithJS(homePage.placeOrder);
        ReusableMethods.wait(2);
        extentTest.info("user's order has been accepted");





        Driver.getDriver().switchTo().window(wh);
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(3);

        String allordersnew=loginMerchantPage.orders.getText();
        System.out.println(allorders+"  "+allordersnew);
        extentTest.info("after buying process now i have "+allordersnew+" orders");
        Assert.assertEquals(Integer.parseInt(allordersnew),(Integer.parseInt(allorders))+1);
        extentTest.pass("The total number of orders increased by one as a result of a new order on all orders page");




        Driver.quitDriver();


    }




}
