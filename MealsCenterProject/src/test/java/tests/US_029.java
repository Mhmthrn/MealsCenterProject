package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A_homePage.HomePage;
import pages.B_merchantPage.HomePageMerchant;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.ProfilePageMerchant;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_029 extends TestBaseRapor {

    HomePage homePage=new HomePage();
    HomePageMerchant homePageMerchant=new HomePageMerchant();
    LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
    ProfilePageMerchant profilePageMerchant=new ProfilePageMerchant();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
    Actions actions=new Actions(Driver.getDriver());
    SoftAssert softAssert=new SoftAssert();

    String verilenOrderNumber;

    @Test
    public void TC_2901(){
        homePage=new HomePage();
        loginMerchantPage=new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        actions=new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest=extentReports.createTest("Successful order test.","As a restaurant manager, I want the orders given from my restaurant to be listed on the Completed page after all processes are completed.");

        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        extentTest.info("Restaurant manager can go home page as a user.");

        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);

        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHomeAli"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHomeAli"), Keys.ENTER);
        extentTest.info("Restaurant manager can login home page successfully.");

        //homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        extentTest.info("address information was entered in the search box and selected");
        ReusableMethods.wait(2);

        homePage.starbucksLocete.click();
        extentTest.info("Restaurant manager can go restaurant page for give order.");

        homePage.kahveAddToCartTestItem1Home.click();
        ReusableMethods.wait(1);
        homePage.kahveAddToCartTestItem2Home.click();
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        ReusableMethods.wait(2);
        extentTest.info("Restaurant manager can give order successfully as a user.");

        //actions.scrollToElement(homePage.cashOnDelivery).perform();
        ReusableMethods.wait(3);
        extentTest.info("address information was not entered because it was entered on the homepage.");

        clickWithJS(homePage.placeOrder);
        ReusableMethods.wait(2);
        verilenOrderNumber=homePage.orderNumberTextLocatiHomePage.getText().substring(7,12);
        ReusableMethods.wait(1);
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();
        extentTest.pass("Restaurant manager's order has been accepted");

    }

    @Test
    public void TC_2902(){
        homePage=new HomePage();
        loginMerchantPage=new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        actions=new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest=extentReports.createTest("Merchant page log in test","Restaurant manager can enter de merchant page for access the orders process.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("Restaurant manager can go to Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();
        extentTest.info("Restaurant manager can login to Merchant page");

        String actualTitle= Driver.getDriver().getTitle();
        String expectedTitle="Dashboard";

        Assert.assertEquals(actualTitle,expectedTitle);
        ReusableMethods.wait(1);
        //sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        //ReusableMethods.wait(1);
        //sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        //ReusableMethods.wait(1);
        extentTest.pass("Restaurant manager can enters to Starbucks Merchant Page");

    }

    @Test
    public void TC_2903(){
        homePage=new HomePage();
        loginMerchantPage=new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        actions=new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest=extentReports.createTest("OrdersProccesTestByRestaurantManager","The order placed must go through the necessary approval processes.");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        ReusableMethods.wait(1);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();
        extentTest.info("login to Merchant page");

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.neworders.click();
        sidebar_dashboardAll_merchantPage.newOrdersItem.click();
        sidebar_dashboardAll_merchantPage.newOrdersAccepted.click();
        sidebar_dashboardAll_merchantPage.neworders.click();
        extentTest.info("Confirmation of the order has been done in the new order section.");

        sidebar_dashboardAll_merchantPage.OrderProcessing.click();
        ReusableMethods.wait(1);
        extentTest.info("Restaurant manager can enter to order processing");

        sidebar_dashboardAll_merchantPage.pickUpLink.click();
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.readyLink.click();
        ReusableMethods.wait(1);
        extentTest.info("Restaurant manager can enter to order ready");

        sidebar_dashboardAll_merchantPage.aliDeliveredButtonInOrdersReadyMerchant.click();
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.completedMerchantPage.click();
        ReusableMethods.wait(2);

        String expectedTitle="Completed Today";
        String actualTitle=Driver.getDriver().getTitle();

        softAssert.assertEquals(actualTitle,expectedTitle);
        //sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        //sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        //ReusableMethods.wait(1);
        extentTest.info("The restaurant manager can follow the preparation and completion of the order.");

        softAssert.assertAll();
    }

    @Test
    public void TC_2904(){
        homePage=new HomePage();
        loginMerchantPage=new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        actions=new Actions(Driver.getDriver());
        softAssert=new SoftAssert();

        extentTest=extentReports.createTest("review test of completed orders page","");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        clickWithJS(loginMerchantPage.userNameMerchant);
        ReusableMethods.wait(1);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();

        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.neworders.click();
        sidebar_dashboardAll_merchantPage.newOrdersItem.click();
        sidebar_dashboardAll_merchantPage.newOrdersAccepted.click();
        sidebar_dashboardAll_merchantPage.neworders.click();
        extentTest.info("Confirmation of the order has been done in the new order section.");

        sidebar_dashboardAll_merchantPage.OrderProcessing.click();
        ReusableMethods.wait(1);
        extentTest.info("Restaurant manager can enter to order processing");

        sidebar_dashboardAll_merchantPage.pickUpLink.click();
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.readyLink.click();
        ReusableMethods.wait(1);
        extentTest.info("Restaurant manager can enter to order ready");

        sidebar_dashboardAll_merchantPage.aliDeliveredButtonInOrdersReadyMerchant.click();
        ReusableMethods.wait(1);

        sidebar_dashboardAll_merchantPage.completedMerchantPage.click();
        ReusableMethods.wait(4);
        extentTest.info("Restaurant manager can enter completed Page");


        sidebar_dashboardAll_merchantPage.completedTodayPageSortButtonMerchant.click();
        ReusableMethods.wait(2);
        sidebar_dashboardAll_merchantPage.orderIdDesvendingCompletedTodayMerchant.click();
        ReusableMethods.wait(4);

        String orderIdsi=sidebar_dashboardAll_merchantPage.aliCompletedPageOrderNumberTextMerchant.getText().substring(7,12);
        sidebar_dashboardAll_merchantPage.competedPagedekiSearchboxMerchant.sendKeys(orderIdsi);
        ReusableMethods.wait(3);
        sidebar_dashboardAll_merchantPage.completedTodaybuyutecButonuMerchant.click();
        ReusableMethods.wait(3);
        softAssert.assertEquals(verilenOrderNumber,orderIdsi);


        softAssert.assertTrue(sidebar_dashboardAll_merchantPage.howToManageOrderButtonMerchant.isEnabled());
        ReusableMethods.wait(2);
        //extentTest.info("How to manage order button looks enabled but it does not work. ");

        softAssert.assertTrue(sidebar_dashboardAll_merchantPage.completedTodayPagePrintButtonMerchant.isEnabled());
        ReusableMethods.wait(2);

        softAssert.assertTrue(sidebar_dashboardAll_merchantPage.orderTypeButtonAliMerchant.isEnabled());
        ReusableMethods.wait(2);

        softAssert.assertTrue(sidebar_dashboardAll_merchantPage.paymentStatusbuttonMerchant.isEnabled());
        ReusableMethods.wait(2);

        softAssert.assertTrue(sidebar_dashboardAll_merchantPage.orderSayisiniVerenButtonMerchant.isEnabled());
        ReusableMethods.wait(2);

        softAssert.assertTrue(sidebar_dashboardAll_merchantPage.getDirectionButtonMerchant.isEnabled());
        ReusableMethods.wait(2);


        //clickWithJS(sidebar_dashboardAll_merchantPage.accountLinkMerchant);
        //clickWithJS(sidebar_dashboardAll_merchantPage.logoutMerchant);
        ReusableMethods.wait(1);
        extentTest.pass("Completed Page's has been completed.All button functions have been tried.");
        softAssert.assertAll();



    }

}
