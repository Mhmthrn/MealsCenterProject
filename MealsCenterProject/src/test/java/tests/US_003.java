package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.A_homePage.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_003 extends TestBaseRapor {
    SoftAssert softAssert=new SoftAssert();
    HomePage homePage=new HomePage();
    @Test
    public void homePageVisibleTest() {
        softAssert=new SoftAssert();
        homePage=new HomePage();
        extentTest = extentReports.createTest("Verify Homepage ", "As a visitor, view the Homepage");
        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        // homePage.cookiesAcceptHome.click();
        ReusableMethods.wait(1);
        extentTest.info("gone to Home Page");
        String expectedUrl = "https://qa.mealscenter.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
        extentTest.pass("Homepage is accessable");
        Driver.closeDriver();
    }


    @Test
    public void localCuisineVisibleTest() {
        softAssert=new SoftAssert();
        homePage=new HomePage();
        extentTest = extentReports.createTest("Verify LocalCuisine Visible ", "As a visitor, view the LocalCuicines");

        Driver.getDriver().get(ConfigReader.getProperty("visitorUrl"));
        ReusableMethods.wait(1);
        extentTest.info("Gone to HomePage");

        homePage.americanCuisineHome.click();
        String expectedUrl1="https://qa.mealscenter.com/cuisine/american";
        String actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("American cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.mediterraneanCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/mediterranean";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Mediterranean cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.sandwichesCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/sandwiches";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Sandwiches cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.italianCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/italian";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Italian cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.mexicanCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/mexican";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Mexican cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.burgersCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/burgers";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Burgers cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.japaneseCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/japanese";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Japanese cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.thaiCuisineHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/thai";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Thai cuisine is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.dropdownCuisineHome.click();
        ReusableMethods.wait(1);
        Assert.assertTrue(homePage.chineseCuisineDropDownHome.isDisplayed());
        extentTest.pass("Dropdown menu MORE is Displayed on HomePage");

        homePage.chineseCuisineDropDownHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/chinese";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Chinese menu MORE is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.dropdownCuisineHome.click();
        homePage.kosherCuisineDropDownHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/kosher";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Kosher menu MORE is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.dropdownCuisineHome.click();
        homePage.halalCuisineDropDownHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/halal";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Halal menu MORE is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);

        homePage.dropdownCuisineHome.click();
        homePage.vegetarianCuisineDropDownHome.click();
        expectedUrl1="https://qa.mealscenter.com/cuisine/vegetarian";
        actualUrl1=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(expectedUrl1,actualUrl1);
        extentTest.pass("Vegetarian menu MORE is Displayed on HomePage");
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        softAssert.assertAll();
        Driver.closeDriver();

    }
}