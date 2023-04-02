package tests;

import org.testng.annotations.Test;
import pages.B_merchantPage.HomePageMerchant;
import pages.B_merchantPage.LoginMerchantPage;
import pages.B_merchantPage.ProfilePageMerchant;
import pages.B_merchantPage.Sidebar_DashboardAll_MerchantPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_022 extends TestBaseRapor {

    HomePageMerchant homePageMerchant=new HomePageMerchant();
    LoginMerchantPage loginMerchantPage=new LoginMerchantPage();
    ProfilePageMerchant profilePageMerchant=new ProfilePageMerchant();
    Sidebar_DashboardAll_MerchantPage sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();

    @Test
    public void merchantLoginText(){
        homePageMerchant=new HomePageMerchant();
        loginMerchantPage=new LoginMerchantPage();
        profilePageMerchant=new ProfilePageMerchant();
        sidebar_dashboardAll_merchantPage=new Sidebar_DashboardAll_MerchantPage();
        extentTest=extentReports.createTest("Verify that MerchantLoginText is displayed ","As Restaurant Manager, I should be able to display MerchantLoginText");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        loginMerchantPage.userNameMerchant.click();
        extentTest.info("page opened");
        ReusableMethods.wait(1);
        loginMerchantPage.loginmerchantUsername.sendKeys(ConfigReader.getProperty("starbucksMerchantUsername"));
        loginMerchantPage.passwordMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.loginmerchantPassword.sendKeys(ConfigReader.getProperty("merchantGeneralPassword"));
        loginMerchantPage.signInButtonMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.dropDownMerchant.isDisplayed();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("successful login");


    }

    @Test
    public void profileOpened(){
        homePageMerchant=new HomePageMerchant();
        loginMerchantPage=new LoginMerchantPage();
        profilePageMerchant=new ProfilePageMerchant();
        extentTest=extentReports.createTest("Verify that MerchantLoginText is displayed ","As Restaurant Manager, I should be able to display MerchantLoginText");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        loginMerchantPage.userNameMerchant.click();
        extentTest.info("page opened");
        ReusableMethods.wait(1);
        loginMerchantPage.loginmerchantUsername.sendKeys(ConfigReader.getProperty("starbucksMerchantUsername"));
        loginMerchantPage.passwordMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.loginmerchantPassword.sendKeys(ConfigReader.getProperty("merchantGeneralPassword"));
        loginMerchantPage.signInButtonMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.dropDownMerchant.isDisplayed();
        extentTest.info("successful login");
        loginMerchantPage.dropDownMerchant.click();
        loginMerchantPage.profileMerchantPage.click();
        profilePageMerchant.basicDetailsMerchantP.isDisplayed();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("Successfully logged into merchant profile");



    }

    @Test(groups = "smoke")
    public void profileUpdate(){
        homePageMerchant=new HomePageMerchant();
        loginMerchantPage=new LoginMerchantPage();
        profilePageMerchant=new ProfilePageMerchant();
        extentTest=extentReports.createTest("Verify that MerchantLoginText is displayed ","As Restaurant Manager, I should be able to display MerchantLoginText");

        Driver.getDriver().get(ConfigReader.getProperty("merchantPageLoginUrl"));
        loginMerchantPage.userNameMerchant.click();
        extentTest.info("page opened");
        ReusableMethods.wait(1);
        loginMerchantPage.loginmerchantUsername.sendKeys(ConfigReader.getProperty("starbucksMerchantUsername"));
        loginMerchantPage.passwordMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.loginmerchantPassword.sendKeys(ConfigReader.getProperty("merchantGeneralPassword"));
        loginMerchantPage.signInButtonMerchant.click();
        ReusableMethods.wait(1);
        loginMerchantPage.dropDownMerchant.isDisplayed();
        extentTest.info("successful login");
        loginMerchantPage.dropDownMerchant.click();
        loginMerchantPage.profileMerchantPage.click();
        profilePageMerchant.basicDetailsMerchantP.isDisplayed();
        extentTest.info("Successfully logged into merchant profile");
        ReusableMethods.wait(2);
        profilePageMerchant.browseMerchantP.click();
        ReusableMethods.wait(2);
        profilePageMerchant.fotoAddProfilMerchant.click();
        profilePageMerchant.addFilesMerchantP.click();
        ReusableMethods.wait(3);
        profilePageMerchant.saveProfilMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.accountLinkMerchant.click();
        ReusableMethods.wait(1);
        sidebar_dashboardAll_merchantPage.logoutMerchant.click();
        ReusableMethods.wait(1);
        extentTest.pass("Profile updated");



    }

}
