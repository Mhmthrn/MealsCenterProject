package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_002 extends TestBaseRapor {
    HomePage homePage=new HomePage();

    @Test(groups = "smoke")
    public void visitorWebSiteIsEnable(){
        extentTest=extentReports.createTest("Verify Visitor Web Site Enable","As a visotor, reach the Home Page");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        extentTest.info("The site has been successfully loaded");

        Assert.assertTrue(homePage.loginVerifiyItemHome.isDisplayed());
        extentTest.pass("Accessing the page as a user");


    }

    @Test
    public void mealsCenterLogoVisibleTest(){
        homePage=new HomePage();
        extentTest=extentReports.createTest("Verify Visitor Web Site Meals Center Logo","As a visotor, can   Meals Center Logo seen");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        extentTest.info("The site has been successfully loaded");

        homePage.headerMealsCenterHome.click();
        extentTest.info("The site has been successfully loaded");

        Assert.assertTrue(homePage.headerMealsCenterHome.isDisplayed());
        extentTest.pass("Meals Center Logo is visible");
    }

    @Test(groups = "smoke")
    public void mealsCenterHeaderCartSectionVisibleTest(){
        homePage=new HomePage();
        extentTest=extentReports.createTest("Verify Visitor Web Site Meals Center Cart section","As a visotor, can header the Home Page Cart section seen");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        extentTest.info("The site has been successfully loaded");

        homePage.headerCartButtonHome.click();
        extentTest.info("Clicked on the Cart section");
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.headerCartButtonHome.isEnabled());
        extentTest.pass("Home page header Cart sectionLogo is enabled.");
    }

    @Test(groups = "smoke")
    public void mealsCenterHeaderBasketIconVisibleTest(){
        homePage=new HomePage();
        extentTest=extentReports.createTest("Verify Visitor Web Site Meals Center Basket icon","As a visotor, can header the Home Page Basket Icon seen");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        extentTest.info("The site has been successfully loaded");

        homePage.headerSepetButtonHome.click();
        extentTest.info("Clicked on the Basket icon");
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.headerSepetButtonHome.isEnabled());
        extentTest.pass("Home page header Basket icon enabled.");
    }

    @Test(groups = "smoke")
    public void mealsCenterHeaderSignInPageVisibleTest(){
        homePage=new HomePage();
        extentTest=extentReports.createTest("Verify Visitor Web Site Meals Center Sign in page","As a visotor, can header the Home Page Sign seen");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        extentTest.info("The site has been successfully loaded");

        homePage.headerSingInButtonHome.click();
        extentTest.info("Clicked on the Sign in section");
        ReusableMethods.wait(1);
        String expectedResult="login";
        String actualResult= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualResult.contains(expectedResult));
        extentTest.pass("Home page header Sign in visible.");
    }


}

