package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.B_merchantPage.LoginMerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_020 extends TestBaseRapor {

    LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void ForgotPasswordLinkisEnabled(){

        LoginMerchantPage loginMerchantPage=new LoginMerchantPage();

        extentTest=extentReports.createTest("Verify that  Forgot password? link is enabled ","As a restaurant manager, Forgot password page is enabled.");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));

        Assert.assertTrue(loginMerchantPage.loginForgotPasswordMerchant.isEnabled());
        extentTest.pass("Forgot password? link is enabled");
        loginMerchantPage.loginForgotPasswordMerchant.click();
        Assert.assertTrue(loginMerchantPage.loginForgotPasswordEmailVerifyPageDisplayedMerchant.isEnabled());
        extentTest.pass("Forgot password? page is visible");

        Driver.closeDriver();

    }
    @Test
    public void emailAdressTextboxisEnabled(){

        LoginMerchantPage loginMerchantPage=new LoginMerchantPage();

        extentTest=extentReports.createTest("Verify that  emailAdressTextbox is enabled ","As a restaurant manager, Forgot password page is enabled.");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));

        loginMerchantPage.loginForgotPasswordMerchant.click();
        Assert.assertTrue(loginMerchantPage.loginForgotPasswordEmailAddressBoxMerchant.isEnabled());
        extentTest.pass("Email adress textbox is enabled");

        Driver.closeDriver();

    }

    @Test (groups = {"smoke","demo"})
    public void ForgotpasswordProcessingisDone(){

        LoginMerchantPage loginMerchantPage=new LoginMerchantPage();

        extentTest=extentReports.createTest("Verify that  Forgot password processing is successfully done ","As a restaurant manager, Forgot password page is enabled.");
        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));

        loginMerchantPage.loginForgotPasswordMerchant.click();
        loginMerchantPage.loginForgotPasswordEmailAddressBoxMerchant1.sendKeys("info@starbucks.com");
        loginMerchantPage.loginForgotPasswordEmailVerifyPageDisplayedMerchant.click();

        Assert.assertTrue(loginMerchantPage.loginforgotPasswordProcessingisDone.isDisplayed());
        extentTest.pass("Forgot password processing is successfully done");

        Driver.closeDriver();


    }


}
