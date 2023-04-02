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

import static utilities.ReusableMethods.clickWithJS;

public class US_026 {
    Actions actions=new Actions(Driver.getDriver());
    HomePage homePage=new HomePage();
    LoginMerchantPage loginMerchantPage= new LoginMerchantPage();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage= new Sidebar_DashboardAll_MerchantPage();


    @Test
    public void OrdersPageNewOrder() {

        actions=new Actions(Driver.getDriver());
        homePage=new HomePage();
        loginMerchantPage= new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage= new Sidebar_DashboardAll_MerchantPage();

        Driver.getDriver().get(ConfigReader.getProperty("homePageLoginUrl"));
        homePage.usernameHome.sendKeys(ConfigReader.getProperty("usernameHome"));
        homePage.passwordHome.sendKeys(ConfigReader.getProperty("passwordHome"), Keys.ENTER);
        homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        homePage.loginSearchBoxHome.sendKeys("Texas");
        ReusableMethods.wait(1);
        clickWithJS(homePage.addressChoseItem);
        homePage.addressChoseItem.click();
        ReusableMethods.wait(1);
        actions.moveToElement(homePage.starbucksLocete);
        homePage.starbucksLocete.click();
        clickWithJS(homePage.kahveAddToCartTestItem1Home);
        ReusableMethods.wait(1);
        clickWithJS(homePage.kahveAddToCartTestItem2Home);
        ReusableMethods.wait(1);
        homePage.checkOutButtonHome.click();
        homePage.placeOrder.click();
        ReusableMethods.wait(1);
        clickWithJS(homePage.profilNameItem);
        clickWithJS(homePage.myOrdersSection);
        ReusableMethods.waitForPageToLoad(1);
        String expectedResult = "Kahve";
        String actualResult = homePage.orderPageTestItem.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        ReusableMethods.wait(1);


      //  extentTest.pass("the order placed appears on the \"my orders\" screen.");
    }

    @Test (groups = "smoke")
    public void    NewOrders()  {
        actions=new Actions(Driver.getDriver());
        homePage=new HomePage();
        loginMerchantPage= new LoginMerchantPage();
        sidebar_dashboardAll_merchantPage= new Sidebar_DashboardAll_MerchantPage();
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();
        sidebar_dashboardAll_merchantPage.ordersLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.neworders.click();
        Assert.assertTrue(sidebar_dashboardAll_merchantPage.newOrdersVerify.isDisplayed());

        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);


    }
}
