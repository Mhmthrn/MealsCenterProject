package tests;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import pages.B_merchantPage.LoginMerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import static utilities.ReusableMethods.clickWithJS;

public class US_034 extends TestBaseRapor {
    LoginMerchantPage loginMerchantPage= new LoginMerchantPage();
    Actions actions = new Actions(Driver.getDriver());

    HomePage homePage= new HomePage();

       /*
    "- Open browser go to url ""merchantPageLoginUrl""
    - User types in ""Email"" and ""password""
    - User clicks sign in button
    - User verifies that website is accessible
    - User closes the page
    "*/


    @Test (groups = "smoke")
    public void merchantPageAccessible(){

        loginMerchantPage= new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        homePage= new HomePage();


        extentTest = extentReports.createTest("Verify Merchantpage ", "As a user, view the Merchantpage. ");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();
        extentTest.info("login to Merchant page");


        Assert.assertTrue(loginMerchantPage.loginTextVerifyMerchantPage.isDisplayed());


        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.info("The user has be access the Merchantpage");

    }


/*        "- Open browser go to url ""merchantPageLoginUrl""
        - User types in ""Email"" and ""password""
            - User clicks sign in button
            - User clicks Order Type
            - User clicks Delivery
            - User must verify the delivery details
            - Click on ""Log out"" section
            - User closes the page"
*/


    @Test(groups = {"smoke","demo"})
    public void verifyDeliveryDetail(){

        loginMerchantPage= new LoginMerchantPage();
        actions = new Actions(Driver.getDriver());
        homePage= new HomePage();

        extentTest = extentReports.createTest("Verify Merchantpage ", "As a user, view the Delivery details. ");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        extentTest.info("went to Starbucks Merchant Page");

        clickWithJS(loginMerchantPage.userNameMerchant);
        actions.sendKeys(loginMerchantPage.userNameMerchant,ConfigReader.getProperty("starbucksMerchantUsername")).perform();
        clickWithJS(loginMerchantPage.passwordMerchant);
        actions.sendKeys(loginMerchantPage.passwordMerchant,ConfigReader.getProperty("merchantGeneralPassword")+Keys.ENTER).perform();
        extentTest.info("login to Merchant page");
        ReusableMethods.wait(1);

        clickWithJS(loginMerchantPage.orderTypeElementi);
        ReusableMethods.wait(2);
        clickWithJS(loginMerchantPage.deliveryElementi);
        ReusableMethods.wait(1);

        Assert.assertTrue(loginMerchantPage.verifyDeliveryItem.isDisplayed());

        homePage.profilNameItem.click();
        ReusableMethods.wait(1);
        homePage.logoutButton.click();

        extentTest.pass("Delivery page has be verified");



    }
}
